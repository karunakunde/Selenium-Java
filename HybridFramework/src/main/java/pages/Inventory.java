package pages;

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
	
	public Inventory()
	{
		PageFactory.initElements(driver, this);
	}

	public String getHeaderTitle() {
			
		return headerTitle.getText();
	}
	public String verifyURLOfApplication() {
		return driver.getCurrentUrl();
	}

	
	public String verifyTitleOfApplication() {
		return driver.getTitle();
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
	
	public void filterNameLowToHigh()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Price (low to high)");
	}
	
	public void filterNameHighToLow()
	{
		Select filter = new Select(filterDropDown);
		filter.selectByVisibleText("Price (high to low)");
	}
}
