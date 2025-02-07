 package demo;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreentShotSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement webElement = webDriver.findElement(By.xpath("//span[text()='right click me']"));
		File sourceFile=webElement.getScreenshotAs(OutputType.FILE);
		//taking screenshot of full page
		TakesScreenshot takesScreenshot = (TakesScreenshot)webDriver;
		Thread.sleep(10);
	    //File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    System.out.println("Source File : "+sourceFile.getAbsoluteFile());
	     
	    File f2 = new File("./screenshots/newfile.png");
	    File f3 = new File(System.getProperty("user.dir")+"\\screenshots\\kk.png");
	    try {
			Files.copy(sourceFile, f2);
			Files.copy(sourceFile, f3);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Thread.sleep(10);
	    System.out.println(f2.getAbsolutePath());
	   
	
	}

}
