package com.knight.cucumber.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TryThisDefs {

	@Given("Open the Firefox and launch the application")
	public void open_the_Firefox_and_launch_the_application() {
		System.out.println("here i am");
	}

	@When("Enter the Username and Password")
	public void enter_the_Username_and_Password() {
		System.out.println("this is me");
	}

	@Then("Reset the credential")
	public void reset_the_credential() {
		System.out.println("fuck you");
	}

}
