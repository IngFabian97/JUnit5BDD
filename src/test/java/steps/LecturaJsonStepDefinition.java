package steps;

import org.junit.jupiter.api.Assertions;

import com.junitbdd.modelos.User;
import com.junitbdd.reader.JsonReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LecturaJsonStepDefinition {

    private User user;

    @Given("Leo el archivo JSON")
    public void leo_el_archivo_json() {
        user = JsonReader.leerUsuarioJson();
    }

    @Then("Verificar que el ID es positivo")
    public void verificar_que_el_id_es_positivo() {
        Assertions.assertTrue(user.getId() > 0, "El ID del usuario debe ser positivo");
    }

    @Then("Verificar que la longitud es {double}")
    public void verificar_que_la_longitud_es(double longitudEsperada) {
        Assertions.assertEquals(longitudEsperada, user.getAddress().getGeo().getLng(), "La longitud del usuario debe ser " + longitudEsperada);
    }

    @Then("Verificar que la longitud de company bs sea mayor a {int}")
    public void verificar_longitud_company_bs_mayor_a(int longitudMinima) {
        Assertions.assertTrue(user.getCompany().getBs().length() > longitudMinima, "La longitud de company bs debe ser mayor a " + longitudMinima);
    }
}