package com.fb.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends Utilities {

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/sign-in")
	@FindBy(id = "fbrsignin/sign-in")
	private WebElement lbl_signIn;

    @AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/email")
    @FindBy(id = "fbrsignin/email")
    private WebElement txt_email;

    @AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/password")
    @FindBy(id = "fbrsignin/password")
    private WebElement txt_password;

    @AndroidFindBy(accessibility = "eye")
    @FindBy(id = "fbrsignin/eye-icon-button")
    private WebElement btn_eye;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/forgot-password")
	@FindBy(id = "fbrsignin/forgot-password")
	private WebElement btn_forgotPassword;

    @AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/sign-in-button")
    @FindBy(id = "fbrsignin/sign-in-button")
    private WebElement btn_signIn;

	@AndroidFindBy(accessibility = "change-order-details")
	@FindBy(id = "fbrchange/change-order-details")
	public WebElement btn_change;

	@AndroidFindBy(accessibility = "sign in")
	@FindBy(id = "fbrwelcome/signin")
	public WebElement btn_welcomeSignIn;

	@AndroidFindBy(accessibility = "fbrwelcomemessage")
	@FindBy(id = "fbrwelcome/createAnAccount")
	public WebElement lbl_welcomeMessage;

	@AndroidFindBy(accessibility = "create an account")
	@FindBy(id = "fbrwelcome/createAnAccount")
	public WebElement btn_welcomeCreateAnAccount;

    @AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsignin/sign-in")
	@FindBy(id = "fbrwelcome/signin")
	private WebElement btn_SignIn;
	@AndroidFindBy(accessibility = "continue as aguest")
	@FindBy(id = "fbrwelcome/continueasaguest")
	public WebElement btn_welComeGuestUser;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsiginfooter/signupbtn")
	@FindBy(name = "fbrsiginfooter/signupbtn")
	private WebElement btn_dontHaveAccount;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsiginfooter/privacy-url")
	@FindBy(name = "fbrsiginfooter/privacy-url")
	private WebElement btn_privacyPolicy;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsiginfooter/terms-url")
	@FindBy(name = "fbrsiginfooter/terms-url")
	private WebElement btn_termsOfService;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/select-location")
	@FindBy(name = "fbrstoresearchheader/select-location")
	public WebElement lbl_selectLocation;
	
	
	@FindBy(xpath = "//button[@id='signin-button']")
	public WebElement siginInButton;
	
	

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public SignInPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void signIn(String userType, String email, String password) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(lbl_welcomeMessage);
		if (lbl_welcomeMessage.isDisplayed() == true)
			logging(condition.info, "The Welcome Message is displayed as expected");
		else
			logging(condition.warning, "The Welcome Message is not displayed");
		
		switch (userType) {
		case "SignedInUser":
            
            if (btn_welcomeSignIn.isDisplayed() == true)
                logging(condition.info, "The SIGN IN button in Welcome page is displayed as expected");
            else
                logging(condition.warning, "The SIGN IN button in Welcome page is not displayed as expected");
            btn_welcomeSignIn.click();
            validateSignInPage();
            EnterInput(txt_email, email);
            EnterInput(txt_password, password);
            btn_eye.click();
            btn_signIn.click();
            waitFor(5000);
            break;
        case "GuestUser":
            WaitVisibilityOfElement(btn_welComeGuestUser);
            if (btn_welComeGuestUser.isDisplayed() == true)
                logging(condition.info, "The Continue as Guest button in Welcome page is displayed as expected");
            else
                logging(condition.warning, "The Continue as Guest button in Welcome page is not displayed as expected");
            btn_welComeGuestUser.click();
            
            WaitVisibilityOfElement(lbl_selectLocation);
            if (lbl_selectLocation.isDisplayed() == true)
                logging(condition.info, "The User logged in as guest user successfully and navigated to SELECT LOCATION page as expected");
            else
                logging(condition.warning, "The User not logged in as guest user successfully and navigated to SELECT LOCATION page");
            break;

		case "createUser":
			WaitVisibilityOfElement(btn_welcomeCreateAnAccount);
			if (btn_welcomeCreateAnAccount.isDisplayed() == true)
				logging(condition.info, "The CREATE AN ACCOUNT button in Welcome page is displayed as expected");
			else
				logging(condition.warning, "The CREATE AN ACCOUNT button in Welcome page is not displayed as expected");
			btn_welcomeCreateAnAccount.click();
			break;
		}

	}
	
	private void validateSignInPage() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(lbl_signIn);
		String act_signIn = lbl_signIn.getAttribute(strProperty);
		if (lbl_signIn.isDisplayed() == true)
			logging(condition.info, "The Header:" + act_signIn + " is displayed as expected");
		else
			logging(condition.warning, "The Header:" + act_signIn + " is not displayed as expected");

		if (txt_email.isDisplayed() == true)
			logging(condition.info, "The Email Text box is displayed as expected");
		else
			logging(condition.warning, "The Email Text box is not displayed as expected");

		if (txt_password.isDisplayed() == true)
			logging(condition.info, "The Password Text box is displayed as expected");
		else
			logging(condition.warning, "The Password Text box is not displayed as expected");

        if (btn_eye.isDisplayed() == true)
            logging(condition.info, "The Password eye button is displayed as expected");
        else
            logging(condition.warning, "The Password eye button is not displayed as expected");
        
        if (btn_forgotPassword.isDisplayed() == true)
            logging(condition.info, "The Forgot Password button is displayed as expected");
        else
            logging(condition.warning, "The Forgot Password is not displayed as expected");
        
        if (btn_signIn.isDisplayed() == true)
            logging(condition.info, "The SIGN IN button is displayed as expected");
        else
            logging(condition.warning, "The SIGN IN is not displayed as expected");
        
        if (btn_dontHaveAccount.isDisplayed() == true)
            logging(condition.info, "The Don't have an account? Sign up button is displayed as expected");
        else
            logging(condition.warning, "The Don't have an account? Sign up button is not displayed as expected");
        
        if (btn_privacyPolicy.isDisplayed() == true)
            logging(condition.info, "The Privacy Policy button is displayed as expected");
        else
            logging(condition.warning, "The Privacy Policy button is not displayed as expected");
        
        if (btn_termsOfService.isDisplayed() == true)
            logging(condition.info, "The Terms of Service button is displayed as expected");
        else
            logging(condition.warning, "The Terms of Service button is not displayed as expected");
    }
    
    public void signIn(String email, String password)
	{
		btn_SignIn.click();
		EnterInput(txt_email, email);
		EnterInput(txt_password, password);
		btn_eye.click();
		btn_signIn.click();
		WaitVisibilityOfElement(btn_change);
		if (btn_change.isDisplayed() == true)
			logging(condition.info, "The User logged in successfully and navigated to Home page as expected");
		else
			logging(condition.warning, "The User is not logged in successfully and not navigated to Home page");
	
	}
    
    public void siginInButtonClick()
    {
    	//siginInButton.click();
    	JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[]0].click()", siginInButton);
    }

    
	

}
