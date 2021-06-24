package com.orangeHRM.e2eTests.buzz.stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orangeHRM.e2eTests.buzz.pages.BuzzPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzStepDefinition {
	
	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage();

	public BuzzStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, BuzzPage.class);
	}
	
	@When("^Je clique sur le module buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		buzzPage.clickOnBuzz();
	}

	@When("^Je saisie un message \"([^\"]*)\"$")
	public void jeSaisieUnMessage(String message) throws Throwable {
		buzzPage.fillMessage(message);
	}

	@When("^Je clique sur le button post$")
	public void jeCliqueSurLeButtonPost() throws Throwable {
		buzzPage.clickPostButton();
		Thread.sleep(3000);
	}

	@Then("^Je vérifie le message \"([^\"]*)\"$")
	public void jeVérifieLeMessage(String message) throws Throwable {
		String textMessage = BuzzPage.buzzPost.getText();
		Assert.assertTrue(textMessage.contains(message));
	}

}
