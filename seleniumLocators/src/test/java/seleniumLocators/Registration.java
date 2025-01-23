package seleniumLocators;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Registration {

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
		webDriver.get("https://practice.automationtesting.in/my-account/");
		
		webDriver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("Karuna");
		WebElement a =webDriver.findElement(By.xpath("//input[@id='reg_email']"));
		
		WebElement r =webDriver.findElement(By.xpath("//input[@value='Register']"));
		WebElement check =webDriver.findElement(By.xpath("//input[@id='rememberme']"));

		Actions act = new Actions(webDriver);
		a.sendKeys("-----");
		act.moveToElement(check).click().sendKeys("first").moveToElement(r).click().perform();
		Thread.sleep(1000);
		
		//webDriver.close();

		

	}

}
