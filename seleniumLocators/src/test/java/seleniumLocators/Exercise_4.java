package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_4 {
	
	/*
    URL: https://www.facebook.com/
  	Exercise 4: Find an element using CSS selector with direct attribute matching (e.g., [name='login']).

*/
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.facebook.com/");
		webDriver.manage().window().maximize();
		
		//tag#id
		WebElement usernamefield = webDriver.findElement(By.cssSelector("input#email"));
		usernamefield.sendKeys("karuna");
		
		
		WebElement passwordfield = webDriver.findElement(By.xpath("//input[@id='pass']"));
		passwordfield.sendKeys("karuna");
		
		//tag[atrribute='value']
		WebElement loginBtn = webDriver.findElement(By.cssSelector("button[name='login']"));
		Thread.sleep(1000);
		loginBtn.click();
		
		//webDriver.quit();

	}
}
