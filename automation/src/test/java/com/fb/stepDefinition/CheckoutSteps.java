package com.fb.stepDefinition;

import java.util.List;
import java.util.Map;
import com.fb.Utilities.Utilities;
import com.fb.pageObject.CartPage;
import com.fb.pageObject.CheckoutPage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.RestaurantInfoPage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends Utilities {

	FBsCommonMethods cm = new FBsCommonMethods(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
    CartPage cp = new CartPage(driver);
    SignInPage sp = new SignInPage(driver);
    CheckoutPage ck = new CheckoutPage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();
	
	@When("user lands on HomePage then user should select AddProduct CTA and selects a item from {string} and {int}")
	public void user_lands_on_home_page_then_user_should_select_add_product_cta_and_selects_a_item_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String item = testData.get(RowNumber).get("Item");
			cp.clickAddProductAndAddItem(item);
	}
	
	@Then("user should select a pickup location from {string} and {int}")
	public void user_should_select_a_pickup_location_location_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String location = testData.get(RowNumber).get("Location Search");
		cm.searchAndSelectLocation(location);
		cm.selectRestaurantName(restaurant);
		cm.selectLocationFromRestaurantInfoPage();

	}
	
	@Then("user should validate the delvery location as pickup if not user should change it to pickup location from {string} and {int}")
	public void user_should_validate_the_delvery_location_as_pickup_if_not_user_should_change_it_to_pickup_location_from_and(String SheetName, int RowNumber) throws Throwable  {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		String location = testData.get(RowNumber).get("Location Search");
		 cm.selectLocationIfNotSelected(userType, location, restaurant);
		 cm.changeToPickUpLocationIfNotSelected(location, restaurant);
	}


	
	@When("click Chekcout button then navigates to chekcout page")
	public void click_chekcout_button_then_navigates_to_chekcout_page() {
	   ck.clickCheckoutButton();
	}
	@Then("validates the Header, Change button, back button, delivery type, schedule type fields in checkout page")
	public void validates_the_header_change_button_back_button_delivery_type_schedule_type_fields_in_checkout_page() {
	    ck.commonCheckoutFieldValidation();
	}
	@Then("validate and enter values in FirstName, LastName, Email and PhoneNumber from {string} and {int}")
	public void validate_and_enter_values_in_first_name_last_name_email_and_phone_number(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String firstName = testData.get(RowNumber).get("FirstName");
		String userType = testData.get(RowNumber).get("UserType");
		String lastName = testData.get(RowNumber).get("LastName");
		String email = testData.get(RowNumber).get("Email");
		String phoneNumber = testData.get(RowNumber).get("PhoneNumber");
	    ck.enterFirstAndLastName(firstName, lastName);
	    ck.enterEmailandPhone(userType, email, phoneNumber);
	}
	@Then("validate and Add Tip from {string} and {int}")
	public void validate_and_add_tip(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String tip = testData.get(RowNumber).get("Tip");
		ck.enterAddTip(tip);
	}
	@Then("user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for delivery")
	public void user_should_validate_the_subtotal_taxes_fees_include_utensils_add_promo_code_total_amount_and_place_order_cta_should_display_at_bottom_for_delivery() {
      ck.validateSubTotalFields();
      ck.checkoutDeliveryValidation();
	}
	
	@Then("user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup")
	public void user_should_validate_the_subtotal_taxes_fees_include_utensils_add_promo_code_total_amount_and_place_order_cta_should_display_at_bottom_for_pickup() {
      ck.validateSubTotalFields();
      ck.checkoutPickupValidation();
	}
	
	@Then("User clicks Inside")
	public void user_clicks_inside() {
		ck.clickInside();
	}
	
	@Then("User clicks Curbside")
	public void user_clicks_curbside() {
		ck.clickCurbside();
	}
	
	@Then("user should select the delivery location from {string} and {int}")
	public void user_should_select_the_delivery_location_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Delivery Location");
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		String userType = testData.get(RowNumber).get("UserType");
		cm.searchAndSelectDeliveryLocation(location, geoLocation, userType);
	}
	
	@Then("user should validates the Restaurant information")
	public void user_should_validates_the_restaurant_information() {
	    ck.validateRestaurantInformation();
	}
	
	@Then("user should select Leave at Door and enter some values in Add Note text field")
	public void user_should_select_leave_at_door_and_enter_some_values_in_add_note_text_field() {
		 ck.validateAddNote();
		ck.clickleaveAtDoor();
	}
	
	@Then("user should select Hand It to me and enter some values in Add Note text field")
	public void user_should_select_hand_it_to_me_and_enter_some_values_in_add_note_text_field() {
		 ck.validateAddNote();
		ck.clickHandItToMe();
	}
	
	@Given("user navigates to Home page and should change and select delivery location from {string} and {int}")
	public void user_navigates_to_home_page_and_should_change_and_select_delivery_location_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		String location = testData.get(RowNumber).get("Delivery Location");
		cm.cheangeDeliveryLocationforSignedInUser(location, geoLocation, userType);
	
	}
	
}
