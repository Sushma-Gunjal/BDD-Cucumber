package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ="C:\\Users\\sushma\\eclipse-workspace\\BDD__framework\\src\\test\\resources\\Features",
    glue = "Stepdefinitions",
    plugin = {"pretty", "html:target/CucumberReport.html"},
    monochrome = true
)

public class TestRunner {

}
