package co.com.choucairtesting.certification.reto3.userinterface;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class AutomationHerokuApp extends PageObject {
    public static final Target ADD_BUTTON_OPTION =Target.the("add role button").locatedBy("//*[@class='list-group']/a[contains(text(),'{0}')]");
}
