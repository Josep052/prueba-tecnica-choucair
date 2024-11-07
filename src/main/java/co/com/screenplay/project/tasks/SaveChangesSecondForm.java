package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.ChangesSecondFormLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SaveChangesSecondForm implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChangesSecondFormLocators.INTERVIEW_STATUS),
                Click.on(ChangesSecondFormLocators.SAVE),
                Click.on(ChangesSecondFormLocators.OFFER_JOB),
                Click.on(ChangesSecondFormLocators.SAVE),
                Click.on(ChangesSecondFormLocators.HIRE),
                Click.on(ChangesSecondFormLocators.SAVE)
        );
    }

    public static SaveChangesSecondForm saveChanges(){
        return new SaveChangesSecondForm();
    }
}
