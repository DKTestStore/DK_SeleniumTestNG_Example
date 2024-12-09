package com.selenium.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchbrowser {

 @BeforeMethod()
 public void LauchBrowser()
 {
	//  Webdriver driver = new ChromeDriver();
 }
	
	@AfterMethod()
	public void TearDown()
	{
		System.out.println("after teardown");
	}
}
