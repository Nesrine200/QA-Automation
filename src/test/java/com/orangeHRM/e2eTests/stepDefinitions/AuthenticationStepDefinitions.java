package com.orangeHRM.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pageObjects.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinitions {
	public WebDriver driver;
	
	private AuthenticationPage authenticationPage = new AuthenticationPage() ;
	private CommonMethods commonMethods = new CommonMethods();
	public  AuthenticationStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver,AuthenticationPage.class);
	}
	
	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws Throwable {
		commonMethods.openURLWithConfigFile("url");
		
	   
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
	   
		authenticationPage.fillUsername(name);
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		authenticationPage.fillPassword(password);
	}

	@When("^Je clique sur le button login$")
	public void jeCliqueSurLeButtonLogin() throws Throwable {
		authenticationPage.clickBtnLogin();
	}

	@Then("^Je me redirige vers le compte admin$")
	public void jeMeRedirigeVersLeCompteAdmin() throws Throwable {
	    
	}



}
