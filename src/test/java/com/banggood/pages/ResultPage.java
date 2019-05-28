package com.banggood.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResultPage {
	public static Target ITEM = Target.the("Item from result list").located(By.cssSelector("a.detail_link_a"));
	public static Target ITEMS = Target.the("Total items in result list").located(By.cssSelector("div.good_box_min ul.goodlist_1 li"));
}
