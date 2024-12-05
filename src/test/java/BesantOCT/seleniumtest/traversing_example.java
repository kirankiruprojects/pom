package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversing_example {
	
	static WebDriver driver ;
	
	public static void corejavadate()
	{
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement core=	driver.findElement(By.xpath("//p[.='Trainer - Shridhar']/../../div[2]/p[2]"));
		System.out.println("core java " + core.getText());
		driver.quit();
	}
	
	public static void testcast2()
	{
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement trainer_name=	driver.findElement(By.xpath("//p[.='Trainer - Manoj']/../../div[3]/p[1]"));
		System.out.println("automation trainer name is " + trainer_name.getText());
		driver.quit();
		
	}
	public static void testcast3()
	{
		driver = new ChromeDriver();
		driver.get("C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/sibling.html");
		WebElement course_name=	driver.findElement(By.xpath("//p[.='Starts on 01-10-2024']/../../div[1]/h2" ));
		WebElement course_name2=	driver.findElement(By.xpath("//p[.='Starts on 01-10-2024']/../../div[2]/h2"));
		WebElement course_name3=	driver.findElement(By.xpath("//p[.='Starts on 01-10-2024']/../../div[3]/h2"));
		System.out.println("course trainer name is \n" + course_name.getText()+"\n" +course_name2 .getText()+"\n"+ course_name3.getText() );
		driver.quit();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		corejavadate();
		testcast2();
		 testcast3();

	}

}
