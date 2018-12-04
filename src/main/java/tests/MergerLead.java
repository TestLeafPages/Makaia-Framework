package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PSM;

public class MergerLead extends PSM{
	@BeforeTest
	public void setData() {
		testCaseName="MergeLead Makaia";
		testDescription="Merging two Lead";
		testNodes="merge";
		category="Smoke";
		authors="koushik";
		browserName="chrome";
		//dataSheetName="01";
	}

	@Test
	public void mergeLead() throws InterruptedException {
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
		click(locateElement("link", "Merge Leads"));
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='firstName']"),"babu");
		click(locateElement("xpath", "(//button[@type='button'])[1]"));
		
		click(locateElement("xpath", "(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]"));
		
		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='firstName']"),"gopinath");
		click(locateElement("xpath", "(//button[@type='button'])[1]"));
	
		click(locateElement("xpath", "(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]"));
		
		switchToWindow(0);
		click(locateElement("class", "buttonDangerous"));
		acceptAlert();
	}
}

