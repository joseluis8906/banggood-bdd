package net.serenity_bdd.samples.banggood.features.steps;

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

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;
import static net.serenity_bdd.samples.banggood.questions.ItemIsInTheShoppingCart.*;
import static net.serenity_bdd.samples.banggood.questions.ItemsSearchResult.*;
import static net.serenity_bdd.samples.banggood.questions.SpecificItemResult.*;
import static net.serenity_bdd.samples.banggood.questions.TitlePage.*;
import static net.serenity_bdd.samples.banggood.tasks.AddItemToCart.*;
import static net.serenity_bdd.samples.banggood.tasks.LookingForAnything.*;
import static net.serenity_bdd.samples.banggood.tasks.OpenPageAtHome.*;
import static net.serenity_bdd.samples.banggood.tasks.SelectItemFromResultList.*;

public class SearchByKeywordStepDefinitions {
	@Managed
	WebDriver browser;
	Actor jose = Actor.named("Jose");
	
	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
		givenThat(jose).can(BrowseTheWeb.with(browser));
	}
	
	@Given("I want to navigate (.*)")
    public void buyerWantsToBuyStep(String article) {
		jose.attemptsTo(openPageAtHome());
        then(jose).should(seeThat(titlePage(), equalTo("Online Shopping for Cool Gadgets, RC Quadcopter, 3D Printer at Banggood")));
    }
	
	@When("I search for items containing '(.*)'")
    public void searchByKeywordStep(String keyword) {
		jose.attemptsTo(lookingForAnything(keyword));
		then(jose).should(seeThat(itemsSearchResult(), greaterThan(0)));
    }
	
	@And("Select an item from the result list")
	public void selectItemFromResultListStep() {
		jose.attemptsTo(selectItemFromResultList());
		then(jose).should(seeThat(specificItemResult(), notNullValue()));
	}
	
	@And("I add these item to cart")
	public void addItemToCartStep() {
		jose.attemptsTo(addItemToCart());
		then(jose).should(seeThat(itemIsInTheShoppingCart(), greaterThan(0)));
	}
	
	@Then("I should only see item related into cart shop")
	public void seeItemIntoCart() {
		then(jose).getName();
	}
}
