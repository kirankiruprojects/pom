package BesantOCT.seleniumtest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
	static WebDriver driver;
	
	@DataProvider(name="Data") Object Data() throws IOException{
		FileInputStream fs = new FileInputStream("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/automation/Sample_data_test.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int totalrows = sheet.getPhysicalNumberOfRows();
		short column = sheet.getRow(0).getLastCellNum();
		
		System.out.println("rows="+totalrows+"column="+column);
		
		Object[][] objArr= new Object[totalrows-1][column];
		for(int i = 1; i <totalrows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j = 0; j<column;j++)
			{
				XSSFCell cell = row.getCell(j);
				objArr[i-1][j]=cell.toString();
			}
		}
		return objArr;
	}
	
	@Test(dataProvider = "Data")
	void LoginTest(String username,String Password)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password") ).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		
		if(driver!=null)
		{
			driver.quit();
		}
	}
	

}
