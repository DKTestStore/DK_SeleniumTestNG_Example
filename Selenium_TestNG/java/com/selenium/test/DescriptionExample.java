package com.selenium.test;

import org.testng.annotations.Test;

public class DescriptionExample {
	
	@Test(description = "This Example Test One")
	public void DescExample()
	{
		System.out.println("This is the Desc Example Test Case");
	}
	
	@Test(description = "This is Test 2 Example")
	public void Test2()
	{
		System.out.println("This is the Test2");
	}
	

}
