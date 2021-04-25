package co.com.tyba.question;

import co.com.tyba.userinterface.CreditSimulation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.annotations.Step;

@Subject("Monthly share value")
public class LeastIncomeValue implements Question<String> {

  @Override
  @Step("{0} Validate  monthly share value")
  public String answeredBy(Actor actor) {
    return CreditSimulation.LBL_MINIMUM_INCOME.resolveFor(actor).getText();
  }

  public static LeastIncomeValue getValue() {
    return new LeastIncomeValue();
  }
}
