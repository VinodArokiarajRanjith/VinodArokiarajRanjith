package com.fb.web.commonmethods;



import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.pageObject.FBsCommonMethods.geoLocationType;
import com.fb.web.pageObject.HomePage;
import com.fb.web.pageObject.ResetPasswordPage;
import com.fb.web.pageObject.SignInPage;
import com.fb.web.pageObject.SignUpPage;

import io.appium.java_client.android.nativekey.KeyEvent;

public class Webcommonmethods extends Utilities {

	@FindBy(xpath = "(//h1[text()='Sign IN'])[1]")
	private WebElement SigninHeading;
	@FindBy(xpath = "//input[@data-testid='email']")
	private WebElement Username;
	@FindBy(xpath = "//*[@data-testid='password']")
	private WebElement Password;
	@FindBy(xpath = "(//*[@class=\"externalLink\"])[5]")
	private WebElement Eyeicon;
	@FindBy(xpath = "//button[@id='signin-button']")
	private WebElement btn_signIn;
	@FindBy(xpath = "//*[@data-testid=\"link_guestProfile\"]")
	private WebElement Backicon;
	@FindBy(xpath = "//*[@data-testid=\"password-error-message\"]")
	private WebElement passworderror;
	@FindBy(xpath = "//*[@data-testid=\"password-error-message\"]")
	private WebElement credentialerror;
	//invalidtoastmessage
	@FindBy(xpath = "//img[@class=\"close-icon\"]")
	private WebElement closeIcon;
	@FindBy(xpath = "//div[@class=\"toast-content-message\"]")
	private WebElement invalidtoastmessage;
	@FindBy(xpath = "//span[contains(text(),\"forgot password?\")]")
	private WebElement forgotPasswordLink;
	@FindBy(xpath = "//img[@class=\"check-mark\"]")
	private WebElement toastInfoIcon;
	@FindBy(xpath = "//button[@data-testid='sign-in-button']")
	private WebElement btn_loginSignInPage;
	@FindBy(xpath = "//div[@data-testid='txt_The_email_or_password_entered_is_incorrect']")
	private WebElement emailerror;
	@FindBy(xpath = "//input[@data-testid='email']")
	private WebElement emailField;
	@FindBy(xpath = "//button[@data-testid='continue-button']")
	private WebElement btn_continue;
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
	@FindBy(xpath = "//button[@id='continuebutton']")
	private WebElement btn_LetsGetcntinue;
	@FindBy(xpath = "//input[@data-testid='input_calender']")
	private WebElement txt_birthDay;
	@FindBy(xpath = "(//input[@data-testid='txt_referral_code'])[1]")
	private WebElement txt_referralCode;
	@FindBy(xpath = "(//img[@class='fbr-checkbox-icon'])[2]")
	private WebElement checkBox_enableSmsNotifications;
	@FindBy(xpath = "//button[@data-testid='btn_completesignup']")
	private WebElement btn_completeSignUp;
	@FindBy(xpath = "//div[text()='Have a Referral code?']")
	private WebElement txt_HaveReferralCode;
	@FindBy(xpath = "//a[@id='link_guestProfile']")
	private WebElement icon_Profile;
	@FindBy (xpath ="//div[@class='galleryTextContainer']//h2")
	private List<WebElement> suggesstedSellNames;


	@FindBy(xpath = "//button[@id='facebook-signin-button']")
	private WebElement btn_continueWithFacebook;
	@FindBy(xpath ="//button[@class='cancelButton']")
	private WebElement btn_faceBookSignInWindowCancel;
	@FindBy(xpath = "//h1[text()='Create An Account']")
	private WebElement heading_createAnAccount;
	@FindBy(xpath ="(//h3[contains(text(),'facebook.com to Sign In')]//parent::div//following::button)[1]")
	private WebElement btn_faceBookSignInWindowContinue;
	@FindBy(xpath ="//div[text()='Log in to Facebook']")
	private WebElement title_FacebookSignIn;
	@FindBy(xpath = "//input[@data-testid=\"reset_email\"]")
	private WebElement Email_Input;
	@FindBy(xpath ="//div[contains(@class,'message')]")
	private List<WebElement> errMessage;
	@FindBy(xpath = "//button[@data-testid=\"btn_reset_password\"]")
	private WebElement Reset_Btn;
	@FindBy (xpath="//p[@data-testid='txt_Checkyouremail']")
	private WebElement resetPwdComment;
	@FindBy(xpath = "//a[@href='https://policies.google.com/privacy?hl=en']")
	private WebElement link_privacyPolicy;
	@FindBy(xpath = "//div[@data-testid='txt_reCAPTCHA']")
	private WebElement label_reCaptcha;
	@FindBy(xpath = "//a[@href='https://policies.google.com/terms?hl=en']")
	private WebElement link_termsOfService;
	@FindBy (id ="reward-sign-up")
	private WebElement btn_RewardSignUp;
	@FindBy (xpath ="//div[@class='gallery']//div[@class='gallerySliderBox']")
	private List<WebElement> suggesstdCellsCount;
	@FindBy(xpath="//input[@id='store-search-input']")
	private WebElement inputField_StoreSearch;
	@FindBy(id="btn_clearsearchtext")
	private WebElement btn_clearText;
	@FindBy(id="button_tab_nearby")
	private WebElement lbl_nearBy;
	@FindBy(id="//img[@alt='get_direction']")
	private WebElement btn_getDirections;
	@FindBy(id="//div[@class='storeLocationNameAndCloseButtonContainer']//div[contains(@class,'storeLocationName')]\")")
	private List<WebElement> list_RestaurantNames;
	@FindBy(id = "BTN_STARTORDER")
	private WebElement btn_StoreSearch;
	@FindBy (id="btn_enableLocation")
	private WebElement btn_EnableLocationServices;
	@FindBy (xpath="//div[@class='restaurantInfoHeadingDesk']//span[@data-testid='txt_storeinfo']")
	private WebElement lbl_RestaurantInfo;
	

	SignInPage signin= new SignInPage(driver);
	ResetPasswordPage resetPwd = new ResetPasswordPage(driver);


	public Webcommonmethods(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}


	public void signIn(String username, String password, String errorMessage)  {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WaitVisibilityOfElement(Username);
		Username.sendKeys(username);		
		Password.sendKeys(password);



		btn_loginSignInPage.click();
		//waitFor(5000);


		if(errorMessage!=null) {
			String returnMsg = signin.getSigninPageError();
			if(returnMsg.contains(errorMessage)) {
				logging(condition.pass, errorMessage+" is displayed successfully");
			}
			else
			{
				logging(condition.fail, errorMessage+" is not displayed");
			}
		}


	}

	public void signInCredentials(String username, String password)  {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WaitVisibilityOfElement(Username);
		Username.sendKeys(username);		
		Password.sendKeys(password);
	}



	public void readErrorMessage(String errorMessage) {

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		if (errorMessage!=null) {
			String returnMsg = signin.getSigninPageError();
			if (returnMsg.contains(errorMessage)) {
				logging(condition.pass, errorMessage +" is displayed as expected");

			}

			else {
				logging(condition.warning, errorMessage+"  is not displayed as expected");
			}
		}



	}



	public void signUp(String email)  {
		WaitVisibilityOfElement(emailField);
		emailField.sendKeys(email);
		btn_continue.click();


	}

	public void letsGetStartedPage(String fName, String lName, String phNo,String pwd,String cnfmPwd)  {
		WaitVisibilityOfElement(txt_firstName);
		txt_firstName.sendKeys(fName);
		txt_lastName.sendKeys(lName);
		txt_phoneNumber.sendKeys(phNo);
		txt_passWord.sendKeys(pwd);
		txt_confirmPwd.sendKeys(cnfmPwd);
		btn_LetsGetcntinue.click();


	}

	public void scoreExclusivePage(String birthday, String refCode)   {
		WaitVisibilityOfElement(txt_birthDay);


		txt_birthDay.sendKeys(birthday);
		txt_HaveReferralCode.click();

		WaitVisibilityOfElement(txt_referralCode);
		txt_referralCode.sendKeys(refCode);
		checkBox_enableSmsNotifications.click();
		btn_completeSignUp.click();

	}

	public void emailField(String alphabets, String Numbers,String specialcharacters)   {

		emailField.sendKeys(alphabets);
		emailField.clear();
		emailField.sendKeys(Numbers);
		emailField.clear();
		emailField.sendKeys(specialcharacters);
		emailField.clear();

	}

	public void faceBookCancelButton() {

		WaitVisibilityOfElement(btn_continueWithFacebook);

		btn_continueWithFacebook.click();


		//handleWindows(btn_faceBookSignInWindowCancel);

		WaitVisibilityOfElement(btn_faceBookSignInWindowCancel);

		btn_faceBookSignInWindowCancel.click();

		if (heading_createAnAccount.isDisplayed()==true) {

			logging(condition.pass,"User is navigated to Create An Account Page");

		} else {

			logging(condition.fail,"User is not navigated to Create An Account Page");

		}



	}

	public void faceBookContinueButton() {

		WaitVisibilityOfElement(btn_continueWithFacebook);

		btn_continueWithFacebook.click();

		WaitVisibilityOfElement(btn_faceBookSignInWindowContinue);

		btn_faceBookSignInWindowContinue.click();



		WaitVisibilityOfElement(title_FacebookSignIn);

		if (title_FacebookSignIn.isDisplayed()==true ){

			logging(condition.pass,"User navigated to facebook sign in page successfully");

		} else {

			logging(condition.fail,"User is not navigated to facebook sign in page");
		}

		driver.navigate().back();

	}

	public void resetPassWord(String email,String errorMessage)  {
		WaitVisibilityOfElement(Email_Input);
		Email_Input.sendKeys(email);		
		Reset_Btn.click();
		waitFor(8000);


		if(errorMessage!=null) {
			String returnMsg = resetPwd.getResetPassWordPageError();
			if(returnMsg.contains(errorMessage)) {
				logging(condition.pass, errorMessage+" is displayed successfully");
			}
			else
			{
				logging(condition.fail, errorMessage+" is not displayed");
			}
		}

	}

	public void verifySigninHeading() 
	{

		if (SigninHeading.isDisplayed() == true)
		{
			logging(condition.info, "SignIn Heading is displayed in the page");
		}
		else {
			logging(condition.fail, "SignIn Heading is not displayed in the page");
		}
	}

	public void verifyResetPwdComment(String comment) {
		WaitVisibilityOfElement(resetPwdComment);
		resetPwdComment.sendKeys(comment);
	}


	private static boolean isTextBold(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String fontWeight = (String) jsExecutor.executeScript(
				"return window.getComputedStyle(arguments[0]).getPropertyValue('font-weight');", element);
		return "bold".equals(fontWeight) || Integer.parseInt(fontWeight) >= 700;
	}

	public void verifyPrivacyPolicyBoldLetters() {


		if (isTextBold(driver, link_privacyPolicy)) {
			logging(condition.pass, link_privacyPolicy.getText()+"is displayed in bold letters");
		}

		else {
			logging(condition.fail, link_privacyPolicy.getText()+"is not displayed in bold letters");
		}

	}

	public void verifyTermsOfServiceBoldLetters() {


		if (isTextBold(driver, link_termsOfService)) {
			logging(condition.pass, link_termsOfService.getText()+"is displayed in bold letters");
		}

		else {
			logging(condition.fail, link_termsOfService.getText()+"is not displayed in bold letters");
		}

	}

	public static boolean scrollDownToElement(WebDriver driver, WebElement elementref) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		boolean elementFound = false;
		int maxScrollAttempts = 10; 

		for (int i = 0; i < maxScrollAttempts; i++) {
			WebElement targetElement = elementref;
			if (targetElement.isDisplayed()) {
				elementFound = true;
				break; // Exit the loop if the element is visible
			}
			jsExecutor.executeScript("window.scrollBy(0, 300);");
		}

		if (!elementFound) {
			System.out.println("Element not found after scrolling.");
		}
		return elementFound;
	}
	
	
	public static boolean scrollDownToElements(WebDriver driver, List<WebElement> txt_restuarantName) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		boolean elementFound = false;
		int maxScrollAttempts = 10; 

		for (int i = 0; i < maxScrollAttempts; i++) {
			List<WebElement> targetElement = txt_restuarantName;
			if (((WebElement) targetElement).isDisplayed()) {
				elementFound = true;
				break; // Exit the loop if the element is visible
			}
			jsExecutor.executeScript("window.scrollBy(0, 300);");
		}

		if (!elementFound) {
			System.out.println("Element not found after scrolling.");
		}
		return elementFound;
	}

	

	public void clickElementWithJavascriptExecutor(WebElement elementRef) {
		WaitVisibilityOfElement(elementRef);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", elementRef);



	}


	

	public static boolean scrollUpToElement(WebDriver driver, WebElement elementref) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		boolean elementFound = false;
		int maxScrollAttempts = 10; 

		for (int i = 0; i < maxScrollAttempts; i++) {
			WebElement targetElement = elementref;
			if (targetElement.isDisplayed()) {
				elementFound = true;
				break; // Exit the loop if the element is visible
			}
			jsExecutor.executeScript("window.scrollBy(0, -300);");
		}

		if (!elementFound) {
			System.out.println("Element not found after scrolling.");
		}
		return elementFound;
	}

	
	
	
	public void verifyHomePageURL(String Url) {
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.equals(Url)) {
			
		logging(condition.pass, "User is navigated to Home Page");
			
		} else {
			logging(condition.fail, "User is not navigated to Home Page");
		}
	}
	
	
	public static void verifyDefaultTab(WebElement elementref) {
		
		boolean selected = elementref.isSelected();
		
		if (selected) {
			
			logging(condition.pass, elementref.getText()+" is selected as default");
			
		} else {
			logging(condition.fail, elementref.getText()+" is not selected as default");

		}
		
	}
	
	public void searchAndSelectLocation(String location) {
		
		waitFor(3000);
		inputField_StoreSearch.click();
		EnterInput(inputField_StoreSearch, location);
		boolean vlu_Clear = btn_clearText.isDisplayed();
		if (vlu_Clear == true) {
			logging(condition.info,"Clear button is enabled in search bar");
		}
		
			autoSuggessitionClick(location);
			waitFor(3000);
			lbl_nearBy.isDisplayed();
			logging(condition.info,"User navigated to restaurant search list page as expected");
		
	}
	
	

	
	public void autoSuggessitionClick(String location) {
//		String strProperty = "text";
//		if (osName.equalsIgnoreCase("IOS"))
//			strProperty = "value";
		waitFor(3000);
		List<WebElement> autoSuggesitionList = driver.findElements(By.xpath("//button[@data-testid='btn_locationId']"));
		for (int i = 0; i < autoSuggesitionList.size(); i++) {
			String txt_suggesitionList = autoSuggesitionList.get(i).getText();
			if (txt_suggesitionList.contains(location)) {
				logging(condition.info,"The LOCATION: " + txt_suggesitionList + " is selected as expected");
				waitFor(1000);
				//driver.navigate().back();
				waitFor(1000);
				ActionClick(autoSuggesitionList.get(i));
				break;
			}
		}
	}
	
	
	public void selectRestaurantName(String restaurant) {
		List<WebElement> txt_restuarantNames = driver.findElements(By.xpath("//div[@class='storeLocationNameAndCloseButtonContainer']//button[@class='storeLocationName cursor-pointer button-wrapper']"));
		for (int i = 0; i < txt_restuarantNames.size(); i++) {
			String txt_restaurantNames = txt_restuarantNames.get(i).getText();
			if (txt_restaurantNames.equalsIgnoreCase(restaurant)) {
				logging(condition.info,"The Restaurant: " + restaurant + " is displayed and SELECT LOCATION button is selected");
				//scrollDownToElements(driver, txt_restuarantName);
				txt_restuarantNames.get(i).click();
				waitFor(3000);
				//WaitVisibilityOfElement(btn_getDirections);
				boolean vlu_backOverLay = lbl_RestaurantInfo.isDisplayed();
				logging(condition.info,"User Navigated to the Restaurant Info as expected");
				assertTrue("User Navigated to the Restaurant Info as expected", vlu_backOverLay);
				break;
			}
		}
	}
	
	public String getSigninPageError() {
		String errMsg = "";
		{
			for (WebElement webElement : errMessage) {
				errMsg= errMsg + webElement.getText();
			}
		}
		return errMsg;
	}
	
	
	
		
	}




















