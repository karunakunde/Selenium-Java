package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
	
	public static String readExcel(int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\darek\\git\\Selenium-Java\\HybridFramework\\testdata\\data.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
	    Sheet sheet = wk.getSheet("Sheet1");
	    String value = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	    return value;
	}

}
