package co.com.tyba.question.calculationfees;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Confirm initial fee value")
public class InitialFeeValue implements Question<String> {

  @Override
  @Step("{0} Validate initial fee value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_INITIAL_FEE_CALCULATOR.resolveFor(actor).getText();
  }

  public static InitialFeeValue getValue() {
    return new InitialFeeValue();
  }
}
