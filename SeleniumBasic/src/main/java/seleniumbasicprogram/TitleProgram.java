package seleniumbasicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("title of the web page:"+driver.getTitle());
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		Thread.sleep(5000);
		driver.close();

	}

}
