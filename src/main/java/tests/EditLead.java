package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.Locators;
import lib.selenium.PSM;

public class EditLead extends PSM{
	@BeforeTest
	public void setData() {
		testCaseName="Edit a lead";
		testDescription="Editing a lead";
		testNodes="edit";
		category="Smoke";
		authors="koushik";
		browserName="chrome";
		//dataSheetName="01";
	}
	@Test()
	public void editLead() throws InterruptedException {
		WebElement eleUserName = locateElement(Locators.ID, "username");
		//clear(eleUserName);
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement(Locators.ID, "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement(Locators.CLASSNAME, "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement(Locators.LINKTETXT, "CRM/SFA");
		click(eleCRM);
		click(locateElement(Locators.LINKTETXT, "Leads"));
	}


}