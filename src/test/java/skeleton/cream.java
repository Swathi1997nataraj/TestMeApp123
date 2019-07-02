package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cream {
	
	@Given("I have some cakes in my hand")
	public void i_have_some_cakes_in_my_hand() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given");
	    
	}

	@When("I wait for some hour")
	public void i_wait_for_some_hour() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
	    
	}

	@Then("my cakes will disappear")
	public void my_cakes_will_disappear() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("ActualResult");
	    
	}
	

}
