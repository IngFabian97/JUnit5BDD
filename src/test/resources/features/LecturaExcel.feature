Feature: Lectura Excel

Scenario: Verificar el primer elemento de la lista de monstruos
    Given Leo la lista de monstruos
    When Obtengo el primer elemento de la lista
    Then El nombre del primer monstruo es "TOLOSO" y su edad es 5

Scenario: Verificar el ultimo elemento de la lista de monstruos
    Given Leo la lista de monstruos
    When Obtengo el último elemento de la lista
    Then El genero del ultimo monstruo es "MACHO" y su tipo es "PLANTA"

Scenario: Verificar la longitud de la lista de monstruos
    Given Leo la lista de monstruos
    When Obtengo ela longitud de la lista
    Then La longitud de la lista es 14