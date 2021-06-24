package com.orangeHRM.e2eTests.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinitions extends CommonMethods {
	public WebDriver driver;

	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthenticationStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte à l'application OrangeHRM");
		commonMethods.openURLWithConfigFile("url");

	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		logger.info("Je saisie Username");
		authenticationPage.fillUsername(name);
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		logger.info("Je saisie Password");
		authenticationPage.fillPassword(password);
	}

	@When("^Je clique sur le button login$")
	public void jeCliqueSurLeButtonLogin() throws Throwable {
		logger.info("Je clique sur le button login");
		authenticationPage.clickBtnLogin();
	}

	@Then("^Je me redirige vers le compte admin \"([^\"]*)\"$")
	public void jeMeRedirigeVersLeCompteAdmin(String message) throws Throwable {
		logger.info("Je me redirige vers le compte admin");
		String textMessage = AuthenticationPage.adminUser.getText();
		Assert.assertTrue(textMessage.contains(message));

	}

}
