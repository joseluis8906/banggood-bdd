package com.banggood.pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCartDialog {
	public static Target BUTTON = Target.the("Button for add item").located(By.cssSelector("div.addToCartBtn a.add_to_cart.clickandsend"));
}
