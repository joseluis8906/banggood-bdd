package com.banggood.features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NothingToDo {
	@Given("Pepe want to make nothing")
	public void makeNothing() { }
	
	@When("Pepe make some action")
	public void makeSomeAction() {}
	
	@Then("Pepe should see movements in the page")
	public void seeMovementInThePage() {}
}
