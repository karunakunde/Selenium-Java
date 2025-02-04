 package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfileFromExcel {

	public static void main(String[] args) throws IOException {
	
		//add dependncies in pom.xml
		//apache-poin
		//apche-poin-ooxml
		
		File file = new File("./data/Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println(rows +" and "+column);

		for(int i=0;i<=rows;i++)
		{
		    XSSFRow row = sheet.getRow(i);
			for(int j=0;j<column;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(" "+cell);
			}
			System.out.println("\n--------------------");
		}
	}

}
