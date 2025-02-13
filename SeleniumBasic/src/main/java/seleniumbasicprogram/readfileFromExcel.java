 package seleniumbasicprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class readfileFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//add dependncies in pom.xml
		//apache-poin
		//apche-poin-ooxml
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		File file = new File("./data/Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
	    Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
	    
		WebElement fname = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement repass = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='f']"));
		WebElement malegender = driver.findElement(By.xpath("//input[@type='radio' and @value='m']"));

		WebElement date_day = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement date_mon = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement signup_city = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement college = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement school = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement fld_captcha = driver.findElement(By.xpath("//input[@id='fld_captcha']"));

		
		fname.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		email.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		pass.sendKeys(sheet.getRow(0).getCell(2).getStringCellValue());
		repass.sendKeys(sheet.getRow(0).getCell(3).getStringCellValue());
		
		String gen = sheet.getRow(0).getCell(4).getStringCellValue();
		if(gen.equals("Female"))
			gender.click();
		if(gen.equals("Male"))
			malegender.click();

		Select date = new Select(date_day);

        date.selectByVisibleText(sheet.getRow(0).getCell(5).getStringCellValue());
        Select month = new Select(date_mon);
        month.selectByVisibleText(sheet.getRow(0).getCell(6).getStringCellValue());
        Select yeard = new Select(year);
        String y =sheet.getRow(0).getCell(7).getStringCellValue();
        yeard.selectByVisibleText(y);
        
        signup_city.sendKeys(sheet.getRow(0).getCell(8).getStringCellValue());
        school.sendKeys(sheet.getRow(0).getCell(9).getStringCellValue());

        college.sendKeys(sheet.getRow(0).getCell(10).getStringCellValue());
        fld_captcha.sendKeys(sheet.getRow(0).getCell(11).getStringCellValue());
        
        Thread.sleep(3000);
       // driver.close();

	}

}
