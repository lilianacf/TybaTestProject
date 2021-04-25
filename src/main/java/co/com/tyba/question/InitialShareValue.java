package co.com.tyba.question;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Initial share value")
public class InitialShareValue implements Question<String> {

  @Override
  @Step("{0} Validate initial share value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_INITIAL_SHARE_CALCULATOR.resolveFor(actor).getText();
  }

  public static InitialShareValue getValue() {
    return new InitialShareValue();
  }
}
