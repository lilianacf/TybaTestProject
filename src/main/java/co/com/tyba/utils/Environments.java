package co.com.tyba.utils;

public enum Environments {
  CREDIT_CALCULATOR("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/");

  private final String url;

  Environments(String url) {
    this.url = url;
  }

  public String Url() {
    return url;
  }
}
