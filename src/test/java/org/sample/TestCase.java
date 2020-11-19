package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	public static void main(String[] args) throws IOException {
		
		File f =new File("C:\\Users\\Vimal\\eclipse-workspace\\Maven9.30Batch\\Excel Loc\\Data9.30am.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(stream);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				String s = cell.getStringCellValue();
				System.out.println(s);
				
			}
		}
		
		
				
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\Maven9.30Batch\\driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://www.facebook.com/");
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.quit();
		
	}

}
