package com.banggood.pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
	public static Target INPUT = Target.the("Search form input").located(By.cssSelector("input[type='text'][name='keywords']"));
	public static Target BUTTON = Target.the("Search form button").located(By.cssSelector("input[type='submit'][name='header-submit']"));
}
