package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChangesFirstFormLocators extends PageObject {

    public static final Target BUTTON_SHORTLIST = Target.the("Button short list")
            .located(By.xpath("//button[normalize-space()='Shortlist']"));

    public static final Target BUTTON_SCHEDULE_INTERVIEW = Target.the("Button Interview")
            .located(By.xpath("//button[normalize-space()='Schedule Interview']"));


    public static final Target BUTTON_SAVE = Target.the("Button save")
            .located(By.xpath("//button[normalize-space()='Save']"));
}
