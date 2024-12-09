package com.selenium.fruits;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fruits {

    @Test
    @Parameters("apple")
	public void addApple(String Apple)
	{
		System.out.println("This is the Fruit :" +Apple);
	}
	
}
