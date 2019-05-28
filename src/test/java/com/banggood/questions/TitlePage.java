package com.banggood.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the title page")
public class TitlePage implements Question<String> {
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).getTitle();
	}
	
	public static Question<String> titlePage() { return new TitlePage(); }
}