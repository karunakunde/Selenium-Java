package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_7 {
	
	/*
    URL: https://testautomationpractice.blogspot.com/
  	Exercise 7: Automate a checkbox selection using name attribute.



*/
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();
		
		
		
		WebElement checkbox = webDriver.findElement(By.id("sunday"));
		// Get all child elements (columns or <td> tags) of the table row
		Thread.sleep(1000);

		/*
		 * // Scroll into view using JavaScriptExecutor JavascriptExecutor js =
		 * (JavascriptExecutor) webDriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", toggleButton);
		 */
		// Print the text content of each child element
		checkbox.click();
		Thread.sleep(1000);	
		checkbox.click();

		

	}
}
