package com.fb.web.pageObject;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.web.commonmethods.Webcommonmethods;

public class SignUpPage extends Utilities{

	Webcommonmethods webcommon = new Webcommonmethods(driver);
	HomePage homePage = new HomePage(driver);
	
	public SignUpPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	
	//Create An Account...
	@FindBy(xpath = "//input[@data-testid='email']")
	private WebElement emailField;
	@FindBy(xpath = "//button[@data-testid='continue-button']")
	private WebElement btn_continue;
	
	@FindBy(xpath = "//img[@alt='rightArrowSm']")
	private WebElement icon_alreadyHaveAnAccountSignInChevron;
	@FindBy (xpath ="//h1[text()='Cookin’']")
	private WebElement welcomePage;
	@FindBy(xpath ="(//h1[text()='Sign IN'])[2]")
	private WebElement heading_SignIn;
	@FindBy(xpath = "//a[@href='https://policies.google.com/privacy?hl=en']")
	private WebElement link_privacyPolicy;
	@FindBy(xpath = "(//span[text()='Privacy Policy'])[2]")
	private WebElement confirm_PrivacyPolicyNav;
	@FindBy(xpath = "//a[@href='https://policies.google.com/terms?hl=en']")
	private WebElement link_termsOfService;
	@FindBy (xpath ="(//span[text()='Privacy & Terms'])[1]")
	private WebElement confirm_TermsOfServiceNav;
	//Sign In page locators
	@FindBy(xpath = "(//h1[text()='Sign IN'])[1]")
	private WebElement cnt_signIn;
	@FindBy(xpath ="//img[@id='img_moesLogo']")
	private WebElement logo_MoEsSignInPage;
	@FindBy(xpath ="//h3[@data-testid='txt_modaltitle']")
	private WebElement appleSignInWindow;
	@FindBy(xpath ="//button[@data-testid='modal-cancel-button']")
	private WebElement btn_appleSignInWindowCancel;
	@FindBy(xpath ="//h3[contains(text(),'facebook.com to Sign In')]")
	private WebElement faceBookSignInWindow;
	@FindBy(xpath ="//button[@class='cancelButton']")
	private WebElement btn_faceBookSignInWindowCancel;
	@FindBy(xpath ="//img[contains(@src,'left-arrow')]")
	private WebElement icon_backArrowSignInPage;
	@FindBy(xpath ="//button[@class='signInButton']")
	private WebElement btn_SignIn;
	@FindBy(xpath ="//button[text()='CONTINUE']")
	private WebElement btn_MembershipRewardsContinue;
	@FindBy(xpath ="//div[text()='Log in to Facebook']")
	private WebElement title_FacebookSignIn;
	//.........Lets Get started page locators...........
	@FindBy(xpath = "//div[@data-testid='txt_letsgetstarted']")
	private WebElement cont_letsGetStartdPage;
	@FindBy(xpath = "//a[@data-testid='link_PrivacyPolicy']")
	private WebElement link_TermsOfService;
	@FindBy(xpath = "//button[@data-testid='link_back']")
	private WebElement link_letsGetStarted;
	@FindBy(xpath = "//input[@data-testid='firstname']")
	private WebElement txt_firstName;
	@FindBy(xpath = "//input[@data-testid='lastname']")
	private WebElement txt_lastName;
	@FindBy(xpath = "//input[@data-testid='phone']")
	private WebElement txt_phoneNumber;
	@FindBy(xpath = "//input[@data-testid='password']")
	private WebElement txt_passWord;
	@FindBy(xpath = "//input[@data-testid='img_password_eye_button']")
	private WebElement icon_passWord;
	@FindBy(xpath = "//input[@data-testid='confirmpassword']")
	private WebElement txt_confirmPwd;
	@FindBy(xpath = "//div[@data-testid='img_confirmpassword_eye_button']")
	private WebElement icon_confirmPwd;
	@FindBy(id = "continuebutton")
	private WebElement btn_LetsGetcntinue;
	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	private WebElement btn_LetsGetStarted;
	
	//...........Score Exclusive Perks page locators..........
	@FindBy(xpath = "//h1[@class='section-title section-title-perk']")
	private WebElement heading_ScoreExclusivePerksPage;
	@FindBy(xpath = "//button[@data-testid='link_back']")
	private WebElement backArrowScoreExclusivePerks;
	@FindBy(xpath = "//input[@data-testid='input_calender']")
	private WebElement txt_birthDay;
	@FindBy(xpath = "(//input[@data-testid='txt_referral_code'])[1]")
	private WebElement txt_referralCode;
	@FindBy(xpath = "(//img[@class='fbr-checkbox-icon'])[1]")
	private WebElement checkBox_enableEmailNotifications;
	@FindBy(xpath = "(//img[@class='fbr-checkbox-icon'])[2]")
	private WebElement checkBox_enableSmsNotifications;
	@FindBy(xpath = "(//a[@data-testid='link_terms' ])[1]")
	private WebElement link_termsOfServiceForSignUp;
	@FindBy(xpath = "(//a[@data-testid='link_terms' ])[2]")
	private WebElement link_termsOfServiceReCaptcha;
	@FindBy(xpath = "(//a[@data-testid='link_privacy' ])[1]")
	private WebElement link_privacyPolcyForSignUp;
	@FindBy(xpath = "(//a[@data-testid='link_privacy' ])[2]")
	private WebElement link_privacyPolcyForReCaptcha;
	@FindBy(xpath = "//a[@data-testid='link_doNotShare']")
	private WebElement link_doNotShare;
	@FindBy(xpath = "//a[@data-testid='link_california']")
	private WebElement link_california;
	@FindBy(xpath = "//a[@data-testid='link_financial']")
	private WebElement link_financialIncentiveDisclosure;
	@FindBy(xpath = "//button[@data-testid='btn_completesignup']")
	private WebElement btn_completeSignUp;
	@FindBy(xpath = "//div[text()='Have a Referral code?']")
	private WebElement txt_HaveReferralCode;
	
	//Welcome to MoE's page locators
	@FindBy(xpath = "//h1[contains(text(),'Welcome To')]")
	private WebElement heading_welcomeToMoEs;
	@FindBy(xpath = "//img[@class='rightArrowAlign']")
	private WebElement arrow_rightArrowWelcomeMoEspage;
	@FindBy(xpath = "//button[@id='continue-button']")
	private WebElement btn_welcomeMoEsContinue;
	@FindBy(xpath = "//button[@id='skip-button']")
	private WebElement btn_welcomeMoEsSkip;
	@FindBy(xpath = "//h1[@data-testid='txt_membership']")
	private WebElement txt_MembershipHeading;
	@FindBy(xpath = "//img[@class='rightArrowAlign']")
	private WebElement arrow_rightArrowMembershipPage;
	@FindBy(xpath = "//button[@id='continue-button']")
	private WebElement btn_membershipPageContinue;
	@FindBy(xpath = "//button[@id='continue-button']")
	private WebElement btn_membershipPageSkip;
	@FindBy(xpath = "//h1[@data-testid='txt_mobilemade']")
	private WebElement txt_mobileOrderHeading;
	@FindBy(xpath = "//button[@id='letsgetstarted-button']")
	private WebElement btn_mobileOrderingContinue;
	@FindBy(xpath = "//button[@id='letsgetstarted-button']")
	private WebElement btn_mobileOrderingLetsGetStarted;
	@FindBy(xpath = "//button[@id='BTN_STARTORDER']")
	private WebElement btn_startOrder;
	@FindBy(xpath="//button[@id='continue-button']")
	private WebElement Btn_Continue;
   @FindBy(xpath="//button[@data-testid='link_back']//img")
   private WebElement arrow_Back;
   @FindBy(xpath="//img[@alt='rightArrow']")
   private WebElement arrow_Right;
   @FindBy (xpath="//button[text()='SKIP']")
   private WebElement btn_Skip;
   @FindBy (xpath="(//h3[@data-testid='txt_modaltitle'])[1]")
   private WebElement confirmation_ApplePage;


	public void letsGetStartedPage(String fName, String lName, String phNo,String pwd,String cnfmPwd)  {
		WaitVisibilityOfElement(txt_firstName);
		txt_firstName.sendKeys(fName);
		txt_lastName.sendKeys(lName);
		txt_phoneNumber.sendKeys(phNo);
		txt_passWord.sendKeys(pwd);
		txt_confirmPwd.sendKeys(cnfmPwd);
		logging(condition.info, "User pass the First Name as : "+fName);
		logging(condition.info, "User pass the Last Name as : "+lName);
		logging(condition.info, "User pass the Phone Number as : "+phNo);
		logging(condition.info, "User pass the Password as : "+pwd);
		logging(condition.info, "User pass the Confirm Password : "+cnfmPwd);
		TapElement(btn_LetsGetcntinue);
		logging(condition.info, "User is clicked : Continue CTA on Lets Get Started page as expected" );
	}

	public void verifyScoreExclusivePerkPage() {
		WaitVisibilityOfElement(heading_ScoreExclusivePerksPage);
		if (heading_ScoreExclusivePerksPage.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to: Score ExclusivePerks Page as expected");
		} else {
			logging(condition.warning, "User is navigated to: Score ExclusivePerks Page as expected");
		}
	}

	public void clickOnCompleteSignUpButton() {
		TapElement(btn_completeSignUp);
	}

	public void scoreExclusivePage(String birthday, String refCode)   {
		WaitVisibilityOfElement(txt_birthDay);
		txt_birthDay.sendKeys(birthday);
		TapElement(txt_HaveReferralCode);
		WaitVisibilityOfElement(txt_referralCode);
		txt_referralCode.sendKeys(refCode);
		logging(condition.info, "User pass the birthday : "+birthday);
		logging(condition.info, "User pass the referral code : "+refCode);
		TapElement(checkBox_enableSmsNotifications);
		logging(condition.info, "User clicked on Enable SMS Notifications check box ");
		TapElement(btn_completeSignUp);
		logging(condition.info, "User is clicked on Complete Sign UP CTA as expected");
	}

	public void verifyWelcomeToMoEsPage() {
		WaitVisibilityOfElement(heading_welcomeToMoEs);
		if (heading_welcomeToMoEs.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Welcome To MoEs Page");
		} else {
			logging(condition.fail, "User is not able to navigate to Welcome To MoEs Page");
		}
	}
	


	public void clickOnWelcomeMoEsContinueBtn() {
		TapElement(btn_welcomeMoEsContinue);
	}

	public void verifyMembershipRewardsPage() {
		WaitVisibilityOfElement(txt_MembershipHeading);
		if (txt_MembershipHeading.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Membership rewards Page successfully");
		} else {
			logging(condition.fail, "User is not navigated to Membership rewards page ");
		}
	}

	public void clickOnMembershipRewardsContinue() {
		TapElement(btn_MembershipRewardsContinue);
	}

	public void verifyMobileOrderingPage() {
		WaitVisibilityOfElement(btn_LetsGetStarted);
		if (btn_LetsGetStarted.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Mobile Ordering Page successfully");
		} else {
			logging(condition.fail, "User is not navigated to Mobile Ordering page ");
		}
	}
	
	public void clickOnLetsGetStartedButton() {
		TapElement(btn_LetsGetStarted);
	}
	
	public void clickOnLetsGetStartedBtn() {
		TapElement(btn_mobileOrderingContinue);
	}
	
	public void clickOnSkipBtn()
	{
		TapElement(btn_Skip);
	}

	public void clickLefttArrow() {
	TapElement(arrow_Back);
	logging(condition.info, "User clicked : Back Arrow as expected");
	}
	
	public void verifyAppleConfirmation() {
		WaitVisibilityOfElement(confirmation_ApplePage);
		if (confirmation_ApplePage.isDisplayed()) {
			logging(condition.pass, "Navigated to Apple Confirmation page");
		} else {
          logging(condition.warning, "Not navigated to Apple confirmation page");
		}
	}

	public void backButtonCreateAnAccountPage() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
             js.executeScript("arguments[0].click();", arrow_Back);   
		}

	public void ValidEmail(String email) {
		WaitVisibilityOfElement(emailField);
		emailField.sendKeys(email);	
		logging(condition.info, "User enters the email id : "+email);
		TapElement(btn_continue);
		logging(condition.info, "User is clicked : Continue CTA Create An Account as expected" );
		
	}


}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	
	










