package co.com.tyba.question;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Property value")
public class PropertyValueShare implements Question<String> {

  @Override
  @Step("{0} Validate property value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_TOTAL_CREDIT_VALUE_SHARE_CALCULATOR.resolveFor(actor).getText();
  }

  public static PropertyValueShare getValue() {
    return new PropertyValueShare();
  }
}
