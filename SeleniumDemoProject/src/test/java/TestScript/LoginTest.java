package TestScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utilities.ExcelUtilities;


public class LoginTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
	
   //	String username= "admin";
   //	String password= "admin";
		
	String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
	String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		
	
	LoginPage loginpage =new LoginPage(driver); 
	loginpage.enterUserName(username);
	loginpage.enterpassword(password);
	loginpage.submitclick();
	
	boolean isHomePageLoded = loginpage.isDashBoardDisplayed();
	Assert.assertTrue(isHomePageLoded);

    }
	
	@Test
	public void verifyTheUserIsAbleToLoginWithIncorrectPassword() 
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
	public void verifyTheUserIsAbleToLoginIncorrectUsername() 
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
	public void verifyTheUserIsAbleToLoginWithIncorrectUsernameAndPassword()
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
