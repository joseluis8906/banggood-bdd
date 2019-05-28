package com.banggood.features.steps;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

//cucumber
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

//matchers
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

//questions
import static com.banggood.questions.ItemIsInTheShoppingCart.itemIsInTheShoppingCart;
import static com.banggood.questions.SearchResult.searchResult;
import static com.banggood.questions.SpecificItemResult.specificItemResult;
import static com.banggood.questions.TitlePage.titlePage;

//tasks
import static com.banggood.tasks.AddItemToCart.addItemToCart;
import static com.banggood.tasks.LookingForAnything.lookingForAnything;
import static com.banggood.tasks.OpenPageAtHome.openPageAtHome;
import static com.banggood.tasks.SelectItemFromResultList.*;

public class ShouldSeeAndBuyAnythingStepsDefinition {
	@Managed
	WebDriver browser;
	Actor jose = Actor.named("Jose");
	
	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
		givenThat(jose).can(BrowseTheWeb.with(browser));
	}
	
	@Given("Jose want to navigate the web")
    public void uyerWantsToBuyStep() {
		jose.attemptsTo(openPageAtHome());
        then(jose).should(seeThat(titlePage(), equalTo("Online Shopping for Cool Gadgets, RC Quadcopter, 3D Printer at Banggood")));
    }
	
	@When("Jose search for items containing '(.*)'")
    public void searchByKeywordStep(String keyword) {
		jose.attemptsTo(lookingForAnything(keyword));
		then(jose).should(seeThat(searchResult(), greaterThan(0)));
    }
	
	@And("Jose select an item from the result list")
	public void selectItemFromResultListStep() {
		jose.attemptsTo(selectItemFromResultList());
		then(jose).should(seeThat(specificItemResult(), notNullValue()));
	}
	
	@And("Jose add these item to the shopping cart")
	public void addItemToCartStep() {
		jose.attemptsTo(addItemToCart());
		then(jose).should(seeThat(itemIsInTheShoppingCart(), greaterThan(0)));
	}
	
	@Then("Jose should only see selected item in the shopping cart")
	public void seeItemIntoCart() {
		then(jose).getName();
	}
}
