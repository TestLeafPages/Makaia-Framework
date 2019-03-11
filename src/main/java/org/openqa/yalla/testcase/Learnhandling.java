package org.openqa.yalla.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnhandling {
	/*public void run() 
	{
		try {
		Thread.sleep(5000);
		
		} catch(InterruptedException e) {
			System.err.println("Exception");
			throw new RuntimeException();
		}
		}
	
	public void walk() throws InterruptedException 
	{
		Learnhandling obj = new Learnhandling();
		obj.run();
		Thread.sleep(3000);
		
	}
	*/
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		try {
			driver.findElementById("username1").sendKeys("Demosalesmanager");
		} catch (NoSuchElementException e) {
			System.err.println("No element found!!");
			throw new NoSuchElementException("Username not found");
		}
		driver.findElementById("password").sendKeys("crmsfa");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
