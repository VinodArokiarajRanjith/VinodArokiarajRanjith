package com.fb.web.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

public class CreateAnAccountPage extends Utilities{

	public CreateAnAccountPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}


	//..........Create An Account page locators...........
	@FindBy(id = "img_moesLogo")
	private WebElement MoesLogo;
	@FindBy(xpath = "//button[@data-testid='link_back']//img")
	private WebElement arrow_Back;
	@FindBy(xpath = "//h1[text()='Create An Account']")
	private WebElement heading_createAnAccount;
	@FindBy(xpath = "//input[@data-testid='email']")
	private WebElement emailField;
	@FindBy(xpath = "//button[@data-testid='continue-button']")
	private WebElement btn_continue;
	@FindBy(id = "apple-signin-button")
	private WebElement btn_continueWithApple;
	@FindBy(xpath = "//img[@alt='signInApple']")
	private WebElement logo_continueWithApple;
	@FindBy(id = "facebook-signin-button")
	private WebElement btn_continueWithFacebook;
	@FindBy(xpath ="//img[@alt='signInFaceBook']")
	private WebElement logo_continueWithFacebook;
	@FindBy(xpath = "//a[@data-testid='link_signin']")
	private WebElement link_signIn;
	@FindBy (xpath ="//span[@class='signUpLinkHover']")
	private WebElement link_SignIn;
	@FindBy (xpath ="//img[@alt='rightArrowSm']")
	private WebElement arrow_RightChevron;
	@FindBy(xpath = "//div[@data-testid='txt_reCAPTCHA']")
	private WebElement label_reCaptcha;
	@FindBy(xpath = "//a[@data-testid='link_signin']")
	private WebElement link_alreadyHaveAnAccountSignIn;
	@FindBy (xpath="//a[@data-testid='link_PrivacyPolicy']")
	private WebElement link_PrivacyPolicy;
	@FindBy (xpath="//a[@data-testid='link_TermsofService']")
	private WebElement link_TermsOfService;

	//other page locators........
	@FindBy(xpath = "//div[@data-testid='txt_letsgetstarted']")
	private WebElement label_letsGetStartdPage;
	@FindBy (xpath="(//button[@id='modal-continue-button'])[1]")
	private WebElement btn_AppleContinueNav;
	@FindBy (xpath="(//button[@id='modal-cancel-button'])[1]")
	private WebElement btn_AppleCancel;
	@FindBy (xpath="(//button[@id='modal-continue-button'])[2]")
	private WebElement btn_FacebookContinueNav;
	@FindBy (xpath="(//button[@id='modal-cancel-button'])[2]")
	private WebElement btn_FacebookCancel;
	@FindBy (xpath ="(//h3[contains(text(),'apple.com')])[1]")
	private WebElement confm_Apple;
	@FindBy (xpath="(//h3[contains(text(),'facebook.com')])[2]")
	private WebElement confm_Facebook;





	public void verifyCreateAnAccountPageUI()
	{
		logging(condition.info, "Crate An Accoung page UI validation is started....");
		boolean status_Logo = MoesLogo.isDisplayed();
		if (status_Logo==true) {
			logging(condition.pass, "User is able to view : MoEs logo as expected");
		}
		else
		{
			logging(condition.warning, "User is able to view : MoEs logo as expected");
		}

		boolean status_BackArrow = arrow_Back.isDisplayed();
		if (status_BackArrow==true) {
			logging(condition.pass, "User is able to view : MoEs logo as expected");
		} else {
			logging(condition.warning, "User is unable to view : MoEs logo as expected");
		}

		boolean status_Heading = heading_createAnAccount.isDisplayed();
		if (status_Heading==true) {
			logging(condition.pass, "User is able to view the header as Create An Account as expected");
		} else {
			logging(condition.warning, "User is unable to view the header as Create An Account as expected");
		}

		boolean status_EmailField = emailField.isDisplayed();
		if (status_EmailField==true) {
			logging(condition.pass, "User is able to view Email field as expected");
		} else {
			logging(condition.warning, "User is unable to view Email field as expected");
		}

		boolean status_ContinueCTA = btn_continue.isDisplayed();
		if (status_ContinueCTA==true) {
			logging(condition.pass, "User is able to view Continue CTA as expected");	
		} else {
			logging(condition.warning, "User is unable to view Continue CTA as expected");
		}

		boolean status_ContinueWithAppleCTA = btn_continueWithApple.isDisplayed();
		if (status_ContinueWithAppleCTA==true) {
			logging(condition.pass, "User is able to view Continue with Apple as expected");
		} else {
			logging(condition.warning, "User is unable to view Continue with Apple as expected");
		}

		boolean status_ContinueWithFacebookCTA = btn_continueWithFacebook.isDisplayed();
		if (status_ContinueWithFacebookCTA==true) {
			logging(condition.pass, "User is able to view Continue with Apple as expected");
		} else {
			logging(condition.warning, "User is unable to view Continue with Apple as expected");
		}

		boolean status_AppleLogo = logo_continueWithApple.isDisplayed();
		if (status_AppleLogo==true) {
			logging(condition.pass, "User is able to view Apple Logo as expected");
		} else {
			logging(condition.warning, "User is able to view Apple Logo as expected");
		}

		boolean status_FacebookLogo = logo_continueWithFacebook.isDisplayed();
		if (status_FacebookLogo==true) {
			logging(condition.pass, "User is able to view Apple Logo as expected");
		} else {
			logging(condition.warning, "User is able to view Apple Logo as expected");
		}

		boolean status_AlreadyHaveAnAccount = link_alreadyHaveAnAccountSignIn.isDisplayed();
		if (status_AlreadyHaveAnAccount==true) {
			logging(condition.pass, "User is able to view Already Have An Account link as expected");
		} else {
			logging(condition.pass, "User is able to unable to view Already Have An Account link as expected");
		}

		boolean status_RightChevron = arrow_RightChevron.isDisplayed();
		if (status_RightChevron==true) {
			logging(condition.pass, "User is able to view Right Chevron symbol in AlreadyHaveAnAccount");
		} else {
			logging(condition.warning, "User is able to view Right Chevron symbol in AlreadyHaveAnAccount");
		}

		boolean status_RecaptchaLabel = label_reCaptcha.isDisplayed();
		String value_RecaptchaLabel = label_reCaptcha.getText();
		if (status_RecaptchaLabel==true) {
			logging(condition.pass, "User is able to view : "+ value_RecaptchaLabel);
		} else {
			logging(condition.warning, "User is able to view : "+ value_RecaptchaLabel);
		}

	}

	public void signUpEmail(String email)  {
		WaitVisibilityOfElement(emailField);
		emailField.sendKeys(email);	
		logging(condition.info, "User enters the email id : "+email);
		TapElement(btn_continue);
		logging(condition.info, "User is clicked : Continue CTA Create An Account as expected" );
	}

	public void verifyLetsGetStartedPage() {
		WaitVisibilityOfElement(label_letsGetStartdPage);
		String value_LetsGetStarted = label_letsGetStartdPage.getText();
		if (label_letsGetStartdPage.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to "+value_LetsGetStarted+ " as expected");
		} else {
			logging(condition.fail, "User is not navigated to  "+value_LetsGetStarted+" as expected");
		}	
	}

	public void emailField(String alphabets, String Numbers,String specialcharacters)   {
		emailField.sendKeys(alphabets);
		logging(condition.pass, "User is passed the email field values are:"+alphabets);
		emailField.clear();
		emailField.sendKeys(Numbers);
		logging(condition.pass, "User is passed the email field values are:"+Numbers);
		emailField.clear();
		emailField.sendKeys(specialcharacters);
		logging(condition.pass, "User is passed the email field values are:"+specialcharacters);
		emailField.clear();
	}

	public void emailFieldMax(String maxChar)   {
		emailField.sendKeys(maxChar);
		logging(condition.pass, "User is passed the email field values are:"+maxChar);
		emailField.clear();	
	}

	public void clickOnContinueWithAppleCTA() {
		TapElement(btn_continueWithApple);
		logging(condition.pass, "User is clicked : Continue with Apple CTA as expected");
	}

	public void verifyContinueCancelApple()
	{
		WaitVisibilityOfElement(confm_Apple);
		boolean status_ConfirmApple = confm_Apple.isDisplayed();
		if (status_ConfirmApple==true) {
			logging(condition.pass, "User is able to see Continue / cancel CTAs in Apple confirmation page");
		} else {
			logging(condition.pass, "User is unable able to see Continue / cancel CTAs in Apple confirmation page");
		}
	}

	public void clickOnContinueApple() {
		WaitVisibilityOfElement(btn_AppleContinueNav);
		TapElement(btn_AppleContinueNav);
		logging(condition.pass, "User is clicked : Continue button as expected");
	}

	public void verifyAppleFlow() {
		waitFor(5000);
		String applePageTitle = driver.getTitle();
		logging(condition.pass, "Navigated to :"+applePageTitle +" page as expected");
		driver.navigate().back();
	}

	public void clickOnAppleCancel() {
		waitFor(2000);
		if (btn_AppleCancel.isDisplayed()==true) {
			logging(condition.pass, "User is able to navigate to Apple SignUp workflow");
		} else {
			logging(condition.warning, "User is unable to navigate to Apple SignUp workflow");
		}
		TapElement(btn_AppleCancel);
		logging(condition.pass, "User is clicked : cancel CTA as expected");
	}

	public void clickOnContinueWithFacebookCTA() {
		TapElement(btn_continueWithFacebook);
		logging(condition.pass, "User is clicked : Continue with facebook CTA as expected");
	}

	public void verifyContinueCancelFacebook()
	{
		WaitVisibilityOfElement(confm_Facebook);
		boolean status_ConfirmFacebook = confm_Facebook.isDisplayed();
		if (status_ConfirmFacebook==true) {
			logging(condition.pass, "User is able to see Continue / cancel CTAs in Facebook confirmation page");
		} else {
			logging(condition.pass, "User is unable able to see Continue / cancel CTAs in Facebook confirmation page");
		}
	}

	public void clickOnContinueFacebook() {
		WaitVisibilityOfElement(btn_FacebookContinueNav);
		waitFor(3000);
		TapElement(btn_FacebookContinueNav);
		logging(condition.pass, "User is clicked : Continue button as expected");
	}

	public void verifyFacebookFlow() {
		waitFor(5000);
		String FacebookPageTitle = driver.getTitle();
		logging(condition.pass, "Navigated to :"+FacebookPageTitle +" page as expected");
		driver.navigate().back();
	}

	public void clickOnAlreadyHaveAnAccount() {
		WaitVisibilityOfElement(link_alreadyHaveAnAccountSignIn);
		TapElement(link_alreadyHaveAnAccountSignIn);
	}


}
