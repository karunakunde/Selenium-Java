package seleniumLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise_10 {
	/*
	 * https://katalon-demo-cura.herokuapp.com/
	 locate button using id	
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://katalon-demo-cura.herokuapp.com/");
		webDriver.manage().window().maximize();

		WebElement makeAppointBtn = webDriver.findElement(By.id("btn-make-appointment"));
		// Get all child elements (columns or <td> tags) of the table row
		 Thread.sleep(1000);
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) webDriver;
			 * js.executeScript("arguments[0].scrollIntoView(true);", chekBoxes);
			 */
          
	    makeAppointBtn.click(); 
		Thread.sleep(1000);
		webDriver.quit();
	}
}





