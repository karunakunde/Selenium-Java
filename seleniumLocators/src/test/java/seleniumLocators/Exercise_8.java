package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_8 {

	/*
	 * URL: https://testautomationpractice.blogspot.com/ Exercise 8: Use partial
	 * link text to click on a hyperlink.
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();

		WebElement link = webDriver.findElement(By.partialLinkText("(Atom)"));
		// Get all child elements (columns or <td> tags) of the table row
		Thread.sleep(1000);
		 JavascriptExecutor js = (JavascriptExecutor) webDriver;
	        js.executeScript("arguments[0].scrollIntoView(true);", link);

		Thread.sleep(1000);
		link.click();
		webDriver.quit();
	}
}
