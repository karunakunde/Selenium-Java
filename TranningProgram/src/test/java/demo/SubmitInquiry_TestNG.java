package demo;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class SubmitInquiry_TestNG {

	@Test
	public void submitInquiry_TestNG() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://bymatautomation.com/");
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "BYMAT Automation – Boost your Mind with Automation Technology";
	    Assert.assertEquals(actualTitle,expectedTitle);
		//taking screenshot of full page
		TakesScreenshot takesScreenshot = (TakesScreenshot)webDriver;
		Thread.sleep(10);
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    System.out.println("Source File : "+sourceFile.getAbsoluteFile());
	     
	    File f2 = new File("./screenshots/newfile.png");
	    
	    try {
			Files.copy(sourceFile, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Thread.sleep(10);
	   
	
	}

}
