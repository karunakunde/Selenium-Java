package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramerazation {
	
	@Parameters({"browser","url"})
	@BeforeClass	
	void login(String br,String url)
	{
		
		System.out.println("Browser "+br+"\nURL "+url);
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
