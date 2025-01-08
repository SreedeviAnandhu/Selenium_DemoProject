package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
		String username = "admin";
		String password = "admin";
		String news = "hello sree";
		
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterpassword(password);
		loginpage.submitclick();
		
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.manageNewsClick();
		managenews.newClick();
		managenews.enterNews(news);
		managenews.saveClick();
		
		boolean isalertdisplayed = managenews.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
	}
}
