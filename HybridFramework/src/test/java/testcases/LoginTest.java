package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Inventory;
import pages.Login;
import testbase.TestBase;

public class LoginTest extends TestBase{
	Login lg;
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		lg = new Login();
		
	}
	@Test
	public void verifyURLOfApplication() {
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = lg.verifyURLOfApplication();
		Assert.assertEquals(actUrl, expUrl);
		
	}

	@Test
	public void verifyTitleOfApplication() {
		String expUrl = "Swag Labs";
		String actUrl = lg.verifyTitleOfApplication();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	@Test
	public void logintoapplication() throws IOException {
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = lg.logintoapplication();
		Assert.assertEquals(actUrl, expUrl);
		Reporter.log("Login successful--"+actUrl);
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
