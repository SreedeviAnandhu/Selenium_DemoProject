package TestScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;


public class LoginTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
	
	String username= "admin";
	String password= "admin";
	
	LoginPage loginpage =new LoginPage(driver);
	loginpage.enterUserName(username);
	loginpage.enterpassword(password);
	loginpage.submitclick();
	
	boolean isHomePageLoded = loginpage.isDashBoardDisplayed();
	Assert.assertTrue(isHomePageLoded);

    }
	
	@Test
	public void loginTestWithIncorrectPassword()
	{
		String username = "admin";
		String password = "sree";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterpassword(password);
		loginpage.submitclick();
		
		boolean isalertdisplayed = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
		
	}
	@Test
	public void loginTestWithIncorrectUsername() 
	{
		String username = "anupama";
		String password ="admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterpassword(password);
		loginpage.submitclick();
		
		boolean isalertdisplayedd = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayedd);
		
	}
	@Test
	public void loginTestWithIncorrectUsernameAndPassword()
	{
		String username ="anusree";
		String password ="sreedevi";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterpassword(password);
		loginpage.submitclick();
		
		boolean isalertdisplayeded = loginpage.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayeded);
	}
}
