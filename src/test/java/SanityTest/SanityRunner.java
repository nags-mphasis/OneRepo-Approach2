package SanityTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/SanityTest", glue={"SanityTest"},
	monochrome = true,
	plugin = {"pretty", "json:target/SanityReports/Sanity.json"},
	tags = "@SanityTest")

public class SanityRunner {

}
