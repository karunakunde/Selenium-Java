import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver webDriver = new ChromeDriver();
	 
	   webDriver.manage().window().maximize();

	   webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  	   
	   System.out.println(webDriver.getTitle());
	   
	   System.out.println(webDriver.getCurrentUrl());
	  
	   System.out.println("----------------------------------------------------------------------");
	   System.out.println(webDriver.getPageSource());
	   
		 Thread.sleep(4000);

	   webDriver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   
	   String parentWindow = webDriver.getWindowHandle();
	   System.out.println("Parent Window:"+ parentWindow);
	   
	   Set<String> windows = webDriver.getWindowHandles();
	   
	   for(String window : windows)
	   {
		   if(!window.equals(parentWindow)) {
			   webDriver.switchTo().window(window);
			   System.out.println("Switched to another window"+window);
		   }
	   }
	   
	   webDriver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//button[text()='Contact Sales']")).click();
	   

	   System.out.println("Program end");
	   Thread.sleep(1000);
	   webDriver.switchTo().window(parentWindow);
	   System.out.println("Again switched to parent window");

	  // webDriver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   Thread.sleep(1000);

	   webDriver.quit();
	}

}
