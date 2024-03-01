package com.fb.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.fb.Utilities.Utilities;
import com.fb.pageObject.DeliveryOrderDetailPages;
import com.fb.pageObject.FBsCommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeliveryOrderDetailSteps extends Utilities {

	DeliveryOrderDetailPages delivery = new DeliveryOrderDetailPages(driver);

	private static Logger logger = LogManager.getLogger(DeliveryOrderDetailSteps.class);

	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	@Given("Guest user launches the MoEs App")
	public void guest_user_launches_the_moes_app() {
		System.out.println("MoEs App Installed");
	}

	@Given("Verify Select Location Header is displayed")
	public void verify_select_location_header_is_displayed() {
		delivery.getSelectLocationHeader();
	}

	@Given("Back button and Map Icon is displayed")
	public void back_button_and_map_icon_is_displayed() {
		delivery.getBackArrow();
		delivery.getMapIcon();
	}

	@Given("Pickup tab is displayed")
	public void pickup_tab_is_displayed() {
		delivery.getPickupTab();
	}

	@Given("Enable Location Services button is displayed")
	public void enable_location_services_button_is_displayed() {
		delivery.getEnableLocationServicesButton();
	}

	@When("user switches to Delivery Screen")
	public void user_switches_to_delivery_screen() {
		delivery.SwitchToDeliveryScreen();

	}
	@When("the geo Location is performed from {string} and {int}")
	public void the_geo_location_is_performed_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		FBsCommonMethods cm = new FBsCommonMethods(driver);
		cm.locationService(geoLocation);
		waitFor(3000);
		delivery.getCloseModel(geoLocation);
	}

    @Then("enter a store locations on the search bar from {string} and {int}")
    public void enter_a_store_locations_on_the_search_bar_from_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
    	List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Location Search");
		delivery.getClickSearchBar(restaurant);
	
    }

    @Then("enter apartment and unit value on the field {string} and {int}")
    public void enter_apartment_and_unit_value_on_the_field_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
    	List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String updatedAptValue = testData.get(RowNumber).get("Value");
		delivery.getEnterAptUnitValue(updatedAptValue);
    	
    }

	@Then("auto suggested values are displayed then select the first value")
	public void auto_suggested_values_are_displayed_then_select_the_first_value() {
		// delivery.getClick1stSearchOption();

	}

	@Then("Does This Address Look Correct module will be displayed")
	public void does_this_address_look_correct_module_will_be_displayed() {

		delivery.getVerifyAddressModule();
		delivery.getVerifyOptional();
	}

	@Then("delivery address is displayed")
	public void delivery_address_is_displayed() {
		delivery.verifyDeliveryAddress();
	}

	@Then("Add New Address CTA is displayed")
	public void add_new_address_cta_is_displayed() {
		delivery.getAddNewAddress();
	}

	@Then("Sign Up To Save Address Link is displayed")
	public void sign_up_to_save_address_link_is_displayed() {
		delivery.getSignUpToSaveAddress();
	}

	@Then("tap on Deliver Here CTA it will navigate to Home Screen")
	public void tap_on_deliver_here_cta_it_will_navigate_to_home_screen() {
		delivery.getClickDeliverHere();

	}

	@Then("verify Home header is displayed")
	public void verify_home_header_is_displayed() {
		delivery.getHomeHeader();
	}

	@Then("verify Store location and ASAP is displayed")
	public void verify_store_location_and_asap_is_displayed() {
		delivery.getLastDeliveryLocation();

	}

	@Then("user tap on Change CTA on the top order details screen")
	public void user_tap_on_change_cta_on_the_top_order_details_screen() {
		delivery.getClickChangeCTA();

	}

	@Then("verify Order Info screen is displayed")
	public void verify_order_info_screen_is_displayed() {
		delivery.getVerifyOrderInfoHeader();

	}

	@Then("Delivery Address Title is displayed")
	public void delivery_address_title_is_displayed() {
		delivery.getDeliveryAddressTitle();
	}

	@Then("Schedule For Title is displayed")
	public void schedule_for_title_is_displayed() {
		delivery.getScheduleFor();
	}

	@Then("tap on Confirm CTA on bottom of the screen")
	public void tap_on_confirm_cta_on_bottom_of_the_screen() {
		delivery.getClickConfirm();

	}

	@Then("click on delivery edit option in the order info screen")
	public void click_on_delivery_edit_option_in_the_order_info_screen() {
		delivery.getClickEditOption();

	}

	@Then("its navigate back to delivery address screen and tap close icon on the search bar")
	public void its_navigate_back_to_delivery_address_screenand_tap_close_icon_on_the_search_bar() {
		delivery.getClickSearchIcon();
		delivery.getClickCloseOption();
	}

	@Then("user able to search new delivery address")
	public void user_able_to_search_new_delivery_address() {

		// delivery.getClickSearchBarAgain();
	}

	@Then("auto suggested values are displayed then select the second value")
	public void auto_suggested_values_are_displayed_then_select_the_second_value() {
		// delivery.getClickSearchBarAgain();
	}

	@Then("verify updated Store location and ASAP is displayed")
	public void verify_updated_store_location_and_asap_is_displayed() {
		delivery.getLastDeliveryLocation();
	}

	@Then("tap on later option and time fiels should be displayed")
	public void tap_on_later_option_and_time_fiels_should_be_displayed() {
		delivery.getClickLaterOption();
	}

	@Then("scheduled date and time should be displayed on home screen")
	public void scheduled_date_and_time_should_be_displayed_on_home_screen() {
		delivery.getVerifyScheduledTime();
	}

	@When("user click on Enable Location Services button")
	public void user_click_on_enable_location_services_button() {
		delivery.getClickEnableLocationServices();
	}

	@When("geo location permisson modal is displayed")
	public void geo_location_permisson_modal_is_displayed() {
		delivery.getVerifyGeoPermission();
	}

	@Then("user click on While using the app option")
	public void user_click_on_while_using_the_app_option() {
		delivery.getClickWhileUsingApp();
		delivery.getClickOnlyThisTime();
	}

	@Then("user switches to Delivery Tab")
	public void user_switches_to_delivery_tab() {
		delivery.SwitchToDeliveryScreen();
	}

	@Then("Sorry You Are Out Of The Delivery Range Modal is diplayed")
	public void sorry_you_are_out_of_the_delivery_range_modal_is_diplayed() {
		delivery.getVerifyOutOfDeliveryRange();
	}

	@Then("verify Change to Pickup button is diplayed")
	public void verify_change_to_pickup_button_is_diplayed() {
		delivery.getVerifyChangeToPickUp();
	}

	@Then("verify Try Another Address button is diplayed")
	public void verify_try_another_address_button_is_diplayed() {
		delivery.getVerifyTryAnotherAddress();
	}

	@Then("click Cancel icon on the modal")
	public void click_cancel_icon_on_the_modal() {
		delivery.getClickCancelIcon();
	}

	@Then("verify Find My Location button is displayed")
	public void verify_find_my_location_button_is_displayed() {
		delivery.getVerifyFindMyLocation();
	}

	@Then("verify Sorry You Are Out Of The Delivery Range Modal functionalities")
	public void verify_sorry_you_are_out_of_the_delivery_range_modal_functionalities() {
		delivery.clickFindMyLocation();
		waitFor(3000);
		delivery.clickChangeToPickUp();
		delivery.getSelectLocationHeader();
		waitFor(2000);
		delivery.SwitchToDeliveryScreen();
		waitFor(2000);
		delivery.clickTryAnotherAddress();
		delivery.clickSearchBar();
	}

	@Then("verify Sorry You Are Out Of The Delivery Range Modal and navigations")
	public void verify_sorry_you_are_out_of_the_delivery_range_modal_and_navigations() {
		delivery.verifyOutOfDeliveyRangeMessage();
		delivery.verifyOutOfDeliveyRangeSubMessage();
		delivery.verifyStoreTiming();
		delivery.verifyPickUpHereCTA();
		delivery.verifySeeMoreRestaurantLink();
		delivery.clickClose();

	}

}
