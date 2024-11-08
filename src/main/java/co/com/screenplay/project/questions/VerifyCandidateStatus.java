package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.VerifyStatusUserLocators.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyCandidateStatus implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("Perez").into(INPUT_CANDIDATE_NAME),
                WaitUntil.the(LISTBOX_OPTION.of("Jose Luis Perez"), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LISTBOX_OPTION.of("Jose Luis Perez")),
                Click.on(BUTTON_SEARCH),
                Scroll.to(STATUS_HIRED)
        );
        return STATUS_HIRED.resolveFor(actor).isVisible();
    }

    public static VerifyCandidateStatus isHired() {
        return new VerifyCandidateStatus();
    }
}

