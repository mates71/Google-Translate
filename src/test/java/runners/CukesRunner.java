package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber-reports","json:target/cucumber.json"},
		features="./src/test/resources/features",
		glue="stepdefinitions",
		tags="@Smoke",
		dryRun=false
		)

public class CukesRunner {

}
