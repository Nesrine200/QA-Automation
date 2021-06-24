package com.orangeHRM.e2eTests.buzz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {
	
	/* Locators */
	final static String MODULE_BUZZ_ID = "menu_buzz_viewBuzz";
	final static String MESSAGE_BUZZ="createPost_content";
	final static String POST_BUTTON_BUZZ="postSubmitBtn";
	final static String BUZZ ="//*[contains(text(),\"I'm Happy\")]";
	
	/* FindBy */
	@FindBy(how = How.ID, using = MODULE_BUZZ_ID)
	public static WebElement moduleBuzz;
	@FindBy(how = How.ID, using = MESSAGE_BUZZ)
	public static WebElement messageBuzz;
	@FindBy(how = How.ID, using = POST_BUTTON_BUZZ)
	public static WebElement postButton;
	@FindBy(how = How.XPATH, using = BUZZ)
	public static WebElement buzzPost;
	
	/* Methods */
	public void clickOnBuzz() {
		moduleBuzz.click();
	}
	public void fillMessage(String message) {
		messageBuzz.sendKeys(message);
	}
	public void clickPostButton() {
		postButton.click();
	}

}
