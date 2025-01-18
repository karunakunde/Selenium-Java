package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_9 {

	/*
	 * URL: https://testautomationpractice.blogspot.com/ 
	 * Automate navigation through breadcrumbs using link text.

	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();

		List<WebElement> chekBoxes = webDriver.findElements(By.xpath("//label[@for='days']/following-sibling::div/input"));
		// Get all child elements (columns or <td> tags) of the table row
		 Thread.sleep(1000);
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) webDriver;
			 * js.executeScript("arguments[0].scrollIntoView(true);", chekBoxes);
			 */

	    for(WebElement checkbox :chekBoxes )
	    {
	    	checkbox.click();
	    	Thread.sleep(1000);
	    }
	     
		Thread.sleep(1000);
		webDriver.quit();
	}
}
