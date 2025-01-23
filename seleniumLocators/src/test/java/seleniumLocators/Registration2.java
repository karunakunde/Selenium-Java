package seleniumLocators;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Registration2 {

	public static void main(String[] args) throws InterruptedException {
	
		/*
		 * 1. Open Chrome and maximise it 2. Navigate to the Website -
		 * https://practice.automationtesting.in/my-account/ 
		 * 3. Register yourself 4.
		 * Wait for 10 seconds 
		 * 5. Close the browser
		 */
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement source =webDriver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target =webDriver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement text =webDriver.findElement(By.xpath("//input[@id='name']"));//*[@id="HTML2"]

		Actions act = new Actions(webDriver);
		// 1.  act.moveToElement(text).click().sendKeys("karuna").moveToElement(source).dragAndDrop(source,target).perform();
		// 2. act.moveToElement(text).click().sendKeys("karuna").dragAndDrop(source,target).perform();
		/* 3*/ act.dragAndDrop(source,target).perform();

		Thread.sleep(1000);
		
		//webDriver.close();

		

	}

}
