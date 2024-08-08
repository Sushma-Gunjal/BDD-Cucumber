package pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class AmazonPage extends BasePage {

	public AmazonPage() {
		super(driver);
	}

	String searchField = "//input[@id='twotabsearchtextbox']";
	String searchButton = "//input[@id='nav-search-submit-button']";
	String pickThirdItem2 = "//div[@class='sg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";
	String addToCart = "//input[@id='add-to-cart-button']";
	String addToCartMsg = "//h1[normalize-space()='Added to Cart']";

	public void navigateToAmazon() {
		navigateTo("https://www.amazon.in/");
	}

	public void enterSearchCriteria(String criteria) {
		write(searchField, criteria);
	}

	public void clickSearchButon() {
		clickElement(searchButton);
	}

	public void goToPage(String pageNumber) {
		goToLinkText(pageNumber);
	}

	public void selectThirdItem2(int index) {
		selectItems(pickThirdItem2, index);
	}

	public void addItemToCart() {

		String mainWindowHandle = driver.getWindowHandle();

		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String childWindowHandle : windowhandles) {

			if (!childWindowHandle.equals(mainWindowHandle)) {

				driver.switchTo().window(childWindowHandle);

			}

		}

		WebElement addToCartbtn = driver.findElement(By.xpath(addToCart));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", addToCartbtn);

		clickElement(addToCart);

	}

	public String addToCartMessage() {
		return textFromElement(addToCartMsg);
	}

}
