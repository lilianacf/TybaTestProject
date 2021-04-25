package co.com.tyba.question.calculationfees;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Confirm monthly fee value")
public class MinimumIncomeValue implements Question<String> {

  @Override
  @Step("{0} Validate  monthly fee value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_MINIMUM_INCOME.resolveFor(actor).getText();
  }

  public static MinimumIncomeValue getValue() {
    return new MinimumIncomeValue();
  }
}
