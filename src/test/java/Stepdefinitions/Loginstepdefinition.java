package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {

	WebDriver driver;
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
	    
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("I should be logged in to my account")
	public void i_should_be_logged_in_to_my_account() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
