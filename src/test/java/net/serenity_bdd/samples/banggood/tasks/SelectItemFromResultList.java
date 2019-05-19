package net.serenity_bdd.samples.banggood.tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectItemFromResultList implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(By.cssSelector("a.detail_link_a")));
	}
	
	public static SelectItemFromResultList selectItemFromResultList() {
		return new SelectItemFromResultList();
	}

}
