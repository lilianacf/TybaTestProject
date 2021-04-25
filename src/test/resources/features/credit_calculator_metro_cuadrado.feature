#language: es

Característica: Funcionamiento de la calculadora de crédito

  Esquema del escenario: Pedro quiere saber cuánto dinero le prestan según sus ingresos mensuales
    Dado que Pedro está en la calculadora de credito de metrocuadrado
    Y elige la alternativa Calcula cuánto te prestan
    Cuando selecciona calcular el crédito teniendo ingresos mensuales de <ingresos> y plazo <limite tiempo>
    Entonces obtendrá las características de su prestamo con valores del inmueble <valor inmueble>, préstamo bancario <valor prestamo>, cuota inicial <cuota inicial> y cuota mensual <cuota mensual>

    Ejemplos:
      | ingresos  | limite tiempo   | valor inmueble      | valor prestamo  | cuota inicial |cuota mensual |
      | 15000000  | 5 Años          | $ 303,984,449       | $ 212,789,114   | $ 91,195,335  | $ 4,500,000  |
      | 19000000  | 10 Años         | $ 621,432,406       | $ 435,002,684   | $ 186,429,722 | $ 5,700,000  |
      | 22000000  | 15 Años         | $ 887,587,173       | $ 621,311,021   | $ 266,276,152 | $ 6,600,000  |
      | 25000000  | 20 Años         | $ 1,125,847,031     | $ 788,092,922   | $ 337,754,109 | $ 7,500,000  |

  Esquema del escenario: Pedro quiere saber el valor de su cuota mensual según el monto del crédito solicitado
    Dado que Pedro está en la calculadora de credito de metrocuadrado
    Y elige la alternativa Calcula el valor de las cuotas
    Cuando calcula las cuotas con un valor del crédito de <total credito> y plazo <limite tiempo>
    Entonces obtendrá las características de su cuota con los valores del inmueble <valor inmueble>, préstamo bancario <valor prestamo>, cuota inicial <valor cuota inicial> y los ingresos mensuales <ingresos>

    Ejemplos:
      | total credito | limite tiempo   |  valor inmueble      | valor prestamo        | valor cuota inicial | ingresos      |
      | 283000000     | 5 Años          | $ 404,285,714        | $ 280,287,409         | $ 121,285,714       | $ 19,949,329  |
      | 435000000     | 10 Años         | $ 621,428,571        | $ 427,454,596         | $ 186,428,571       | $ 18,999,883  |
      | 622000000     | 15 Años         | $ 888,571,429        | $ 607,325,829         | $ 266,571,429       | $ 22,024,396  |
      | 790000000     | 20 Años         | $ 1,128,571,429      | $ 767,482,951         | $ 338,571,429       | $ 25,060,497  |