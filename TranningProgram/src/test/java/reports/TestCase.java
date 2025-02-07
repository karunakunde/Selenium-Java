package reports;

import static org.testng.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCase  {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() throws FileNotFoundException,IOException {
		
		driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		Properties props = new Properties();
		props.load(fis);
		//driver.get(props.getProperty("url"));
	}
	
	@Test(priority = 1)
	void testTitle() {
		driver.get("https://seleniumbase.io/demo_page");

		String actualtile = driver.getTitle();
		String expectedTitle = "Web page";	
		Assert.assertEquals(actualtile, expectedTitle);
		
	}
	
	@Test(priority = 2)
	void testCheckbox()
	{
		driver.get("https://seleniumbase.io/demo_page");

		boolean isChecked = driver.findElement(By.xpath("//input[@id='checkBox1']")).isSelected();
		Assert.assertFalse(isChecked);
	}
	
	@Test(priority = 3,dependsOnMethods = {"testTitle"})
	void testHeading()
	{
		driver.get("https://seleniumbase.io/demo_page");

		boolean isDisplyed = driver.findElement(By.xpath("//h1[text()='Demo Page']")).isDisplayed();
		Assert.assertTrue(isDisplyed);
	}

}
