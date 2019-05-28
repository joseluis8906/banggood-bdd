package com.banggood.questions;

import com.banggood.pages.CartListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ItemIsInTheShoppingCart implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		return Text.of(CartListPage.LIST_ITEMS).viewedBy(actor).asList().size();
	}
	
	public static Question<Integer> itemIsInTheShoppingCart() {
		return new ItemIsInTheShoppingCart();
	}
}
