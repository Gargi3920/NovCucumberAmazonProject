package StepDefinarion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Features/FirstPage.feature"},
		
		glue = {"StepDefinarion"},
		publish = true,
		plugin = {"pretty", "html:target/htmlReport/HTMLREPORT.html"}
		
		
		)

public class TestRun {

}
