package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutPageFactory {
	
	WebDriver driver;
	
	//constructor
	public WithoutPageFactory(WebDriver webDriver) throws InterruptedException
	{
		
		this.driver = webDriver;
		System.out.println("constructor "+webDriver);
	}
	
	//locators
	By inputhPath = By.xpath("//input[@id='myTextInput']");
	By textAreaPath = By.id("myTextarea");
	By buttonPath = By.id("myButton");
	By checkBoxPath = By.id("checkBox1");
	
	
	//methods
	void enterInputText(String s)
	{
		System.out.println("input");
		WebElement inputText = driver.findElement(inputhPath);

		inputText.sendKeys(s);
		
		System.out.println("done");
	}
	
	void enterTextIntoTextArea(String s)
	{
		System.out.println("input area");

		WebElement textArea = driver.findElement(textAreaPath);
		textArea.sendKeys(s);
		System.out.println("done");

	}
	
	void clickButton()
	{
		driver.findElement(buttonPath).click();
	}
	
	void checkBox()
	{
		WebElement checkBox = driver.findElement(checkBoxPath);

		checkBox.click();
	}

}
