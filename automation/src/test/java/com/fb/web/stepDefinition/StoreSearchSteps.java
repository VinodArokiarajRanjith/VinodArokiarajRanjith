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
import com.fb.web.pageObject.OrderInfoPage;
import com.fb.web.pageObject.RestaurantDetails;
import com.fb.web.pageObject.SignInPage;
import com.fb.web.pageObject.SignUpPage;
import com.fb.web.pageObject.StoreSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreSearchSteps extends Utilities {
	
	
	SignInPage signIn = new SignInPage(driver);
	HomePage homePage = new HomePage(driver);
	SignUpPage signUp = new SignUpPage(driver);
	Webcommonmethods webcommon= new Webcommonmethods(driver);
	StoreSearch storesearch = new StoreSearch(driver);
	RestaurantDetails restaurantinfo = new RestaurantDetails(driver);
	OrderInfoPage orderinfo = new OrderInfoPage(driver);
	
	@Given("User should launch the MoEs app URL")
	public void user_should_launch_the_mo_es_app_url() {
	  log("User is navigate to MoEs app URL"); 
	}
	@Given("User should select user type from {string} and {int}")
	public void user_should_select_user_type_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		logging(condition.info, "Selected user type as "+userType+ " successfully");
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		if (userType.trim().equals("GuestUser".trim())) 
		{
			
			storesearch.clickOnGuestUserLink();
			homePage.clickOnStartOrderBtn();
			log("User selected guestUser in TestData and logged in as GuestUser as expected");
		}
		else {
			//cm.signingInFromSavedTab();
			homePage.clickOnProfile();
			//signUp.verifyWelcomePage();
			signIn.clickSignInButton();
			signIn.signInUser(email, password);
			log("Selected user type as : Signed In User Successfully");
		}
	}
	
	@Given("User should validate the UI Functionality for Pick up tab {string} and {int}")
	public void user_should_validate_the_ui_functionality_for_pick_up_tab_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);	
		String accuratePricing = testData.get(RowNumber).get("AccuratePricingText");
		String menuAvailability = testData.get(RowNumber).get("menuAvailabilityText");
		storesearch.verifyUISelectLocationPickUp(accuratePricing, menuAvailability);	
	}
	
	
	
	
	@Then("User should view the search input field for select the location")
	public void user_should_view_the_search_input_field_for_select_the_location() {
	    storesearch.verifySearchLocationInputField();
	    
	}
	
	
	
	
	@Then("User should view the Menu availability text as {string} in Delivery tab")
	public void user_should_view_the_menu_availability_text_as_in_delivery_tab(String deliveryContent) {
		storesearch.verifyTextMenuAvailabilityDeliveryTab(deliveryContent);
	    
	}

	
	@Then("User should view the close icon")
	public void user_should_view_the_close_icon() {
	    storesearch.verifyCloseIcon();
	    
	}
	
	@Then("User should view the Find My Location button in Delivery tab")
	public void user_should_view_the_find_my_location_button_in_Delivery_tab() {
	    
		 storesearch.clickOnDeliveryTab();
		 storesearch.verifyFindMyLocationCTA();
		 
	}
	
	@When("User should select the location in Search location field from {string} and {int}")
	public void user_should_select_the_location_in_search_location_field_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	 
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("LocationSearch");
		webcommon.searchAndSelectLocation(location);
		
	}
	
	@When("click the Restaurant name or more info link from {string} and {int}")
	public void click_the_restaurant_name_or_more_info_link_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		webcommon.selectRestaurantName(restaurant);
		//storesearch.clickOnRestaurant();
	}
	
	@Then("validate the fields in Restaurant Info page from {string} and {int} and functionality validation of favorite and drop up button")
	public void validate_the_fields_in_restaurant_info_page_from_and_and_functionality_validation_of_favorite_and_drop_up_button(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurantHeader = testData.get(RowNumber).get("RestaurantInfoHeader");
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String restaurantAddress = testData.get(RowNumber).get("RestaurantAddress");
		restaurantinfo.restaurantInfoPageUIFieldValidation(restaurantHeader, restaurant, restaurantAddress);	
		
	}
	
	@When("User should click on Change CTA")
	public void user_should_click_on_change_cta() {
	  storesearch.clickOnChangeCTA();
	}
	@When("User should click on Edit CTA")
	public void user_should_click_on_edit_cta() {
	   orderinfo.clickOnEditCTA();
	}
	@Then("User should navigate to Select Location Page")
	public void user_should_navigate_to_select_location_page() {
	    storesearch.verifySelectionLocationHeader();
	}
	
	@When("User should navigate to Enable Location Services")
	public void user_should_navigate_to_enable_location_services() {
	    storesearch.clickOnEnableLocationServices();
	}
	
	@When("User should click on Select Location CTA")
	public void user_should_click_on_select_location_cta() {
		restaurantinfo.clickOnSelectLocation();
	}
	@When("User should click on Order Ahead CTA")
	public void user_should_click_on_order_ahead_cta() {
		restaurantinfo.clickOnOrderAhead();
	}
	@Then("User should navigate to Order Info Page")
	public void user_should_navigate_to_order_info_page() {
		orderinfo.verifyOrderInfoPage();
	}
	@Then("User should validate the fields in Order Info Page from {string} and {int}")
	public void user_should_validate_the_fields_in_order_info_page_from_and(String SheetName, Integer RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String orderInfoHeader = testData.get(RowNumber).get("Header");
		String orderInfoLabel1 = testData.get(RowNumber).get("Label1");
		String orderInfoLabel2 = testData.get(RowNumber).get("Label2");
		String RestaurantName = testData.get(RowNumber).get("Restaurant");
		String restaurantAddress=testData.get(RowNumber).get("RestaurantAddress");
		orderinfo.orderInfoPageUIValidation(orderInfoHeader, orderInfoLabel1, orderInfoLabel2, RestaurantName, restaurantAddress);
	}
	
	@When("User should click on Later CTA")
	public void user_should_click_on_later_cta() {
	    orderinfo.clickOnLaterCTA();
	}
	@When("User should select the Date and Time from {string} and {int}")
	public void user_should_select_the_date_and_time_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String orderInputDate = testData.get(RowNumber).get("OrderInputDate");
		String orderInputTime = testData.get(RowNumber).get("OrderInputTime");
		orderinfo.selectOrderTime(orderInputDate,orderInputTime);
	}
	@When("User should click on Confirm CTA")
	public void user_should_click_on_confirm_cta() {
	    orderinfo.clickOnConfirmCTA();
	}
	@Then("User should validate order details in home page")
	public void user_should_validate_order_details_in_home_page() {
		homePage.verifyOrderConfirmation();
	   
	}


	
	
}
