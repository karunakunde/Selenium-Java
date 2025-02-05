package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestUsingEXCEL {
	String browser;
	String url;
	WebDriver webDriver;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	void initialization(String browser,String url) {
		this.browser=browser;
		this.url = url;
		
	}
	@Test(dataProvider = "logindata")
	void loginTest(String username,String password) {
		
		if(browser.equals("Chrome"))
			webDriver = new ChromeDriver();
		else
			webDriver = new ChromeDriver();
		webDriver.get(url);
		webDriver.findElement(By.xpath("//a[contains(text(),'Make')]")).click();
		webDriver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		webDriver.findElement(By.xpath("//button[@id='btn-login']")).click();
		System.out.println(username+"   "+password);
	}
	
	@DataProvider(name="logindata")
	String[][] getLoginData() throws IOException{
		
		
		File f = new File(System.getProperty("user.dir")+"\\testdata\\logindata.xlsx");
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet1");
		int rowcount = xssfSheet.getLastRowNum();
		int columnCnt = xssfSheet.getRow(1).getLastCellNum();
	    System.out.println(rowcount+"   "+columnCnt); 
	    String[][] data = new String[rowcount][columnCnt];
	    
	    for(int i=1;i<=rowcount;i++)
	    {
	    	XSSFRow row = xssfSheet.getRow(i);
	    	for(int j = 0;j<columnCnt;j++)
	    	{
	    		data[i-1][j] = row.getCell(j).toString();
	    	}
	    }
		return data;
	}

}
