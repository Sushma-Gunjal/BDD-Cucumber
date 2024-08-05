package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtocartStepdefinifion {


@Given("the user is on the Amazon home page")
public void the_user_is_on_the_amazon_home_page() {
   
}

@Given("the user opens the Amazon homepage")
public void the_user_opens_the_amazon_homepage() {
 
}

@When("the user searches for {string}")
public void the_user_searches_for(String string) {
   
}

@When("the user selects the first product from the search results")
public void the_user_selects_the_first_product_from_the_search_results() {

}

@When("the user adds the product to the cart")
public void the_user_adds_the_product_to_the_cart() {
  
}

@Then("the product should be added to the cart successfully")
public void the_product_should_be_added_to_the_cart_successfully() {
    
}

@Given("the user has added a product to the cart")
public void the_user_has_added_a_product_to_the_cart() {

}

@When("the user navigates to the cart")
public void the_user_navigates_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the cart should contain the added product")
public void the_cart_should_contain_the_added_product() {
   
}


}
