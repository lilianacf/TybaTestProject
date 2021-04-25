package co.com.tyba.task;

import static co.com.tyba.userinterface.FeeCreditCalculator.BTN_CALCULATE_FEES;
import static co.com.tyba.userinterface.FeeCreditCalculator.CMB_TERM_IN_YEARS_FEE;
import static co.com.tyba.userinterface.FeeCreditCalculator.TXT_CREDIT_VALUE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.thucydides.core.annotations.Step;

public class CalculateFees implements Task {

  private long creditValue;
  private String paymentTerm;

  public CalculateFees(long creditValue, String paymentTerm) {
    this.creditValue = creditValue;
    this.paymentTerm = paymentTerm;
  }

  @Override
  @Step("{0} enter credit data and calculate ")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SendKeys.of(String.valueOf(creditValue)).into(TXT_CREDIT_VALUE),
        new SelectByVisibleTextFromTarget(CMB_TERM_IN_YEARS_FEE, paymentTerm),
        Click.on(BTN_CALCULATE_FEES));
  }

  public static CalculateFees ofCredit(long creditValue, String paymentTerm) {
    return Tasks.instrumented(CalculateFees.class, creditValue, paymentTerm);
  }
}
