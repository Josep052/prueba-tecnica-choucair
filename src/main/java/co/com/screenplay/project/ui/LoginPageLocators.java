package co.com.screenplay.project.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageLocators extends PageObject {

    public static final Target USER_NAME = Target.the("User name field")
            .located(By.name("username"));

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.name("password"));

    public static final Target BUTTON_LOGIN = Target.the("Button for login user")
            .located(By.xpath("//button[@type='submit']"));

}


