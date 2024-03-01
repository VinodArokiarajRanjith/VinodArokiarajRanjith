package com.fb.pageObject;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.google.common.collect.ImmutableMap;

import ch.qos.logback.core.boolex.Matcher;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PersonalInfo extends Utilities {



	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/personalinfo")
	@FindBy(id = "fbrpersonalinfo/personalinfo")
	public WebElement header_PersonalInfo;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/first-name")
	@FindBy(id = "fbrpersonalinfo/first-name")
	public WebElement tb_FirstName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Required']")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Required']")
	public List<WebElement> txt_Required;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/last-name")
	@FindBy(id = "fbrpersonalinfo/last-name")
	public WebElement tb_LastName;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/phone")
	@FindBy(id = "fbrpersonalinfo/phone")
	public WebElement tb_PhoneNumber;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/email")
	@FindBy(id = "fbrpersonalinfo/email")
	public WebElement tb_Email;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/password")
	@FindBy(id = "fbrpersonalinfo/password")
	public WebElement tb_Password;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/change-password")
	@FindBy(id = "right-icon-adornment")
	public WebElement btn_ChangePassword;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/birthday")
	@FindBy(name = "fbrpersonalinfo/birthday-label-inactive")
	public WebElement txt_Birthday;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/birthday")
	@FindBy(id = "fbrpersonalinfo/birthday")
	public WebElement value_Birthday;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[1]")
	@FindBy(name = "Face ID / Touch ID")
	public WebElement txt_Faceid;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/toggel")
	@FindBy(id = "TrackBar")
	public WebElement btn_FaceIdToggle;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/save")
	@FindBy(id = "fbrpersonalinfo/save")
	public WebElement btn_Save;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/cancel")
	@FindBy(id = "fbrpersonalinfo/cancel")
	public WebElement btn_Cancel;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/delete")
	@FindBy(id = "fbrpersonalinfo/delete")
	public WebElement btn_DeleteAccount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/back")
	@FindBy(id = "fbrpersonalinfo/back")
	public WebElement btn_Back;	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a first name.']")
	@FindBy(id = "Please enter a first name.")
	public WebElement error_FirsName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a last name.']")
	@FindBy(id = "Please enter a last name.")
	public WebElement error_LastName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a phone number.']")
	@FindBy(id = "Please enter a phone number.")
	public WebElement error_PhoneNumber;

	@AndroidFindBy(xpath = "//com.horcrux.svg.SvgView[@content-desc='warning']")
	@FindBy(xpath = "//XCUIElementTypeImage[@name='Icon-component' and @label='warning']")
	public WebElement icon_Warning;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/saveyourchanges")
	@FindBy(id = "fbrsavemodal/saveyourchanges")
	public WebElement header_SaveToChanges;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/save-and-close")
	@FindBy(id = "fbrsavemodal/save-and-close")
	public WebElement btn_SaveAndClose;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/discard-changes")
	@FindBy(id = "fbrsavemodal/discard-changes")
	public WebElement btn_DiscardChanges;
	
	@AndroidFindBy(xpath = "//com.horcrux.svg.SvgView[@content-desc='cancel icon']")
	@FindBy(xpath = "(//XCUIElementTypeImage[@name='Icon-component'])[2]")
	public WebElement btn_Close;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/saveyourchanges")
	@FindBy(id = "fbrsavemodal/saveyourchanges")
	public WebElement header_ResetPassword;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/description")
	@FindBy(id = "fbrsavemodal/description")
	public WebElement desc_ResetPassword ;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/save-and-close")
	@FindBy(id = "fbrsavemodal/save-and-close")
	public WebElement btn_SendEmail;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/discard-changes")
	@FindBy(id = "fbrsavemodal/discard-changes")
	public WebElement btn_CancelResetPassword;
	

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public PersonalInfo(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void VerifyPersonalInfoHeader() {
		if (header_PersonalInfo.isDisplayed())
			logging(condition.info, "Personal info Header Is Displayed");
		else {
			logging(condition.fail, "Personal info  Header Is not Displayed");
		}
	}

	public void verifyFirstNameColumn() {
		if (tb_FirstName.isDisplayed())
			logging(condition.info, "FirstName Column is displayed");
		else {
			logging(condition.fail, "First name column is not displayed");
		}
	}

	public void verifyLastNameColumn() {
		if (tb_LastName.isDisplayed())

			logging(condition.info, "Last Name is displayed");
		else {
			logging(condition.fail, "Last Name is not displayed");
		}
	}

	public void verifyPhoneNumberColumn() {
		if (tb_PhoneNumber.isDisplayed())

			logging(condition.info, "Phone Number column is displayed");
		else
			logging(condition.fail, "phone Number column is not displayed");
	}

	public void verifyEmailColumn() {
		if (tb_Email.isDisplayed())

			logging(condition.info, "Email column is displayed");
		else
			logging(condition.fail, "Email column is not displayed");
	}

	public void verifyPasswordColumn() {
		if (tb_Password.isDisplayed())

			logging(condition.info, "Password colum is displayed");
		else
			logging(condition.fail, "Password colum is not displayed");
	}

	public void verifyChangePasswordButton() {
		if (btn_ChangePassword.isDisplayed())

			logging(condition.info, "Change Password is displayed");
		else
			logging(condition.fail, "Change Password is not displayed");
	}

	public void verifyBirthdayColumn() {
		System.out.println("checking");
	
		if (txt_Birthday.isDisplayed())
			logging(condition.info, "Birthday column is displayed");
		else {
			logging(condition.fail, "Birthday column is not displayed");
		}
	}

	public void verifyFaceIdText() {
		if (txt_Faceid.isDisplayed())

			logging(condition.info, "FaceId/Touch id text is displayed");
		else {
			logging(condition.fail, "FaceId/Touch id text is not displayed");
		}}

	public void verifyFaceIdToggle() {
		if (btn_FaceIdToggle.isDisplayed())

			logging(condition.info, "FaceId Toggle is displayed");
		else
			{logging(condition.fail, "FaceId Toggle is not displayed");
	}}

	public void verifySaveButton() {
		if (btn_Save.isDisplayed())

			logging(condition.info, "Save Button is displayed");
		else
			{logging(condition.fail, "Save Button is not displayed");
	}}

	public void verifyCancelButton() {
		if (btn_Cancel.isDisplayed())

			logging(condition.info, "Cancel Button is displayed");
		else
			{logging(condition.fail, "Cancel button is not displayed");
	}}

	public void verifyDeleteAccountButton() {
		if (btn_DeleteAccount.isDisplayed())

			logging(condition.info, "Delete account button is displayed");
		else
			{logging(condition.fail, "Delete account button  is not displayed");
	}}

	public void verifyBackButton() {
		if (btn_Back.isDisplayed())

			logging(condition.info, "Back button is displayed");
		else
			{logging(condition.fail, "Back button is not displayed");
	}}

	public void verifyRequiredText() {
		int count = 1;
		for (WebElement text : txt_Required) {
			if (text.isDisplayed())

				logging(condition.info, count + " : Required text is displayed");
			else
				{logging(condition.fail, count + " : Required text is not displayed");
			count++;
		}}
	}

	public void verifyFirstNameError() {
		if (error_FirsName.isDisplayed())
			logging(condition.info, "Enter firstname error is displayed");
		else
		{	logging(condition.fail, "Enter firstname error is not displayed");
	}}

	public void verifyLastNameError() {
		if (error_LastName.isDisplayed())
			logging(condition.info, "Enter last name error is displayed");
		else
			{logging(condition.fail, "Enter last name error is not displayed");

	}}

	public void verifyPhoneNumberError() {
		if (error_PhoneNumber.isDisplayed())
			logging(condition.info, "Enter Phone Number error is displayed");
		else
			{logging(condition.fail, "Enter Phone Number error is not displayed");
	}}
	
	public void verifySaveToChangesHeader() {
		if (header_SaveToChanges.isDisplayed())
			logging(condition.info, "Save To Changes Header is displayed");
		else
			{logging(condition.fail, "Save To Changes Header is not displayed");
	}}
	
	public void verifySaveAndCloseButton() {
		if (btn_SaveAndClose.isDisplayed())
			logging(condition.info, "Save and Close button is displayed");
		else
			{logging(condition.fail, "Save and Close button is not displayed");
	}}
	
	
	public void verifyDiscardChangesButton() {
		if (btn_DiscardChanges.isDisplayed())
			logging(condition.info, "Discard changes button is displayed");
		else
			{logging(condition.fail, "Discard changes button is not displayed");
	}}
	
	
	public void verifyCloseButton() {
		if (btn_Close.isDisplayed())
			logging(condition.info, "Close Button is displayed");
		else
			{logging(condition.fail, "Close Button is not displayed");
	}}
	
	
	public void verifyResetPasswordHeader() {
		if (header_ResetPassword.isDisplayed())
			logging(condition.info, "Reset Password Header is displayed");
		else
			{logging(condition.fail, "Reset Password Header is not displayed");
	}}
	
	
	public void verifyResetPasswordDescription() {
		if (desc_ResetPassword.isDisplayed())
			logging(condition.info, "Reset Password Description is displayed");
		else
			{logging(condition.fail, "Reset Password Description is not displayed");
	}}    
	
	public void verifySendEmailButton() {
		if (btn_SendEmail.isDisplayed())
			logging(condition.info, "Send Email Button is displayed");
		else
			{logging(condition.fail, "Send Email Button is not displayed");
	}}
	
	public void verifyCancelResetPasswordButton() {
		if (btn_CancelResetPassword.isDisplayed())
			logging(condition.info, "Cancel reset password button is displayed");
		else
			{logging(condition.fail, "Cancel reset password button is not displayed");
	}}
	
	public void verifyResetDecorativeIcon() {
		if (icon_Warning.isDisplayed())
			logging(condition.info, "Decorative Icon in reset password is displayed");
		else
			{logging(condition.fail, "Decorative Icon in reset password is not displayed");
	}}


	public void enterValuesToFirstNameField(String Name) {
		try {
			WaitElementToBeClickable(tb_FirstName);
			tb_FirstName.clear();
			tb_FirstName.sendKeys(Name);
			logging(condition.info, "successfully entered the firstname ");
		} catch (Exception e) {
			logging(condition.fail, "failed to enter the firstname ");
		}

	}


	public void enterValuesToLastNameField(String Name) {
		try {
			WaitElementToBeClickable(tb_LastName);
			tb_LastName.clear();
			tb_LastName.sendKeys(Name);
			logging(condition.info, "successfully entered the Lastname ");
		} catch (Exception e) {
			logging(condition.fail, "failed to enter the lastname ");
		}

	}

	public void enterValuesToPhoneColumn(String number) {
		try {
			WaitElementToBeClickable(tb_PhoneNumber);
			tb_PhoneNumber.clear();
			tb_PhoneNumber.sendKeys(number);
			logging(condition.info, "successfully entered the phone number ");
		} catch (Exception e) {
			logging(condition.fail, "failed to enter the phone number ");
		}

	}

	public void validateEmailFormat() {
		try {
			String strProperty = "text";
			if (osName.equalsIgnoreCase("IOS"))

				strProperty = "value";
			String email = tb_Email.getAttribute(strProperty);
			Boolean format = isValidEmail(email);
			if (format) {
				logging(condition.info, "email format is correct ");
			} else {
				logging(condition.fail, "email format is incorrect");
			}
		} catch (Exception e) {
			logging(condition.warning, "email field is blank ");
		}

	}

	public void clickSaveButton() {
		ScrollToText("Save");
		btn_Save.click();
	}


	public void scrollToSaveButton() {
		
		
		ScrollToText("Save");

	}

	public void clickCancelButton() {
		btn_Cancel.click();
	}

	public void clickBackButton() {
		btn_Back.click();
	}

	public void clickChangePasswordButton() {
		btn_ChangePassword.click();
	}

	public void clickDeleteAccountButton() {
		btn_DeleteAccount.click();
	}

	public void clickEnableFaceIDButton() {
		btn_FaceIdToggle.click();
	}

	public void validateFirstnameFieldLimit(String Name) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WaitElementToBeClickable(tb_FirstName);
		tb_FirstName.clear();
		tb_FirstName.sendKeys(Name);
		String typedvalue = tb_FirstName.getAttribute(strProperty);
		int len = typedvalue.length();
		int size = Integer.parseInt(String.valueOf(len));
		if (size <= 36)
			logging(condition.info, "first name field is accepting upto 36 characters");
		else {
			logging(condition.fail, "first name field is accepting more than 36 characters");
		}
	}

	public void validateLastnameFieldLimit(String Name) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WaitElementToBeClickable(tb_LastName);
		tb_LastName.clear();
		tb_LastName.sendKeys(Name);
		String typedvalue = tb_LastName.getAttribute(strProperty);
		int len = typedvalue.length();
		int size = Integer.parseInt(String.valueOf(len));
		if (size <= 36)
			logging(condition.info, "Last name field is accepting upto 36 characters");
		else {
			logging(condition.fail, "Last name field is accepting more than 36 characters");
		}
	}

	public void validatePhoneNumberLimit(String Name) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WaitElementToBeClickable(tb_PhoneNumber);
		tb_PhoneNumber.clear();
		tb_PhoneNumber.sendKeys(Name);
		String typedvalue = tb_PhoneNumber.getAttribute(strProperty);
		int len = typedvalue.length();
		int size = Integer.parseInt(String.valueOf(len));
		if (size <= 14)
			logging(condition.info, "Last name field is accepting upto 10 characters");
		else {
			logging(condition.fail, "Last name field is accepting more than 10 characters");
		}
	}

	public void validateBirthdayValue() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		waitFor(2000);
		String bvalue = value_Birthday.getAttribute(strProperty);
		System.out.println(bvalue);

		int len = bvalue.length();
		System.out.println(len);
		int size = Integer.parseInt(String.valueOf(len));
		if (size >= 1)
			logging(condition.info, "birthday value is displaying as " + bvalue);
		else
			logging(condition.fail, "birthday value is not displaying");

	}

}
