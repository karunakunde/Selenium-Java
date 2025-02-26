package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.TestBase;

public class Inventory extends TestBase {

	@FindBy(xpath = "//div[@class='app_logo']")
	private WebElement appLogoText;
	
	@FindBy(xpath = "//span[@class='title']")
	private WebElement headerTitle;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filterDropDown;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartLink;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']/span")
	private WebElement cartCountText;
	
	@FindBy(xpath = "//div[@class='inventory_item_name ']")
	private List<WebElement> productNames;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement> productprices;
	
	@FindBy(xpath = "//div[@class='inventory_item'][1]")
	private WebElement firstProduct;
	
	//products
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement saucelabsbackpack_6;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement saucelabsbikelight_1;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement saucelabsbolttshirt_2;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement saucelabsfleecejacket_3;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement saucelabsonesie_4;
	
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement allthethingstshirtred_5;
	
	//social icon
	@FindBy(xpath = "//a[text()='Twitter']")
	private WebElement TwitterIcon;
	
	@FindBy(xpath = "//a[text()='Facebook']")
	private WebElement FacebookIcon;
	
	@FindBy(xpath = "//a[text()='LinkedIn']")
	private WebElement linkedinIcon;
	
	//footer text
	@FindBy(xpath = "//a[text()='footer_copy']")
	private WebElement footerText;
	
	//hamburger menu 
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement hamburgerBtn;

	@FindBy(xpath = "//div[@class='bm-menu-wrap']")
	private WebElement sideMenuBar;
	
	@FindBy(xpath = "//button[@id='react-burger-cross-btn']")
	private WebElement crossBtn;
	
	
	
	
	public Inventory()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void add3ProductsToCart()
	{
		saucelabsbikelight_1.click();
		saucelabsbolttshirt_2.click();
	    saucelabsfleecejacket_3.click();
	    
	}
	public void addAll6ProductsToCart()
	{
		saucelabsbikelight_1.click();
		saucelabsbolttshirt_2.click();
	    saucelabsfleecejacket_3.click();
	    saucelabsonesie_4.click();
	    allthethingstshirtred_5.click();
	    saucelabsbackpack_6.click();
	}

	public String getHeaderTitle() {
			
		return headerTitle.getText();
	}
	public String getApplicationUrl() {
		return driver.getCurrentUrl();
	}

	
	public String getApplicationTitle() {
		return driver.getTitle();
	}
	
	public String getCartItemCount() {
		return cartCountText.getText();
	}
	

	
	public void filterNameAToZ()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Name (A to Z)");
	}
	
	public void filterNameZToA()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Name (Z to A)");
	}
		
	public void filterByPriceLowToHigh()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Price (low to high)");
	}
	
	public void filterByPriceHighToLow()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Price (high to low)");
	}
	
	public boolean isTwitterIconPresent() {
		
		return TwitterIcon.isDisplayed();
	}
	
	public boolean isFacebookIconPresent() {
			
		return FacebookIcon.isDisplayed();
		}

	public boolean isLinkeinIconPresent() {
		
		return linkedinIcon.isDisplayed();
	}
	
	public void clickHamburgerMenu(){
		hamburgerBtn.click();
		}
	
	public void clickCrossBtn() {
		crossBtn.click();
	}

	public boolean isSideMenudisplayed() {
		// TODO Auto-generated method stub
		return sideMenuBar.isDisplayed();
	}
	
	public List<String> getProductNames()
	{
		List<String> allProductNames = new ArrayList<String>();
		for(WebElement name : productNames)
		{
			
			allProductNames.add(name.getText());
			
		}
		return allProductNames;
	}
	
	public List<Double> getProductPrices() {
		// TODO Auto-generated method stub
        List<Double> allProductPrices = new ArrayList<Double>();
        for(WebElement priceText : productprices)
        {
        	Double price =  Double.parseDouble(priceText.getText().replace("$", "").trim());
            allProductPrices.add(price);
        }
        	return allProductPrices;
	}
	
}
