package net.serenity_bdd.samples.banggood.tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddItemToCart implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(By.cssSelector("div.addToCartBtn a.add_to_cart.clickandsend")));
		actor.attemptsTo(WaitUntil.the(By.cssSelector("div.module"), isPresent()));
		actor.attemptsTo(Click.on("div.module div.modal_ship_info a.view_cart"));
	}
	
	public static AddItemToCart addItemToCart() {
		return new AddItemToCart();
	}
}
