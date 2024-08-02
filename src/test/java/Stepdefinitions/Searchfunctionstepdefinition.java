package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Amazonhomepage;

public class Searchfunctionstepdefinition {

Amazonhomepage amzonhomepage;
	
WebDriver driver;
	

@Before
public void browserSetup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\java\\WebDriver\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}

@After
public void teardown() {
	
	driver.close();
	
}



@Given("user is on Amazon homepage")
public void user_is_on_amazon_homepage() {
	

    driver.get("https://www.amazon.in");
    amzonhomepage=new Amazonhomepage(driver);
    
  
}

@When("user enters {string} into the search box")
public void user_enters_into_the_search_box(String laptop) throws InterruptedException {

Thread.sleep(3000);

	amzonhomepage.enterserchitem("HP laptop");

}

@When("user clicks on search button")
public void user_clicks_on_search_button() {
	amzonhomepage.clickSearchButton();
}

@Then("list of search results should be displayed for {string}")
public void list_of_search_results_should_be_displayed_for(String string) {
	amzonhomepage.listofRelatedSearchproduct();
	
   
}

}
