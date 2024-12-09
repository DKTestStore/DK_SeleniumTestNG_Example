package com.selenium.calc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class subtractparam {

	@Test
	@Parameters({"a","b"})
	public void subtract(int a,int b)
	{
		int c =b-a;
		System.out.println("This is Subtraction value is :" + c);
	}
	
}
