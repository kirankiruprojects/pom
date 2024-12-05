package BesantOCT.seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popup_accept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-ui-for-media-stream"); 
        WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://mictests.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement simplepopup1 = driver.findElement(By.id("mic-launcher"));
		 simplepopup1.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		

		
	}

}