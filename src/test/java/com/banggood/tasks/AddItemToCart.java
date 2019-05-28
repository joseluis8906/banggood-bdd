package com.banggood.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import com.banggood.pages.AddToCartDialog;
import com.banggood.pages.CartListPage;

public class AddItemToCart implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AddToCartDialog.BUTTON));
		actor.attemptsTo(WaitUntil.the(CartListPage.LIST_CONTAINER, isPresent()));
		actor.attemptsTo(Click.on(CartListPage.ITEM));
	}
	
	public static AddItemToCart addItemToCart() {
		return new AddItemToCart();
	}
}
