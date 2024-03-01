package com.fb.web.pageObject;


import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.web.commonmethods.Webcommonmethods;

public class SignInPage extends Utilities {

	
	public SignInPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	@FindBy(xpath = "(//h1[text()='Sign IN'])[1]")
	private WebElement heading_SignIn;
	@FindBy(xpath = "//input[@data-testid='email']")
	private WebElement Username;
	@FindBy(xpath = "//*[@data-testid='password']")
	private WebElement Password;
	@FindBy(xpath = "//img[@alt='password-eye-icon']")
	private WebElement Eyeicon;
	@FindBy(xpath = "//*[@data-testid='link_back']")
	private WebElement icon_Back;
	@FindBy(id = "signin-button")
	private WebElement btn_signInWelcomePage;
	@FindBy(xpath = "//*[@data-testid=\"password-error-message\"]")
	private WebElement passworderror;
	@FindBy(xpath = "//*[@data-testid=\"password-error-message\"]")
	private WebElement credentialerror;
	@FindBy(id = "sign-in-button")
	private WebElement btn_SignIn;
	@FindBy(id = "img_guestProfile")
	private WebElement profileIcon;
	@FindBy(xpath ="//div[contains(@class,'message')]")
	private List<WebElement> errMessage;
	@FindBy(className = "toast-content-message")
	private List<WebElement> toastMessage;
	@FindBy(xpath = "//a[@id='link_menu']")
	private WebElement menuLink;
	@FindBy(xpath = "//div[@data-testid='txt_The_email_or_password_entered_is_incorrect']")
	private WebElement emailerror;
	@FindBy(xpath ="//a[text()='Privacy Policy']")
	private WebElement link_PrivacyPolicy;
	@FindBy(id ="sign-in-button")
	private WebElement signInclick;
	@FindBy (xpath="//a[@data-testid='link_signUp']")
	private WebElement link_DontHaveAccount;
	@FindBy (xpath="(//h1[text()='Create An Account' or text()='Sign Up'])[1]")
	private WebElement heading_SignUp;
	@FindBy (xpath="//span[text()='Sign Up']")
	private WebElement link_SignUp;
	@FindBy (xpath="//div[@data-testid='txt_reCAPTCHA']")
	private WebElement label_Recaptcha;


	public String getSigninPageError() {
		String errMsg = "";
		{
			for (WebElement webElement : errMessage) {
				errMsg= errMsg + webElement.getText();
			}
		}
		return errMsg;
	}
	
	public void verifySigninPage()
	{
		WaitVisibilityOfElement(btn_SignIn);
		if (btn_SignIn.isDisplayed() == true)
		{
			logging(condition.info, "User is navigated to Sign In Page successfully");
		}
		else
			logging(condition.fail, "User is not navigated to Sign In Page");
	}

	public void clickEyeicon()
	{
		Eyeicon.click();
	}

	public void clickSignInButtonOnWelcomePage()  {
		TapElement(btn_signInWelcomePage);	
	}

	public void clickSignInButton() {
		WaitVisibilityOfElement(btn_SignIn);
		TapElement(btn_SignIn);
		logging(condition.pass, "User is clicked on Sign in button successfully");
	}

	public void successLoginVerify()
	{
		WaitVisibilityOfElement(menuLink);
		if (menuLink.isDisplayed()==true) {
			logging(condition.pass, "Navigated to Home Page successfully");
		} else {
			logging(condition.fail, "Unable to login home page");
		}
		menuLink.click();
	}

	public void signInUser(String email,String passWord) {
		WaitVisibilityOfElement(Username);
		Username.sendKeys(email);
		Password.sendKeys(passWord);
		signInclick.click();
		
	}

	public void clickOnDontHaveAccount() {
		WaitVisibilityOfElement(link_DontHaveAccount);
		boolean status_DontAccount = link_DontHaveAccount.isDisplayed();
		String value_DontAccount = link_DontHaveAccount.getText();
		if (status_DontAccount==true) {
			logging(condition.pass, value_DontAccount+ "is displayed as expected");
		} else {
			logging(condition.warning, value_DontAccount+ "is not displayed as expected");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link_DontHaveAccount);
		logging(condition.pass, "User is clicked on :"+value_DontAccount);
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

	public void validUNameInvalidPwd(String username,String pwd, String errorMessage) {
		logging(condition.info, "User enters the valid User Name: "+ username);
		logging(condition.info, "User enters the invalid Password: "+ pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Username.sendKeys(username);
		Password.sendKeys(pwd);
		btn_SignIn.click();
		logging(condition.pass, "User is clicked : Sign In button as expected");
		if (errorMessage!=null) {
			String returnMsg = getSigninPageError();
			if (returnMsg.contains(errorMessage)) {
				logging(condition.pass, errorMessage +" is displayed as expected");
			}
			else {
				logging(condition.fail, errorMessage+" is not displayed expected");
			}
		}
	}

	public void emptyUNameAndPwd(String username,String pwd) {
		logging(condition.info, "User enters the empty User Name: "+ username);
		logging(condition.info, "User enters the empty Password: "+ pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Username.sendKeys(username);
		Password.sendKeys(pwd);
		}
		
	

	public void InvalidUNameAndPwd(String invalidUserName, String invalidPassWord) {
		logging(condition.info, "User enters the invalid User Name: "+ invalidUserName);
		logging(condition.info,"User enters the invalid Password: "+ invalidPassWord);
		Username.sendKeys(invalidUserName);
		Password.sendKeys(invalidPassWord);
		}


	public void InvalidUNameAndvalidPwd(String invalidUserName, String validPassWord) {
		logging(condition.info, "User enters the invalid User Name: "+ invalidUserName);
		logging(condition.info,"User enters the valid Password: "+ validPassWord);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Username.sendKeys(invalidUserName);
		Password.sendKeys(validPassWord);
		

	}

	public void temporarilyLockedUNameAndPwd(String validUserName, String validPassWord) {
		logging(condition.info, "User enters the valid User Name: "+ validUserName);
		logging(condition.info,"User enters the valid Password: "+ validPassWord);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Username.sendKeys(validUserName);
		Password.sendKeys(validPassWord);
		
	}

	public void successLogin(String validUserName, String validPassWord) {
		logging(condition.info, "User enters the valid User Name: "+ validUserName);
		logging(condition.info,"User enters the valid Password: "+ validPassWord);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Username.sendKeys(validUserName);
		Password.sendKeys(validPassWord);
		//btn_SignIn.click();
		//logging(condition.pass, "User is clicked : Sign In button as expected");

	}

	public void verifyRecaptchaLabel(String recptcha) {
		WaitVisibilityOfElement(label_Recaptcha);
		boolean status_Recaptcha = label_Recaptcha.isDisplayed();
		String value_Recaptcha = label_Recaptcha.getText();
		
		if (value_Recaptcha.equals(value_Recaptcha)) {
			logging(condition.pass, "User is able to view: "+value_Recaptcha+ "as expected");
		} else {
			logging(condition.warning, "User is able to view: "+value_Recaptcha+ "as expected");
		}
		
	}
}


