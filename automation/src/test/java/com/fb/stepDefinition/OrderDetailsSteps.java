package com.fb.stepDefinition;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.fb.Utilities.Utilities;
import com.fb.pageObject.DeliveryOrderDetailPages;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.OrderDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderDetailsSteps extends Utilities {

	OrderDetailsPage orderDetails = new OrderDetailsPage(driver);
	DeliveryOrderDetailPages delivery = new DeliveryOrderDetailPages(driver);
	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);
private static Logger logger = LogManager.getLogger(OrderDetailsSteps.class);
	
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	
	@Given("the user launches the App")
	public void the_user_launches_the_app() {
		System.out.println("Moes app Launched");
	}
	@When("the Geo Location is performed from {string} and {int}")
	public void the_geo_location_is_performed_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		commonMethods.geoLocationService(geoLocation);
	}
	@When("select the user type from {string} and {int}")
	public void select_the_user_type_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		FBsCommonMethods cm = new FBsCommonMethods(driver);
		if (userType.trim().equals("GuestUser".trim())) 
			log("User selected guestUser in TestData and logged in as GuestUser as expected");
		else {
			cm.signingInFromSavedTab();
			log("User selected SignedIn User in TestData and logged in as SignedIn User as expected");
		}
	}
	@When("user Selected the location from {string} and {int}")
	public void user_selected_the_location_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		FBsCommonMethods commonMethods = new FBsCommonMethods(driver);
		commonMethods.searchAndSelectLocation(location);
		if(userType.trim().equals("GuestUser".trim()))
			commonMethods.selectRestaurant(restaurant);
		else{
			commonMethods.clickOrderNow(restaurant);
		}
	}

	@When("the user is on Order Info Overlay and Order Info header is displayed")
	public void the_user_is_on_order_info_overlay_and_order_info_header_is_displayed() {
		orderDetails.getClickChangeCTA();
		orderDetails.getVerifyOrderInfoHeader();
	}

	@When("Your Moms Restaurant Title is displayed")
	public void your_moms_restaurant_title_is_displayed() {
		orderDetails.getYourMoesRestaurant();
		orderDetails.getScheduleFor();
	}

	@Then("click on Pickup edit option in the order info screen")
	public void click_on_pickup_edit_option_in_the_order_info_screen() {
		orderDetails.getClickEdit();
	}

	@Then("its navigate back to Select Location screen under Nearby tab")
	public void its_navigate_back_to_select_location_screen_under_nearby_tab() {
		orderDetails.getVerifySelectLocationHeader();
	}

	@Then("user able to search new Pickup address when the location selected from {string} and {int}")
	public void user_able_to_search_new_pickup_address_when_the_location_selected_from_and(String SheetName,Integer RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Location Search");
		orderDetails.getClickSearchBar(restaurant);
	}

	@Then("tap on Order Now CTA and user will navigate to Order Info Overlay")
	public void tap_on_order_now_cta_and_user_will_navigate_to_order_info_overlay() {
		orderDetails.getClickOrderNowCTA();
	}

	@Then("verify updated Pickup Address is displayed")
	public void verify_updated_pickup_address_is_displayed() {
		orderDetails.getVerifyUpdatedPickUpAddress();
	}

	@Then("user switch pickup to Delivery tab")
	public void user_switch_pickup_to_delivery_tab() {
		orderDetails.getSwitchToDeliveryTab();
	}

	@Then("‘Changing to Delivery Could affect item availability and pricing’ popup is displayed")
	public void changing_to_delivery_could_affect_item_availability_and_pricing_popup_is_displayed() {

	}
	
	@Then("click on delivery edit option in the order info overlay")
	public void click_on_delivery_edit_option_in_the_order_info_overlay() {
		delivery.getClickEditOption();
	}

	@Then("user able to search new delivery address when the location selected from {string} and {int}")
	public void user_able_to_search_new_delivery_address_when_the_location_selected_from_and(String SheetName,Integer RowNumber) throws Throwable{
		orderDetails.getClickCloseOption();
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Location Search");
		delivery.getClickSearchBarAgain(restaurant);
	}

	@Then("enter apartment and unit address when the value get it from {string} and {int}")
	public void enter_apartment_and_unit_address_when_the_value_get_it_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String updatedAptValue = testData.get(RowNumber).get("Value");
		delivery.getEnterAptUnitValue(updatedAptValue);
	}

	@Then("tap on Deliver Here CTA and user will navigate to Order Info Overlay")
	public void tap_on_deliver_here_cta_and_user_will_navigate_to_order_info_overlay() {
		 delivery.getClickDeliverHere();
	}

	@Then("verify updated delivery Address is displayed")
	public void verify_updated_delivery_address_is_displayed() {
		orderDetails.getUpdatedDeliveryAddress();
	}

	@When("the user is on Home Screen and tap on Add Product CTA")
	public void the_user_is_on_home_screen_and_tap_on_add_product_cta() {
		orderDetails.getAddProduct();
	}

	@Then("select Moe Meat Moe Cheese Burrito product and tap on cart Icon")
	public void select_moe_meat_moe_cheese_burrito_product_and_tap_on_cart_icon() {
		orderDetails.getAddProductToCart();
		orderDetails.getClickCart();
	}

	@Then("scroll down and tap on Checkout CTA")
	public void scroll_down_and_tap_on_checkout_cta() {
		orderDetails.getVerifyMyCartHeader();
		orderDetails.getClickCheckout();
	}

	@Then("Checkout header is displayed")
	public void checkout_header_is_displayed() {
		orderDetails.verifyCheckoutHeader();
	}

	@Then("verify Pickup method as Inside \\/ Inside and Curbside \\/  Inside and DriveThru \\/ Inside, Curbside and DriveThru options")
	public void verify_pickup_method_as_inside_inside_and_curbside_inside_and_drive_thru_inside_curbside_and_drive_thru_options() {
		orderDetails.getVerifyYouAreAlmostThere();
		orderDetails.getVerifyPickupMethod();
		orderDetails.getVerifyInsideOption();
		orderDetails.getVerifyCurbsideOption();
	}

	@When("the user is on Home Screen and tap on Change CTA")
	public void the_user_is_on_home_screen_and_tap_on_change_cta() {
		delivery.getHomeHeader();
		delivery.getClickChangeCTA();
	}

	@Then("the Order Info Overlay and Order Info header is displayed")
	public void the_order_info_overlay_and_order_info_header_is_displayed() {
		delivery.getVerifyOrderInfoHeader();	
	}
	
	@Then("click edit CTA in the order info screen")
	public void click_edit_cta_in_the_order_info_screen() {
		orderDetails.getClickEditOptionForLogin();
	}
	
	@Then("its navigate back to delivery address screen and verify delivery address header is displayed")
	public void its_navigate_back_to_delivery_address_screen_and_verify_delivery_address_header_is_displayed() {
		orderDetails.getClickCloseOption();
		delivery.getDeliveryAddressHeader();
	}

	@Then("it’s a returning logged in user and able to see “Your Saved Addresses” with all the Saved address and Update CTA")
	public void it_s_a_returning_logged_in_user_and_able_to_see_your_saved_addresses_with_all_the_saved_address_and_update_cta() {
		orderDetails.getVerifySavedAddresses();
		orderDetails.getVerifyUpdateCTA();
	}

	@Then("user able to see “Recent Searches” with all the Recent address and Clear CTA")
	public void user_able_to_see_recent_searches_with_all_the_recent_address_and_clear_cta() {
		orderDetails.getVerifyRecentSearches();
		orderDetails.getVerifyClearCTA();
	}

	@When("the user clicks on Start Order")
	public void the_user_clicks_on_start_order() {
		orderDetails.getClickStartOrderCTA();
		orderDetails.getClickCloseOption();
		orderDetails.getClickStartOrderCTA();
	}

	@Then("the user should see Confirm Order Type Modal with the user’s last Order Type")
	public void the_user_should_see_confirm_order_type_modal_with_the_user_s_last_order_type() {
		orderDetails.getVerifyConfirmOrderTypeHeader();
		orderDetails.getVerifyLastOrderType();
		orderDetails.getVerifyLastOrderAddress();
	}

	@Then("verify Confirm CTA Is displayed")
	public void verify_confirm_cta_is_displayed() {
		orderDetails.getVerifyConfirmCTA();
	}

	@Then("verify Change CTA Is displayed")
	public void verify_change_cta_is_displayed() {
		orderDetails.getVerifyChangeCTA();
	}

	@Then("User should see Change CTA to change the order details, which will lead the user to Order Info Page")
	public void user_should_see_change_cta_to_change_the_order_details_which_will_lead_the_user_to_order_info_page() {
		orderDetails.clickChangeCTA();
		orderDetails.getClickConfirmCTA();
		orderDetails.getClickStartOrderCTA();
			
	}
	@Then("User should see Confirm CTA to confirm and use the last Order Details, which will lead user’s to Menu Page")
	public void user_should_see_confirm_cta_to_confirm_and_use_the_last_order_details_which_will_lead_user_s_to_menu_page() {
		orderDetails.ClickConfirmCTA();
		orderDetails.getVerifyMenuCartPage();
	}
	

}
