package testng;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = 1)
	void viewProfile()
	{
		System.out.println("This is view profile method");
	}
	@Test(priority = 2)
	void editPRofile()
	{
		System.out.println("This is edit profile method");
	}

	

}
