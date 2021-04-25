package co.com.tyba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValueCreditCalculator {

  public static final Target TXT_MONTHLY_INCOME =
      Target.the("monthly income").located(By.id("ingresosMensuales"));

  public static final Target CMB_TERM_IN_YEARS =
      Target.the("list term in years")
          .located(By.xpath("//div[@class='form-group']//select[@ng-model='termInYears']"));

  public static final Target BTN_CALCULATE_CREDIT =
      Target.the("calculate credit button")
          .located(By.xpath("//button[@class='btn btn-upload credito']"));
}
