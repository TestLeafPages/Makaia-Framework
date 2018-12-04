package lib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import util.DataInputProvider;

public class PSM extends WebDriverServiceImpl{
	public String browserName;
	public String dataSheetName;

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}


	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
	}

	@AfterMethod
	public void afterMethod(){
		closeAllBrowsers();

	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	@BeforeMethod
	public void startApp() {
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	

}
