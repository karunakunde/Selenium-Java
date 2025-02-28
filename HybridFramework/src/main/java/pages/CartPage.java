package pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath = "//span[@id='shopping_cart_badge']")
	WebElement cartCount;
	
	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement headerLabel;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement hamburgerMenuBtn;
	
	@FindBy(xpath = "//button[@id='react-burger-cross-btn']")
	WebElement closeMenuBtn;
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	WebElement continueShoppBtn;
	
	@FindBy(xpath = "//a[@id='reset_sidebar_link']")
	WebElement resetMenuLink;
	
	@FindBy(xpath = "//a[@id='inventory_sidebar_link']")
	WebElement allItemsMenuLink;
	
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	WebElement aboutMenulink;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutMenulink;
	
	Actions action;
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

	}
	public String getApplicationUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnCheckout() {
		// TODO Auto-generated method stub
       checkoutBtn.click();
	}
	
	public void clickOnHamburgerBtn() {
		
		hamburgerMenuBtn.click();
		
	}
	public void clickOnCloseBtn() {
			
			closeMenuBtn.click();
			
	}
	public void clickOnAllItems()
	{
		allItemsMenuLink.click();
		//action.moveToElement(allItemsMenuLink).click().pause(Duration.ofSeconds(3000)).click().build().perform();
	}
	
	public void clickOnAbout()
	{
		aboutMenulink.click();
		//action.moveToElement(aboutMenulink).click().pause(Duration.ofSeconds(3000)).click().build().perform();;
	}
	
	public void clickOnLogout()
	{
		logoutMenulink.click();
		//action.moveToElement(logoutMenulink).click().pause(Duration.ofSeconds(3000)).click().build().perform();;
	}
	public void clickOnResetState()
	{
		resetMenuLink.click();
		//action.moveToElement(resetMenuLink).click().pause(Duration.ofSeconds(3000)).build().perform();;
	}
	public void continueShoppingBtn() {
		// TODO Auto-generated method stub
       continueShoppBtn.click();
	}
}
