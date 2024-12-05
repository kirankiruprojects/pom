package BesantOCT.seleniumtest;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordTestData {


		static WebDriver driver;
		
		static void fetchData() throws IOException {
			FileInputStream fs = new FileInputStream("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/automation/KeywordDrivenTest.xlsx");
			XSSFWorkbook book = new XSSFWorkbook(fs);
			XSSFSheet sheet = book.getSheetAt(0);
			int totalRows = sheet.getPhysicalNumberOfRows();
			for (int i = 1; i < totalRows; i++) {
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue(); 
				String param1 = sheet.getRow(i).getCell(1).getStringCellValue(); 
				String param2 = sheet.getRow(i).getCell(2).getStringCellValue(); 
				actions(keyword, param1, param2);
			}
			System.out.println("total number of rows"+sheet.getLastRowNum());
			System.out.println("total number of column"+sheet.getRow(totalRows).getLastCellNum());
			
		}
		
		
		static void actions(String keyword, String param1, String param2) {
			switch (keyword) {
			case "OpenBrowser":
				driver = new ChromeDriver();
				break;
			case "NavigateToUrl":
				driver.get(param1);
				break;
			case "EnterUName":
				driver.findElement(By.xpath(param1)).sendKeys(param2);
				break;
			case "EnterPwd":
				driver.findElement(By.xpath(param1)).sendKeys(param2);
				break;
			
			default:
				break;
			}
		}
		
		public static void main(String[] args) throws IOException {
			fetchData();
		}
		
	}
