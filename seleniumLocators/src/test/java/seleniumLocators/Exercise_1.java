package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 *  URL: https://demo.opencart.com/
  	Exercise 1: Search for a Product
	Task:
	Locate the search bar and perform a product search using the id locator.
	
	Steps:	
	Open OpenCart.
	Find the search bar element using its ID (search).
	Input a product name like "iPhone".
	Click the search button.
 */
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://demo.opencart.com/");
		WebElement searchBar = webDriver.findElement(By.name("search"));
		searchBar.sendKeys("iPhone");
		
		WebElement searchBtn = webDriver.findElement(By.xpath("//input[@name='search']/following-sibling::button"));
		searchBtn.click();


		

	}

}
