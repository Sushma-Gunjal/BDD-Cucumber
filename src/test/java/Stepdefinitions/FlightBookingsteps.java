package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.makemytriphomepage;

public class FlightBookingsteps {

makemytriphomepage makemytrip=new makemytriphomepage();
	
	@Given("user is on makemytripHomePage")
	public void user_is_on_makemytrip_home_page() {
		makemytrip.launchUrl();
		
	}

	@When("user selects from location {string}")
	public void user_selects_from_location(String string) {
		makemytrip.selectFromAddress();
	}

	@When("user Selects To location {string}")
	public void user_selects_to_location(String string) {
		makemytrip.selectTraveller();
	}

	@When("user selects {string} adults and {string} children")
	public void user_selects_adults_and_children(String string, String string2) {
	 
	}

	@When("user selects {string}")
	public void user_selects(String string) {
	 
	}

	@Then("user must be able to book the flight ticket")
	public void user_must_be_able_to_book_the_flight_ticket() {
	 
	}
}
