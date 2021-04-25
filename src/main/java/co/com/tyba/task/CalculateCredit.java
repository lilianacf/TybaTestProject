package co.com.tyba.task;

import co.com.tyba.userinterface.ValueCreditCalculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.thucydides.core.annotations.Step;

public class CalculateCredit implements Task {

  private long monthlyIncome;
  private String paymentTerm;

  public CalculateCredit(long monthlyIncome, String paymentTerm) {
    this.monthlyIncome = monthlyIncome;
    this.paymentTerm = paymentTerm;
  }

  @Override
  @Step("{0} enter credit data and calculate ")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SendKeys.of(String.valueOf(monthlyIncome)).into(ValueCreditCalculator.TXT_MONTHLY_INCOME),
        new SelectByVisibleTextFromTarget(ValueCreditCalculator.CMB_TERM_IN_YEARS, paymentTerm),
        Click.on(ValueCreditCalculator.BTN_CALCULATE_CREDIT));
  }

  public static CalculateCredit amounts(long monthlyIncome, String paymentTerm) {
    return Tasks.instrumented(CalculateCredit.class, monthlyIncome, paymentTerm);
  }
}
