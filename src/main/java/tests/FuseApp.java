package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.Browser;
import lib.selenium.Locators;
import lib.selenium.PSM;

public class FuseApp extends PSM{
	@BeforeTest
	private void loadData() {
		browserName = Browser.Chrome;
		testCaseName = "Plus";
		testNodes = "node";
		testDescription = "Automate Plus";
		category = "smoke";
		authors = "koushik";
		url = "http://quickfuseapps.com/";
	}
	@Test
	private void run() {
		click(Locators.LINKTETXT, "Create an App");
		click(Locators.XPATH, "//button[text()=\"Let's get started!\"]");
		click(Locators.LINKTETXT, "Messaging");
		click(Locators.XPATH, "//li[text()='Send an SMS']/a/span");
		

	}

}
