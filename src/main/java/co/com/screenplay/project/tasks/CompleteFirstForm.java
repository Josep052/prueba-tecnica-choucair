package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.FirstFormLocators;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

public class CompleteFirstForm implements Task {

    private final Map<String, String> formDataFirstForm;

    public CompleteFirstForm(Map<String, String> formDataFirstForm) {
        this.formDataFirstForm = formDataFirstForm;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FirstFormLocators.LINK_PAGE_RECRUITMENT),
                Click.on(FirstFormLocators.BUTTON_ADD_CANDIDATE),
                Enter.theValue(formDataFirstForm.get("First Name")).into(FirstFormLocators.FIRST_NAME),
                Enter.theValue(formDataFirstForm.get("Middle Name")).into(FirstFormLocators.MIDDLE_NAME),
                Enter.theValue(formDataFirstForm.get("Last Name")).into(FirstFormLocators.LAST_NAME),
                Click.on(FirstFormLocators.SELECT_VACANCY),
                Click.on(FirstFormLocators.PAYROLL_ADMINISTRATOR_OPTION),
                Enter.theValue(formDataFirstForm.get("Email")).into(FirstFormLocators.EMAIL),
                Enter.theValue(formDataFirstForm.get("Phone Number")).into(FirstFormLocators.PHONE_NUMBER),
                Enter.theValue(formDataFirstForm.get("Keyword")).into(FirstFormLocators.KEYWORDS),
                Scroll.to(FirstFormLocators.BUTTON_SAVE),
                Enter.theValue(formDataFirstForm.get("Notes")).into(FirstFormLocators.NOTES),
                Click.on(FirstFormLocators.CHECK_CONSENT),
                Click.on(FirstFormLocators.BUTTON_SAVE)
        );
    }

    public static CompleteFirstForm withData(Map<String, String> formData){
        return new CompleteFirstForm(formData);
    }
}
