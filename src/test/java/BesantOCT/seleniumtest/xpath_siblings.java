package BesantOCT.seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_siblings {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		driver = new ChromeDriver();
		driver.navigate().to("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		driver.manage().window().maximize();
	    WebElement manual_startsdate = driver.findElement(By.xpath("//p[.='Trainer - Manoj']/following-sibling::p"));
	    System.out.println(manual_startsdate.getText());
	    
	    driver.quit();
	    
	    driver = new ChromeDriver();
		driver.navigate().to("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		driver.manage().window().maximize();
	   List<WebElement> manysubject_taken_by_shridhar = driver.findElements(By.xpath("//p[.='Trainer - Shridhar']/preceding-sibling::h2"));
	   for(WebElement sub : manysubject_taken_by_shridhar)
	   {
		   System.out.println(sub.getText());
	   }
	   driver.quit();
	}

}
