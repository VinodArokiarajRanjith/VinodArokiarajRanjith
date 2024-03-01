package com.fb.web.stepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.fb.Utilities.Utilities;

import com.fb.stepDefinition.AccountAddressesSteps;
import com.fb.web.commonmethods.Webcommonmethods;
import com.fb.web.pageObject.HomePage;
import com.fb.web.pageObject.ResetPasswordPage;
import com.fb.web.pageObject.SignInPage;
import com.fb.web.pageObject.SignUpPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUpSteps extends Utilities{

	SignUpPage signUp = new SignUpPage(driver);
	Webcommonmethods webcommon= new Webcommonmethods(driver);

	@When("User should click on back Arrow button")
	public void user_should_click_on_back_arrow_button() {
		signUp.clickLefttArrow();
	}

	@When("User should click on back button")
	public void user_should_click_on_back_button() {    
		signUp.backButtonCreateAnAccountPage();
	}

	@When("User should enter the valid Emails ID and clicks on Continue button from {string} and {int}")
	public void user_should_enter_the_valid_emails_id_and_clicks_on_continue_button_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String validemail = testData.get(RowNumber).get("Email");
	    signUp.ValidEmail(validemail);
	}


	@Then("User should enter the firstname and last name and phone number and valid password and Confirm password from {string} and {int}")
	public void user_should_enter_the_firstname_and_last_name_and_phone_number_and_valid_password_and_confirm_password_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String firstName = testData.get(RowNumber).get("FirstName");
		String lastName = testData.get(RowNumber).get("LastName");
		String phoneNumber = testData.get(RowNumber).get("PhoneNumber");
		String passWord = testData.get(RowNumber).get("PassWord");
		String cnfPassWord = testData.get(RowNumber).get("ConfirmPassword");
		signUp.letsGetStartedPage(firstName, lastName, phoneNumber, passWord, cnfPassWord);
	}

	@Then("Click on Continue button and User should navigate to Score Exclusive Perks page")
	public void click_on_continue_button_and_user_should_navigate_to_score_exclusive_perks_page() {    
		signUp.verifyScoreExclusivePerkPage();
	}

	@Then("User should enter birthday and referral code from {string} and {int} and click on complete Sign up")
	public void user_should_enter_birthday_and_referral_code_from_and_and_click_on_complete_sign_up(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String birthDay = testData.get(RowNumber).get("Birthday");
		String referralCode = testData.get(RowNumber).get("ReferralCode");
		signUp.scoreExclusivePage(birthDay, referralCode);    
	}

	@Then("User should navigate to MoEs welcome page")
	public void user_should_navigate_to_mo_es_welcome_page() {    
		signUp.verifyWelcomeToMoEsPage();
	}

	@When("User should click on Continue button in MoEs welcome page")
	public void user_should_click_on_continue_button_in_mo_es_welcome_page() {
		signUp.clickOnWelcomeMoEsContinueBtn();    
	}

	@Then("User should navigate to MEMBERSHIP HAS ITS \\(DELICIOUS) REWARDS page")
	public void user_should_navigate_to_membership_has_its_delicious_rewards_page() {
		signUp.verifyMembershipRewardsPage();  
	}

	@When("User should click on Continue button in Membership page")
	public void user_should_click_on_continue_button_in_membership_page() {    
		signUp.clickOnMembershipRewardsContinue();
	}

	@Then("User should navigate to MOBILE ORDERING MADE FAST AND EASY page")
	public void user_should_navigate_to_mobile_ordering_made_fast_and_easy_page() {    
		signUp.verifyMobileOrderingPage();
	}

	@When("User should click on LetsGetStarted button")
	public void user_should_click_on_lets_get_started_button() {
		signUp.clickOnLetsGetStartedButton();    
	}

	

	


	@When("User should click on Back Arrow icon in MEMBERSHIP HAS ITS \\(DELICIOUS) REWARDS page")
	public void user_should_click_on_back_arrow_icon_in_membership_has_its_delicious_rewards_page() {
		signUp.backButtonCreateAnAccountPage();

	}
	
	
	@When("User should click on Back Arrow icon in MOBILE ORDERING MADE FAST AND EASY page")
	public void user_should_click_on_back_arrow_icon_in_mobile_ordering_made_fast_and_easy_page() {
		signUp.backButtonCreateAnAccountPage();

	}

	@When("User should click on back Arrow in LetsGetStarted page")
	public void user_should_click_on_back_arrow_in_lets_get_started_page() {

		signUp.backButtonCreateAnAccountPage();
	}
	@When("click on LetsGetStarted button")
	public void click_on_lets_get_started_button() {
		signUp.clickOnLetsGetStartedBtn();

	}

	
	
	@When("User should click on back Arrow in MOBILE ORDERING MADE FAST AND EASY page")
	public void user_should_click_on_back_arrow_in_mobile_ordering_made_fast_and_easy_page() {

		signUp.backButtonCreateAnAccountPage();
	}
	
	@When("User should click on Skip button")
	public void user_should_click_on_skip_button() {
		signUp.clickOnSkipBtn();
	}

	@Then("User should verify Privacy policy and Terms of Service word in bold letter")
	public void user_should_verify_privacy_policy_and_terms_of_service_word_in_bold_letter() {
		webcommon.verifyPrivacyPolicyBoldLetters();
		webcommon.verifyTermsOfServiceBoldLetters();
	}





}





