package org.openqa.yalla.testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Merlin {
	RemoteWebDriver driver;

	@Test(enabled = false)

	public void tes() {
		File f = new File("‪‪K:\\check.pdf");
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
	}

	@Test
	public void run() {
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		try {
			driver = new RemoteWebDriver(new URL("http://10.0.0.14:4444/wd/hub"), dc);
//			webdriver.setFileDetector(new LocalFileDetector());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://merlinsupplierdemo.rheincs.net");
		driver.findElementById("txtEmail").sendKeys("leaf201901@gmail.com");
		driver.findElementById("txtPassword").sendKeys("Leaf@1234");
		driver.findElementByXPath("//button[text()='LOGIN']").click();
		driver.findElementByXPath("//a[@title='GSR']").click();
		driver.findElementByXPath("//span[text()='Details']").click();
		WebElement attachment = driver.findElementByXPath("//button[text()='Add Attachments']");
		driver.executeScript("scroll(0, " + attachment.getLocation().getY() + ")");
		attachment.click();
		new Select(driver.findElementByXPath("//select[@name='Details[0].Attached[0].Attachtype']"))
				.selectByVisibleText("Conflict Minerals Form");
		WebElement upload = driver.findElementByXPath("//input[@type='file']");
		try {
			File f = new File("K:\\日本語ファイル名めえテスト.pdf");
			System.out.println(f.exists());
			String absolutePath = f.getAbsolutePath();
			LocalFileDetector detc = new LocalFileDetector();
			driver.setFileDetector(detc);
			((RemoteWebElement) upload).setFileDetector(detc);
			upload.sendKeys(absolutePath);
		} catch (Exception e) {
			driver.quit();
		}
		/*
		 * WebElement countryDD = driver.findElementByXPath(
		 * "//select[@name='Country']"); new Select(countryDD).
		 * selectByVisibleText("United States of America" ); driver.findElementByXPath(
		 * "//span[text()='Details']").click(); WebElement diversity = driver.
		 * findElementByXPath("//label[text()='Diversity Supplier Type']" );
		 * System.out.println("is Displayed: " + diversity.isDisplayed());
		 * System.out.println("is Enables: " + diversity.isEnabled()); WebElement
		 * country = driver.findElementByXPath( "//select[@name='Country']"); Select sel
		 * = new Select(country); for (int i = 1; i < sel.getOptions().size(); i++) {
		 * driver.findElementByXPath( "(//span[contains(text(),'General')])[1]").
		 * click(); WebElement countryDD1 = driver.findElementByXPath(
		 * "//select[@name='Country']"); Select select = new Select(countryDD1);
		 * select.selectByIndex(i); System.out.println(select.
		 * getFirstSelectedOption().getText()); driver.findElementByXPath(
		 * "//span[text()='Details']").click(); diversity = driver.
		 * findElementByXPath("//label[text()='Diversity Supplier Type']" );
		 * System.out.println("is Displayed: " + diversity.isDisplayed());
		 * System.out.println("is Enables: " + diversity.isEnabled()); }
		 */
	}

}
