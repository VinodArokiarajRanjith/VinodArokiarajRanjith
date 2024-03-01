package com.fb.web.stepDefinition;

import java.util.List;
import java.util.Map;

import com.fb.Utilities.Utilities;
import com.fb.web.pageObject.WelcomePage;

import io.cucumber.java.en.*;

public class WelcomePageSteps extends Utilities {
	
	WelcomePage welcomepage = new WelcomePage(driver);
	
	@Given("User validate the UI components from  {string} and {int}")
	public void user_validate_the_ui_components_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String header1 = testData.get(RowNumber).get("Header1");
		String header2 = testData.get(RowNumber).get("Header2");
		String paragraph = testData.get(RowNumber).get("Paragraph");
		String labelRecaptcha = testData.get(RowNumber).get("RecaptchaLabel");
		welcomepage.verifyUIValidationWelcomePage(header1, header2, paragraph, labelRecaptcha);
	  	}

	@When("User should click on Sign in button")
	public void user_should_click_on_sign_in_button() {
	    welcomepage.clickOnSignInCTA();
	}
	
	@Then("User should navigate to Sign In Page")
	public void user_should_navigate_to_sign_in_page() {
	   welcomepage.verifySignInPage();
	}
	
	@When("User should click on Back Arrow")
	public void user_should_click_on_back_arrow() {
	  welcomepage.clickOnBackArrow();
	}
	@Then("User should navigate to Welcome page")
	public void user_should_navigate_to_welcome_page() {
	   welcomepage.verifyWelcomePage();
	}
	@When("User click on Create An Account button")
	public void user_click_on_create_an_account_button() {
	    welcomepage.clickOnCreateAnAccoungCTA();   
	}
	
	@Then("User should navigate to Create An Account Page")
	public void user_should_navigate_to_create_an_account_page() {
	    welcomepage.verifyCreateAnAccount();
	}
	
	@When("User click on Guest user link")
	public void user_click_on_guest_user_link() {
	   welcomepage.clickOnGuestUserLink();    
	}
	
	@Then("User should navigate to home Page")
	public void user_should_navigate_to_home_page() {
	    welcomepage.verifyHomePage();
	    
	}
	
	@When("User click on Privacy Policy link")
	public void user_click_on_privacy_policy_link() {
		welcomepage.clickOnPrivacyPolicyLink(); 
	    
	}
	@Then("User should navigate to Privacy Policy URL")
	public void user_should_navigate_to_privacy_policy_url() {
		confirmPageNavigation();
	}
	
	@When("User click on Terms of Service link")
	public void user_click_on_terms_of_service_link() {
		  welcomepage.clickOnTermsOfServiceLink();
	}
	
	@Then("User should navigate to Terms of Service URL")
	public void user_should_navigate_to_terms_of_service_url() {
	    confirmPageNavigation();    
	}
	
	



}
