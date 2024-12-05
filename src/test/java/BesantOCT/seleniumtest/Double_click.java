package BesantOCT.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement	dobleclick =driver.findElement(By.id("doubleClickBtn"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",dobleclick);
		Thread.sleep(3000);
		Actions act =new Actions(driver);
		act.doubleClick(dobleclick);
		Thread.sleep(3000);
		act.perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
