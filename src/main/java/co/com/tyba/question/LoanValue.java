package co.com.tyba.question;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Loan value")
public class LoanValue implements Question<String> {

  @Override
  @Step("{0} Validate loan value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_AMOUNT_SHARE_CALCULATOR.resolveFor(actor).getText();
  }

  public static LoanValue getValue() {
    return new LoanValue();
  }
}
