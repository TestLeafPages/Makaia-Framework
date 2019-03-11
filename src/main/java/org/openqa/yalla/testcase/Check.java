package org.openqa.yalla.testcase;

import org.testng.annotations.Test;

public class Check {
	@Test()
	public void first() {
	String s = "test";
	String substring = s.substring(2, s.length());
	System.out.println(substring);
	}
	/*@Test(dependsOnMethods = "third")
	public void second() {
		System.out.println("Second method");
	}
	@Test(dependsOnMethods = "first")
	public void third() {
		System.out.println("Third method");
	}
*/
}
