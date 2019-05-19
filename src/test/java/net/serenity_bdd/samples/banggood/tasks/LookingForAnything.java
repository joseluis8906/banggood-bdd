package net.serenity_bdd.samples.banggood.tasks;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class LookingForAnything implements Task {

	private String keyword;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(this.keyword).into(By.cssSelector("input[name='keywords']")));
		actor.attemptsTo(Hit.the(Keys.ENTER).into(By.cssSelector("input[name='keywords']")));
	}
	
	public LookingForAnything withKeyword(String keyword) {
		this.keyword = keyword;
		return this;
	}
	
	public static LookingForAnything lookingForAnything(String keyword) { return new LookingForAnything().withKeyword(keyword); }
}
