package com.fb.stepDefinition;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.CartPage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.RestaurantInfoPage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefinition extends Utilities {

	private static Logger logger = LogManager.getLogger(CartStepDefinition.class);
	FBsCommonMethods cm = new FBsCommonMethods(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
    CartPage cp = new CartPage(driver);
    SignInPage sp = new SignInPage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	@Given("user launched the app")
	public void user_launched_the_app() {
		assertTrue("User launched the MoEs app", true);
	}

	@When("user selected a Pickup location from  {string} and {int}")
	public void user_selected_a_pickup_location_then_navigated_to_home_page_from_and(String SheetName, int RowNumber) throws Throwable{
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		cm.searchAndSelectLocation(location);
	}
	
	@When("logged in as signed in or guest user for delivery flow from  {string} and {int}")
	public void logged_in_as_signed_in_or_guest_user_for_delivery_flow_from_and(String SheetName, int RowNumber) throws Throwable{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		if (userType.trim().equals("GuestUser".trim())) 
			log("User selected guestUser in TestData and logged in as GuestUser as expected");
		else {
			String location = testData.get(RowNumber).get("Location Search");
			if (geoLocation.equalsIgnoreCase("don'tAllow")) 
			cm.searchAndSelectLocation(location);
			cm.signingInFromSavedTab();
			log("User selected SignedIn User in TestData and logged in as SignedIn User as expected");
		}
	}
	
	@When("user selected a delivery location from  {string} and {int}")
	public void user_selected_a_delivery_location_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Delivery Location");
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		String userType = testData.get(RowNumber).get("UserType");
		cm.searchAndSelectDeliveryLocation(location, geoLocation, userType);
	}

	@When("logged in as signed in or guest user from  {string} and {int}")
	public void logged_in_as_signed_in_or_guest_user_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		String password = testData.get(RowNumber).get("Password");
		String userType = testData.get(RowNumber).get("UserType");
		sp.signIn(userType, email, password);
	}
	
	@Then("validate DUPLICATE button from {string} and {int}")
	public void validate_duplicate_button(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.trim().equalsIgnoreCase("YES".trim()))
	   cp.validateDuplicate();
	   else 
		   log("The UI validation value is no in testdata, so UI validation is skiped here");
	}
	@Then("validate EDIT button from {string} and {int}")
	public void validate_edit_button(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.trim().equalsIgnoreCase("YES".trim()))
	    cp.validateEdit();
		 else 
			   log("The UI validation value is no in testdata, so UI validation is skiped here");
	}
	@Then("validate REMOVE button from {string} and {int}")
	public void validate_remove_button(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.trim().equalsIgnoreCase("YES".trim()))
	    cp.validateRemove();
		 else 
			   log("The UI validation value is no in testdata, so UI validation is skiped here");
	}
	
	@When("user clicks SELECT LOCATION of a restaurant from {string} and {int}")
	public void user_clicks_select_location_of_a_restaurant_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		if (userType.trim().equals("GuestUser".trim()))
		cm.selectRestaurant(restaurant);
		else
		cm.clickOrderNow(restaurant);
	}


	@And("user clicks Cart icon then user should navigates to Cart page from {string} and {int}")
	public void user_clicks_cart_icon_then_user_should_navigates_to_cart_page(String SheetName, int RowNumber) throws InvalidFormatException, IOException{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		String location = testData.get(RowNumber).get("Location Search");
		if (userType.trim().equalsIgnoreCase("GuestUser".trim())) {
			cm.searchAndSelectLocation(location);
			cm.selectRestaurantName(restaurant);
			cm.selectLocationFromRestaurantInfoPage();
		}
		 else 
		cm.selectLocationIfNotSelected(userType, location, restaurant);
		if (uiValidation.trim().equalsIgnoreCase("YES".trim()))
			  cp.clickCartButton();
		 else 
			   log("The UI validation value is no in testdata, so UI validation is skiped here");
	  	
	}
	
	@When("user clicks Cart icon then user should navigates to Cart page after add product")
	public void user_clicks_cart_icon_then_user_should_navigates_to_cart_page_after_add_product() {
		cp.clickCartButton();
	}

	@Then("user should do the field validation in empty cart page and clicks back button to navigates back to Home page from {string} and {int}")
	public void user_should_do_the_field_validation_in_empty_cart_page_and_clicks_back_button_to_navigates_back_to_home_page(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.trim().equalsIgnoreCase("YES".trim())) {
			cp.commonCartFieldValidation();
			cp.emptyCartFieldValidation();
			cp.clickBackButton();
		}
		 else 
			   log("The UI validation value is no in testdata, so UI validation is skiped here");
		
	}

	@When("user selects “Add Product” CTA then menu page should display and user should select a item from {string} and {int}")
	public void user_selects_add_product_cta_then_menu_page_should_display_and_user_should_select_a_item(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String item = testData.get(RowNumber).get("Item");
		cp.clickAddProductAndAddItem(item);
	}

	@Then("user should navigate to HomePage and in cart icon should update the number of count added to cart")
	public void user_should_navigate_to_home_page_and_in_cart_icon_should_update_the_number_of_count_added_to_cart() {
		cp.validateCartIconCount();
	}

	@Then("user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields")
	public void user_should_validates_the_field_in_cart_page_order_types_schedule_type_change_cta_cart_cta_and_other_fields() {
		cp.commonCartFieldValidation();
	}

	@Then("verify the added item and price")
	public void verify_the_added_item_and_price() {
		cp.itemAddedCartValidatoin();
	}

	@Then("user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom")
	public void user_should_validate_the_subtotal_taxes_fees_include_utensils_and_add_promo_code() {
		cp.validateSubTotalFields();
	}


	@Then("user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed")
	public void user_clicks_taxes_fees_then_popup_should_display_and_breaking_fees_should_displayed_in_the_popup_when_user_clicks_x_then_popup_should_closed() {
       cp.validateTaxesAndFeesPopUp();
	}
	
	@Then("verify +, - and Remove button")
	public void verify_and_remove_button() {
	  cp.validateNonCustomizablecart();
	}
	
	@Given("user navigates to Home page and verify the delivery type if delivery type is pickup then user should change and select delivery location from {string} and {int}")
	public void user_navigates_to_home_page_and_verify_the_delivery_type_if_delivery_type_is_pickup_then_user_should_change_and_select_delivery_location(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		String location = testData.get(RowNumber).get("Delivery Location");
		cm.selectDeliveryLocation(location, geoLocation, userType);
	}
	
}
