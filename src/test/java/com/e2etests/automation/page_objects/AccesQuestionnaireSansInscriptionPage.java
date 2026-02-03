package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AccesQuestionnaireSansInscriptionPage {

	private ConfigFileReader configFileReader; 
	
	/** @FindBy **/
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Questionnaire']")
	public WebElement questionnaireButton;

    @FindBy(how = How.XPATH , using = "//h2[normalize-space()='Bienvenue sur le Sondage de Bigscreen !']")
    public WebElement welcomeText;
	
	public AccesQuestionnaireSansInscriptionPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/** Create methods **/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	public void clickOnQuestionnaireButton() {
		questionnaireButton.click();
	}
    public String getAlertText(){
        return Setup.getDriver().switchTo().alert().getText();
    }
    public void acceptAlert(){
        Setup.getDriver().switchTo().alert().accept();
    }
    public String getWelcomeText(){
        return welcomeText.getText();
    }
}
