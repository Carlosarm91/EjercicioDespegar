#Author: Carlos Sarmiento
#Feature para la busqueda de vuelos en Despegar.
@tag
Feature: Busqueda de vuelo en Despegar


  @tag1
  Scenario Outline: Solo ida para 2 adultos y 3 niños y validar el precio más barato del vuelo.
    Given Ingreso a Navegador
    When Ingresar destino fecha y cantidad de personas <destino><fecha><adultos><niños>
    Then Validar precio mas bajo<precioEsperado>
    Examples: 
      |destino|fecha         |adultos|niños|precioEsperado|
      | "roma"| "2019-01-30" | "2"   |"3"	 |  7596990     |
   
  @tag2
  Scenario Outline: ida y vuelta para 4 adultos y 4 niños y validar el precio más barato del vuelo
    Given Ingreso a Navegador
    When Ingresar destino fecha ida fecha vuelta y cantidad de personas <destino><fechaIda><fechaVuelta><adultos><niños>
    Then Validar precio mas bajo<precioEsperado>
    Examples: 
      |destino |  fechaIda    |fechaVuelta  |adultos| niños |precioEsperado|
      | "quito"| "2019-01-30" |"2019-02-13" |  "4"  |  "4"  | 7596990      |
      
  @tag3
  Scenario Outline: vuelo para 3 niños 2 adultos sin decidir fecha validar el precio más alto del vuelo
    Given Ingreso a Navegador
    When Ingresar destino y cantidad de personas <destino><adultos><niños>
    Then Validar precio mas alto
    Examples: 
      |destino |adultos|niños|
      | "barcelona" | "3"   |"2"	 |

