package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_selenium {

	static WebDriver driver;
	
	public static void switchtoframe1() throws InterruptedException//handle frame works
	{
		System.out.println(driver.getTitle());
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	
		
	}
	public static void switchtoNestedframe1() throws InterruptedException//handle nested frame works
	{
		System.out.println(driver.getTitle());
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement nestedframes = driver.findElement(By.tagName("iframe"));//weblements frameworls
		driver.switchTo().frame(nestedframes);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Nested Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	
		
	}
	public static void switchtoIndexFrame1() throws InterruptedException//handling index
	{
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Nested Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	
		
	}
	public static void switchtoAllframe1() throws InterruptedException//handle switch from parent to child, child to default content, parent frame to default content
	{
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Nested Frame 1)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 1)']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println( driver.findElement(By.tagName("p")).getText());;
		Thread.sleep(2000);
		
		driver.quit();
	
		
	}
	public static void switchtoframe2() throws InterruptedException
	{
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click Me (Frame 2)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		System.out.println( driver.findElement(By.tagName("p")).getText());;
		driver.quit();
	
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/IPG%20A4IN/OneDrive/Documents/NOTES/Besanth/automation/frames.html");
	//	switchtoframe1();
		//switchtoNestedframe1();
		//switchtoIndexFrame1();
		switchtoAllframe1();
	//	switchtoframe2();
		
		

	}

}
