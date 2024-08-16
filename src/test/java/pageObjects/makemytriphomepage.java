package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class makemytriphomepage  extends BasePage{

	public makemytriphomepage() {
		super(driver);	
	}

	
	
	
	public void launchUrl()
	{
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
	}
	
	public void selectFromAddress() {
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
		driver.findElement(By.xpath("//p[contains(text(), 'Bengaluru, India')]")).click();
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Chennai, India')]")).click();

	}
	
	public void selectdate()
	{
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'today')]")).click();
		
		
	}
	
	public void selectTraveller() {
		
		
	driver.findElement(By.xpath("//input[@id='travellers']//preceding::span[contains(text(),'Travellers & Class')]")).click();
		
		driver.findElement(By.xpath("//ul//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//ul//li[@data-cy='children-1']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		
	}
	
	
}
