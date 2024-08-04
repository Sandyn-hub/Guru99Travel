package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Login_WEB.feature"},
		glue= {"Login_WEB.java"},
		monochrome=false,
		dryRun=true
		)
public class Login_WEBTR {

}
