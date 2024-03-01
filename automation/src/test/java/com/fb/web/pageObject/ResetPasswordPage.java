package com.fb.web.pageObject;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

public class ResetPasswordPage extends Utilities {
	private static Logger logger = LogManager.getLogger(HomePage.class);
	@FindBy(id = "img_moesLogo")
	private WebElement MoesLogo;
	@FindBy(xpath = "//button[@id='signin-button']")
	private WebElement SignIn_Btn;
	@FindBy(xpath = "//a[@data-testid=\"link_forgotPassword\"]")
	private WebElement ForgotPwd_Link;
	@FindBy(xpath = "//h1[contains(text(),'RESET PASSWORD')]")
	private WebElement ResetPwd_Header;
	@FindBy(xpath = "//input[@data-testid=\"reset_email\"]")
	private WebElement Email_Input;
	@FindBy(xpath = "//button[@data-testid=\"btn_reset_password\"]")
	private WebElement Reset_Btn;
	@FindBy(id = "link_singin")
	private WebElement SignIn_LinkResetPwdPage;
	@FindBy(id = "link_singin")
	private WebElement KnowPwd_SignIn;
	@FindBy(xpath = "//p[@data-testid=\"link_Didnt_receive_an_email\"]")
	private WebElement ResendPwd_ResetPwdPage;
	@FindBy(xpath ="//div[contains(@class,'message')]")
	private List<WebElement> errMessage;
	@FindBy(xpath = "//button[@data-testid=\"link_back\"]")
	private WebElement Back_Arrow;
	@FindBy(xpath = "(//h1[text()='Sign IN'])[2]")
	private WebElement SigninHeading;
	@FindBy(xpath = "//img[@alt='home']")
	private WebElement homePage;
	@FindBy(xpath ="//a[text()='Know your password? Sign in']")
	private WebElement knowYourPassword;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement privacyPolicyLink;
	@FindBy(xpath="(//a[text()='Terms of Service'])[1]")
	private WebElement privacyPolicyPage;
	@FindBy(xpath="//a[text()='Terms of Service']")
	private WebElement termsOfServicePolicyLink;
	@FindBy(xpath="//h1[text()='Google Terms of Service']")
	private WebElement termsOfServicePolicyPage;
	@FindBy (xpath="//p[@data-testid='txt_Entertheemail']")
	private WebElement content_EnterEmail;
	@FindBy (xpath="//p[@data-testid='txt_Checkyouremail']")
	private WebElement content_checkYourEmail;
	@FindBy (xpath="//div[@data-testid='txt_Something_went_wrong._Please_try_again.']")
	private WebElement error_SomethingWentWrong;
	@FindBy (xpath="//button[text()='RETURN TO SIGN-IN']")
	private WebElement btn_RetrunSignIn;
	@FindBy (xpath="//p[@data-testid='link_Didnt_receive_an_email']")
	private WebElement content_DidntReceiveEmail;

	public ResetPasswordPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}
	public void verifyForgotPwdLink() {
		WaitVisibilityOfElement(ForgotPwd_Link);
		if (ForgotPwd_Link.isDisplayed() == true) {
			logging(condition.info, "Navigated to the Reset Password page as expected");
		} else {
			logging(condition.fail, "Not Navigated to the ForgotPwd_Link page as expected");
		}
		TapElement(ForgotPwd_Link);
		logging(condition.pass, "User is clicked: Forgot Password link as expected");
	}
	
	public void verifyResetPwdBtn() {
		WaitVisibilityOfElement(Reset_Btn);
		if (Reset_Btn.isDisplayed() == true)
		{
			logging(condition.pass, "Navigated to the Reset Password page");
		} else {
			logging(condition.fail, "Not Navigated to the ForgotPwd_Link page");
		}
	}

	public void resetEmailCredentials(String emailField)  {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WaitVisibilityOfElement(Email_Input);
		Email_Input.sendKeys(emailField);				
	}
	public void clickOnBackArrowResetPwdPage() {
		if (Back_Arrow.isDisplayed() == true)
		{
			logging(condition.info, "Navigated to the Sign In page as expected");
		} else {
			logging(condition.fail, "Not Navigated to the Sign In page as expected");
		}
		TapElement(Back_Arrow);
		logging(condition.pass, "User is clicked: Back Arrow as expected");
	}
	
	public void verifyMoesLogo() {
		if (MoesLogo.isDisplayed() == true) {
			logging(condition.info, "Moes Logo is available as expected");
		} else {
			logging(condition.fail, "Moes Logo is unavailable as expected");
		}
		TapElement(MoesLogo);
	}
	
	public void resendEmailLink() {
		if (ResendPwd_ResetPwdPage.isDisplayed() == true) {
			logging(condition.info, "Resend Link is clicked as expected");
		} else {
			logging(condition.fail, "Resend Link not clicked as expected");
		}
		TapElement(ResendPwd_ResetPwdPage);
	}
	
	public String getResetPassWordPageError() {
		String errMsg = "";
		{
			for (WebElement webElement : errMessage) {
				errMsg= errMsg + webElement.getText();
				System.out.println(errMsg+"is selvi");
			}
		}
		return errMsg;
	}
	
	public void verifySignInPageHeading()
	{
		WaitVisibilityOfElement(SigninHeading);
		if (SigninHeading.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Sign In page as expected");
		} else {
			logging(condition.fail, "User is not navigated to Sign In page as expected");
		}
	}

	public void verifyHomePage() {
		WaitVisibilityOfElement(homePage);
		if (homePage.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Home Page as expected");
		} else {
			logging(condition.fail, "User is not navigated to Home Page as expected");
		}
	}
	
	public void knowYourPassword() {
		TapElement(knowYourPassword);
	}
	
	public void signInPageKnowYourPassword()
	{
		WaitVisibilityOfElement(SigninHeading);
		if (SigninHeading.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Sign In page as expected");
		} else {
			logging(condition.fail, "User is not navigated to Sign In page as expected");
		}
	}
	
	public void privacyPolicyLinkClick() {
		TapElement(privacyPolicyLink);
		logging(condition.pass, "User is clicked : Privacy Policy Link as expected");
	}
	
	public void privacyPolicyDocumentPage() {
		handleWindows();
		WaitVisibilityOfElement(privacyPolicyLink);
		if (privacyPolicyLink.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Privacy Terms page successfully");
		} else {
			logging(condition.fail, "User is not navigated to Privacy Terms page");
		}
	}

	public void termsOfServicePolicyLink() {
		TapElement(termsOfServicePolicyLink);
		logging(condition.pass, "User is clicked : Terms of service Link as expected");
	}
	
	public void termsOfServiceDocumentPage() {
		handleWindows();
		WaitVisibilityOfElement(termsOfServicePolicyLink);
		if (termsOfServicePolicyLink.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Terms Of Service page successfully");
		} else {
			logging(condition.fail, "User is not navigated to Terms Of Service");
		}
	}
	
	public void clickonResetPassWordBtn() {
		TapElement(Reset_Btn);	
		logging(condition.pass, "User is clicked : Reset Password CTA as expected");
	}
	
	public String getResetPwdPageError() {
		String errMsg = "";
		{
			for (WebElement webElement : errMessage) {
				errMsg= errMsg + webElement.getText();			
			}
		}
		return errMsg;
	}

	public void clickOnKnowyourPwd() {
		WaitVisibilityOfElement(KnowPwd_SignIn);
		String knowPwd = KnowPwd_SignIn.getText();
		if (KnowPwd_SignIn.isDisplayed()==true) {
			logging(condition.pass, knowPwd+" is displayed as expected");
		} else {
			logging(condition.warning, knowPwd+" is not displayed as expected");
		}
		TapElement(KnowPwd_SignIn);
		logging(condition.pass, "User is clicked: Know your password?Sign in> as expected");
	}
	
	public void checkYourEmail(String checkEmail) {
		WaitVisibilityOfElement(content_checkYourEmail);
		String content1 = content_checkYourEmail.getText();
		logging(condition.info, checkEmail);
		if (content1.equals(checkEmail)) {
			logging(condition.pass,content1+" is displayed as expected" );
		} else {
			logging(condition.warning,content1+" is not displayed as expected" );
		}
	}
	
	public void entertheEmail(String enterEmail) {
		WaitVisibilityOfElement(content_EnterEmail);
		String content2 = content_EnterEmail.getText();
		if (content2.equals(enterEmail)) {
			logging(condition.pass,content2+" is displayed as expected" );
		} else {
			logging(condition.warning,content2+" is not displayed as expected" );
		}

	}
	
	public void verifySomethingwent(String somethingError) {
	WaitVisibilityOfElement(error_SomethingWentWrong);
	logging(condition.info, somethingError);
	String error = error_SomethingWentWrong.getText().trim();
	if (somethingError.equalsIgnoreCase(error)) {
		logging(condition.pass,error+" is displayed as expected" );
	}
	 else {
		logging(condition.warning,error+" is displayed as expected" );
	}
	}
	
	public void resetEmptyEmailCredentials(String emailField) {
		WaitVisibilityOfElement(Email_Input);
		logging(condition.info, "User enters the email field value as :"+ emailField);
		Email_Input.sendKeys(emailField);	
	}
	
	public void resetInvalidEmailCredentials(String emailField) {
		WaitVisibilityOfElement(Email_Input);
		logging(condition.info, "User enters the email field value as :"+ emailField);
		Email_Input.sendKeys(emailField);		
	}
	
	public void resetValidEmailCredentials(String emailField) {
		WaitVisibilityOfElement(Email_Input);
		logging(condition.info, "User enters the email field value as :"+ emailField);
		Email_Input.sendKeys(emailField);	
		
	}
	public void didNtReceiveEmail(String didntreceive) {
		WaitVisibilityOfElement(content_DidntReceiveEmail);
		String content2 = content_DidntReceiveEmail.getText()+">";
		if (content2.contains(didntreceive)) {
			logging(condition.pass,content2+" is displayed as expected" );
		} else {
			logging(condition.warning,content2+" is not displayed as expected" );
		}
	}
	
	public void returnToSignInCTA() {
		WaitVisibilityOfElement(btn_RetrunSignIn);
		String value_RetrunToSignIn = btn_RetrunSignIn.getText();
		boolean status_ReturnToSignIn = btn_RetrunSignIn.isDisplayed();
		if (status_ReturnToSignIn==true) {
			logging(condition.pass,value_RetrunToSignIn+" CTA is displayed as expected" );
		} else {
			logging(condition.warning,value_RetrunToSignIn+" CTA is not displayed as expected" );
		}
		btn_RetrunSignIn.click();
		logging(condition.pass, "User is clicked: Return to sign in as expected");
		
	}
}



