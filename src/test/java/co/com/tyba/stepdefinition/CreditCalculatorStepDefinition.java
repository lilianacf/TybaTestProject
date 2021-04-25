package co.com.tyba.stepdefinition;

import static co.com.tyba.utils.Environments.CREDIT_CALCULATOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import co.com.tyba.question.calculationfees.InitialFeeValue;
import co.com.tyba.question.calculationfees.LoanValue;
import co.com.tyba.question.calculationfees.MinimumIncomeValue;
import co.com.tyba.question.calculationfees.PropertyValueFee;
import co.com.tyba.question.creditcalculation.BankLoanValue;
import co.com.tyba.question.creditcalculation.MinimumInitialFeeValue;
import co.com.tyba.question.creditcalculation.MonthlyFeeValue;
import co.com.tyba.question.creditcalculation.PropertyValue;
import co.com.tyba.task.CalculateCredit;
import co.com.tyba.task.CalculateFees;
import co.com.tyba.task.OpenTheMenu;
import co.com.tyba.task.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreditCalculatorStepDefinition {

  @Before
  public void prepareStage() {
    setTheStage(new OnlineCast());
  }

  @Given("^(.*) ingresa la calculadora de crédito para vivienda de metrocuadrado.com$")
  public void theActorEntersTheCalculatorWebPortal(String actorsName) {
    theActorCalled(actorsName).wasAbleTo(OpenWeb.openUrl(CREDIT_CALCULATOR.Url()));
  }

  @Given("^selecciona la opción (.*)$")
  public void heOpensTheAmountsCalculator(String option) {
    theActorInTheSpotlight().attemptsTo(OpenTheMenu.option(option));
  }

  @When("calcula el crédito con ingresos mensuales de (.*) y plazo (.*)$")
  public void heEntersTheValueOfHisIncomeAndThePayment(long monthlyIncome, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateCredit.amounts(monthlyIncome, paymentTerm));
  }

  @Then(
      "^podrá ver los valores del inmueble (.*), préstamo bancario (.*), cuota inicial (.*) y cuota mensual (.*)$")
  public void heWillKnowTheCreditConditions(
      String propertyValue,
      String bankLoanValue,
      String minimumInitialFeeValue,
      String monthlyFeeValue) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValue.getValue(), is(propertyValue)),
            seeThat(BankLoanValue.getValue(), is(bankLoanValue)),
            seeThat(MinimumInitialFeeValue.getValue(), is(minimumInitialFeeValue)),
            seeThat(MonthlyFeeValue.getValue(), is(monthlyFeeValue)));
  }

  @When("^calcula las cuotas con un valor del crédito de (.*) y plazo (.*)$")
  public void heEntersTheCreditValueThePaymentAndTheInterestRate(
      long creditValue, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateFees.ofCredit(creditValue, paymentTerm));
  }

  @Then(
      "^podrá ver los valores del inmueble (.*), préstamo bancario (.*), cuota inicial (.*) y los ingresos mensuales (.*)$")
  public void heCanSeeTheAmountOfFeesAndTheCreditConditions(
      String propertyValue, String loanValue, String initialFeeValue, String minimumIncome) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValueFee.getValue(), is(propertyValue)),
            seeThat(LoanValue.getValue(), is(loanValue)),
            seeThat(InitialFeeValue.getValue(), is(initialFeeValue)),
            seeThat(MinimumIncomeValue.getValue(), is(minimumIncome)));
  }
}
