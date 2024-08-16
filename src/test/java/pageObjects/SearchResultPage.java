package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchResultPage extends BasePage {

	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	By results = By.cssSelector("div.s-main-slot div.s-result-item");
	By firstresultitem=By.xpath("(//div[ @data-component-type='s-search-result'])[1]//h2/a");
	
		
	public String isResultsDisplayed(String product) {
		
	boolean flag=false;
	String title=	driver.findElement(firstresultitem).getText();
	System.out.println(title);
	return title;
//	if(title.contains(product))
//	{
//		flag=true;
//		
//		System.out.println("yes");
//	}
//	else
//	{
//		flag=false;
//	}
//	return flag;
		

    }
	
	public void clickOnFirstItem()
	{
		driver.findElement(firstresultitem).click();
	}
}
