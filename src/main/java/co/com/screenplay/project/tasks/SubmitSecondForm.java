package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.ChangesSecondFormLocators;
import co.com.screenplay.project.ui.CommonLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SubmitSecondForm implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChangesSecondFormLocators.INTERVIEW_STATUS),
                Click.on(CommonLocators.BUTTON_SAVE),
                Click.on(ChangesSecondFormLocators.OFFER_JOB),
                Click.on(CommonLocators.BUTTON_SAVE),
                Click.on(ChangesSecondFormLocators.HIRE),
                Click.on(CommonLocators.BUTTON_SAVE)
        );
    }

    public static SubmitSecondForm saveChanges(){
        return new SubmitSecondForm();
    }
}
