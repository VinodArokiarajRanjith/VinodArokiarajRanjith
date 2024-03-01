package com.fb.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.PersonalInfo;
import com.fb.pageObject.RestaurantInfoPage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * author: sagar
 */
public class PersonalInformationStepDefination extends Utilities {

	private static Logger logger = LogManager.getLogger(PickupStoreSearchStepDefinition.class);
	FBsCommonMethods cm = new FBsCommonMethods(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
	PersonalInfo pi = new PersonalInfo(driver);
	SignInPage si = new SignInPage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	@When("user is on Sign In Page and able to enter  authentication details from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_authentication_details_from_and(String SheetName,
			int RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String username = testData.get(RowNumber).get("username");
		String password = testData.get(RowNumber).get("password");
		String usertype = testData.get(RowNumber).get("UserType");
		si.signIn(username, password);
	}

	@When("user should see and verify the homepage")
	public void user_should_see_and_verify_the_homepage() {
		hs.validateHomePage();
	}

	@When("user should verify order type as pickup through order info")
	public void user_should_verify_order_type_as_pickup_through_order_info() {
		hs.btn_change.click();
		oi.switchToPickup();

	}

	@When("user closes order info and navigates back to home page")
	public void user_closes_order_info_and_navigates_back_to_home_page() {
		oi.clicksConfirmButton();

	}

	@Then("user should see and able to click the hamburger menu from home page2")
	public void user_should_see_and_able_to_click_the_hamburger_menu_from_home_page2() {

		hs.ClickOnHamburgButton();

	}

	@Then("verify close icon and able to navigate back on hamburg page")
	public void verify_close_icon_and_able_to_navigate_back_on_hamburg_page() {
		hs.btn_CloseButton.click();
		hs.ClickOnHamburgButton();

	}

	@When("user should able to see and tap on your account button")
	public void user_should_able_to_see_and_tap_on_your_account_button() {
		if (hs.btn_YourAccount.isDisplayed()) {
			logging(condition.info, "Your account button is getting displayed");
			hs.btn_YourAccount.click();
		}

	}

	@When("verify Account Header is displayed and back navigation")
	public void verify_account_header_is_displayed_and_back_navigation() {

		hs.verifyAccountHeaderandBackButton();

	}

	@When("user should able to tap on personal info CTA")
	public void user_should_able_to_tap_on_personal_info_cta() {
		hs.btn_PersonalInfo.click();
	}

	@When("verify Personal info Header is displayed")
	public void verify_personal_info_header_is_displayed() {
		pi.VerifyPersonalInfoHeader();
	}

	@Then("user should enter values from  {string} and {int}  to first name field and verify the first Name column limit")
	public void user_should_enter_values_from_and_to_first_name_field_and_verify_the_first_name_column_limit(
			String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String FirstName = testData.get(RowNumber).get("First Name");
		pi.validateFirstnameFieldLimit(FirstName);

	}

	@Then("user should enter values from  {string} and {int}  to last name field and verify the last Name column limit")
	public void user_should_enter_values_from_and_to_last_name_field_and_verify_the_last_name_column_limit(
			String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String LastName = testData.get(RowNumber).get("Last Name");
		pi.validateLastnameFieldLimit(LastName);

	}

	@Then("user should enter values from  {string} and {int}  to phone number field and verify the phone number column limit")
	public void user_should_enter_values_from_and_to_phone_number_field_and_verify_the_phone_number_column_limit(
			String SheetName, Integer RowNumber) throws Throwable {

		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String PhoneNumber = testData.get(RowNumber).get("Phone Number");
		pi.validatePhoneNumberLimit(PhoneNumber);

		if (osName.equalsIgnoreCase("IOS")) {
			pi.header_PersonalInfo.click();
			pi.header_PersonalInfo.click();
		}

	}

	@Then("user should verify the first name column")
	public void user_should_verify_the_first_name_column() {
		pi.verifyFirstNameColumn();
	}

	@When("user clears the values from first name column and enters values from  {string} and {int}")
	public void user_clears_the_values_from_first_name_column_and_enters_values_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String FirstName = testData.get(RowNumber).get("First Name");
		pi.enterValuesToFirstNameField(FirstName);
	}

	@Then("user should see and verify the Last Name column")
	public void user_should_see_and_verify_the_last_name_column() {

		pi.verifyLastNameColumn();
	}

	@When("user clears the values from Last name column and enters values from  {string} and {int}")
	public void user_clears_the_values_from_last_name_column_and_enters_values_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String LastName = testData.get(RowNumber).get("Last Name");
		pi.enterValuesToLastNameField(LastName);
	}

	@Then("user should see and verify the Phone number column")
	public void user_should_see_and_verify_the_phone_number_column() {

		pi.verifyPhoneNumberColumn();

	}

	@When("user clears the values from Phone number column and enters values from  {string} and {int}")
	public void user_clears_the_values_from_phone_number_column_and_enters_values_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String PhoneNumber = testData.get(RowNumber).get("Phone Number");
		pi.enterValuesToPhoneColumn(PhoneNumber);
		if (osName.equalsIgnoreCase("IOS")) {
			try {
				pi.header_PersonalInfo.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Then("user should see and verify the Email column")
	public void user_should_see_and_verify_the_email_column() {

		pi.verifyEmailColumn();

	}

	@Then("user should verify Email format")
	public void user_should_verify_email_format() {

		pi.validateEmailFormat();

	}

	@Then("user should verify Password column and change button")
	public void user_should_verify_password_column_and_change_button() {

		pi.verifyPasswordColumn();
		pi.verifyChangePasswordButton();

	}

	@Then("user should verify required text below each textboxs")
	public void user_should_verify_required_text_below_each_textboxs() {

		pi.verifyRequiredText();

	}

	@Then("user should verify Birthday column and text in birthday column value")
	public void user_should_verify_birthday_column_and_text_in_birthday_column_value() {
		if (osName.equalsIgnoreCase("IOS"))
			System.out.println("Birthday column will be verified");
		else {
			pi.verifyBirthdayColumn();
			pi.validateBirthdayValue();
		}

	}

	@Then("user should see and verify Face ID\\/Touch ID column text")
	public void user_should_see_and_verify_face_id_touch_id_column_text() {

		pi.verifyFaceIdText();

	}

	@Then("user should verify Face ID\\/Touch ID toggle button")
	public void user_should_verify_face_id_touch_id_toggle_button() {
		pi.verifyFaceIdToggle();

	}

	@Then("user should verify save button")
	public void user_should_verify_save_button() {
		if (osName.equalsIgnoreCase("IOS")) {
			pi.header_PersonalInfo.click();
			pi.scrollToSaveButton();
			pi.verifySaveButton();
		} else {
			pi.scrollToSaveButton();
			pi.verifySaveButton();
		}
	}

	@Then("user should see and verify cancel")
	public void user_should_see_and_verify_cancel() {

		pi.verifyCancelButton();
	}

	@Then("user should see and verify delete account CTA")
	public void user_should_see_and_verify_delete_account_cta() {

		pi.verifyDeleteAccountButton();

	}

	@When("user should change order type as delivery through order info")
	public void user_should_change_order_type_as_delivery_through_order_info() {
		hs.btn_change.click();
		oi.switchToDelivery();
		oi.clicksConfirmButton();

	}

	@When("user clears the values from first name column")
	public void user_clears_the_values_from_first_name_column() {
		pi.tb_FirstName.clear();
	}

	@When("user clears the values from Last name column")
	public void user_clears_the_values_from_last_name_column() {
		pi.tb_LastName.clear();
	}

	@When("user clears the values from Phone number column")
	public void user_clears_the_values_from_phone_number_column() {

		pi.tb_PhoneNumber.clear();
	}

	@When("user taps on Save button")
	public void user_taps_on_save_button() {
		{
			if (osName.equalsIgnoreCase("IOS")) {
				pi.header_PersonalInfo.click();
				pi.scrollToSaveButton();
				pi.clickSaveButton();
			} else {
				pi.scrollToSaveButton();
				pi.clickSaveButton();
			}
		}

	}

	@Then("user should see and verify Please enter a first name error")
	public void user_should_see_and_verify_please_enter_a_first_name_error() {
		waitFor(2000);
		// pi.scrollup();
		pi.verifyFirstNameError();

	}

	@Then("user should see and verify Please enter a last name error")
	public void user_should_see_and_verify_please_enter_a_last_name_error() {

		pi.verifyLastNameError();

	}

	@Then("user should see and verify Please enter a phone number error error")
	public void user_should_see_and_verify_please_enter_a_phone_number_error_error() {

		pi.verifyPhoneNumberError();

	}
	
	@When("user tap on back button")
	public void user_tap_on_back_button() {
		pi.btn_Back.click();
	}

	@Then("user should verify save your changes popup")
	public void user_should_verify_save_your_changes_popup() {
		pi.verifySaveToChangesHeader();
	}

	@Then("user should verify save and close button")
	public void user_should_verify_save_and_close_button() {
		pi.verifySaveAndCloseButton();
	}

	@Then("user should verify close button")
	public void user_should_verify_close_button() {
		pi.verifyCloseButton();
	}

	@Then("user should verify discard changes button")
	public void user_should_verify_discard_changes_button() {
		pi.verifyDiscardChangesButton();
	}
	
	@When("user tap on change button")
	public void user_tap_on_change_button() {
		pi.btn_ChangePassword.click();
	}

	@Then("user should verify reset password popup")
	public void user_should_verify_reset_password_popup() {
		pi.verifyResetPasswordHeader();
	}

	@Then("user should verify the decorative icon and close button")
	public void user_should_verify_the_decorative_icon_and_close_button() {
		pi.verifyResetDecorativeIcon();
		pi.verifyCloseButton();
	}

	@Then("user should verify the reset password readonly text")
	public void user_should_verify_the_reset_password_readonly_text() {
		pi.verifyResetPasswordDescription();
	}
	

	@Then("user should verify the send email button")
	public void user_should_verify_the_send_email_button() {
		pi.verifySendEmailButton();
	}
	
	@Then("User should verify the cancel button")
	public void user_should_verify_the_cancel_button() {
		pi.verifyCancelResetPasswordButton();
	}

	@When("user tap on cancel button")
	public void user_tap_on_cancel_button() {
		pi.btn_CancelResetPassword.click();
	}

	@Then("user should verify navigating back to personal info landing page")
	public void user_should_verify_navigating_back_to_personal_info_landing_page() {
		pi.VerifyPersonalInfoHeader();
	}


}
