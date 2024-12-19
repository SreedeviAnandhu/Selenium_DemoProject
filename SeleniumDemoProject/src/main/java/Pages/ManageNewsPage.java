package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(xpath="//input[@type='text']")private WebElement webelementname;
	
	@FindBy(name="username")private WebElement name;
	@FindBy(name="password")private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenewsclick;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newclick;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement enternews;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement saveclick;
	@FindBy(xpath="//i[@class='icon fas fa-check']")private WebElement isalertdisplayed;
	
	
	public void enterUserName(String usernamevalue)
	{
		name.sendKeys(usernamevalue);
	}
	
	public void enterPassword(String passwordvalue)
	{
		pass.sendKeys(passwordvalue);
	}
	
	public void submitClick()
	{
		submit.click();
	}
	
	public void manageNewsClick()
	{
		managenewsclick.click();
	}
	
	public void newClick()
	{
		newclick.click();
	}
	
	public void enterNews(String newsvalue)
	{
		enternews.sendKeys(newsvalue);
	}
	
	public void saveClick()
	{
		saveclick.click();
	}
	
	public boolean isAlertDisplayed()
	{
		return isalertdisplayed.isDisplayed();
	}

}