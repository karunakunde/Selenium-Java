package action_n_interaction;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement source =webDriver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target =webDriver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement text =webDriver.findElement(By.xpath("//input[@id='name']"));//*[@id="HTML2"]
		WebElement div =webDriver.findElement(By.xpath("//*[@id='HTML2']"));


		Actions act = new Actions(webDriver);
	     act.moveToElement(text)
	     .click()
	     .sendKeys("karuna")
	     .moveToElement(source)
	     .dragAndDrop(source,target).perform();
		
	    act.pause(Duration.ofSeconds(5)).dragAndDrop(source, div).perform();

	    act.pause(Duration.ofSeconds(5)).dragAndDrop(source, target).perform();
		//webDriver.close();

		

	}

}
