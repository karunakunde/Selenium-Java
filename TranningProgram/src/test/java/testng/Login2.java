package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login2 {
	
	@Parameters("browser")
	@BeforeClass	
	void login(String br)
	{
		
		System.out.println("This is login method "+br);
	}
	@Test(groups="regression")
	void signup()
	{
		System.out.println("This is signup method");
	}

	@Test(groups= {"sanity","regression"})
	void search()
	{
		System.out.println("This is search method");
	}


}
