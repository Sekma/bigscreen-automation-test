package com.e2etests.automation.page_objects;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class AccesQuestionnaireAvecInscriptionPage {

	//** @FindBy **//
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Participer au Sondage']")
	public WebElement sondageButton;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Annuler']")
	public WebElement annulerButton;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Confirmer']")
	public WebElement confirmButton;
    @FindBy(how = How.ID, using = "inputName")
	public WebElement inputName;
    @FindBy(how = How.ID, using = "inputEmail")
	public WebElement inputEmail;
    @FindBy(how = How.ID, using = "input1")
	public WebElement firstInput;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Reset']")
	public WebElement resetButton;

    	public AccesQuestionnaireAvecInscriptionPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

    //** Methods scenarion 1 **//
    public void clickOnSondageButton(){
        sondageButton.click();
    }
    public void clickOnAnnulerButton(){
        annulerButton.click();
    }

    //** Methods scenarion 2 **//
    public void fillName(String name){
        inputName.sendKeys(name);
    }
    public void fillEmail (String email){
        inputEmail.sendKeys(email.trim());
    }
    public void clickOnConfirmButton(){
        confirmButton.click();
    }
    public String getFirstInputValue(){

        WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(firstInput));
        return firstInput.getAttribute("value");
    }
public void clickOnReset() {
    WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));

    // Clic direct via JS, ignore overlays et scroll
    ((JavascriptExecutor) Setup.getDriver())
        .executeScript("arguments[0].click();", resetButton);

    // Petite pause pour que l'alerte apparaisse
    try {
        Thread.sleep(3000); // 3s
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Accepter l'alerte immédiatement
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Setup.getDriver().switchTo().alert().accept();
        System.out.println("Reset effectué et alerte acceptée !");
    } catch (TimeoutException e) {
        System.out.println("Alerte non détectée !");
    }
}







}
