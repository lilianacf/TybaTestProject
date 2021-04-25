package co.com.tyba.task;

import static co.com.tyba.userinterface.ShareCreditCalculator.BTN_CALCULATE_SHARES;
import static co.com.tyba.userinterface.ShareCreditCalculator.CMB_TERM_IN_YEARS_SHARE;
import static co.com.tyba.userinterface.ShareCreditCalculator.TXT_CREDIT_VALUE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.thucydides.core.annotations.Step;

public class CalculateShares implements Task {

  private long creditValue;
  private String paymentTerm;

  public CalculateShares(long creditValue, String paymentTerm) {
    this.creditValue = creditValue;
    this.paymentTerm = paymentTerm;
  }

  @Override
  @Step("{0} enter credit data and calculate ")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SendKeys.of(String.valueOf(creditValue)).into(TXT_CREDIT_VALUE),
        new SelectByVisibleTextFromTarget(CMB_TERM_IN_YEARS_SHARE, paymentTerm),
        Click.on(BTN_CALCULATE_SHARES));
  }

  public static CalculateShares ofCredit(long creditValue, String paymentTerm) {
    return Tasks.instrumented(CalculateShares.class, creditValue, paymentTerm);
  }
}
