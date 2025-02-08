package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClassWithout {
	WebDriver driver;
	WithPageFactory wpf;
	
	@BeforeClass
	void setup()
	{
		System.out.println("setup methos");
		driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		

	}
	
	
	@Test
	void testCase() throws InterruptedException
	{
		wpf = new WithPageFactory(this.driver);

        Thread.sleep(3000);
		wpf.setInputText("automation testing input box");
		wpf.setTestArea("Text area box");
		wpf.checkUncheckbox();
		//System.out.println(wpf.inputText.getText());
		wpf.clickOnButton();
		Thread.sleep(3000);
		Assert.assertEquals(wpf.getButtonText(),"Purple button");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
