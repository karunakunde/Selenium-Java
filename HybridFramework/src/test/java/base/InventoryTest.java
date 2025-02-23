package base;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Inventory;
import pages.Login;
import testbase.TestBase;

public class InventoryTest extends TestBase{
	Login lg;
	Inventory inventory;
	
	@BeforeMethod
	public void setup() {
		initialization();
		lg = new Login();
		lg.logintoapplication();
		inventory = new Inventory();		
		
	}
	

	
	
	@Test
	public void filterProductsAtoZ() throws InterruptedException {
		Thread.sleep(3000);
		inventory.filterNameZToA();
	}

	@Test
	public void verifyHeaderTitle() {
		String expUrl = "Products";
		String actUrl = inventory.getHeaderTitle();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	@Test
	public void verifyURLOfApplication() {
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = inventory.verifyURLOfApplication();
		Assert.assertEquals(actUrl, expUrl);
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
