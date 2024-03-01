package com.fb.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.AccountAddressesPage;
import com.fb.pageObject.DeliveryOrderDetailPages;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.OrderDetailsPage;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.RestaurantInfoPage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountAddressesSteps extends Utilities {


	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);
	AccountAddressesPage accountAddresses = new AccountAddressesPage(driver);
	SignInPage signin = new SignInPage(driver);
	OrderDetailsPage orderDetails = new OrderDetailsPage(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
	DeliveryOrderDetailPages delivery = new DeliveryOrderDetailPages(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	@When("user is on Sign In Page and able to enter  authendication details from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_authendication_details_from_and(String SheetName,
			int RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		signin.signIn(userType, email, password);
	}

	@Then("the geo Location action is performed from {string} and {int}")
	public void the_geo_location_action_is_performed_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		commonMethods.geoLocationService(geoLocation);
	}

	@Then("user searched the location and selected from {string} and {int}")
	public void user_searched_the_location_and_selected_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		String restaurant = testData.get(RowNumber).get("Restaurant");
		commonMethods.searchAndSelectLocation(location);
		commonMethods.clickOrderNow(restaurant);
	}

	@Then("user should see and able to click the hamburger menu from home page")
	public void user_should_see_and_able_to_click_the_hamburger_menu_from_home_page() {
		commonMethods.clickYourAccountFromHamburgerMenu();
	}
	
	@Then("user should see Addresses Option and able to click the Chevron and get it from {string} and {int}")
	public void user_should_see_addresses_option_and_able_to_click_the_chevron_and_get_it_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String accountOption = testData.get(RowNumber).get("Account");
		commonMethods.clickAccountOption(accountOption);
	}

	@Then("user should see Addresses Option and able to click the Chevron")
	public void user_should_see_addresses_option_and_able_to_click_the_chevron() {
	
	}

	@Then("verify No Addresses Saved text is displayed and able to click Add New Address CTA")
	public void verify_no_addresses_saved_text_is_displayed_and_able_to_click_add_new_address_cta() {
		accountAddresses.commonValidations();

	}

	@When("user scroll to bottom of the screen and click the Save CTA")
	public void user_scroll_to_bottom_of_the_screen_and_click_the_save_cta() {
		accountAddresses.addNewAddressPageValidation();
	}

	@Then("tap on Add New Addresses CTA from saved Addresses screen")
	public void tap_on_add_new_addresses_cta_from_saved_addresses_screen() {
		accountAddresses.clickAddNewAddressFromSavedAddresses();
	}

	@When("I click on Enter Address chevron, Does This Address Look Correct Modal will	be displayed")
	public void i_click_on_enter_address_chevron_does_this_address_look_correct_modal_will_be_displayed() {
		accountAddresses.clickEnterAddressArrow();
	}

	@When("user able to enter Apt \\/ Unit \\/ Suite value from {string} and {int} and click Use Address CTA")
	public void able_to_enter_apt_unit_suite_value_from_and_and_click_use_address_cta(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String updatedAptValue = testData.get(RowNumber).get("Value");
		accountAddresses.enterAptUnitValue(updatedAptValue);
	}

	@Then("tap on Enter Address chevron and Does This Address Look Correct Modal will	be displayed")
	public void tap_on_enter_address_chevron_and_does_this_address_look_correct_modal_will_be_displayed() {
		accountAddresses.clickEnterAddressArrowWithText();
	}

	@Then("able to click Re-Enter CTA and It will display Add  New Address screen")
	public void able_to_click_re_enter_cta_and_it_will_display_add_new_address_screen() {
		accountAddresses.clickReEnter();
		accountAddresses.verifyAddNewAddressHeaderFML();
		accountAddresses.clickEnterAddressArrow();
		accountAddresses.clickCancel();
	}

	@Then("tap on Find My Location CTA, and close the Does This Address Look Correct? Modal")
	public void tap_on_find_my_location_cta_and_close_the_does_this_address_look_correct_modal() {
		accountAddresses.clickFindMyLocationCTA();
		accountAddresses.clickCancel();
	}

	@Then("user able to search new address and the location is get it from {string} and {int}")
	public void user_able_to_search_new_address_and_the_location_is_get_it_from_and(String SheetName, Integer RowNumber)
			throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Delivery Location Search");
		accountAddresses.clickSearchBar(restaurant);
	}

	@When("I tap on Clear CTA Recent Searches should be disappear")
	public void i_tap_on_clear_cta_recent_searches_should_be_disappear() {
		accountAddresses.clickCancel();
		accountAddresses.clickClearCTA();
		accountAddresses.clickAndClearSearch();
	}

	@Then("user able to enter Location Name and get it from {string} and {int}")
	public void user_able_to_enter_location_name_and_get_it_from_and(String SheetName, Integer RowNumber)
			throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String locationName = testData.get(RowNumber).get("Location Name");
		accountAddresses.enterLocationName(locationName);
	}

	@Then("able to enter user delivery Notes and get it from {string} and {int}")
	public void able_to_enter_user_delivery_notes_and_get_it_from_and(String SheetName, Integer RowNumber)
			throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String notes = testData.get(RowNumber).get("Delivery Note");
		accountAddresses.enterDeliveryNotes(notes);
	}

	@Then("user should see the check box and able to check in")
	public void user_should_see_the_check_box_and_able_to_check_in() {
		accountAddresses.clickCheckBox();
	}

	@Then("tap on Save CTA and verify selected address should be displayed on Addresses Screen")
	public void tap_on_save_cta_and_verify_selected_address_should_be_displayed_on_addresses_screen() {
		accountAddresses.clickSaveCTA();
		accountAddresses.savedAddressesValidation();
	}

	@When("user is on Sign In Page and able to enter authendication details from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_authendication_details_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		signin.signIn(userType, email, password);
	}

	@When("I click on Enter Address chevron, Add New Address screen with search field has been displayed")
	public void i_click_on_enter_address_chevron_add_new_address_screen_with_search_field_has_been_displayed() {
		accountAddresses.clickEnterAddressArrowRight();
	}

	@Then("tap on Recently searched location")
	public void tap_on_recently_searched_location() {
		accountAddresses.clickRecentSearch();
	}

	@Then("user should see and tap on edit link")
	public void user_should_see_and_tap_on_edit_link() {
		accountAddresses.clickEditCTA();
	}

	@Then("scroll to bottom of the screen and Verify Remove This Address modal functionalities")
	public void scroll_to_bottom_of_the_screen_and_verify_remove_this_address_modal_functionalities() {
		accountAddresses.clickRemoveThisAddressCTA();
		accountAddresses.removeThisAddressActions();
	}

	@Then("verify Address Removed Pop up is displayed")
	public void verify_address_removed_pop_up_is_displayed() {
		accountAddresses.addressRemovedPopup();
	}

	@When("user is on Sign In Page and able to enter Sign In Credentials from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_sign_in_credentials_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		signin.signIn(userType, email, password);
	}

	@Then("user able to see and click the Add New Address CTA")
	public void user_able_to_see_and_click_the_add_new_address_cta() {
		accountAddresses.clickAddNewAddressFromSavedAddresses();
	}

	@When("user is on Sign In Page and able to enter  authentication details from {string} and {int}")
	public void user_is_on_sign_in_page_and_able_to_enter_authentication_details_from_and(String SheetName,
			Integer RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		signin.signIn(userType, email, password);
	}

	@Then("verify Edit Address header is displayed")
	public void verify_edit_address_header_is_displayed() {
		accountAddresses.verifyEditAddressHeader();
	}

	@Then("user should select Hand It To Me Drop Off Instructions")
	public void user_should_select_hand_it_to_me_drop_off_instructions() {
		accountAddresses.clickHandItToMe();
	}

	@Then("Tap on Back Navigation Arrow and Save Your Changes Modal will be displaying")
	public void tap_on_back_navigation_arrow_and_save_your_changes_modal_will_be_displaying() {
		accountAddresses.clickBackArrow();
	}

	@Then("verify the Save Your Changes modal and then close the Modal")
	public void verify_the_save_your_changes_modal_and_then_close_the_modal() {
		accountAddresses.saveYourChangesValidation();
	}

	@Then("verify Discard Changes CTA and  tap on Discard Changes CTA")
	public void verify_discard_changes_cta_and_tap_on_discard_changes_cta() {
		accountAddresses.clickDiscardChangesCTA();
	}

	@Then("user should see and tap on Save & Close CTA")
	public void user_should_see_and_tap_on_save_close_cta() {
		accountAddresses.clickSaveAndCloseCTA();
	}

	@Then("scroll to bottom of the screen and tap on Cancel CTA and it will navigate to Addresses Screen")
	public void scroll_to_bottom_of_the_screen_and_tap_on_cancel_cta_and_it_will_navigate_to_addresses_screen() {
		accountAddresses.clickCancelCTA();
	}

	@Then("user should select Leave at Door Drop Off Instructions")
	public void user_should_select_leave_at_door_drop_off_instructions() {
		accountAddresses.clickLeaveAtDoor();
	}

	@Then("scroll to bottom of the screen and tap on Cancel CTA")
	public void scroll_to_bottom_of_the_screen_and_tap_on_cancel_cta() {
		accountAddresses.clickCancelCTA();
	}

	@When("user scroll to bottom of the screen and click the Save CTAs")
	public void user_scroll_to_bottom_of_the_screen_and_click_the_save_ct_as() {
		accountAddresses.clickSaveButton();
	}

	@Then("Tap on Back Navigation Arrow")
	public void tap_on_back_navigation_arrow() {
		accountAddresses.clickBackArrow();
	}

}
