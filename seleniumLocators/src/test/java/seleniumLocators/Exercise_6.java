package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_6 {
	
	/*
    URL: https://testautomationpractice.blogspot.com/
  	Exercise 5: Locate a dynamic element with changing IDs using XPath contains() function.


*/
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();
		
		
		
		WebElement toggleButton = webDriver.findElement(By.xpath("//button[contains(text(),'ST')]"));
		// Get all child elements (columns or <td> tags) of the table row
		Thread.sleep(1000);

		/*
		 * // Scroll into view using JavaScriptExecutor JavascriptExecutor js =
		 * (JavascriptExecutor) webDriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", toggleButton);
		 */
		// Print the text content of each child element
		toggleButton.click();
		Thread.sleep(1000);	
		toggleButton.click();

		

	}
}
