package co.com.tyba.task;

import static co.com.tyba.userinterface.CalculatorOption.BTN_AMOUNT_CALCULATOR;
import static co.com.tyba.userinterface.CalculatorOption.BTN_FEE_CALCULATOR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class OpenTheMenu implements Task {

  private String option;
  private static final String AMOUNTS_CALCULATOR = "Calcula cuánto te prestan";
  private static final String FEE_CALCULATOR = "Calcula el valor de las cuotas";

  public OpenTheMenu(String option) {
    this.option = option;
  }

  @Override
  @Step("{0} select calculator function ")
  public <T extends Actor> void performAs(T actor) {
    if (option.equals(AMOUNTS_CALCULATOR)) {
      actor.attemptsTo(Click.on(BTN_AMOUNT_CALCULATOR));
    } else if (option.equals(FEE_CALCULATOR)) {
      actor.attemptsTo(Click.on(BTN_FEE_CALCULATOR));
    }
  }

  public static OpenTheMenu option(String option) {
    return Tasks.instrumented(OpenTheMenu.class, option);
  }
}
