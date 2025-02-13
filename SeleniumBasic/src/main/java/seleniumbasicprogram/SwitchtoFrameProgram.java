package seleniumbasicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrameProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='s']"));
		searchBox.sendKeys("Iframes");
		Thread.sleep(2000);
		searchBox.clear();
		Thread.sleep(2000);
		searchBox.sendKeys("windows");

		WebElement iframeBtn = driver.findElement(By.xpath("//li[@id='iFrame']"));
		iframeBtn.click();
		Thread.sleep(5000);
		driver.switchTo().frame("globalSqa");
		WebElement iframeSearchBox = driver.findElement(By.xpath("//input[@id='s']"));
		iframeSearchBox.sendKeys("inner iframe");
		Thread.sleep(2000);
		iframeSearchBox.clear();
		iframeSearchBox.sendKeys("done");
		
		driver.switchTo().defaultContent();
		searchBox.clear();
		searchBox.sendKeys("switched to parent");
		Thread.sleep(3000);
		driver.close();
		
		

		

	}

}
