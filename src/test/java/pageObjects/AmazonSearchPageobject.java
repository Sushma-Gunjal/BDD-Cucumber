package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WebDriverUtils;

public class AmazonSearchPageobject extends BasePage {

	public AmazonSearchPageobject() {
		super(driver);

	}

	By SearchBox = By.xpath("//input[@id='twotabsearchtextbox']");

	By SearchButton = By.xpath("//input[@id='nav-search-submit-button']");

	By brandTitle = By.xpath("//div[@id='p_123-title']/span");

	By Puma = By.xpath("//li[@aria-label='Puma']//following::label");

	By seeMoreButton = By.xpath("//span[@class='a-expander-prompt'][1]");

	By Nike = By.xpath("//li[@aria-label='Nike']//following::label");

	By brandCheckbox = By.xpath("//label//input[@type='checkbox']");

	By Discount = By.xpath("//div[@id='p_6-title']/span");

	By Discountfilter = By.xpath(" //span[contains(text(),'50% Off or more')]");

	By thirdItem = By.xpath("(//div[contains(@class, 's-main-slot')]//div[@data-component-type='s-search-result'])[3]");

	By AddtocartMessage = By.xpath("//h1[normalize-space()='Added to Cart']");

	String addToCart = "//input[@id='add-to-cart-button']";

//Action Method

	public void enterSearchItem(String product) throws InterruptedException {
		driver.get("https://www.amazon.in/");

		driver.findElement(SearchBox).sendKeys("shoes");

		driver.findElement(SearchButton).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

	}

	public void applyBrandFilter() throws InterruptedException

	{

		WebElement brand = driver.findElement(brandTitle);

		WebDriverUtils.Scrollpage(driver, brand);
	//	driver.findElement(By.xpath("//li[@id='p_123/256097']//following::label")).click();

		driver.findElement(Puma).click();
		WebElement seemorebutton = driver.findElement(seeMoreButton);

		WebDriverUtils.waitForElementVisibility(driver, seemorebutton).click();

		driver.findElement(Nike).click();

	}

	public void applyDiscountFilter() {
		WebElement discount = driver.findElement(Discount);

		WebDriverUtils.Scrollpage(driver, discount);

		driver.findElement(Discountfilter);

		driver.findElement(By.xpath("//li[@id='p_n_pct-off-with-tax/2665401031']//span//a")).click();

	}

	public void navigatetopage() {
		WebElement Brandsrelatedtosearch = driver
				.findElement(By.xpath("//span[contains(text(),'Brands related to your search')]"));

		WebDriverUtils.Scrollpage(driver, Brandsrelatedtosearch);

		driver.findElement(By.xpath("//a[@aria-label='Go to page 3']")).click();

	}

	public void addToCart() throws InterruptedException {

		Thread.sleep(10000);
//	WebElement product=	driver.findElement(By.xpath("(//div[contains(@class, 's-main-slot')]//div[@data-component-type='s-search-result'])[3]"));
		String product = "(//div[contains(@class, 's-main-slot')]//div[@data-component-type='s-search-result'])[3]";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(product)));

		myElement.click();

		String mainWindowHandle = driver.getWindowHandle();

		Set<String> windowhandles = driver.getWindowHandles();

		for (String childWindowHandle : windowhandles) {

			if (!childWindowHandle.equals(mainWindowHandle)) {

				driver.switchTo().window(childWindowHandle);

			}

		}

		WebElement addToCartbtn = driver.findElement(By.xpath(addToCart));

		WebDriverUtils.Scrollpage(driver, addToCartbtn);

		addToCartbtn.click();

	}

	public String addToCartMessage() {

		String addtocartmessage = driver.findElement(AddtocartMessage).getText();
		return addtocartmessage;

	}
	
	//Scenario for kids crocks page objects
	
	By fashiontab = By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion']");
	By kids=By.xpath("//a[contains(@aria-label,'Kids')]");
	By boysShoes=By.xpath("((//div[@class='left_nav browseBox']//h3)[1]//following::li)[2]//a");
	By topBandCheckbox=By.xpath("(//li[@class='a-spacing-micro']//following::label)[1]");
	By crocs=By.xpath("//li[@id='p_123/234857' and @aria-label='Crocs']//following::label");
	By shoesSize=By.xpath("//span[contains(text(),'Infant & Toddler Shoe Size')]//following::button[@aria-label='2']");
	By firstItemfromsearchresult=By.xpath("(//div[contains(@class, 's-main-slot')]//div[@data-component-type='s-search-result'][1])");
	By cartbutton=By.xpath("//a[@aria-label='1 item in cart']");
	
	public void HomePage() {
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement fashion=driver.findElement(fashiontab);
		WebElement fashionlink=WebDriverUtils.waitForElementVisibility(driver, fashion);
		fashionlink.click();	
		
	}
	
	public void selectKidasSection() {
		driver.findElement(kids).click();
	}
	
	public void selecttopBrand()
	{
		driver.findElement(boysShoes).click();
		driver.findElement(topBandCheckbox).click();
		
	}
	
	
	public void selectCrocs()
	{
		driver.findElement(crocs).click();
	}
			
	public void selectShoesSize()
	{
	    WebElement size=driver.findElement(shoesSize);
		WebDriverUtils.Scrollpage(driver, size);
		
		WebDriverUtils.waitForElementVisibility(driver, size);
	    size.click();
	
	
	
WebElement firstitem=	driver.findElement(firstItemfromsearchresult);

WebDriverUtils.waitForElementVisibility(driver, firstitem).click();
	
	String mainWindowHandle = driver.getWindowHandle();

	Set<String> windowhandles = driver.getWindowHandles();

	for (String childWindowHandle : windowhandles) {

		if (!childWindowHandle.equals(mainWindowHandle)) {

			driver.switchTo().window(childWindowHandle);

		}

		
	}

	WebElement addToCartbtn = driver.findElement(By.xpath(addToCart));

	WebDriverUtils.Scrollpage(driver, addToCartbtn);

	addToCartbtn.click();

	}

	public String addToCartMessage1() {

		String addtocartmessage = driver.findElement(AddtocartMessage).getText();
		return addtocartmessage;

	}
	
	public void OpenCart()
	{
		driver.findElement((cartbutton)).click();
	}
}
