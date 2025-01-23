package action_n_interaction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.manage().window().maximize();
		
		webDriver.get("https://seleniumbase.io/demo_page");
		
		WebElement dropDown = webDriver.findElement(By.xpath("//div[@class='dropdown']"));
		List<WebElement> childElements = dropDown.findElements(By.xpath(".//a"));
		System.out.println(childElements.size());
		Actions actions = new Actions(webDriver);
		
		
		for(int i=childElements.size()-1; i>=0;i--)
		{ 

			System.out.println("OPtion "+ childElements.get(i).getText());
			actions.moveToElement(dropDown).moveToElement(childElements.get(i)).pause(Duration.ofSeconds(5)).click().build().perform();

		}
		
		
		// TODO Auto-generated method stub
		Thread.sleep(10);
		webDriver.close();

	}

	
}
