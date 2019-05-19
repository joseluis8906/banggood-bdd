package net.serenity_bdd.samples.banggood.questions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ItemIsInTheShoppingCart implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		BrowseTheWeb.as(actor).waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".newcart_main")));
		return BrowseTheWeb.as(actor).findBy(".newcart_box").thenFindAll(".newcart_list_items").size();
	}
	
	public static Question<Integer> itemIsInTheShoppingCart() {
		return new ItemIsInTheShoppingCart();
	}
}
