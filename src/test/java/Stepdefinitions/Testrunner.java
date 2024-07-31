package Stepdefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

   features = "C:\\Users\\sushma\\eclipse-workspace\\BDD__framework\\src\\test\\resources\\Features",
   //path of step definition file
   glue = "Stepdefinitions",
   plugin = {"html:target/cucumber-html-report",
		   "json:target/cucumber.json",
		   "junit:target/cucumber.xml"
		   
   }
   
   )
	
public class Testrunner {

}
