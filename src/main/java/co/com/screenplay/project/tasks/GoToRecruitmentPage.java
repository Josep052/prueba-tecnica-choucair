package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.CommonLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRecruitmentPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CommonLocators.PAGE_RECRUITMENT_BUTTON)
        );
    }

    public static GoToRecruitmentPage mainPage(){

        return new GoToRecruitmentPage();
    }
}
