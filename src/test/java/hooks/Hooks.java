package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.Logs;

public class Hooks {

    @BeforeAll
    public static void BeforeAll(){
        Logs.info("beforeAll");
    }

    @AfterAll
    public static void AfterAll(){
        Logs.info("afterAll");
    }

    @Before
    public static void Before(Scenario scenario){
        Logs.info("before" + scenario.getName());
    }

    @After
    public static void After(Scenario scenario){
        Logs.info("after " + scenario.getName() + " , status: " + scenario.getStatus());
    }
}
