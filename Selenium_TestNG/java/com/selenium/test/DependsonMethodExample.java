package com.selenium.test;

import org.testng.annotations.Test;

public class DependsonMethodExample {
	
	
	@Test(enabled=true)
	public void TenthGrade()
	{
	  System.out.println("This is Tenth Grade ");	
	}
	
	@Test(dependsOnMethods = {"TenthGrade"})
	public void  HigherSecondaryGrade()
	{
		System.out.println("This is the Higher Secondary Grade");
	}

	@Test(dependsOnMethods = {"TenthGrade","HigherSecondaryGrade"})
	public void UGGrade()
	{
		System.out.println("This is UG Grade");
	}
	
	@Test(dependsOnMethods = {"TenthGrade","HigherSecondaryGrade","UGGrade"})
	public void PGGrade()
	{
		System.out.println("This is PG Grade");
	}
	
	@Test(dependsOnMethods = {"TenthGrade","HigherSecondaryGrade","UGGrade","PGGrade"})
	public void MockInterviewGrade()
	{
		System.out.println("This is Mock Interview Result");
	}
	
	@Test(dependsOnMethods = {"TenthGrade","HigherSecondaryGrade","UGGrade","PGGrade","MockInterviewGrade"})
	public void ActualInterviewResult()
	{
	   System.out.println("This is Actual Interview Result");	
	}
  	
}
