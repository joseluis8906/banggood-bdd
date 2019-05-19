package net.serenity_bdd.samples.banggood.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the results of item search")
public class ItemsSearchResult implements Question<Integer> {
	@Override
	public Integer answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findBy(".goodlist_1").thenFindAll("li").size();
	}
	
	public static Question<Integer> itemsSearchResult() { return new ItemsSearchResult(); }
}
