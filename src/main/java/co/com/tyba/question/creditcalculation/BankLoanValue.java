package co.com.tyba.question.creditcalculation;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Confirm bank loan value")
public class BankLoanValue implements Question<String> {

  @Override
  @Step("{0} Validate bank loan value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_AMOUNT_LOAN_CREDIT_CALCULATOR.resolveFor(actor).getText();
  }

  public static BankLoanValue getValue() {
    return new BankLoanValue();
  }
}
