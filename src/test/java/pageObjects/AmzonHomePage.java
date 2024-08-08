package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AmzonHomePage extends BasePage {

	
	public AmzonHomePage()

	{
		super(driver);
	}

	By searchbox = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
	By searchresult = By.xpath("(//div[contains(@class, 's-main-slot')]//div[contains(@class, 's-result-item')])[3]");
	By resultafterclicking = By.xpath("//span[@id='productTitle']");

	
	public void enterserchitem(String productname) {
		driver.get("https://www.amazon.in/");
		driver.findElement(searchbox).sendKeys(productname);

	}

	public void clickSearchButton() {
		driver.findElement(searchButton).click();

	}

	public boolean Searchproduct(String productname) {

		boolean flag = false;
		driver.findElement(searchresult).click();
		
	String productheading = driver.findElement(resultafterclicking).getText();
	if (productheading.contains(productname))
	{
		flag = true;
	}

	return flag;

	  
	  
	
}
}