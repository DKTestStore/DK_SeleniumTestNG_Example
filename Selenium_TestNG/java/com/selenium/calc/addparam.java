package com.selenium.calc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class addparam {
	
	
	@Test
	@Parameters({"a","b"})
	public void addnum(int a, int b)
	{
		int c= a+b;
		System.out.println("The Sum Value is "+ c);	
	}
	

}
