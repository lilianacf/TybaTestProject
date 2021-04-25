package co.com.tyba.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/credit_calculator.feature",
    glue = "co.com.tyba.stepdefinition",
    snippets = SnippetType.CAMELCASE)
public class CreditCalculatorRunner {}
