package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.Inventory;
import pages.Login;
import testbase.TestBase;

public class CartTest extends TestBase {
	
	Login login;
	Inventory inventory;
	CartPage cartPage;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		login = new Login();
		login.logintoapplication();
		inventory = new Inventory();
		inventory.add3ProductsToCart();
		inventory.clickOnCart();
	    cartPage = new CartPage();
				
	}
	@Test(enabled = false)
	public void verifyApplicationUrl()
	{
		String actual = inventory.getApplicationUrl();
		String expected = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(actual, expected);
	}
	@Test(enabled = false)
	public void verifyApplicationTitle()
	{
		String actual = inventory.getApplicationTitle();
		String extected = "Swag Labs";
		Assert.assertEquals(actual, extected);
	}
	
	
	@Test(enabled = false)
	public void verifyCheckout() throws InterruptedException
	{
		cartPage.clickOnCheckout();
		String actual = cartPage.getApplicationUrl();
		String expected = "https://www.saucedemo.com/checkout-step-one.html";
		Thread.sleep(4000);
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void verifyContinueShoppingBtn() throws InterruptedException
	{
		cartPage.continueShoppingBtn();
		String actual = "https://www.saucedemo.com/inventory.html";
		String expected = cartPage.getApplicationUrl();
		Thread.sleep(3000);
		Assert.assertEquals(actual, expected,"Continue shpooing button not working as expected");
		Reporter.log("Continue shpooing button working as expected");
	}
	
	@Test(priority = 1)
	public void verifyAllItemsMenu() throws InterruptedException {
		cartPage.clickOnHamburgerBtn();
		Thread.sleep(3000);
        cartPage.clickOnAllItems();
		String actual = "https://www.saucedemo.com/inventory.html";
		String expected = cartPage.getApplicationUrl();
		Assert.assertEquals(actual, expected,"All Items Menu not working");
		Reporter.log("All Items Menu working as expected");
	}
	
	@Test(priority = 2)
	public void verifyAboutMenu() throws InterruptedException {
		cartPage.clickOnHamburgerBtn();
		Thread.sleep(3000);
		cartPage.clickOnAbout();
		String actual = "https://saucelabs.com/";
		String expected = cartPage.getApplicationUrl();
		Assert.assertEquals(actual, expected,"About Menu not working as expected");
		Reporter.log("About menu working as expected");
	}
	@Test(priority = 3)
	public void verifyLogoutMenu() throws InterruptedException {
		cartPage.clickOnHamburgerBtn();
		Thread.sleep(3000);
		cartPage.clickOnLogout();
		String actual = "https://www.saucedemo.com/";
		String expected = cartPage.getApplicationUrl();
		Assert.assertEquals(actual, expected,"Logout Menu not working as expected");
		Reporter.log("Logout menu working as expected");
	}
	
	@Test(priority = 4)
	public void verifyResetAppMenu() throws InterruptedException {
		cartPage.clickOnHamburgerBtn();
		Thread.sleep(3000);
		cartPage.clickOnResetState();
		String actual = "https://www.saucedemo.com/cart.html";
		String expected = cartPage.getApplicationUrl();
		Assert.assertEquals(actual, expected,"Reset Menu not working as expected");
		Reporter.log("Reset menu working as expected");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
