package com.banggood.questions;

import com.banggood.pages.UniqueItemPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("SpecificItemResult")
public class SpecificItemResult implements Question<String> {
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(UniqueItemPage.PRICE).viewedBy(actor).asString();
	}
	
	public static Question<String> specificItemResult() { return new SpecificItemResult(); }
}
