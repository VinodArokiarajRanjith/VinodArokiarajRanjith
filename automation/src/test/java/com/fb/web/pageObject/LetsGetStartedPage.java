package com.fb.web.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;

public class LetsGetStartedPage extends Utilities {
	
	public LetsGetStartedPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}
	
	@FindBy (id="img_moesLogo")
	private WebElement logo_MoEs;
	@FindBy (xpath="//button[@data-testid='link_back']")
	private WebElement arrow_Back;
	@FindBy (xpath="//div[@data-testid='txt_letsgetstarted']")
	private WebElement label_LetsGetStarted;
	@FindBy (xpath="all-required-field-text")
	private WebElement text_AllFieldsRequired;
	@FindBy (xpath="//input[@data-testid='firstname']")
	private WebElement label_FName;
	@FindBy (xpath="lastname")
	private WebElement label_LName;
	

}
