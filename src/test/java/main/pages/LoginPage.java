package main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	//locating the element
	@FindBy(id="login-button")
	WebElement loginButton;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement error;
	
	//initia;izing part
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//actions
	
	public void enterusername(String userNameValue)
	{
		username.sendKeys(userNameValue);
	}
	public void enterpassword(String passwordValue)
	{
		Password.sendKeys(passwordValue);
	}
	public void loginbtnclick()
	{
		loginButton.click();
	}
	public String getError()
	{
		return error.getText();
	}
	
	public void login(String userNameValue,String passwordValue)
	{
		username.sendKeys(userNameValue);
		Password.sendKeys(passwordValue);
		loginButton.click();
	}
	public String getTitleofPage()
	{
		return driver.getTitle();
		
	}
	



}
