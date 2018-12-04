package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PSM;

public class FrameTest extends PSM {
	@BeforeTest
	public void setData() {
		testCaseName = "Frame Test";
		testDescription = "Testing a frame";
		testNodes = "Frame & Alert";
		category = "Check";
		authors = "koushik";
		browserName = "chrome";
	}

	@Test()
	public void frame() {
		WebElement frame = locateElement("id", "iframeResult");
		switchToFrame(frame);
		click(locateElement("xpath", "//button[text()='Try it']"));
		acceptAlert("Koushik");
		System.out.println(getText(locateElement("id", "demo")));

	}
}




