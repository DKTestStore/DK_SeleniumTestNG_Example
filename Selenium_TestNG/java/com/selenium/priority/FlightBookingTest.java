package com.selenium.priority;

import org.testng.annotations.Test;

public class FlightBookingTest {
	
	
	@Test(priority = 2)
	public void LoginintoApp()
	{
		System.out.println("Login into Application ");
	}
	@Test(priority = 5)
   public void LogoutFromApp()
   {
	   System.out.println("Logout Out From the App ");
   }
	@Test(priority = 1)
   public void SigninToApp()
   {
		System.out.println("Sign in to the Application ");
	   
   }
   
	@Test(priority = 3)
   public void SearchtheFlight()
   {
	   System.out.println("Search the Flight ");
   }
	@Test(priority = 4)
   public void BooktheFlight()
   {
	   System.out.println("Book the Flight ");
   }
   
}
