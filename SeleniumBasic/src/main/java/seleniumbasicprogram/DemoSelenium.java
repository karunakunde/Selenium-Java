package seleniumbasicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com/");
	    webDriver.manage().window().maximize();
		Thread.sleep(3000);
		webDriver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		webDriver.navigate().to("http://www.instagram.com");
		Thread.sleep(3000);
	    webDriver.navigate().back();
		Thread.sleep(3000);

		webDriver.close();
	
	}

}
