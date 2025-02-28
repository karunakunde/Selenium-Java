package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath = "//span[@id='shopping_cart_badge']")
	WebElement cartCount;
	
	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement headerLabel;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn'")
	WebElement hamburgerMenuBtn;
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	WebElement continueShoppBtn;
	
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
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
	
	public void continueShoppingBtn() {
		// TODO Auto-generated method stub
       continueShoppBtn.click();
	}
}
