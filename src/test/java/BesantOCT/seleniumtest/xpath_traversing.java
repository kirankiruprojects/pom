package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement trainermanoj = driver.findElement(By.xpath("//div[@id='content']/div[1]/p[1]"));
		System.out.println(trainermanoj.getText());
		WebElement automationdate = driver.findElement(By.xpath("//p[.'Trainer - Shaaru']/../../div[3]/p[2]"));
		System.out.println(automationdate.getText());
		

	}

}
