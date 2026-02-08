package com.e2etests.automation.step_definitions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.AccesQuestionnaireSansInscriptionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccesQuestionnaireSansInscriptionStepDefinition {

    private AccesQuestionnaireSansInscriptionPage accesQuestionnaireSansInscriptionPage;

    public AccesQuestionnaireSansInscriptionStepDefinition(){
        this.accesQuestionnaireSansInscriptionPage = new AccesQuestionnaireSansInscriptionPage();
    }

@Given("je me connecte sur le site bigscreen")
public void jeMeConnecteSurLeSiteBigscreen() {
    accesQuestionnaireSansInscriptionPage.goToUrl();
}
@When("je clique sur le bouton questionnaire")
public void jeCliqueSurLeBoutonQuestionnaire() {
    accesQuestionnaireSansInscriptionPage.clickOnQuestionnaireButton();
}
@Then("un message alert est affiche {string}")
public void unMessageAlertEstAffiche(String message) {
     assertTrue(accesQuestionnaireSansInscriptionPage.getAlertText().contains(message));
}
@When("j accepte le message alert")
public void jAccepteLeMessageAlert() {
    accesQuestionnaireSansInscriptionPage.acceptAlert();
}
@Then("je me redirige vers la page home {string}")
public void jeMeRedirigeVersLaPageHome(String text) {
    assertEquals(text, accesQuestionnaireSansInscriptionPage.getWelcomeText());
}
}
