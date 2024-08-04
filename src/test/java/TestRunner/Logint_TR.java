package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Logint.feature"},
		glue= {"Logint.java"},
		monochrome=false,
		dryRun=true
		)
public class Logint_TR {

}
