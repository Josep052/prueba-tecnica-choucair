package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChangesSecondFormLocators extends PageObject {

    public static final Target INTERVIEW_STATUS = Target.the("Mark interview status")
            .located(By.xpath("//button[normalize-space()='Mark Interview Passed']"));

    public static final Target SAVE = Target.the("Save changes")
            .located(By.xpath("//button[normalize-space()='Save']"));

    public static final Target OFFER_JOB = Target.the("click in Offer job")
            .located(By.xpath("//button[normalize-space()='Offer Job']"));

    public static final Target HIRE = Target.the("Hire candidate")
            .located(By.xpath("//button[normalize-space()='Hire']"));

}
