package com.selenium.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp  implements ITestListener
{
    public void OnTestStart(ITestResult result)
	{
    	System.out.println("This is On Test Result ");
		
	}
	
    @Override  
    public void onTestSuccess(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Success of test cases and its details are : "+result.getName());  
    } 
    
    public void onTestFailure(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
}
