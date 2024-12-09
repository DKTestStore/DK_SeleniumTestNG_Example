package com.selenium.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RollNumberExample {

	@Test(dataProvider = "getdata")
	public void setData(String name, String rollNo) 
	{ 
	   System.out.println("Name: " +name); 
	   System.out.println("RollNo: " +rollNo); 
	}
	
	
	@DataProvider(name="getdata")
	public Object[][] DataProvideMethod()
	{
		
		Object[][] data =new Object[3][2]; 
		
		 data[0][0] ="dhina";
		 data[0][1]="01";
		
	     data[1][0] = "jaya"; 
	     data[1][1] = "02"; 
 
	     data[2][0] = "lakshmi";  
	     data[2][1] = "013"; 
	     
	     return data;
		
	}
	
	
}
