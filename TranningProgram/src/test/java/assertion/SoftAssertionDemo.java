package assertion;

import static org.testng.Assert.expectThrows;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	/* in hard assertion if testcase failed then further excution will not happen*/
	
	WebDriver driver;
	String url ;

	
	@Parameters({"browser","url"})
	@BeforeMethod
	void initialization(String browser,String url) {
		 this.url = url;
		switch (browser) {
		case "Chrome":  driver = new ChromeDriver();
			
			break;

		case "Edge":    driver = new EdgeDriver();
			break;
		case "Firefox": driver = new FirefoxDriver();
			break;
		default:  	    System.out.println("Illegal value");
			break;
		}
	}
	
	@Test
	void checkWindowTitle()
	{
		driver.get(url);
		String expectedTitle = "CURA Healthcare Service";
		String actualtitle = driver.getTitle();
		
		System.out.println("Before assertion: Check window Title");
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(expectedTitle,actualtitle );
		System.out.println("After assertion: Check window Title");
		softAssert.assertAll();

		
		
	}
	@Test(priority = 2)
	void checkUrl() {
		
		driver.get(url);
		String expectedUrl = "http://www.facebook.com";
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println("Before assertion: Check current url");
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(expectedUrl, actualUrl);
		System.out.println("After assertion: Check current url");
		softAssert.assertAll();
	}
	
	@Test(priority = 3)
	void checkHeadingDisplayed()
	{
		driver.get(url);
		boolean isDisplayed = driver.findElement(By.xpath("//h1[text()='CURA Healthcare Service']")).isDisplayed();
		System.out.println("Before Assertion: check heading is displyed");
	    SoftAssert	softAssert = new SoftAssert();
		softAssert.assertTrue(isDisplayed);
		System.out.println("Aftert assertion: check heading displyed");
		softAssert.assertAll();
	}
	
	@Test(priority = 4,dependsOnMethods = {"checkUrl"})
	void checkMakeAppointemnt() {
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Make Appointment']")).click();
		String expectedRedirectedURl = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
		String actualRedirectedURL = driver.getCurrentUrl();
		
		System.out.println("Before Assetion: Check Make Appointment");
		SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedRedirectedURl, actualRedirectedURL);
		System.out.println("After Assetion: Check Make Appointment");
		
		softAssert.assertAll();

		
		
	}
	

}
