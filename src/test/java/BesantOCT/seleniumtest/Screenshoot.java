package BesantOCT.seleniumtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshoot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType .FILE);
		File dst = new File("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/automation/amgscreen2.jpg");
		//FileHandler.copy(src, dst);
		FileUtils.copyFile(src, dst);
		
		

	}

}