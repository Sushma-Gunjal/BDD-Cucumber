package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Amazonhomepage {

	
	WebDriver driver;
	By searchbox=By.xpath("//input[@id='twotabsearchtextbox']");
	By SearchButton =By.xpath("//input[@id='nav-search-submit-button']");
	By search_itemlist=By.xpath("//h2//span[contains(text(),'HP Laptop')]");
	
	public Amazonhomepage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public void enterserchitem(String productname)
	{
		driver.findElement(searchbox).sendKeys(productname);
	
	}
	
	public void clickSearchButton()
	{
		driver.findElement(SearchButton).click();
		
		
	}
	
	public void listofRelatedSearchproduct()
	{
List<WebElement> laptoplist=driver.findElements(search_itemlist);
		
		if(laptoplist.size()>0)
		{
			System.out.println("search function working fine");
		}
	}
}
