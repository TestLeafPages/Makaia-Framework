package org.openqa.yalla.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.yalla.base.SeleniumBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations extends SeleniumBase {

	@BeforeMethod
	public void beforeMethod() {
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "username");
		System.out.println(locateElement("id", "username").isDisplayed());
		clearAndType(eleUsername, "DemoSalesManager");
		clearAndType(locateElement("id", "password"), "crmsfa");       
		click(locateElement("class", "decorativeSubmit"));  
		click(locateElement("link", "CRM/SFA"));
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am from before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am from after class");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am from before test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am from after test");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am from before suite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am from after suite");

	}

}