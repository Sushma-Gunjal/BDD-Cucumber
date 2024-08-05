package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Stepdefinitions.BaseClass;

public class Productcartpage extends BaseClass {

	Productcartpage productcart;

	By searchBox = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");
	By firstProduct = By.cssSelector(".s-main-slot .s-result-item");
	By addToCartButton = By.id("add-to-cart-button");
	By cartButton = By.id("nav-cart");
	By cartItem = By.cssSelector(".sc-list-item");

	
	
	public Productcartpage(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void searchForProduct(String productName) {
	        driver.findElement(searchBox).sendKeys(productName);
	        driver.findElement(searchButton).click();
	    }

	    public void selectFirstProduct() {
	        driver.findElement(firstProduct).click();
	    }

	    public void addProductToCart() {
	        driver.findElement(addToCartButton).click();
	    }
	    
	    
	    public Productcartpage isProductAddedToCart() {
	       return this;
	    }

	    public void goToCart() {
	        driver.findElement(cartButton).click();
	    }

	    public Productcartpage isProductInCart() {
	       return this;
	    }

}
