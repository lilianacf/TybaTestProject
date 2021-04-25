package co.com.tyba.question.creditcalculation;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Confirm property value")
public class PropertyValue implements Question<String> {

  @Override
  @Step("{0} Validate property value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_TOTAL_CREDIT_VALUE_AMOUNT.resolveFor(actor).getText();
  }

  public static PropertyValue getValue() {
    return new PropertyValue();
  }
}
