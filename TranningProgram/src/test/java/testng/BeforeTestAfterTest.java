package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAfterTest {
	
	
	@BeforeTest
	void login()
	{
		
		System.out.println("This is login testCase");
	}
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search testCase");
	}
	@Test(priority = 2)
	void advancedSearch() {
		System.out.println("this is advanced Search testCase");
	}
	@AfterTest
	void logout() {
		System.out.println("This is logout testCase");
	}

}
