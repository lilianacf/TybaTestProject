package co.com.tyba.utils;

public enum Environment {
  CREDIT_CALCULATOR("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/");

  private final String url;

  Environment(String url) {
    this.url = url;
  }

  public String Url() {
    return url;
  }
}
