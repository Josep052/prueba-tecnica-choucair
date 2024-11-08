package co.com.screenplay.project.tasks;
import co.com.screenplay.project.ui.CommonLocators;
import co.com.screenplay.project.ui.SecondFormLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.screenplay.project.ui.SecondFormLocators.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillSecondForm implements Task {

    private final Map<String, String > formDataSecondForm;

    public FillSecondForm(Map<String, String> formDataSecondForm) {
        this.formDataSecondForm = formDataSecondForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formDataSecondForm.get("Interview Title")).into(SecondFormLocators.INTERVIEW_TITLE),
                Enter.theValue(formDataSecondForm.get("Interviewer")).into(INTERVIEWER),
                WaitUntil.the(SecondFormLocators.LISTBOX_OPTION.of(formDataSecondForm.get("Interviewer")), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SecondFormLocators.LISTBOX_OPTION.of(formDataSecondForm.get("Interviewer"))),
                Enter.theValue(formDataSecondForm.get("Date")).into(DATE_INTERVIEW),
                Enter.theValue(formDataSecondForm.get("Time")).into(TIME_INTERVIEW),
                Scroll.to(CommonLocators.BUTTON_SAVE),
                Enter.theValue(formDataSecondForm.get("Notes")).into(SecondFormLocators.NOTES),
                Click.on(CommonLocators.BUTTON_SAVE)
        );
    }

    public static FillSecondForm withData(Map<String, String> formData){

        return new FillSecondForm(formData);
    }
}
