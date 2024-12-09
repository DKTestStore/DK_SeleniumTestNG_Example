package com.selenium.test;

import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(groups = {"Search Engine"} )
	public void Google()
	{
		System.out.println("This is  Google Search Enginee");
	}
	
	@Test(groups = {"Search Engine"} )
	public void Yahoo()
	{
		System.out.println("This is Yahoo Search Engine");
	}
	
	@Test(groups = {"Search Engine"} )
    public void Bing()
    {
    	System.out.println("This is Bing Search Engine");
    }
   
	@Test(groups = {"Browser Group"}, priority = 1 )
    public void chrome()
    {
    	System.out.println("This is Chrome Browser");
    }
	
	@Test(groups = {"Browser Group"},priority = 2 )
    public void firefox()
    {
    	System.out.println("This is firefox Browser");
    }
	
	@Test(groups = {"Browser Group"} ,priority = 3 )
    public void edge()
    {
    	System.out.println("This is Edge Browser");
    }
    
	@Test(groups = {"Database Group"} )
    public void oracle()
    {
    	System.out.println("This is Oracle Database");
    }
    
	@Test(groups = {"Database Group"} )
    public void MongoDB()
    {
    	System.out.println("This is Mongo DB Database");
    }
	
	@Test(groups = {"Database Group"} )
    public void MySQL()
    {
    	System.out.println("This is MySQL Database");
    }
    
}
