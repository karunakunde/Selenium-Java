package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_5 {
	
	/*
    URL: https://testautomationpractice.blogspot.com/
  	Exercise 4: Locate a table row using XPath with positional indexing.

*/
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();
		
		
		
		WebElement tableRow = webDriver.findElement(By.xpath("//table[@name='BookTable']//tr[1]"));
		// Get all child elements (columns or <td> tags) of the table row
		List<WebElement> childElements = tableRow.findElements(By.xpath("./*"));
		Thread.sleep(1000);

		// Scroll into view using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);", tableRow);

		// Print the text content of each child element
		for (WebElement child : childElements) {
		    System.out.print(child.getText()+"  ");
		}
	
		
		webDriver.quit();

	}
}
