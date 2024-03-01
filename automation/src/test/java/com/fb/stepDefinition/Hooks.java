package com.fb.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.fb.Utilities.Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Utilities{
	private static Logger logger = LogManager.getLogger(Utilities.class);
	
	@BeforeClass
    public void deviceDetails() {
		deviceName = System.getProperty("deviceName");
		osVersion = System.getProperty("osVersion");
		platformName = System.getProperty("platform");
	}
	@Before
	public void setUp() throws Exception {
		initiateApp();
		waitFor(2000);
		log("MoEs Application is initiated successfully");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if (platformName.equalsIgnoreCase("BS_ANDROID") | platformName.equalsIgnoreCase("BS_IOS")) {
			bsSessionId = driver.getSessionId().toString();
			scenario.log("To check video recording, open href='https://app-automate.browserstack.com/dashboard/v2/search?query=" + bsSessionId + "' Browserstack session link");
		}
		if (scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		terminateApp();
	}

}
