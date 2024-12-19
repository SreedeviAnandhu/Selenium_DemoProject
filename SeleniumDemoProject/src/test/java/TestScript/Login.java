package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	
	@Test
	public void loginTest()
	{
		String username = "admin";
		String password = "admin";
		
		
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.click();
		
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.click();
		
		WebElement signinbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		
	
		WebElement dashboardvalue = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean isHomePageAvailable = dashboardvalue.isDisplayed();
		Assert.assertTrue(isHomePageAvailable);
		
		
	} 
	@Test
	public void wrongPassword()
	{
		String username = "admin";
		String password = "sree";
		
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.click();
		
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.click();
		
		WebElement signinbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		
		WebElement alertvalue = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertAvailable = alertvalue.isDisplayed();
		Assert.assertFalse(isAlertAvailable);
		
	}
	@Test
	public void wrongUsername()
	{
		String username = "sree";
		String password = "admin";
		
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.click();
		
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.click();
		
		WebElement signinbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		
		WebElement alertvalue = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertAvailable = alertvalue.isDisplayed();
		Assert.assertTrue(isAlertAvailable);

}
	@Test
	public void wrongUsernameAndPassword()
	{
		String username = "anusre";
		String password = "sree";
		
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		usernamefield.sendKeys(username);
		usernamefield.click();
		
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.sendKeys(password);
		passwordfield.click();
		
		WebElement signinbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
		
		
		WebElement alertvalue = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertAvailable = alertvalue.isDisplayed();
		Assert.assertTrue(isAlertAvailable);
		
	}
}
