package com.fb.pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountOrderHistoryPage extends Utilities {
	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);

	
	@FindBy(id = "back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_backIcon;
	
	@FindBy(id = "back")
	@AndroidFindBy(xpath = "//*[@text='HISTORY']")
	private WebElement lbl_historyHeader;
	
	@FindBy(id = "back")
	@AndroidFindBy(xpath = "//*[@text='ORDER NOW']")
	private WebElement btn_orderNow;
	
	@FindBy(id = "back")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrshowmore/showmoreButton")
	private WebElement lbl_showMore;
	
	@FindBy(id = "back")
	@AndroidFindBy(accessibility = "down arrow-icon")
	private WebElement btn_showMoreDownArrow;
	
	@FindBy(id = "back")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrshowmore/showmoreButton")
	private WebElement lbl_showLess;
	
	@FindBy(id = "back")
	@AndroidFindBy(accessibility = "down arrow-icon")
	private WebElement btn_showLessUpArrow;
	
	@FindBy(id = "back")
	@AndroidFindBy(accessibility = "2 Items, $38.99,11/25/2023,Moe's Sandbox 1,,Pickup")
	private WebElement btn_previousOrderHistory;
	
	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public AccountOrderHistoryPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void verifyHistoryHeader() {
		String strProperty = "text";
		if(osName.equalsIgnoreCase("IOS"))
			strProperty="value";
		if(lbl_historyHeader.isDisplayed())
			logging(condition.info,"Header:" +lbl_historyHeader.getAttribute(strProperty) + "is displayed as expected");
		else
			logging(condition.fail,"Header:" +lbl_historyHeader.getAttribute(strProperty) + " is not displayed as expected");
	}

	public void verifyOrderNow() {
		if(btn_orderNow.isDisplayed())
			logging(condition.info,"Order Now Button is displayed as expected");
		else
			logging(condition.fail,"Order Now Button is not displayed as expected");
	}
	
	public void clickPreviousOrderHistory() {
		WaitVisibilityOfElement(btn_previousOrderHistory);
		btn_previousOrderHistory.click();
	}
	
}
