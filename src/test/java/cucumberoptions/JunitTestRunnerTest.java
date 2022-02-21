package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", 
monochrome = true,
tags = "@PlaceOrder or @Offer",
plugin= {"html:target/cucumber1.html","json:target/cucumber1.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"},
dryRun = false)
public class JunitTestRunnerTest {
	
}
