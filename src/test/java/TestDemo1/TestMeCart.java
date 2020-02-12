package TestDemo1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestMeCart {

	

@Given("application launched by registered user")
public void application_launched_by_registered_user() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("app launched");
}

@Then("user verify added item")
public void user_verify_added_item() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("app launched");
}

@Then("user verify removed item")
public void user_verify_removed_item() {
    // Write code here that turns the phrase above into concrete actions
 //   throw new cucumber.api.PendingException();
	System.out.println("app launched");
}

@Then("user verify counted item")
public void user_verify_counted_item() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	System.out.println("app launched");
	
}
}
