import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		
		//implicit wait
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		webDriver.get("https://katalon-demo-cura.herokuapp.com/");

		webDriver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		
		
		
	}

}
