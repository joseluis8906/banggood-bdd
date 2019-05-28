package com.banggood.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartListPage {
	public static Target LIST_CONTAINER = Target.the("List container of cart items").located(By.cssSelector("div.module"));
	public static Target ITEM = Target.the("Item of items result").located(By.cssSelector("div.module div.modal_ship_info a.view_cart"));
	public static Target LIST_ITEMS = Target.the("Items of list container").located(By.cssSelector(".newcart_box .newcart_list_items"));
}
