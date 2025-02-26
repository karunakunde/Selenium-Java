package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReadData {

	
	public static String readProperty(String value) throws IOException
	{
		Properties	prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\SoftwareTesting\\Selenium-Java\\HybridFramework\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		return prop.getProperty(value);
	}
	

}
