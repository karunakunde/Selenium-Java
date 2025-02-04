package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {
	
	//login ----@beforeclass
	//search
	//advanceSearch
	//logout  ---@afterclass

	@BeforeClass
	void login()
	{
		System.out.println("I am login method");
		
	}
	@AfterClass
	void logout()
	{
		System.out.println("I am logout method");
		
	}
   @Test(priority = 1)
	void search()
	{
		System.out.println("I am search method");
		
	}
   @Test(priority = 2)
	void advancedSearch()
	{
		System.out.println("I am advanced search method");
		
	}


}
