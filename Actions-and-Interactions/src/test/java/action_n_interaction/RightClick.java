package action_n_interaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement webElement = webDriver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(webDriver);
		actions.moveToElement(webElement).contextClick()
		.pause(Duration.ofSeconds(5))
		.build().perform();
		
		
		
	}

}
