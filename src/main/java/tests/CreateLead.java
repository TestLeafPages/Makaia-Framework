package tests;

import lib.selenium.PSM;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends PSM {
    @BeforeTest
    public void setData() {
        testCaseName = "Create a lead";
        testDescription = "Creating a lead";
        testNodes = "create";
        category = "Smoke";
        authors = "koushik";
        browserName = "chrome";
        dataSheetName = "01";
    }

    @Test(dataProvider = "fetchData")
    public void createLead(String cName, String fName, String lName) {
    	
        WebElement eleUserName = locateElement("id", "username");
        type(eleUserName, "DemoSalesManager");
        WebElement elePassword = locateElement("id", "password");
        type(elePassword, "crmsfa");
        WebElement eleLogin = locateElement("class", "decorativeSubmit");
        click(eleLogin);
        WebElement eleCRM = locateElement("link", "CRM/SFA");
        click(eleCRM);
        click(locateElement("link", "Leads"));
        click(locateElement("link", "Create Lead"));
        type(locateElement("id", "createLeadForm_companyName"), cName);
        type(locateElement("id", "createLeadForm_firstName"), fName);
        type(locateElement("id", "createLeadForm_lastName"), lName);
        selectDropDownUsingVisibleText(locateElement("id", "createLeadForm_dataSourceId"), "Employee");
        click(locateElement("class", "smallSubmit"));
        String id1 = getText(locateElement("id", "viewLead_companyName_sp"));
        String leadID1 = id1.replaceAll("\\D+", "");
        System.out.println(leadID1);
        System.out.println(driver.getTitle());
    }
}




