package co.com.tyba.stepdefinition;

import static co.com.tyba.utils.Environment.METRO_CUADRADO_CREDIT_CALCULATOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import co.com.tyba.question.BankLendingValue;
import co.com.tyba.question.InitialShareValue;
import co.com.tyba.question.LeastIncomeValue;
import co.com.tyba.question.LeastInitialShareValue;
import co.com.tyba.question.LendingValue;
import co.com.tyba.question.MonthlyShareValue;
import co.com.tyba.question.PropertyValue;
import co.com.tyba.question.PropertyValueShare;
import co.com.tyba.task.CalculateCredit;
import co.com.tyba.task.CalculateShares;
import co.com.tyba.task.OpenMenu;
import co.com.tyba.task.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreditCalculatorMetroCuadradoStepDefinition {

  @Before
  public void prepareStage() {
    setTheStage(new OnlineCast());
  }

  @Given("^que (.*) está en la calculadora de crédito de metrocuadrado$")
  public void theActorEntersTheCalculatorWebPortal(String actorsName) {
    theActorCalled(actorsName).wasAbleTo(OpenPage.openUrl(METRO_CUADRADO_CREDIT_CALCULATOR.Url()));
  }

  @Given("^elige la alternativa (.*)$")
  public void heOpensTheAmountsCalculator(String option) {
    theActorInTheSpotlight().attemptsTo(OpenMenu.option(option));
  }

  @When("selecciona calcular el crédito teniendo ingresos mensuales de (.*) y plazo (.*)$")
  public void heEntersTheValueOfHisIncomeAndThePayment(long monthlyIncome, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateCredit.amounts(monthlyIncome, paymentTerm));
  }

  @Then("^obtendrá las características de su préstamo de acuerdo a sus ingresos y plazo$")
  public void heWillKnowTheCreditConditions(List<Map<String, String>> data) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValue.getValue(), is(data.get(0).get("valor_vivienda"))),
            seeThat(BankLendingValue.getValue(), is(data.get(0).get("valor_prestamo"))),
            seeThat(LeastInitialShareValue.getValue(), is(data.get(0).get("cuota_inicial"))),
            seeThat(MonthlyShareValue.getValue(), is(data.get(0).get("cuota_mensual"))));
  }

  @When("^calcula las cuotas con un valor del crédito de (.*) y plazo (.*)$")
  public void heEntersTheCreditValueThePaymentAndTheInterestRate(
      long creditValue, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateShares.ofCredit(creditValue, paymentTerm));
  }

  @Then("^obtendrá las características de su cuota mensual$")
  public void heCanSeeTheAmountOfFeesAndTheCreditConditions(List<Map<String, String>> data) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValueShare.getValue(), is(data.get(0).get("valor_vivienda"))),
            seeThat(LendingValue.getValue(), is(data.get(0).get("valor_prestamo"))),
            seeThat(InitialShareValue.getValue(), is(data.get(0).get("cuota_inicial"))),
            seeThat(LeastIncomeValue.getValue(), is(data.get(0).get("ingresos"))));
  }
}
