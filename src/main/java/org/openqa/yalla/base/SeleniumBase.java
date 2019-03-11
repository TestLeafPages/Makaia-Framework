package org.openqa.yalla.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.framework.api.Browser;
import org.openqa.framework.api.Element;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBase implements Browser, Element{

	RemoteWebDriver driver = null;
	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The element "+ele+" clicked successfully");

	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
        System.out.println("The data "+data+" entered successfully");
	}

	@Override
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(value);
   System.out.println("The dropdown selected using VisibleText "+value); 
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void startApp(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startApp(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		driver.manage().window().maximize();
		driver.get(url); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The browser "+browser+" launched successfully");
	}

	@Override
	public WebElement locateElement(String locatorType, String value) {
		switch (locatorType) {
		case "id": return driver.findElementById(value);
		case "class": return driver.findElementByClassName(value);
		case "xpath": return driver.findElementByXPath(value);
		case "link": return driver.findElementByLinkText(value);
		}
		System.out.println("The element with "+value+" located successfully");
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> locateElements(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(UnhandledAlertException e) {
			System.err.println();
		}catch(WebDriverException e) {
			
		}

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void typeAlert(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		driver.close();
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

}
