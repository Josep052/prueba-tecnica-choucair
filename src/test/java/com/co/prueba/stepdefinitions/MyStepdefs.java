package com.co.prueba.stepdefinitions;

import co.com.screenplay.project.questions.VerifyCandidateStatus;
import co.com.screenplay.project.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static co.com.screenplay.project.utils.Constants.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyStepdefs {

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(PATH_WEB_URL)
        );
    }

    @When("enters their credentials and logs into the system")
    public void entersTheirCredentialsAndLogsIntoTheSystem() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                LoginUser.withCredentials(USERNAME, PASSWORD)
        );
    }

    @And("complete the first form with candidate information")
    public void completeTheFirstFormWithCandidateInformation(DataTable dataTable) {
        List<Map<String, String>> formDataList = dataTable.asMaps(String.class, String.class);
        Actor user = OnStage.theActorInTheSpotlight();
        user.attemptsTo(FillFirstForm.withData(formDataList.get(0)));
    }

    @Then("save the changes for the first form")
    public void saveTheChangesForTheFirstForm() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                SubmitFirstForm.saveChanges()
        );
    }

    @And("complete the second form with interview details")
    public void completeTheSecondFormWithInterviewDetails(DataTable dataTable) {
        List<Map<String, String>> formDataList = dataTable.asMaps(String.class, String.class);
        Actor user = OnStage.theActorInTheSpotlight();
        user.attemptsTo(FillSecondForm.withData(formDataList.get(0)));
    }

    @Then("save the changes for the second form")
    public void saveTheChangesForTheSecondForm() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                SubmitSecondForm.saveChanges()
        );

    }

    @And("navigates to the main page")
    public void navigatesToTheMainPage() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                GoToRecruitmentPage.mainPage()
        );
    }

    @Then("the candidate should have the status hired")
    public void theCandidateShouldHaveTheStatusHired() {
        Actor actor = OnStage.theActorInTheSpotlight();
        boolean isHired = VerifyCandidateStatus.isHired().answeredBy(actor);
        assertThat(isHired).isTrue();
    }
}
