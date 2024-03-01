package com.fb.pageObject;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fb.Utilities.Utilities;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLocationPage extends Utilities {

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public SelectLocationPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	public void verifyFavoritedRestsurant() {

	}
	
}
