package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageLocators extends PageObject {

    public static final Target MAIN_PAGE_BUTTON = Target.the("Navigate to the main page")
            .located(By.xpath("//span[text()='Recruitment']"));
}
