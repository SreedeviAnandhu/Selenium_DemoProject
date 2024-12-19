package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
		String username = "admin";
		String password = "admin";
		String news = "hello sree";
		
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.enterUserName(username);
		managenews.enterPassword(password);
		managenews.submitClick();
		managenews.manageNewsClick();
		managenews.newClick();
		managenews.enterNews(news);
		managenews.saveClick();
		
		boolean isalertdisplayed = managenews.isAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
	}
}
