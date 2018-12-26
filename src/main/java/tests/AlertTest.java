package tests;

import org.testng.annotations.BeforeTest;

import lib.selenium.Browser;
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
        browserName =Browser.Chrome;
        url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    }

    public void createLead() throws InterruptedException {
    	switchToFrame("iframeResult");
    	clickWithNoListener(Locators.BUTTONTEXT, "Try it");
    	acceptAlert("koushik");
    	String text = getText(locateElement(Locators.ID, "demo"));
    	System.out.println(text);
    	
    }
}




