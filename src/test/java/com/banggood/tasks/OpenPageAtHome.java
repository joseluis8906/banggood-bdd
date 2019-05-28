package com.banggood.tasks;

import com.banggood.pages.BanggoodPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageAtHome implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(BanggoodPage.class));
	}
	
	public static OpenPageAtHome openPageAtHome() { return new OpenPageAtHome(); }
}
