package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationBeforeMethod {
	
	//login
	//search--->@Test
	//logout
	//login
	//advance-search
	//logout
	
	@BeforeMethod
	void login()
	{
		System.out.println("I am login method");
		
	}
	@AfterMethod
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
