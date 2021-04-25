#language: es

Característica: Funcionamiento de la calculadora de credito

  Escenario: Pedro quiere saber cuánto dinero le prestan con ingresos mensuales altos y con el plazo mínimo
    Dado que Pedro está en la calculadora de crédito de metrocuadrado
    Y elige la alternativa Calcula cuánto te prestan
    Cuando selecciona calcular el crédito teniendo ingresos mensuales de 25000000 y plazo 5 Años
    Entonces obtendrá las características de su préstamo de acuerdo a sus ingresos y plazo
      | valor_vivienda  | valor_prestamo | cuota_inicial  |cuota_mensual |
      |  $ 506,640,748  | $ 354,648,524  | $ 151,992,224  | $ 7,500,000  |

  Escenario: Pedro quiere saber cuánto dinero le prestan con ingresos mensuales bajos y con el plazo maximo
    Dado que Pedro está en la calculadora de crédito de metrocuadrado
    Y elige la alternativa Calcula cuánto te prestan
    Cuando selecciona calcular el crédito teniendo ingresos mensuales de 15000000 y plazo 20 Años
    Entonces obtendrá las características de su préstamo de acuerdo a sus ingresos y plazo
      | valor_vivienda  | valor_prestamo | cuota_inicial  |cuota_mensual |
      |   $ 675,508,219 | $ 472,855,753  | $ 202,652,466  | $ 4,500,000  |

  Escenario: Pedro quiere saber el valor de su cuota mensual cuando el monto es alto y el plazo corto
    Dado que Pedro está en la calculadora de crédito de metrocuadrado
    Y elige la alternativa Calcula el valor de las cuotas
    Cuando calcula las cuotas con un valor del crédito de 790000000 y plazo 5 Años
    Entonces obtendrá las características de su cuota mensual
      |   valor_vivienda    | valor_prestamo | cuota_inicial | ingresos      |
      |   $ 1,128,571,429   | $ 782,427,749  | $ 338,571,429 | $ 55,688,939  |

  Escenario: Pedro quiere saber el valor de su cuota mensual cuando el monto es corto y el plazo alto
    Dado que Pedro está en la calculadora de crédito de metrocuadrado
    Y elige la alternativa Calcula el valor de las cuotas
    Cuando calcula las cuotas con un valor del crédito de 283000000 y plazo 20 Años
    Entonces obtendrá las características de su cuota mensual
      |   valor_vivienda    | valor_prestamo | cuota_inicial | ingresos      |
      |   $ 404,285,714     | $ 274,933,766  | $ 121,285,714 | $ 8,977,368   |