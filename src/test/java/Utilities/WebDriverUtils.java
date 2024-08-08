package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	
	WebDriverWait wait;
	
	//WeDriver Waits
	public static void implicitlyWait(WebDriver driver)
	{
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	 public static WebElement waitForElementVisibility(WebDriver driver, WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, (Duration.ofSeconds(20)));
	        return wait.until(ExpectedConditions.visibilityOf(element));
	}

	 
		 public static void waitForElement(WebDriver driver, By locator, int timeout, int pollingInterval) {
		        Wait<WebDriver> wait = new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(timeout))
		            .pollingEvery(Duration.ofSeconds(pollingInterval))
		            .ignoring(NoSuchElementException.class);
				

	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}