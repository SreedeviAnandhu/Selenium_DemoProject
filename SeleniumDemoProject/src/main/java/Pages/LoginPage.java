package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //webelements ine initialze chyan ann initElements use chyunnath
	}
	
	//@FindBy(xpath="//input[@type='text']")private WebElement webelementname;
	
	@FindBy(name="username")private WebElement name;
	@FindBy(name="password")private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement db;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alert;
	
	
	public void enterUserName(String usernamevalue)
	{
		name.sendKeys(usernamevalue);
	}
	
	public void enterpassword(String passwordvalue)
	{
		pass.sendKeys(passwordvalue);
	}
	
	public void submitclick()
	{
		submit.click();
	}
	 
	public boolean isDashBoardDisplayed()
	{
		return db.isDisplayed();
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
