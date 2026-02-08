package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.e2etests.automation.page_objects.AccesQuestionnaireAvecInscriptionPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccesQuestionnaireAvecInscriptionStepDefinition {

    private AccesQuestionnaireAvecInscriptionPage accesQuestionnaireAvecInscriptionPage;

    public AccesQuestionnaireAvecInscriptionStepDefinition(){
        this.accesQuestionnaireAvecInscriptionPage = new AccesQuestionnaireAvecInscriptionPage();
    }

@When("je clique sur le bouton participer au sondage")
public void jeCliqueSurLeBoutonParticiperAuSondage() {
    accesQuestionnaireAvecInscriptionPage.clickOnSondageButton();
}
@When("je clique sur le bouton annuler")
public void jeCliqueSurLeBoutonAnnuler() {
    accesQuestionnaireAvecInscriptionPage.clickOnAnnulerButton();
}

@When("je saisi le nom {string}")
public void jeSaisiLeNom(String name) {
    accesQuestionnaireAvecInscriptionPage.fillName(name);
}
@When("je saisi l email {string}")
public void jeSaisiLEmail(String email) {
    accesQuestionnaireAvecInscriptionPage.fillEmail(email);
}
@When("je clique sur le bouton confirmer")
public void jeCliqueSurLeBoutonConfirmer() {
    accesQuestionnaireAvecInscriptionPage.clickOnConfirmButton();
}
@Then("je me redirige vers le questionnaire {string}")
public void jeMeRedirigeVersLeQuestionnaire(String userEmail) {
    assertEquals(userEmail, accesQuestionnaireAvecInscriptionPage.getFirstInputValue());
    accesQuestionnaireAvecInscriptionPage.clickOnReset();
}
}
