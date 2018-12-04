package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
		WebElement eleUserName = locateElement("id", "username");
		//clear(eleUserName);
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "gopi");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));
		//	clear(locateElement("id", "updateLeadForm_companyName"));
		clearAndType(locateElement("id", "updateLeadForm_companyName"), "testleaf");
		WebElement locateElement = locateElement("id", "updateLeadForm_currencyUomId");
		selectDropDownUsingVisibleText(locateElement, "ALL - Albanian Lek");
		click(locateElement("name", "submitButton"));

		//driver.close();


	}


}