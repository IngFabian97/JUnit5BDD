Feature: Lectura de un archivo JSON

Background:
    Given Leo el archivo JSON

Scenario: Verificar ID positivo
   Then Verificar que el ID es positivo

Scenario: Verificar longiitud
   Then Verificar que la longitud es 71.7478

Scenario: Verificar la longitud de company bs 
    Then Verificar que la longitud de company bs sea mayor a 10