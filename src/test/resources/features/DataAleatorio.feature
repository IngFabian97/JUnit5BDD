Feature: Data aleatoria

Background:
    Given Genero un par de numeros int aleatorios positivos

@regression @smoke
Scenario: Suma positiva
    When Sumo los numeros generados
    Then El resultado de la suma es positivo

@regression
Scenario: Producto positivo
    When Multiplico los numeros generados
    Then El resultado del producto es positivo

@regression @smoke
Scenario: Raiz cuadrada positiva
    When Calculo la raiz cuadrada de los numeros generados
    Then El resultado de la raiz cuadrada es positivo