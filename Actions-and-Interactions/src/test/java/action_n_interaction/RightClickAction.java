package action_n_interaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();   //
	    driver.manage().window().maximize();
	    
	     
	    
	    driver.get("https://text-compare.com/");
	    
	    WebElement webElement = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    webElement.sendKeys("Akshay");
	    
	    Actions act=new Actions(driver);
	    
	    //control + A
	    act.moveToElement(webElement).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();

	    act.keyDown(Keys.TAB).perform();
	    
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();

	    Thread.sleep(1000);
		
	}

}
