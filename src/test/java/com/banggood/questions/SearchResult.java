package com.banggood.questions;

import com.banggood.pages.ResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("the results of item search")
public class SearchResult implements Question<Integer> {
	@Override
	public Integer answeredBy(Actor actor) {
		return Text.of(ResultPage.ITEMS).viewedBy(actor).asList().size();
	}
	
	public static Question<Integer> searchResult() { return new SearchResult(); }
}
