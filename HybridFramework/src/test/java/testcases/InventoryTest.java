package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
	public void setup() throws IOException {
		initialization();
		lg = new Login();
		lg.logintoapplication();
		inventory = new Inventory();		
		
	}
	

	@Test(enabled = false)
	public void add3ProductToCartTest() throws InterruptedException {
		String expCount="3";
		inventory.filterNameZToA();
		inventory.add3ProductsToCart();
		String actualCartCount = inventory.getCartItemCount();
		Assert.assertEquals(actualCartCount,expCount);
		Reporter.log("Total products added into the cart = "+actualCartCount);


	}
	
	@Test(enabled = false)
	public void addAll6ProductToCartTest() throws InterruptedException {
		String expCount="6";
		inventory.filterNameZToA();
		inventory.addAll6ProductsToCart();
		String actualCartCount = inventory.getCartItemCount();
		Assert.assertEquals(actualCartCount,expCount);
		Reporter.log("Total products added into the cart = "+actualCartCount);


	}
	@Test(enabled = false)
	public void verifyTitleOfApplicaton() {
		String expUrl = "Swag Labs";
		String actUrl = inventory.getApplicationTitle();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	@Test(enabled = false)
	public void verifyHeaderTitle() {
		String expUrl = "Products";
		String actUrl = inventory.getHeaderTitle();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	@Test(enabled = false)
	public void verifyURLOfApplication() {
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = inventory.getApplicationUrl();
		Assert.assertEquals(actUrl, expUrl);
		
	}
	@Test(enabled = false)
	public void verifyFacebookIconDisplayed()
	{
		Assert.assertTrue(inventory.isFacebookIconPresent(), "Facebook icon is not displayed");
	}
	
	@Test(enabled = false)
	public void verifyTwitterIconDisplayed()
	{
		Assert.assertTrue(inventory.isTwitterIconPresent(), "Twitter icon is not displayed");
	}
	@Test(enabled = false)
	public void verifyLinkedinIconDisplayed()
	{
		Assert.assertTrue(inventory.isLinkeinIconPresent(), "Linkedin icon is not displayed");
	}
	
	@Test(enabled = false)
	public void testHamburgerMenu() throws InterruptedException
	{
		inventory.clickHamburgerMenu();
		Assert.assertTrue(inventory.isSideMenudisplayed(), "Menu did not open!");
		inventory.clickCrossBtn();
		Thread.sleep(5000);
		Assert.assertFalse(inventory.isSideMenudisplayed(), "Menu did not close!");
        
	}
	
	@Test
	private void verfifyAToZFilter() {
		// TODO Auto-generated method stub
		
		inventory.filterNameAToZ();
		List<String> actual = inventory.getProductNames();
        List<String> expected = new ArrayList<>(actual);
	    Collections.sort(expected); //expected order
	    Assert.assertEquals(actual, expected,"Product are not in A to Z order");
	    Reporter.log("Sorted Product: "+actual);
	}
	
	@Test
	private void verfifyZToAFilter() {
		// TODO Auto-generated method stub
		
		inventory.filterNameZToA();
		List<String> actual = inventory.getProductNames();
        List<String> expected = new ArrayList<>(actual);
	    Collections.sort(expected);
	    Collections.reverse(expected);//expected order
	    Assert.assertEquals(actual, expected,"Product are not in Z to A order");
	    Reporter.log("Sorted Product: "+actual);
	}
	
	@Test
	private void verfifyLowToHighFilter() {
		// TODO Auto-generated method stub
		
		inventory.filterByPriceLowToHigh();
		List<Double> actual = inventory.getProductPrices();
        List<Double> expected = new ArrayList<>(actual);
	    Collections.sort(expected);
	    Assert.assertEquals(actual, expected,"Product are not in Low to High order");
	    Reporter.log("Sorted Product(Ascending): "+actual);
	}
	
	@Test
	private void verfifyHighToLowFilter() {
		// TODO Auto-generated method stub
		
		inventory.filterByPriceLowToHigh();

		List<Double> actual = inventory.getProductPrices();
        List<Double> expected = new ArrayList<>(actual);
	    Collections.sort(expected);
	    Collections.reverse(expected);//expected order
	    Assert.assertEquals(actual, expected,"Product are not in High to Low order");
	    Reporter.log("Sorted Product(Descending): "+actual);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
