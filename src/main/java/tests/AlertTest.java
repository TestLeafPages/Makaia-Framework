package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.Locators;
import lib.selenium.PSM;

public class AlertTest extends PSM {
    @BeforeTest
    public void setData() {
        testCaseName = "Alert text";
        testDescription = testCaseName;
        testNodes = testDescription;
        category = "Smoke";
        authors = "koushik";
        browserName = "chrome";
        url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    }

    @Test()
    public void createLead() throws InterruptedException {
    	switchToFrame("iframeResult");
    	clickWithNoListener(locateElement(Locators.BUTTONTEXT, "Try it"));
    	acceptAlert("koushik");
    	String text = getText(locateElement(Locators.ID, "demo"));
    	System.out.println(text);
    	
    	
    }
}




