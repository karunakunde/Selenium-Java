import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
		
		webDriver.get("https://omayo.blogspot.com/");
		
		try {
	    //--------perform task after alert is present--------------		
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("This line is printed after alert is visible on screen");
		}catch(Exception e) {
			System.err.println(e);
			System.out.println("This line is printed because alert is not on screen");

		}
		
		try {
		    //--------perform task after button is disable--------------	
			WebElement webElement = webDriver.findElement(By.id("myBtn"));
			Thread.sleep(5);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			System.out.println("This line is printed after button is enabled on screen");
			}catch(Exception e) {
				System.err.println(e);
				System.out.println("after timeout button is still disabled so expection occured");

			}
		
		

	}

}
