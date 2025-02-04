package testng;

import org.testng.annotations.Test;

public class Login_Multiple_Grouping {
	
	@Test(groups="smoke")
	void login()
	{
		System.out.println("This is login method");
	}
	@Test(groups="regression")
	void signup()
	{
		System.out.println("This is signup method");
	}

	@Test(groups= {"sanity","regression","a"})
	void search()
	{
		System.out.println("This is search method");
	}


}
