#language: es

Característica: Funcionamiento de la calculadora de crédito

  Esquema del escenario: Liliana quiere calcular cuánto dinero le pueden prestar según sus ingresos mensuales
    Dado Liliana ingresa la calculadora de crédito para vivienda de metrocuadrado.com
    Y selecciona la opción Calcula cuánto te prestan
    Cuando calcula el crédito con ingresos mensuales de <ingreso mensual> y plazo <plazo>
    Entonces podrá ver los valores del inmueble <inmueble>, préstamo bancario <prestamo>, cuota inicial <cuota inicial> y cuota mensual <cuota mensual>

    Ejemplos:
      | ingreso mensual | plazo   | inmueble      |prestamo         | cuota inicial |cuota mensual |
      | 5000000         | 20 Años | $ 225,169,406 | $ 157,618,584   | $ 67,550,822  | $ 1,500,000  |
      | 10000000        | 15 Años | $ 403,448,715 | $ 282,414,101   | $ 121,034,615 | $ 3,000,000  |
      | 12000000        | 10 Años | $ 392,483,625 | $ 274,738,537   | $ 117,745,087 | $ 3,600,000  |
      | 15000000        | 5 Años  | $ 303,984,449 | $ 212,789,114   | $ 91,195,335  | $ 4,500,000  |

  Esquema del escenario: Liliana quiere calcular el valor de su cuota mensual según el valor del crédito
    Dado Liliana ingresa la calculadora de crédito para vivienda de metrocuadrado.com
    Y selecciona la opción Calcula el valor de las cuotas
    Cuando calcula las cuotas con un valor del crédito de <valor credito> y plazo <plazo>
    Entonces podrá ver los valores del inmueble <inmueble>, préstamo bancario <prestamo>, cuota inicial <cuota inicial> y los ingresos mensuales <ingresos>

    Ejemplos:
      | valor credito | plazo   | inmueble      | prestamo        | cuota inicial | ingresos      |
      | 100000000     | 20 Años | $ 142,857,143 | $ 97,149,741    | $ 42,857,143  | $ 3,172,215   |
      | 250000000     | 15 Años | $ 357,142,857 | $ 244,102,021   | $ 107,142,857 | $ 8,852,249   |
      | 300000000     | 10 Años | $ 428,571,429 | $ 294,796,273   | $ 128,571,429 | $ 13,103,367  |
      | 350000000     | 5 Años  | $ 500,000,000 | $ 346,645,205   | $ 150,000,000 | $ 24,672,315  |