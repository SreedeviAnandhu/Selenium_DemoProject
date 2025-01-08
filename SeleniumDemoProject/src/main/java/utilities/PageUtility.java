package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	
	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

	public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		return formater.format(date);
	}
	
	public void selectByVisibleText(WebElement element,String visibleText) {
		
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
			
		}
	
	public void selectByIndex(WebElement element,int index) {
		
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}


}
 