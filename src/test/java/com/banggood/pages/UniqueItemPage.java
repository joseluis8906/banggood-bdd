package com.banggood.pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class UniqueItemPage {
	public static Target PRICE = Target.the("Price description").located(By.cssSelector(".item_now_price"));
}
