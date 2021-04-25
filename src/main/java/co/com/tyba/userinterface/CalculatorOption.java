package co.com.tyba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CalculatorOption {

  public static final Target BTN_AMOUNT_CALCULATOR =
      Target.the("amount calculator button")
          .located(By.xpath("//a[contains(text(), 'cuánto te prestan')]"));

  public static final Target BTN_SHARE_CALCULATOR =
      Target.the("share calculator button")
          .located(By.xpath("//a[contains(text(), 'Calcula el valor de las')]"));
}
