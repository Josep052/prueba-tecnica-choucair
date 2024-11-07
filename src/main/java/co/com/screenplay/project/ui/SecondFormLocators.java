package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondFormLocators extends PageObject {

    public static final Target INTERVIEW_TITLE = Target.the("Interview title")
            .located(By.xpath("//div[contains(@class, 'oxd-input-group') and .//label[contains(text(),'Interview Title')]]//input"));

    public static final Target INTERVIEWER = Target.the("interviewer")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target LISTBOX_OPTION = Target.the("Option in listbox")
            .locatedBy("//div[@role='listbox']//div[contains(., '{0}')]");

    public static final Target DATE_INTERVIEW = Target.the("Date interview")
            .located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));

    public static final Target TIME_INTERVIEW = Target.the("Time interview")
            .located(By.xpath("//input[@placeholder='hh:mm']"));

    public static final Target NOTES = Target.the("Notes")
            .located(By.xpath("//textarea[@placeholder='Type here']"));

    public static final Target BUTTON_SAVE = Target.the("Button save")
            .located(By.xpath("//button[normalize-space()='Save']"));


}
