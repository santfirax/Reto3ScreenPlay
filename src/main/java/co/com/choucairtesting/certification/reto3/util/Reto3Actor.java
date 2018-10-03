package co.com.choucairtesting.certification.reto3.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Reto3Actor {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private WebDriver getHisBrowser() {
        return hisBrowser;
    }
    protected Actor getCarlos() {
        return Actor.named("Carlos").can(BrowseTheWeb.with(getHisBrowser()));
    }
}
