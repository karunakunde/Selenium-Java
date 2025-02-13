package seleniumbasicprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselctDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		Thread.sleep(3000);
		WebElement ele = webDriver.findElement(By.xpath("//button[@id=\"accept_cookies_btn\"]"));
		ele.click();
		Thread.sleep(0);
		WebElement selctdrop = webDriver.findElement(By.xpath("//div[@id='select-wrapper-513558']"));
	    selctdrop.click();
		
	    
	    	webDriver.close();
	    
	}

}
