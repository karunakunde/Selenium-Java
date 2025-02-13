package seleniumbasicprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("http://www.google.com");
		Thread.sleep(4000);
		TakesScreenshot takesScreenshot = (TakesScreenshot)web;
		//File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file = new File("./screenshots/pic.jpeg");
        WebElement w = web.findElement(By.xpath("//textarea[@id='APjFqb']"));
        File f1=w.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f1, file);
         
	}

}
