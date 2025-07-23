Feature: Data aleatoria

Scenario: Suma positiva
    Given Genero un par de numeros int aleatorios positivos
    When Sumo los numeros generados
    Then El resultado de la suma es positivo

Scenario: Producto positivo
    Given Genero un par de numeros int aleatorios positivos
    When Multiplico los numeros generados
    Then El resultado del producto es positivo

Scenario: Raiz cuadrada positiva
    Given Genero un par de numeros int aleatorios positivos
    When Calculo la raiz cuadrada de los numeros generados
    Then El resultado de la raiz cuadrada es positivo