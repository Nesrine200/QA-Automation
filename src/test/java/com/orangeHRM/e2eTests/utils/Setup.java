package com.orangeHRM.e2eTests.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {
	
	public static WebDriver driver;
	static DriverManager driverManager;
	@Before
	/** 
	 * call browse with the design pattern factory navigator
	 */
	public static void setup()
	{
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	@After
	public void embedScreenshot(Scenario scenario)
	{
		if (scenario.isFailed()) {
			try {
				scenario.write("Current page URL is: "+ driver.getCurrentUrl());
				byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenShot, "image/png");
			}catch (WebDriverException somePlatformdontSupportScreenShot ) {
			
				System.err.println(somePlatformdontSupportScreenShot.getMessage());
				
			}
		}
		driver.quit();
	}

}
