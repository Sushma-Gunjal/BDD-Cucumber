package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AmazonSearchPageobject;

public class AmazonSearchSteps {

	AmazonSearchPageobject amazonsearchpage=new AmazonSearchPageobject();
	
	@Given("I am on the search page")
	public void i_am_on_the_search_page() throws InterruptedException {
	
		amazonsearchpage.enterSearchItem("Shoes");
	
	}

	@When("I select brands {string} and {string}")
	public void i_select_brands_and(String string, String string2) throws InterruptedException {
		
		amazonsearchpage.applyBrandFilter();		
	}

	@And("I apply a discount filter of {string}")
	public void i_apply_a_discount_filter_of(String string) {
		amazonsearchpage  .applyDiscountFilter();
	}

	@And("I navigate to the third page")
	public void i_navigate_to_page() {
		amazonsearchpage.navigatetopage();
	}

	@And("I select an item and add it to the cart")
	public void i_select_an_item_and_add_it_to_the_cart() throws InterruptedException {
		amazonsearchpage.addToCart();
	}

	@Then("the item should be added to the cart successfully")
	public void the_item_should_be_added_to_the_cart_successfully() {
	    Assert.assertEquals("Added to Cart", amazonsearchpage.addToCartMessage());
	}


	
	//second sceanrio
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		amazonsearchpage.HomePage();
	}

	@When("I select the {string} section")
	public void i_select_the_section(String string) {
	
		amazonsearchpage.selectKidasSection();
	}

	@When("I choose the {string} brand from Featured Brands")
	public void i_choose_the_brand_from_featured_brands(String string) {
		amazonsearchpage.selecttopBrand();
		amazonsearchpage.selectCrocs();
	}

	@When("I filter for the {string}")
	public void i_filter_by_the_age_group(String string) {
		amazonsearchpage.selectShoesSize();
	}

	@Then("I add the first product to the cart")
	public void i_add_the_first_product_to_the_cart() {
amazonsearchpage.addToCartMessage1();
Assert.assertEquals("Added to Cart", amazonsearchpage.addToCartMessage());
	}

	@Then("I should see the product in the cart")
	public void i_should_see_the_product_in_the_cart() {
		amazonsearchpage.OpenCart();
	}

	
}
