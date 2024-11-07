package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyStatusUserLocators extends PageObject {

    public static final Target INPUT_CANDIDATE_NAME = Target.the("Name candidate ")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target LISTBOX_OPTION = Target.the("Option in listbox")
            .locatedBy("//div[@role='listbox']//div[contains(., '{0}')]");


    public static final Target BUTTON_SEARCH = Target.the("Button search candidate ")
            .located(By.xpath("//button[normalize-space()='Search']"));


    public static final Target STATUS_HIRED = Target.the("Hired status text")
            .located(By.xpath("//div[contains(text(),'Hired')]"));

}
