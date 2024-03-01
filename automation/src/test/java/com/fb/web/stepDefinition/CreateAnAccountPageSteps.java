package com.fb.web.stepDefinition;

import java.util.List;
import java.util.Map;

import com.fb.Utilities.Utilities;
import com.fb.web.pageObject.CreateAnAccountPage;

import io.cucumber.java.en.*;

public class CreateAnAccountPageSteps extends Utilities {
	
	CreateAnAccountPage signup = new CreateAnAccountPage(driver);
	
	@Then("User validate the UI Functionalities on Create An Account Page")
	public void user_validate_the_ui_functionalities_on_create_an_account_page() {
		signup.verifyCreateAnAccountPageUI();
	    
	}
	
	@Then("User should see the Email field with Alphabets and Numbres and special characters from {string} and {int}")
	public void user_should_see_the_email_field_with_alphabets_and_numbres_and_special_characters_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String alphabets = testData.get(RowNumber).get("Alphabets");
		String numbers = testData.get(RowNumber).get("Numbers");
		String specialCharacters = testData.get(RowNumber).get("SpecialCharacters");
		signup.emailField(alphabets, numbers, specialCharacters);
	
	    
	}
	@Then("User should allow  Maximum {int} characters to Email field from {string} and {int}")
	public void user_should_allow_maximum_characters_to_email_field_from_and(Integer int1, String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String maxCharacter = testData.get(RowNumber).get("MaxCharacter");
		signup.emailFieldMax(maxCharacter);    
	}
	@When("User should enter the valid Email ID and click on Continue button from {string} and {int}")
	public void user_should_enter_the_valid_email_id_and_click_on_continue_button_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String validemail = testData.get(RowNumber).get("ValidEmail");
	    signup.signUpEmail(validemail);
	}
	
	@Then("User should navigate to Lets get started page")
	public void user_should_navigate_to_lets_get_started_page() {
	   signup.verifyLetsGetStartedPage();
	    
	}
	@When("User should click on Continue with Apple button")
	public void user_should_click_on_continue_with_apple_button() {
	   signup.clickOnContinueWithAppleCTA();
	    
	}
	
	@Then("User should navigate to Continue or cancel Apple window")
	public void user_should_navigate_to_continue_or_cancel_apple_window() {
	    
	  signup.verifyContinueCancelApple();
	}
	
	@When("User should click on continue button in Apple window")
	public void user_should_click_on_continue_button_in_apple_window() {
	    signup.clickOnContinueApple();
	   
	}
	
	@Then("User should be navigated to Apple signup flow")
	public void user_should_be_navigated_to_apple_signup_flow() {
	    signup.verifyAppleFlow();
	   
	}
	
	@When("User should click on Cancel button")
	public void user_should_click_on_cancel_button() {
	   signup.clickOnAppleCancel();
	    
	}
	
	
	@When("User should clicks on Continue with facebook button")
	public void user_should_clicks_on_continue_with_facebook_button() {
		 signup.clickOnContinueWithFacebookCTA();
	}
	
	
	
	@Then("User should navigate to Continue or cancel facebook window")
	public void user_should_navigate_to_continue_or_cancel_facebook_window() {
	    signup.verifyContinueCancelFacebook();
	   
	}
	
	@When("User should click on continue button in facebook window")
	public void user_should_click_on_continue_button_in_facebook_window() {
	   signup.clickOnContinueFacebook();
	   
	}

	@Then("User should be navigated to facebook flow")
	public void user_should_be_navigated_to_facebook_flow() {
		 signup.verifyFacebookFlow();
	}
	
	
	@When("User should click on Already have an account?Sign In> link")
	public void user_should_click_on_already_have_an_account_sign_in_link() {
	   signup.clickOnAlreadyHaveAnAccount();
	   logging(condition.pass, "User is clicked on : AlreadyHaveAnAccount?Sign In> CTA as expected");
	    
	}
	
	
	
	
	
	
	




}
