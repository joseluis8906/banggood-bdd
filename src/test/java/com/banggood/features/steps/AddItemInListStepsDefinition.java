package com.banggood.features.steps;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddItemInListStepsDefinition {
	
	private List<String> list;
	private String item;
	
	@Given("Juan want to add items to list")
	public void addItemsToList() {
		this.list = new ArrayList<String>();
	}
	
	@When("Juan attemp to add '(.*)' item to the list")
	public void addAnItemToTheList(String item) {
		this.item = item;
		this.list.add(this.item);
	}
	
	@Then("Juan shoul see the item in the list")
	public void seeItemInTheList() {
		Assertions.assertThat(this.list.size()).isGreaterThan(0);
		Assertions.assertThat(this.list.contains(this.item));
	}
}
