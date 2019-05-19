package net.serenity_bdd.samples.banggood.features;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/search/search_by_keyword.feature")
public class BuyAnything {}