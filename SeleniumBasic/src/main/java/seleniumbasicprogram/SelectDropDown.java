package seleniumbasicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
	    WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));//select[@name='DOB_Day6712402d']
		Select dropdownDay= new Select(day);
		 List<WebElement> dayOptions = dropdownDay.getOptions();
		 for(int i =0 ; i<dayOptions.size();i++)
		 {
			 System.out.println(dayOptions.get(i).getText());
		 }
		
	    WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));//select[@name='DOB_Day6712402d']
		Select dropdownMonth = new Select(month);
		List<WebElement> montoptions = dropdownMonth.getOptions();
		for(int i=0;i<montoptions.size();i++)
		{
			System.out.println(montoptions.get(i).getText());
		}
		
	    WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));//select[@name='DOB_Day6712402d']
		Select dropdownYear = new Select(year);
		List<WebElement> yearOptions = dropdownYear.getOptions();
		for(int i=0;i<yearOptions.size();i++)
		{
			System.out.println(yearOptions.get(i).getText());
		}

		
		driver.close();
	   
	}

}
