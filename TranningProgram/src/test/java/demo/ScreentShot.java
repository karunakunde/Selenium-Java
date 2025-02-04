package demo;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreentShot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//taking screenshot of full page
		TakesScreenshot takesScreenshot = (TakesScreenshot)webDriver;
		Thread.sleep(10);
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    System.out.println("Source File : "+sourceFile.getAbsoluteFile());
	     
	    File f2 = new File("C:\\Users\\darek\\Downloads\\images\\newfile.png");
	    File f3= new File("./data/newfile.png");

	    
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
