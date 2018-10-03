package co.com.choucairtesting.certification.reto3.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    private RegistrationForm(){
         }
    public static final Target FIRST_NAME_FIELD = Target.the("first name field").locatedBy("//*[@class='col-md-4']/div[1]/input");
    public static final Target LAST_NAME_FIELD = Target.the("last name field").locatedBy("//*[@class='col-md-4']/div[2]/input");
    public static final Target PHONE_FIELD = Target.the("telephone field").locatedBy("//*[@class='col-md-4']/div[3]/input");
    public static final Target IDENTIFICATION_TYPE = Target.the("identification type field").locatedBy("//*[@class='col-md-4']/div[4]/select");
    public static final Target ID_DOCUMENT_FIELD = Target.the("id document field").locatedBy("//*[@class='col-md-4']/div[5]/input");
    public static final Target SUBMIT_BUTTON = Target.the("submit button").located(By.xpath("//*[@class='col-md-4']/a"));
    public static final Target DATA_STORED_LABEL = Target.the("data stored label").located(By.xpath("//*[@class='panel-body']/p"));
    public static final Target PREPAID_HEALTH_CHECKBOX = Target.the("prepaid health checkbox").located(By.name("prepaid"));
}
