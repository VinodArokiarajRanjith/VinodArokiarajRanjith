package com.fb.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.AccountOrderHistoryPage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountOrderHistorySteps extends Utilities {
	private static Logger logger = LogManager.getLogger(AccountOrderHistorySteps.class);
	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);
	AccountOrderHistoryPage orderHistory = new AccountOrderHistoryPage(driver);
	SignInPage signin = new SignInPage(driver);
	HomePage hs = new HomePage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();
	
	
	@When("user is on Sign In Page and able to enter authentication details from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_authentication_details_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		signin.signIn(userType, email, password);
	}

	@Then("user should see Order History Option and able to click the Chevron and get it from {string} and {int}")
	public void user_should_see_order_history_option_and_able_to_click_the_chevron_and_get_it_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String accountOption = testData.get(RowNumber).get("Account");
		commonMethods.clickAccountOption(accountOption);
	}

	@Then("user should be shown to the order history page with a message as ‘NO PREVIOUS ORDERS’")
	public void user_should_be_shown_to_the_order_history_page_with_a_message_as_no_previous_orders() {
	    commonMethods.velidateEmptyOrderHistoryLandingScreen();
	}

	@Then("user should be able to view and access the button ‘ORDER NOW’ in the page")
	public void user_should_be_able_to_view_and_access_the_button_order_now_in_the_page() {
		orderHistory.verifyOrderNow();
	}

	@Then("user should see History header is displayed")
	public void user_should_see_history_header_is_displayed() {
	   orderHistory.verifyHistoryHeader();
	}

	@Then("user should validate Order History landing page")
	public void user_should_validate_order_history_landing_page() {
	    
	}

	@Then("user should see and click the chevron icon")
	public void user_should_see_and_click_the_chevron_icon() {
	   orderHistory.clickPreviousOrderHistory();
	}

	@Then("verify Order number, Order Completed and PickUp Restaurant")
	public void verify_order_number_order_completed_and_pick_up_restaurant() {
	    commonMethods.velidatePickUpOrderReciptStatus();
	}

	@Then("user should verify Your Order field validations")
	public void user_should_verify_your_order_field_validations() {
	   
	}

	@Then("user should verify Payment Info field validations")
	public void user_should_verify_payment_info_field_validations() {
	   
	}

	@When("user Taps on Reorder button, user will navigate to Reorder screen")
	public void user_taps_on_reorder_button_user_will_navigate_to_reorder_screen() {
	   
	}

	@Then("user should verify Reorder field validations")
	public void user_should_verify_reorder_field_validations() {
	    
	}

	@When("user Taps on Add To Cart button, user will navigate to Order History Lading Page")
	public void user_taps_on_add_to_cart_button_user_will_navigate_to_order_history_lading_page() {
	   
	}

	@When("verify confirmation toast message with View Cart link")
	public void verify_confirmation_toast_message_with_view_cart_link() {
	    
	}

	@Then("verify Order number, Order Completed and Delivery Restaurant")
	public void verify_order_number_order_completed_and_delivery_restaurant() {
	    
	}

}
