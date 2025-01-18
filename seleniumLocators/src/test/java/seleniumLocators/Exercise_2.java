package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_2 {
	
	/*
    URL: https://testautomationpractice.blogspot.com/
  	Exercise 2: 
  	1.Select a dropdown menu using tag name and choose an option.
  	2. select "Item 10"
*/
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		webDriver.manage().window().maximize();
		WebElement dropdown = webDriver.findElement(By.xpath("//input[@id='comboBox']"));
		dropdown.click();
		
		// Scroll into view using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropdown);

		Thread.sleep(1000);

		List<WebElement> options = webDriver.findElements(By.xpath("//div[@class='option']"));
	
		for(WebElement option : options)
		{
			if(option.getText().equals("Item 10"))
				{option.click();
				  break;
				}
		}
		
		//webDriver.quit();

	}
}
