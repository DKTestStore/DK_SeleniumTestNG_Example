package com.selenium.calc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multipleparam {

	@Test
	@Parameters({"a","b"})
	public void Multiple(int a ,int b)
	{
		int c = a*b;
		
		System.out.println("This is Multiplication value is : " + c);
	}

}
