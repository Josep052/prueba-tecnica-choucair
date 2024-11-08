package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.ChangesFirstFormLocators;
import co.com.screenplay.project.ui.CommonLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SubmitFirstForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ChangesFirstFormLocators.BUTTON_SHORTLIST, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ChangesFirstFormLocators.BUTTON_SHORTLIST),
                Click.on(CommonLocators.BUTTON_SAVE),
                Click.on(ChangesFirstFormLocators.BUTTON_SCHEDULE_INTERVIEW)
        );
    }

    public static SubmitFirstForm saveChanges(){
        return new SubmitFirstForm();
    }
}
