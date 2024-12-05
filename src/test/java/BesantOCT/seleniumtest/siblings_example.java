package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblings_example {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test1 = driver.findElement(By.xpath("//h1[contains(.,'Besant')]/following-sibling::div[1]/p[2]"));
		System.out.println(test1.getText());
		driver.quit();
		System.out.println("-------------------------------------------------------------------------------------------");
		
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test2 = driver.findElement(By.xpath("//h2[starts-with(.,'Automation')]/../preceding-sibling::div[1]/h2"));
		System.out.println(test2.getText());
		driver.quit();
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test3 = driver.findElement(By.xpath("//h2[contains(.,'Manual Testing')]/../following-sibling::div[2]/p[2]"));
		System.out.println(test3.getText());
		driver.quit();
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test4 = driver.findElement(By.xpath("//h2[.='Core Java']/../preceding-sibling::div[1]/h2"));
		System.out.println(test4.getText());
		driver.quit();
		

		System.out.println("-------------------------------------------------------------------------------------------");
		
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test5 = driver.findElement(By.xpath("//p[starts-with(.,'Software Testing')]/following-sibling::div[3]/p[1]"));
		System.out.println(test5.getText());
		driver.quit();
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement test6 = driver.findElement(By.xpath("//p[contains(.,'Trainer - Shridhar')]/../../div[2]/p[2]"));
		System.out.println(test6.getText());
		driver.quit();

	}

}
