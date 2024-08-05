package Stepdefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

protected static WebDriver driver;

	
public void browserSetUp()

{
	
	System.setProperty("webdriver.chrome.driver", "C:\\java\\WebDriver\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}

public void teardown()
{
	//driver.close();
}

// method to take sceeenshot

public static String captureScreenshot(WebDriver driver, String screenshotName) {
    try {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;
    } catch (Exception e) {
        System.out.println("Exception while taking screenshot " + e.getMessage());
        return e.getMessage();
    }
    


}
}