package SmokeTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/SmokeTest", glue={"SmokeTest"},
	monochrome = true,
	plugin = {"pretty", "json:target/SmokeReports/Smoke.json"},
	tags = "@SmokeTest")

public class SmokeRunner {

}
