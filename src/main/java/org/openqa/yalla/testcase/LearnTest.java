package org.openqa.yalla.testcase;

import org.testng.annotations.Test;

public class LearnTest {
	@Test(invocationCount=2)
	public void createlead()
	{
		System.out.println("I am from Create Lead");
	}
	@Test(enabled=false)
	public void mergelead()
	{
		System.out.println("I am from Merge Lead");
	}
	@Test(dependsOnMethods="createlead")
	public void editlead()
	{
		System.out.println("I am from Edit Lead");
		
	}

}
