package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckSelectAscending {
	@Test
	public void sortDropDown() {
		
		ChromeDriver driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/a.html");
		WebElement source = driver.findElementByTagName("select");
		checkDropDownSorting(source);

	}

	public void checkDropDownSorting(WebElement source) {
		Select sel = new Select(source);
		List<WebElement> options = sel.getOptions();
		List<String> originalDropDownValues = new ArrayList<>();
		for (WebElement dd : options) {	originalDropDownValues.add(dd.getText());}
		List<String> sortedValues = new ArrayList<>(originalDropDownValues);
		Collections.sort(sortedValues);
		if(originalDropDownValues.equals(sortedValues)) { System.out.println("matched");
		} else { System.out.println("not matched");}
		originalDropDownValues.clear();
		sortedValues.clear();
	}

}
