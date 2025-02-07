package externalize_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesExample {
	
	@Test
	void loginTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
		
	}
	


}
