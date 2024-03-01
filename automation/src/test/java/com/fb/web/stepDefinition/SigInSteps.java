package com.fb.web.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.stepDefinition.AccountAddressesSteps;
import com.fb.web.commonmethods.Webcommonmethods;
import com.fb.web.pageObject.HomePage;
import com.fb.web.pageObject.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigInSteps extends Utilities{
	
	
	SignInPage signIn = new SignInPage(driver);
	HomePage homePage = new HomePage(driver);
	Webcommonmethods webcommon= new Webcommonmethods(driver);
	public String SheetName = "user_details";

	
	
	@Then("User should provide UserName and Password from {string} and {int}")
	public void user_should_provide_user_name_and_password_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String userName = testData.get(RowNumber).get("username");
		String passWord = testData.get(RowNumber).get("password");
		webcommon.signInCredentials(userName, passWord);
	}
	
	@Then("User should click on Sign In button to login")
	public void user_should_click_on_sign_in_button_to_login() {
     signIn.clickSignInButton();
	}
	
	@Then("User should receive the error Message from {string} and {int}")
	public void user_should_receive_the_error_message_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testData1 = reader.getData(SheetPath, SheetName);
		String errorMessage = testData1.get(RowNumber).get("errormessage");
        webcommon.readErrorMessage(errorMessage);
	}
	
	@When("User should click on Dont have an account? Sign Up link")
	public void user_should_click_on_dont_have_an_account_sign_up_link() {
		
	   signIn.clickOnDontHaveAccount();
	}
	
	@Then("User should provide empty UserName and empty Password from {string} and {int}")
	public void user_should_provide_empty_user_name_and_empty_password_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String emptyUserName = testData.get(RowNumber).get("username");
		String emptyPassWord = testData.get(RowNumber).get("password");
		 signIn.emptyUNameAndPwd(emptyUserName, emptyPassWord);
	}
	
	@Then("User should provide valid UserName and invalid Password from {string} and {int}")
	public void user_should_provide_valid_user_name_and_invalid_password_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String emptyUserName = testData.get(RowNumber).get("username");
		String emptyPassWord = testData.get(RowNumber).get("password");
		String errorMessage = testData.get(RowNumber).get("errormessage");
		 signIn.validUNameInvalidPwd(emptyUserName, emptyPassWord, errorMessage);
	}
	
	@Then("User should provide invalid UserName and invalid Password from {string} and {int}")
	public void user_should_provide_invalid_user_name_and_invalid_password_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String invalidUserName = testData.get(RowNumber).get("username");
		String invalidPassWord = testData.get(RowNumber).get("password");
	    signIn.InvalidUNameAndPwd(invalidUserName, invalidPassWord);
	}
	
	@Then("User should provide invalid UserName and valid Password from {string} and {int}")
	public void user_should_provide_invalid_user_name_and_valid_password_from_and(String SheetName, Integer RowNumber)throws Throwable  {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String invalidUserName = testData.get(RowNumber).get("username");
		String validPassWord = testData.get(RowNumber).get("password");
	    signIn.InvalidUNameAndvalidPwd(invalidUserName, validPassWord);
	}
	
	@Then("User should provide temporarily locked UserName and valid Password from {string} and {int}")
	public void user_should_provide_temporarily_locked_user_name_and_valid_password_from_and(String SheetName, Integer RowNumber)throws Throwable{
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String validUserName = testData.get(RowNumber).get("username");
		String validPassWord = testData.get(RowNumber).get("password");
	    signIn.temporarilyLockedUNameAndPwd(validUserName, validPassWord);
	
	}
	
	@Then("User should provide valid UserName and valid Password from {string} and {int}")
	public void user_should_provide_valid_user_name_and_valid_password_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String validUserName = testData.get(RowNumber).get("username");
		String validPassWord = testData.get(RowNumber).get("password");
	    signIn.successLogin(validUserName, validPassWord);
	   
	}
	
	@Then("User should be able to view the label from {string} and {int}")
	public void user_should_be_able_to_view_the_label_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String recaptchaLabel = testData.get(RowNumber).get("recaptchalabel");
		signIn.verifyRecaptchaLabel(recaptchaLabel);
		
	}
}







