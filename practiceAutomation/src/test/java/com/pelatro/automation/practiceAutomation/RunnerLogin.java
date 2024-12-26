package com.pelatro.automation.practiceAutomation;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/login.feature", plugin = {
		"rerun:target/rerun.txt" }, glue = {
				"com.pelatro.automation.practiceAutomation.test.steps" }, tags = { "" }, format = { "pretty"} )
public class RunnerLogin {
	
	

}
