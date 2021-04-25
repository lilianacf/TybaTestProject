package co.com.tyba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShareCreditCalculator {

  public static final Target TXT_CREDIT_VALUE =
      Target.the("Credit value").located(By.name("loadAmount"));

  public static final Target CMB_TERM_IN_YEARS_SHARE =
      Target.the("list term in years")
          .located(By.xpath("//div[@class='form-group']//select[@ng-model='termInYearsByQuota']"));

  public static final Target BTN_CALCULATE_SHARES =
      Target.the("calculate fees button")
          .located(By.xpath("//button[@class='btn btn-upload cuotas']"));
}
