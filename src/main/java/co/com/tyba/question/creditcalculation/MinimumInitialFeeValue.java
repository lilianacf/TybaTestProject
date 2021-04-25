package co.com.tyba.question.creditcalculation;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Confirm minimum initial fee value")
public class MinimumInitialFeeValue implements Question<String> {

  @Override
  @Step("{0} Validate minimum initial fee value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_INITIAL_FEE_AMOUNT_CALCULATOR.resolveFor(actor).getText();
  }

  public static MinimumInitialFeeValue getValue() {
    return new MinimumInitialFeeValue();
  }
}
