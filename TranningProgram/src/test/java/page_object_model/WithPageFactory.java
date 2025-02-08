package page_object_model;

import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory {
	
	WebDriver driver;
	
	public WithPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver; 
	    PageFactory.initElements(driver,this);

	}

	
	@FindBy(xpath ="//input[@id='myTextInput']")
	WebElement inputText;
	
	@FindBy(id="myTextarea")
	WebElement textArea;
	
	@FindBy(id="checkBox1")
	WebElement checkbox;

	@FindBy(id="myButton")
	WebElement button;
	
	void setInputText(String s)
	{
		inputText.sendKeys(s);
	}

	void setTestArea(String s)
	{
		textArea.sendKeys(s);
	}
	
	void clickOnButton()
	{
		button.click();;
	}
	
	void checkUncheckbox()
	{
		checkbox.click();
	}
	
	String getButtonText()
	{
		String s =checkbox.getText();
		return s;
	}
}
