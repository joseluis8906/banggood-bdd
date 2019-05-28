package com.banggood.features;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/search/buy_anything.feature")
public class BuyAnything {}
