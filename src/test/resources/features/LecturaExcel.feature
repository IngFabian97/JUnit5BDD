Feature: Lectura Excel

Background:
    Given Leo la lista de monstruos

@regression @smoke
Scenario: Verificar el primer elemento de la lista de monstruos
    When Obtengo el primer elemento de la lista
    Then El nombre del primer monstruo es "TOLOSA" y su edad es 5

@regression
Scenario: Verificar el ultimo elemento de la lista de monstruos
    When Obtengo el último elemento de la lista
    Then El genero del ultimo monstruo es "MACHO" y su tipo es "PLANTA"

@regression @smoke
Scenario: Verificar la longitud de la lista de monstruos
    When Obtengo la longitud de la lista
    Then La longitud de la lista es 14

@regression
Scenario Outline: Verificar cuatro primeros elementos de la lista de monstruos
    When Obtengo el elemento con index <index>
    Then Verifico que el nombre del monstruo es "<nombre>", edad <edad> y su peso es <peso>

    Examples:
        | index | nombre  | edad | peso |
        | 0     | TOLOSA  | 5    |1.97  |
        | 1     | COROMINAS | 1    |2.31  |
        | 2     | ARNAIZ| 5    |2.27  |
        | 3     | CABEZAS| 2    |2.05  |