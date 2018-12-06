package reports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Reporter {

	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public ExtentTest test, suiteTest;
	public String testCaseName, testNodes, testDescription, category, authors;
	protected static File file;

	public void startResult() {
		String date = new SimpleDateFormat("dd-MMM-yy").format(new Date());
		file = new File("./reports/"+date);
		if(!file.exists()) {
			System.out.println("Exists? "+file.exists());
			file.mkdir();
		}
		html = new ExtentHtmlReporter(file.toString()+"/TestAutomationReport.html");
		html.config().setChartVisibilityOnOpen(false);
		html.config().setDocumentTitle("MAKAIA TESTLEAF PRODUCT");
		html.setAppendExisting(true);		
		extent = new ExtentReports();	
		extent.attachReporter(html);	
	}


	public ExtentTest startTestModule(String testCaseName, String testDescription) {
		suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	public ExtentTest startTestCase(String testNodes) {
		test = 	suiteTest.createNode(testNodes);
		return test;
	}

	public abstract long takeSnap();


	public void reportStep(String desc, String status, boolean bSnap)  {

		long snapNumber = 100000L;
		MediaEntityModelProvider img = null;
		if(bSnap && !status.equalsIgnoreCase("INFO")){

			snapNumber = takeSnap();
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath
						("./images/"+snapNumber+".jpg").build();
			} catch (IOException e) {

			}
		}

		/*
		 * OTHER MAKUPS
		 * Markup markUp = MarkupHelper.createCodeBlock(desc);
		 * Markup markUp = MarkupHelper.createTable(s);
		 * 	String[][] s = {{desc}, {"some table"}};
		 */

		Markup markUp = MarkupHelper.createLabel(desc, ExtentColor.RED);
		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc, img);
		}else if (status.equalsIgnoreCase("FAIL")) {
			test.fail("Error Snapshot", img).fail(markUp);
		}else if (status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);
		}else if (status.equalsIgnoreCase("INFO")) {
			test.info(desc);
		}							
	}


	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}




	public void endResult() {
		extent.flush();
	}	

}
