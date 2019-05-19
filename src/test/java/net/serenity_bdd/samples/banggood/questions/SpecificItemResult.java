package net.serenity_bdd.samples.banggood.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("SpecificItemResult")
public class SpecificItemResult implements Question<String> {
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findBy(".item_now_price").then().getText();
	}
	
	public static Question<String> specificItemResult() { return new SpecificItemResult(); }
}
