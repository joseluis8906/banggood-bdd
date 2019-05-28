package com.banggood.tasks;

import com.banggood.pages.ResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectItemFromResultList implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ResultPage.ITEM));
	}
	
	public static SelectItemFromResultList selectItemFromResultList() {
		return new SelectItemFromResultList();
	}

}
