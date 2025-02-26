package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItem {
	
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement backToProductBtn;
	
	@FindBy(xpath = "//div[@data-test='inventory-item-name']")
	private WebElement itemName;
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement cartCountText;
	
	@FindBy(xpath = "//img[@class='inventory_details_img']")
	private WebElement itemImage;
	
	
	

}
