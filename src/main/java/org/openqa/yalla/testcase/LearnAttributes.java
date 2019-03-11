package org.openqa.yalla.testcase;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(invocationCount=2,threadPoolSize=3)
	public void sleep()
	{
		System.out.println("Sleeping");
		throw new RuntimeException();
	}
	@Test(enabled=false)
	public void run()
	{
		System.out.println("Run");
	}
	@Test(dependsOnMethods="sleep", alwaysRun=true)
	public void walk()
	{
		System.out.println("Walk");
	}

}
