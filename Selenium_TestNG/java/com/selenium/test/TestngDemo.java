package com.selenium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("This is Before Suite");
  }
	
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("This is Before Test");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("This is Before Class");
  }
	
  @BeforeMethod
	public void beforemethod()
	{
	   System.out.println("This is Before Method");
	}

	@Test
	public void testmethod()
	{
		System.out.println("This is Test Method information");
	}
	
	@Test()
	public void testmethod2()
	{
		System.out.println("This is Test Method 2");
	}
	
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("This is After Method");
	}
	
	@AfterClass()
	public void afterclass()
	{
		System.out.println("This is After Class");
	}
	
	@AfterTest()
	public void afterTest()
	{
		System.out.println("This is After Test");
	}
	
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("after suite Method");
    }
	
}



