package com.banggood.tasks;

import org.openqa.selenium.Keys;

import com.banggood.pages.SearchForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LookingForAnything implements Task {

	private String keyword;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(SearchForm.INPUT, isPresent()));
		actor.attemptsTo(Enter.theValue(keyword).into(SearchForm.INPUT));
		actor.attemptsTo(Hit.the(Keys.ENTER).into(SearchForm.BUTTON));
	}
	
	public LookingForAnything withKeyword(String keyword) {
		this.keyword = keyword;
		return this;
	}
	
	public static LookingForAnything lookingForAnything(String keyword) { return new LookingForAnything().withKeyword(keyword); }
}
