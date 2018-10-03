package co.com.choucairtesting.certification.reto3.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reto_3_screenplay.feature",
        glue = "co.com.choucairtesting.certification.reto3.stepdefinitions",
        tags = "@Regresion"
)
public class Reto3ScreenPlay {

}
