package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
 @Given("open browser")
 public void open_browser() {
    System.out.println("browser opend");
 }

@Given("I open login page")
public void i_open_login_page() {
    System.out.println("I open login page");
}

@When("I enter my password")
public void i_enter_my_password() {
   System.out.println("I enter my password");
}

@Then("I should be logged in")
public void i_should_be_logged_in() {
   System.out.println("I should be logged in");
}



}
