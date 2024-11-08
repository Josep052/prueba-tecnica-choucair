package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonLocators extends PageObject {

    public static final Target PAGE_RECRUITMENT_BUTTON = Target.the("Navigate to the recruitment page")
            .located(By.xpath("//span[text()='Recruitment']"));


    public static final Target BUTTON_SAVE = Target.the("Button save")
            .located(By.xpath("//button[normalize-space()='Save']"));

}
