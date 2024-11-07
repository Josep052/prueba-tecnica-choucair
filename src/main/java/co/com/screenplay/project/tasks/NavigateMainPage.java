package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.MainPageLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateMainPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPageLocators.MAIN_PAGE_BUTTON)
        );
    }

    public static NavigateMainPage mainPage(){

        return new NavigateMainPage();
    }
}
