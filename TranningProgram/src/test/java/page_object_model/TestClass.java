package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	WithoutPageFactory wpf;
	
	@BeforeClass
	void setup()
	{
		System.out.println("setup methos");
		try {
		driver = new ChromeDriver();
		System.out.println("driver : "+driver);
		wpf = new WithoutPageFactory(this.driver);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		
		driver.get("https://seleniumbase.io/demo_page");

	}
	
	
	@Test
	void testCase() throws InterruptedException
	{
        Thread.sleep(3000);
		wpf.enterInputText("automation testing input box");
		wpf.enterTextIntoTextArea("Text area box");
		wpf.clickButton();
		wpf.checkBox();
		//System.out.println(wpf.inputText.getText());
		Thread.sleep(3000);
		driver.close();
	}

}
