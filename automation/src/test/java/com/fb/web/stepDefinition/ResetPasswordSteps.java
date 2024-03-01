package com.fb.web.stepDefinition;

import java.io.IOException;
import java.util.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.SignInPage;
import com.fb.web.commonmethods.Webcommonmethods;
import com.fb.web.pageObject.HomePage;
import com.fb.web.pageObject.ResetPasswordPage;
import com.fb.web.pageObject.SignUpPage;

import io.cucumber.java.en.*;

public class ResetPasswordSteps extends Utilities{


	ResetPasswordPage resetPwd = new ResetPasswordPage(driver);
	Webcommonmethods webcommon = new Webcommonmethods(driver);
	HomePage homePage = new HomePage(driver);
	SignInPage signInPage = new SignInPage(driver);
	SignUpPage signUp = new SignUpPage(driver);
	

	@When("User should click the Forgot Password link")
	public void user_should_click_the_forgot_password_link() {
	    resetPwd.verifyForgotPwdLink();
	    
	}
	@Then("User should navigate to the Reset Password page")
	public void user_should_navigate_to_the_reset_password_page() {
	    resetPwd.verifyResetPwdBtn();
	    
	}
	
	@When("User should provide the empty Email details into Email field from {string} and {int}")
	public void user_should_provide_the_empty_email_details_into_email_field_from_and(String SheetName, Integer RowNumber) throws Throwable  {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String userName = testData.get(RowNumber).get("Email");
		resetPwd.resetEmptyEmailCredentials(userName);
	}
	
	@When("User should provide the invalid Email details into Email field from {string} and {int}")
	public void user_should_provide_the_invalid_email_details_into_email_field_from_and(String SheetName, Integer RowNumber) throws Throwable  {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String userName = testData.get(RowNumber).get("Email");
		resetPwd.resetInvalidEmailCredentials(userName);
	}

	@When("User should provide the valid Email details into Email field from {string} and {int}")
	public void user_should_provide_the_valid_email_details_into_email_field_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String userName = testData.get(RowNumber).get("Email");
		resetPwd.resetValidEmailCredentials(userName);

	}

	@When("User should click on Reset Password button")
	public void user_should_click_on_reset_password_button() {
		resetPwd.clickonResetPassWordBtn();
	    
	}
	@When("User should validate the inline error message from {string} and {int}")
	public void user_should_validate_the_inline_error_message_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String errorMessage = testData.get(RowNumber).get("errormessage");
		 webcommon.readErrorMessage(errorMessage);
	}
	
	@Then("User should view the check your email paragraph from {string} and {int}")
	public void user_should_view_the_check_your_email_paragraph_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String checkEmail = testData.get(RowNumber).get("Paragraph1");
		resetPwd.checkYourEmail(checkEmail);
	}
	
	@When("User should validate the inline success message from {string} and {int}")
	public void user_should_validate_the_inline_success_message_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String successMsg = testData.get(RowNumber).get("SuccessMessage");
		webcommon.readErrorMessage(successMsg);
	}
	@When("User should view the Enter the email paragram from {string} and {int}")
	public void user_should_view_the_enter_the_email_paragram_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String enterEmail = testData.get(RowNumber).get("Paragraph2");
		resetPwd.entertheEmail(enterEmail);
	}

	@When("User should click on the back arrow icon")
	public void user_should_click_on_the_back_arrow_icon() { 
		resetPwd.clickOnBackArrowResetPwdPage();
	}
	
	@When("User should click on the Moes logo")
	public void user_should_click_on_the_moes_logo() {
	    resetPwd.verifyMoesLogo();
	}
	
	@When("User should click on Know your password?Sign in> link")
	public void user_should_click_on_know_your_password_sign_in_link() {
	   resetPwd.clickOnKnowyourPwd();
	}
	
	@Then("User should be able to view the Reset Password comment from {string} and {int}")
	public void user_should_be_able_to_view_the_reset_password_comment_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String Resetcomment = testData.get(RowNumber).get("Comment");
		webcommon.verifyResetPwdComment(Resetcomment);		
	}
	
	@When("User should view the Didnt receive an email? Resend> content from {string} and {int}")
	public void user_should_view_the_didnt_receive_an_email_resend_content_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String Resetcomment = testData.get(RowNumber).get("Didnt receive an email? Resend>");
		resetPwd.didNtReceiveEmail(Resetcomment);
		
	  
	}
	@When("User should view the Return to Sign-in CTA")
	public void user_should_view_the_return_to_sign_in_cta() {
	  resetPwd.returnToSignInCTA();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@When("the user clicks the Forgot Password")
//	public void the_user_clicks_the_forgot_password()  {
//		resetPwd.verifyForgotPwdLink();
//		
//	}
//
//	@Then("the user should be able to navigate to the Reset Password page")
//	public void the_user_should_be_able_to_navigate_to_the_reset_password_page()  {
//		String currentUrlResetPwd = driver.getCurrentUrl();
//		
//		System.out.println(currentUrlResetPwd);
//	}
//
//	@And("the user clicks on the Reset password button")
//	public void the_user_clicks_on_the_reset_password_button(){
//		resetPwd.verifyResetPwdBtn();
//		
//
//	}
//
//	@Then("User should be able to reset the password with valid emailid from {string} and {int}")
//	public void user_should_be_able_to_reset_the_password_with_valid_emailid_from_and(String SheetName,
//			Integer RowNumber) throws InvalidFormatException, IOException  {
//
//		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
//
//		String email = testData.get(RowNumber).get("Email");
//		String errorMessage = testData.get(RowNumber).get("errormessage");
//		webcommon.resetPassWord(email, errorMessage);
//
//		
//	}
//
//	@And("click on the back arrow")
//
//	public void click_on_the_back_arrow() throws InterruptedException {
//
//		resetPwd.backArrowClick();
//		Thread.sleep(3000);
//
//	}
//
//	@And("And validate the SignIn page")
//
//	public void And_validate_the_SignIn_page() throws InterruptedException {
//		String currentUrlSignInPage = driver.getCurrentUrl();
//		Thread.sleep(3000);
//
//		System.out.println(currentUrlSignInPage);
//	}
//
//	@And("the user click on the Moes logo")
//	public void the_user_click_on_the_Moes_logo() throws InterruptedException {
//
//		resetPwd.verifyMoesLogo();
//		Thread.sleep(3000);
//
//	}
//
//
//	@And("validate the inline error message from {string} and {int}")
//	public void validate_the_inline_error_message_from_and(String SheetName, Integer RowNumber)
//			throws Exception, IOException {
//
//		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
//
//		String email = testData.get(RowNumber).get("Email");
//		String errorMessage = testData.get(RowNumber).get("errormessage");
//		webcommon.resetPassWord(email, errorMessage);
//
//	}
//	
//	@Then("validate the SignIn page")
//	public void validate_the_sign_in_page(){
//		
//		resetPwd.verifySignInPageHeading();
//	    
//	}
//	
//	@Then("validate the user is in the Home page")
//	public void validate_the_user_is_in_the_home_page() {
//		resetPwd.verifyMoesLogo();
//	}
//	
//	@Then("the user click on Know your password? Sign in> link")
//	public void the_user_click_on_know_your_password_sign_in_link() {
//	    resetPwd.knowYourPassword();
//	}
//	
//	@Then("the user click on privacy policy link")
//	public void the_user_click_on_privacy_policy_link() {
//		resetPwd.privacyPolicyLinkClick();
//	   
//	}
//	@Then("should navigate to privacy policy terms document")
//	public void should_navigate_to_privacy_policy_terms_document() {
//	    resetPwd.privacyPolicyDocumentPage();
//	}
//	
//	@Then("validate the user is in the sign In page")
//	public void validate_the_user_is_in_the_sign_in_page() {
//		resetPwd.signInPageKnowYourPassword();
//	}
//
//
//

}
