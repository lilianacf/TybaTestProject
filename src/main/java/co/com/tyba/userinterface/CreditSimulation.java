package co.com.tyba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreditSimulation {

  public static final Target LBL_TOTAL_CREDIT_VALUE_AMOUNT =
      Target.the("Value you can buy a property from")
          .located(By.xpath("//div[@ng-show = 'showLoanInfo']//dd[@class='valor ng-binding']"));

  public static final Target LBL_AMOUNT_LOAN_CREDIT_CALCULATOR =
      Target.the("Value A bank can lend you up to")
          .located(
              By.xpath(
                  "//div[@ng-show = 'showLoanInfo']//span[contains(text(),'Un banco puede prestarte')]/../following-sibling::dd[@class='ng-binding']"));

  public static final Target LBL_INITIAL_FEE_AMOUNT_CALCULATOR =
      Target.the("Value You must have a minimum down payment of")
          .located(
              By.xpath(
                  "//div[@ng-show = 'showLoanInfo']//span[contains(text(),'Debe tener una cuota inicial')]/../following-sibling::dd[@class='ng-binding']"));

  public static final Target LBL_TOTAL_CREDIT_VALUE_FEE_CALCULATOR =
      Target.the("Value you can buy a property from, Fee Calculator")
          .located(
              By.xpath("//div[@ng-show = 'showLoanInfoByQuota']//dd[@class='valor ng-binding']"));

  public static final Target LBL_MINIMUM_INCOME =
      Target.the("Value You must have monthly income of")
          .located(
              By.xpath(
                  "//div[@ng-show = 'showLoanInfoByQuota']//span[contains(text(),'Debes tener ingresos mensuales')]/../following-sibling::dd[@class='ng-binding']"));

  public static final Target LBL_INITIAL_FEE_CALCULATOR =
      Target.the("Value You must have a minimum initial fee of")
          .located(
              By.xpath(
                  "//div[@ng-show = 'showLoanInfoByQuota']//span[contains(text(),'Debes tener una cuota inicial')]/../following-sibling::dd[@class='ng-binding']"));

  public static final Target LBL_AMOUNT_FEE_CALCULATOR =
      Target.the("Value of the monthly fee")
          .located(By.xpath("//td[@ng-class=\"{'valor_result2': bank.state == 'S'}\"]//br/.."));

  public static final Target LBL_AMOUNT_FEE_AMOUNT_CALCULATOR =
      Target.the("Value of the monthly fee, fee calculator")
          .located(By.xpath("//td[@ng-class=\"{'valor_result': bank.state == 'S'}\"]//br/.."));
}
