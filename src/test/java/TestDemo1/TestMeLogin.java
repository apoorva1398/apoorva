package TestDemo1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeLogin {
	
	@Given("TestMe app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("code for launch");
	}

	@Given("User accessing registration link")
	public void user_accessing_registration_link() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("code for registration");
	}

	@When("User accessing valid data for all required fiedls")
	public void user_accessing_valid_data_for_all_required_fiedls() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("code for dataprovider");
		
	}

	@Then("user verifying registration status")
	public void user_verifying_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for reg status");
	}

	@Given("TestMe app is launched and acccessible")
	public void testme_app_is_launched_and_acccessible() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("User clicks on login link available in home page")
	public void user_clicks_on_login_link_available_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for login");
	}

	@Then("provides valid credentials")
	public void provides_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for dataprovider for login");
	}

	@Then("user verifying Login status")
	public void user_verifying_Login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for login status");
	}

}
