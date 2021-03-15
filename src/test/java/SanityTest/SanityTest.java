package SanityTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SanityTest {
	
	@Given("sanity test is picked")
	public void sanity_test_is_chosen() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line1 Given");
	}

	@When("during execution")
	public void this_is_not_needed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line2 When");
	}

	@Then("this section should run")
	public void this_should_not_run() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line3 Then");
	}
	
	@And("generate report")
	public void generate_report() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Line3 And");
	}

}
