package steps;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import com.junitbdd.modelos.Monstruo;
import com.junitbdd.reader.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LecturaExcelStepDefinition {
    private List<Monstruo> monstruos;
    private Monstruo monstruo;
    private int tamaLista;

    @Given("Leo la lista de monstruos")
    public void leo_la_lista_de_monstruos() {
        monstruos = ExcelReader.obtenerListaMonstruos();
    }

    @When("Obtengo el primer elemento de la lista")
    public void obtengo_el_primer_elemento_de_la_lista() {
        monstruo = monstruos.get(0);
    }  

    @Then("El nombre del primer monstruo es {string} y su edad es {int}")
    public void el_nombre_del_primer_monstruo_es_y_su_edad_es(String nombre, int edad) {
        Assertions.assertAll(
            () -> Assertions.assertEquals(nombre, monstruo.getNombre(), "El nombre del primer monstruo debe ser " + nombre),
            () -> Assertions.assertEquals(edad, monstruo.getEdad(), "La edad del primer monstruo debe ser " + edad)
        );
    }

    @When("Obtengo el último elemento de la lista")
    public void obtengo_el_ultimo_elemento_de_la_lista() {
        monstruo = monstruos.get(monstruos.size() - 1);
    }

    @Then("El genero del ultimo monstruo es {string} y su tipo es {string}")
    public void el_genero_del_ultimo_monstruo_es_y_su_tipo_es(String genero, String tipo) {
        Assertions.assertAll(
            () -> Assertions.assertEquals(genero, monstruo.getGenero(), "El genero del ultimo monstruo debe ser " + genero),
            () -> Assertions.assertEquals(tipo, monstruo.getTipo(), "El tipo del ultimo monstruo debe ser " + tipo)
        );
    }

    @When("Obtengo la longitud de la lista")
    public void obtengo_la_longitud_de_la_lista() {
        tamaLista = monstruos.size();
    }

    @Then("La longitud de la lista es {int}")
    public void la_longitud_de_la_lista_es(int longitudEsperada) {
        Assertions.assertEquals(longitudEsperada, tamaLista, "La longitud de la lista debe ser " + longitudEsperada);
    }

    @When ("Obtengo el elemento con index {int}")
    public void obtengo_el_elemento_con_index(int index) {
        monstruo = monstruos.get(index);

    }

    @Then("Verifico que el nombre del monstruo es {string}, edad {int} y su peso es {double}")
    public void verifico_que_el_nombre_del_monstruo_es_edad_y_su_peso_es( String nombre, int edad, double peso) {
        Assertions.assertAll(
            () -> Assertions.assertEquals(monstruo.getNombre(), nombre, "El nombre del monstruo debe ser " + nombre),
            () -> Assertions.assertEquals(monstruo.getEdad(), edad, "La edad del monstruo debe ser " + edad),
            () -> Assertions.assertEquals(monstruo.getPeso(), peso, "El peso del monstruo debe ser " + peso)
        
        );
    }
 
}