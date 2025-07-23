Feature: Lectura de un archivo JSON

Scenario: Verificar ID positivo
   Given Leo el archivo JSON
   Then Verificar que el ID es positivo

Scenario: Verificar longiitud
   Given Leo el archivo JSON
   Then Verificar que la longitud es 71.7478

Scenario: Verificar la longitud de company bs 
    Given Leo el archivo JSON
    Then Verificar que la longitud de company bs sea mayor a 10