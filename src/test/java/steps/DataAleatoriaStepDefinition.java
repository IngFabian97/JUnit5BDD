package steps;

import org.junit.jupiter.api.Assertions;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DataAleatoriaStepDefinition {
    private final Faker faker = new Faker();
    private int a;
    private int b;
    private int suma;
    private int producto;
    private double raizCuadradaA;
    private double raizCuadradaB;

    @Given("Genero un par de numeros int aleatorios positivos")
    public void genero_un_par_de_numeros_int_aleatorios_positivos() {
        a = faker.number().numberBetween(1, 50);
        b = faker.number().numberBetween(1, 50);
    }

    @When("Sumo los numeros generados")
    public void sumo_los_numeros_generados() {
        suma = a + b;
    }

    @Then("El resultado de la suma es positivo")
    public void el_resultado_de_la_suma_es_positivo() {
        Assertions.assertTrue(suma > 0, "El resultado de la suma debe ser positivo");
    }

    @When("Multiplico los numeros generados")
    public void multiplico_los_numeros_generados() {
        producto = a * b;
    }

    @Then("El resultado del producto es positivo")
    public void el_resultado_del_producto_es_positivo() {
        Assertions.assertTrue(producto > 0, "El resultado del producto debe ser positivo");
    }

    @When("Calculo la raiz cuadrada de los numeros generados")
    public void calculo_la_raiz_cuadrada_de_los_numeros_generados() {
        raizCuadradaA = Math.sqrt(a);
        raizCuadradaB = Math.sqrt(b);
    }

    @Then("El resultado de la raiz cuadrada es positivo")
    public void el_resultado_de_la_raiz_cuadrada_es_positivo() {
        Assertions.assertTrue(raizCuadradaA > 0, "El resultado de la raiz cuadrada de A debe ser positivo");
        Assertions.assertTrue(raizCuadradaB > 0, "El resultado de la raiz cuadrada de B debe ser positivo");
    }
}