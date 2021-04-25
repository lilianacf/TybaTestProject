package co.com.tyba.stepdefinition;

import static co.com.tyba.utils.Environments.CREDIT_CALCULATOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import co.com.tyba.question.BankLoanValue;
import co.com.tyba.question.InitialShareValue;
import co.com.tyba.question.LoanValue;
import co.com.tyba.question.MinimumIncomeValue;
import co.com.tyba.question.MinimumInitialShareValue;
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
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreditCalculatorStepDefinition {

  @Before
  public void prepareStage() {
    setTheStage(new OnlineCast());
  }

  @Given("^que (.*) está en la calculadora de credito de metrocuadrado$")
  public void theActorEntersTheCalculatorWebPortal(String actorsName) {
    theActorCalled(actorsName).wasAbleTo(OpenPage.openUrl(CREDIT_CALCULATOR.Url()));
  }

  @Given("^elige la alternativa (.*)$")
  public void heOpensTheAmountsCalculator(String option) {
    theActorInTheSpotlight().attemptsTo(OpenMenu.option(option));
  }

  @When("selecciona calcular el crédito teniendo ingresos mensuales de (.*) y plazo (.*)$")
  public void heEntersTheValueOfHisIncomeAndThePayment(long monthlyIncome, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateCredit.amounts(monthlyIncome, paymentTerm));
  }

  @Then(
      "^obtendrá las características de su prestamo con valores del inmueble (.*), préstamo bancario (.*), cuota inicial (.*) y cuota mensual (.*)$")
  public void heWillKnowTheCreditConditions(
      String propertyValue,
      String bankLoanValue,
      String minimumInitialFeeValue,
      String monthlyFeeValue) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValue.getValue(), is(propertyValue)),
            seeThat(BankLoanValue.getValue(), is(bankLoanValue)),
            seeThat(MinimumInitialShareValue.getValue(), is(minimumInitialFeeValue)),
            seeThat(MonthlyShareValue.getValue(), is(monthlyFeeValue)));
  }

  @When("^calcula las cuotas con un valor del crédito de (.*) y plazo (.*)$")
  public void heEntersTheCreditValueThePaymentAndTheInterestRate(
      long creditValue, String paymentTerm) {
    theActorInTheSpotlight().attemptsTo(CalculateShares.ofCredit(creditValue, paymentTerm));
  }

  @Then(
      "^obtendrá las características de su cuota con los valores del inmueble (.*), préstamo bancario (.*), cuota inicial (.*) y los ingresos mensuales (.*)$")
  public void heCanSeeTheAmountOfFeesAndTheCreditConditions(
      String propertyValue, String loanValue, String initialFeeValue, String minimumIncome) {
    theActorInTheSpotlight()
        .should(
            seeThat(PropertyValueShare.getValue(), is(propertyValue)),
            seeThat(LoanValue.getValue(), is(loanValue)),
            seeThat(InitialShareValue.getValue(), is(initialFeeValue)),
            seeThat(MinimumIncomeValue.getValue(), is(minimumIncome)));
  }
}
