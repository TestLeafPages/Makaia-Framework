package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.Browser;
import lib.selenium.DropDown;
import lib.selenium.Locators;
import lib.selenium.PSM;

public class Merlin extends PSM {
	@BeforeTest
	public void setData() {
		headless = true;
		testCaseName = "Alert text";
		testDescription = testCaseName;
		testNodes = testDescription;
		category = "Smoke";
		authors = "koushik";
		browserName = Browser.Chrome;
		url = "http://merlinsupplierdemo.rheincs.net";
	}

	@Test
	public void run() throws InterruptedException {
		type(locateElement(Locators.ID, "txtEmail"), "leaf201901@gmail.com");
		type(locateElement(Locators.ID, "txtPassword"), "Leaf@1234");
		click(Locators.XPATH, "//button[text()='LOGIN']");
		click(Locators.XPATH, "//a[@title='GSR']");
		click(Locators.XPATH, "//span[text()='Details']");
//		WebElement attachment = locateElement(Locators.XPATH, "//button[text()='Add Attachments']");
//		driver.executeScript("scroll(0, " + attachment.getLocation().getY() + ")");
//		click(attachment);
//		selectDropDown(DropDown.VISIBLETEXT,
//				locateElement(Locators.XPATH, "//select[@name='Details[0].Attached[0].Attachtype']"),
//				"Conflict Minerals Form");
//		driver.unregister(this);
//		WebElement upload = webdriver.findElementByXPath("//input[@type='file']");
//		RemoteWebDriver remoteDriver = (RemoteWebDriver) driver;
//		WebElement upload = locateElement(Locators.XPATH, "//input[@type='file']");
//		LocalFileDetector detector = new LocalFileDetector();

//		RemoteWebElement ele = (RemoteWebElement) upload;
//		ele.setFileDetector(detector);
//		upload.sendKeys("‪C:\\Users\\dell\\Pictures\\IeSettings.png");
//		Thread.sleep(10000);

		WebElement dropDown = locateElement(Locators.XPATH, "//select[@name='Country']");
		Select sel = new Select(dropDown);
		for (int i = 1; i < sel.getOptions().size(); i++) {
			selectDropDown(DropDown.INDEX, dropDown, i);
			click(Locators.XPATH, "//span[text()='Details']");
			boolean verifyDisplayed = verifyDisplayed(
					locateElement(Locators.XPATH, "//label[text()='Diversity Supplier Type']"));
			if (!verifyDisplayed) {
				reportStep("As expected value is not present", "pass");
			} else {
				reportStep("As expected value is present", "pass");
			}
			click(Locators.XPATH, "(//span[contains(text(),'General')])[1]");
		}

	}
}
