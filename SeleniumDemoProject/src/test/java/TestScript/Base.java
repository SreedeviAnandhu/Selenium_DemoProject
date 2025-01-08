package TestScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ScreenShotUtility;


public class Base {
	
	public WebDriver driver;
	public ScreenShotUtility scrshot;
	
	@BeforeMethod
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin"); //to launch a site get method is used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize(); //window maximize chyan 
		
	}
	
	@AfterMethod
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}

		 driver.quit();
	}

} 
