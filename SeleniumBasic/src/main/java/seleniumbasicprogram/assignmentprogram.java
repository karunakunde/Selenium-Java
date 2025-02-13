package seleniumbasicprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentprogram {

	private static WebElement daylist;
;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhanarath\\eclipse-workspace\\Seleniumprogram\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		 WebElement fullname=driver.findElement(By.xpath("//input[@id='fullname']"));
		 WebElement emailid=driver.findElement(By.xpath("//input[@id='emailid']"));
		 WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		 WebElement retypepassword=driver.findElement(By.xpath("//input[@id='repass']"));
		 WebElement radiobutton = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement daylist=driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monthlist=driver.findElement(By.xpath("//select[@id='date_mon']"));
		 WebElement yearlist=driver.findElement(By.xpath("//select[@name='Date_Year']"));
		 WebElement location=driver.findElement(By.xpath("//input[@id='signup_city']"));
		 WebElement school=driver.findElement(By.xpath("//input[@id='school']"));
		 WebElement collage=driver.findElement(By.xpath("//input[@id='college']"));
		 WebElement captcha = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		 WebElement signup= driver.findElement(By.xpath("//input[@class='submitbtn vmiddle']"));
		 
		 FileInputStream file=new FileInputStream("C:\\Users\\Dhanarath\\eclipse-workspace\\Seleniumprogram\\Test data\\rediffsignup.xlsx");
		 Sheet signuppage = WorkbookFactory.create(file).getSheet("Sheet2");
		 
		 fullname.sendKeys(signuppage.getRow(0).getCell(0).getStringCellValue());
		 emailid.sendKeys(signuppage.getRow(1).getCell(0).getStringCellValue());
		 password.sendKeys(signuppage.getRow(2).getCell(0).getStringCellValue());
		 retypepassword.sendKeys(signuppage.getRow(3).getCell(0).getStringCellValue());
		
		 
		radiobutton.sendKeys(signuppage.getRow(4).getCell(0).getStringCellValue());
		 radiobutton.click();
		daylist.sendKeys(signuppage.getRow(5).getCell(0).getStringCellValue());
		monthlist.sendKeys(signuppage.getRow(6).getCell(0).getStringCellValue());
		Select s=new Select(yearlist);
		
	   s.selectByVisibleText(signuppage.getRow(7).getCell(0).getStringCellValue());
	  location.sendKeys(signuppage.getRow(8).getCell(0).getStringCellValue());
		 school.sendKeys(signuppage.getRow(9).getCell(0).getStringCellValue());
		 collage.sendKeys(signuppage.getRow(10).getCell(0).getStringCellValue());
		 captcha.sendKeys(signuppage.getRow(11).getCell(0).getStringCellValue());
		 signup.sendKeys(signuppage.getRow(12).getCell(0).getStringCellValue());
		 signup.click();
		 
		
		
		 Thread.sleep(5000);
		  driver.close();
	}
	}
