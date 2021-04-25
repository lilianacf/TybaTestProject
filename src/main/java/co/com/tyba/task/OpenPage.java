package co.com.tyba.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenPage implements Task {

  private String url;

  public OpenPage(String url) {
    this.url = url;
  }

  @Override
  @Step("{0} Open metro cuadrado credit calculator ")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(url));
  }

  public static OpenPage openUrl(String url) {
    return Tasks.instrumented(OpenPage.class, url);
  }
}
