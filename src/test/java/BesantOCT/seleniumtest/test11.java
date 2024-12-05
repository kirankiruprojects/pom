package BesantOCT.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.instagram.com");
	    String title = driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(5000);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    //String pagesource =driver.getPageSource();
	    //System.out.println(pagesource);
	    driver.close();
		driver.quit();
		

	}

}
