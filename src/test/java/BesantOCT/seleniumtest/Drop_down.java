package BesantOCT.seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/IPG A4IN/OneDrive/Documents/NOTES/Besanth/automation/drag_drop.html");
		WebElement drop_down = driver.findElement(By.id("SeleniumClass"));
		Select s = new Select(drop_down);
		List<WebElement> options = s.getOptions();
		for(WebElement value : options)
		{
			System.out.println(value.getText());
		}
		//s.selectByIndex(2);
		//s.selectByValue("Sridhar");
	//	s.selectByVisibleText("Appu");
		
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for(WebElement values : alloptions)
		{
			System.out.println(values.getText());
		}
		//s.deselectByIndex(2);
		s.deselectByVisibleText("Appu");
			
		

	}

}
