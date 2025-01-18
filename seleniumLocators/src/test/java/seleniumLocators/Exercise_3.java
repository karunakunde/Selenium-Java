package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_3 {
	
	/*
    URL: https://www.facebook.com/
  	Exercise 2: Identify username ,password and a login button using class name and click it.
  	Select a dropdown menu using tag name and choose an option.
*/
	
	public static void main(String[] args) {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.facebook.com/");
		WebElement usernamefield = webDriver.findElement(By.xpath("//input[@id='email']"));
		usernamefield.sendKeys("karuna");
		
		WebElement passwordfield = webDriver.findElement(By.xpath("//input[@id='pass']"));
		passwordfield.sendKeys("karuna");
		
		WebElement loginBtn = webDriver.findElement(By.name("login"));
		loginBtn.click();
		
		//webDriver.quit();

	}
}
