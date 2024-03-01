
package com.fb.web.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.LoggingAssert;

import com.fb.Utilities.Utilities;

public class WelcomePage extends Utilities {

	public WelcomePage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	@FindBy (id="img_moesLogo")
	private WebElement logo_MoEs;
	@FindBy (xpath="//p[@data-testid='txt_letsget']")
	private WebElement heading1_WelcomePage;
	@FindBy (xpath="//h1[@data-testid='txt_cookin']")
	private WebElement heading2_WelcomePage;
	@FindBy (xpath="//p[@data-testid='txt_earnpoint']")
	private WebElement paragraph_EarnPoints;
	@FindBy (id="signin-button")
	private WebElement btn_SignIn;
	@FindBy (id="btn_create_account")
	private WebElement btn_CreateAnAccount;
	@FindBy (xpath="//a[@data-testid='txt_guest_account']")
	private WebElement link_GuestUser;
	@FindBy (xpath="//div[@data-testid='txt_reCAPTCHA']")
	private WebElement label_Recaptcha;
	@FindBy (xpath="//a[@data-testid='link_PrivacyPolicy']")
	private WebElement link_PrivacyPolicy;
	@FindBy (xpath="//a[@data-testid='link_TermsofService']")
	private WebElement link_TermsOfService;
	@FindBy (xpath="//button[@data-testid='link_back']")
	private WebElement arrow_Back;

	//Other page locators
	@FindBy (xpath="//a[@data-testid='link_forgotPassword']")
	private WebElement link_ForgotPwd;
	@FindBy (id="img_guestProfile")
	private WebElement img_ProfileHomePage;
	@FindBy (xpath="//h1[text()='Create An Account']")
	private WebElement label_CreateAnAccount;
	@FindBy (xpath="(//h1[text()='Sign IN'])[2]")
	private WebElement label_SignIn;



	public void verifyUIValidationWelcomePage(String header1,String header2,String paragraph,String lblRecaptcha) {
		boolean status_MoEsLogo = logo_MoEs.isDisplayed();
		if (status_MoEsLogo==true) {
			logging(condition.pass, "User is able to view : MoEs logo as expected");	
		} else {
			logging(condition.warning, "User is not able to view : MoEs logo as expected");
		}

		boolean status_Header1 = heading1_WelcomePage.isDisplayed();
		String value_Header1= heading1_WelcomePage.getText().toUpperCase();
		if (value_Header1.equals(header1) && status_Header1==true) {
			logging(condition.pass, "User is able to view the header as: " +value_Header1 +" as expected");	
		} else {
			logging(condition.warning, "User is unable to view the header as: " +value_Header1 +" as expected");
		}

		boolean status_Header2 = heading2_WelcomePage.isDisplayed();
		String value_Header2= heading2_WelcomePage.getText().toUpperCase();
		if (value_Header2.equals(header2) && status_Header2==true) {
			logging(condition.pass, "User is able to view the header as: " +value_Header2 +" as expected");	
		} else {
			logging(condition.warning, "User is unable to view the header as: " +value_Header2 +" as expected");
		}

		boolean status_EarnPoints = paragraph_EarnPoints.isDisplayed();
		String value_EarnPoints = paragraph_EarnPoints.getText().trim();
		if (status_EarnPoints==true && value_EarnPoints.equals(paragraph)) {
			logging(condition.pass, "User is able to view the paragraph as: " +value_EarnPoints +" as expected");
		} else {
			logging(condition.warning, "User is unable to view the paragraph as: " +value_EarnPoints +" as expected");
		}

		boolean status_SignInCTA = btn_SignIn.isDisplayed();
		if (status_SignInCTA==true) {
			logging(condition.pass, "User is able to view the Sign In CTA as expected");
		} else {
			logging(condition.warning, "User is able to view the Sign In CTA as expected");
		}

		boolean status_CreateAnAccountCTA = btn_CreateAnAccount.isDisplayed();
		if (status_CreateAnAccountCTA==true) {
			logging(condition.pass, "User is able to view Create An Account CTA as expected");
		} else {
			logging(condition.warning, "User is unable to view Create An Account CTA as expected");
		}

		boolean status_GuestUser = link_GuestUser.isDisplayed();
		if (status_GuestUser==true) {
			logging(condition.pass, "User is able to view Guest user link as expected");
		} else {
			logging(condition.warning, "User is unable to view Guest user link as expected");
		}

		boolean status_Recaptcha = label_Recaptcha.isDisplayed();
		String value_Recaptcha = label_Recaptcha.getText().trim();
		if (status_Recaptcha==true && value_Recaptcha.equals(lblRecaptcha)) {
			logging(condition.pass, value_Recaptcha+ " is displayed as expected");
		} else {
			logging(condition.warning, value_Recaptcha+ " is not displayed as expected");
		}

	}

	public void clickOnSignInCTA()
	{
		TapElement(btn_SignIn);
		logging(condition.pass, "User is clicked on : Sign In CTA as expected");
	}

	public void clickOnCreateAnAccoungCTA() {
		TapElement(btn_CreateAnAccount);
		logging(condition.pass, "User is clicked on : Create An Account CTA as expected");
	}

	public void clickOnGuestUserLink() {
		TapElement(link_GuestUser);
		logging(condition.pass, "User is clicked on : Continue as Guest link as expected");
	}

	public void clickOnPrivacyPolicyLink() {
		TapElement(link_PrivacyPolicy);
		logging(condition.pass, "User is clicked on : Privacy Policy link as expected");
	}

	public void clickOnTermsOfServiceLink() {
		TapElement(link_TermsOfService);
		logging(condition.pass, "User is clicked on : Terms Of Service link as expected");
	}

	public void verifySignInPage() {
		//WaitVisibilityOfElement(link_ForgotPwd);
		waitFor(2000);
		boolean status_LabelSignIn = label_SignIn.isDisplayed();
		if (status_LabelSignIn==true) {
			logging(condition.pass, "User is navigated to Sign in page as expected");
		} else {
			logging(condition.warning, "User is not navigated to Sign in page as expected");
		}
	}

	public void verifyHomePage()
	{
		boolean status_ProfileImage = img_ProfileHomePage.isDisplayed();
		if (status_ProfileImage==true) {
			logging(condition.pass, "User is navigated to Home Page as expected");
		} else {
			logging(condition.warning, "User is navigated to Home Page as expected");
		}
	}

	public void verifyCreateAnAccount() {
		//WaitVisibilityOfElement(label_CreateAnAccount);
		waitFor(3000);
		boolean status_CreateAnAccount = label_CreateAnAccount.isDisplayed();
		if (status_CreateAnAccount==true) {
			logging(condition.pass, "User is navigated to Create An Account page as expected");
		} else {
			logging(condition.warning, "User is not navigated to Create An Account page as expected");
		}
	}
	
	public void clickOnBackArrow()
	{
		TapElement(arrow_Back);
		logging(condition.pass, "User is clicked on : Back arrow as expected");
	}
	
	public void verifyWelcomePage() {
		WaitVisibilityOfElement(btn_CreateAnAccount);
		boolean status_CreateAnAccountCTA = btn_CreateAnAccount.isDisplayed();
		if (status_CreateAnAccountCTA==true) {
			logging(condition.pass, "User is navigated to welcome page as expected");
		} else {
           logging(condition.warning, "User is not navigated to welcome page as expected");
		}
	}
	
	
	
	



}
