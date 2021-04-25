package co.com.tyba.question;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Loan value")
public class LendingValue implements Question<String> {

  @Override
  @Step("{0} Validate loan value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_AMOUNT_SHARE_CALCULATOR.resolveFor(actor).getText();
  }

  public static LendingValue getValue() {
    return new LendingValue();
  }
}
