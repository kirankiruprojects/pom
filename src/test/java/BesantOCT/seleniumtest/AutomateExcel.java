package BesantOCT.seleniumtest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class AutomateExcel {

	static void readData() throws IOException {
		FileInputStream fs = new FileInputStream("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/automation/frameworksheet.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		short totalCell = sheet.getRow(totalRows).getLastCellNum();
		
		System.out.println("Total number of rows is "+sheet.getLastRowNum());
		System.out.println("Total number of cells is "+totalCell);
	
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCell; j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString()+"\t");
				
			}
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) throws IOException {
		readData();
	}
	
}

	
	