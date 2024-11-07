package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.LoginPageLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {

    private final String user;
    private final String pass;

    public LoginUser(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPageLocators.USER_NAME),
                Enter.theValue(pass).into(LoginPageLocators.PASSWORD),
                Click.on(LoginPageLocators.BUTTON_LOGIN)
        );
    }

    public static LoginUser withCredentials(String user, String pass){
        return instrumented(LoginUser.class, user, pass);
    }
}
