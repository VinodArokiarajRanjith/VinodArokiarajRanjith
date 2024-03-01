package com.fb.stepDefinition;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.fb.Utilities.Utilities;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.RestaurantInfoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PickupStoreSearchStepDefinition extends Utilities {
	private static Logger logger = LogManager.getLogger(PickupStoreSearchStepDefinition.class);
	FBsCommonMethods cm = new FBsCommonMethods(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	@Given("^user launched the app and logged in$")
	public void user_launched_the_app_and_logged_in() throws Throwable {
		log("Application launched and logged in successfully");
	}

	
	@Then("^validating the text and buttons present in SelectLocation page from  \"([^\"]*)\" and (\\d+)$")
	public void validating_the_text_and_buttons_present_in_SelectLocation_page_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String[] values = testData.get(RowNumber).get("Value").split("-");
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		String exp_selectLocation = values[0].trim();
		String exp_pickUp = values[1].trim();
		String exp_enableLocation = values[3].trim();
		if (uiValidation.equalsIgnoreCase("YES")) 
		hs.selectLocationPagePickupTabFieldValidation(exp_selectLocation, exp_pickUp, exp_enableLocation);
	}

	@Then("^validating the text and buttons present in DeliveryAddress pagefrom  \"([^\"]*)\" and (\\d+)$")
	public void validating_the_text_and_buttons_present_in_DeliveryAddress_pagefrom_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String[] values = testData.get(RowNumber).get("Value").split("-");
		String exp_enableLocation = values[3].trim();
		String exp_delivery = values[4].trim();
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.equalsIgnoreCase("YES")) 
		hs.selectLocationDeliveryTabFieldValidation(exp_delivery, exp_enableLocation);
	}
	
	@When("^The Geo Location action is performed from \"([^\"]*)\" and (\\d+)$")
	public void the_Geo_Location_action_is_performed_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		cm.geoLocationService(geoLocation);
	}
	
	@When("^Location is searched and selected from \"([^\"]*)\" and (\\d+)$")
	public void location_is_searched_and_selected_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		cm.searchAndSelectLocation(location);
	}
	
	@When("^selects UserType from \"([^\"]*)\" and (\\d+)$")
	public void selects_UserType_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		if (userType.trim().equals("GuestUser".trim())) 
			log("User selected guestUser in TestData and logged in as GuestUser as expected");
		else {
			cm.signingInFromSavedTab();
			log("User selected SignedIn User in TestData and logged in as SignedIn User as expected");
		}
		
	}
	
	@When("^click the Restaurant name or more info link from \"([^\"]*)\" and (\\d+)$")
	public void click_the_Restaurant_name_or_more_info_link_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		cm.selectRestaurantName(restaurant);
	}
	
	@Then("^validate the fields in Restaurant Info page from \"([^\"]*)\" and (\\d+) and functionality validation of favorite and drop up button$")
	public void validate_the_fields_in_Restaurant_Info_page_from_and_and_functionality_validation_of_favorite_and_drop_up_button(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.equalsIgnoreCase("YES") & !osName.equalsIgnoreCase("IOS")) 
		ri.restaurantInfoPageFieldValidation(restaurant,userType);
		
	}
	
	@Then("^click Select Location button present in restaurant info page from \"([^\"]*)\" and (\\d+) and navigates to HomePage$")
	public void click_Select_Location_button_present_in_restaurant_info_page_from_and_and_navigates_to_HomePage(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		if (userType.equalsIgnoreCase("GuestUser")) 
			cm.selectLocationFromRestaurantInfoPage();
		else {
			ScrollAndClickText("ORDER NOW");
			}
			
	}
	
	@Then("^validate the fields present in HomePage from \"([^\"]*)\" and (\\d+)$")
	public void validate_the_fields_present_in_HomePage_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.equalsIgnoreCase("YES") & !osName.equalsIgnoreCase("IOS")) 
		hs.homePageFieldValidation(restaurant);
	}
	
	@Then("^validate the fields in OrderInfo page from \"([^\"]*)\" and (\\d+)$")
	public void validate_the_fields_in_OrderInfo_page(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String uiValidation = testData.get(RowNumber).get("UiValidation");
		if (uiValidation.equalsIgnoreCase("YES")) 
		oi.orderInfoPageFieldValidation();
	    oi.clicksConfirmButton();
	}
	
	
	@When("^The Geo Location is performed from \"([^\"]*)\" and (\\d+)$")
	public void the_Geo_Location_is_performed_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String geoLocation = testData.get(RowNumber).get("GeoLocation");
		cm.geoLocationService(geoLocation);
	}

	@Then("^The Location is searched and selected from \"([^\"]*)\" and (\\d+)$")
	public void the_Location_is_searched_and_selected_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		cm.searchAndSelectLocation(location);
	}

	@Then("^selects UserTypes from \"([^\"]*)\" and (\\d+)$")
	public void selects_UserTypes_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String userType = testData.get(RowNumber).get("UserType");
		if (userType.trim().equals("GuestUser".trim())) 
			log("User selected guestUser in TestData and logged in as GuestUser as expected");
		else {
			cm.signingInFromSavedTab();
			log("User selected SignedIn User in TestData and logged in as SignedIn User as expected");
		}
	}
	

	@Then("^click the Restaurant name or moreInfo link from \"([^\"]*)\" and (\\d+)$")
	public void click_the_Restaurant_name_or_moreInfo_link_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		cm.selectRestaurantName(restaurant);
	}

	@Then("^click Select Location button in restaurant info page from \"([^\"]*)\" and (\\d+) and navigates to HomePage$")
	public void click_Select_Location_button_in_restaurant_info_page_from_and_and_navigates_to_HomePage(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		if (userType.equalsIgnoreCase("GuestUser")) 
			cm.selectLocationFromRestaurantInfoPage();
		else {
			ScrollAndClickText("ORDER NOW");
		}
		
	}

	@When("^click edit button$")
	public void click_edit_button() throws Throwable {
	oi.clickEditButton();
	}

	@Then("^User navigates to Select Location Page$")
	public void user_navigates_to_Select_Location_Page() throws Throwable {
    log("User Navigated to SELECT LOCATION page as expected");
	}

	@Then("^User search a location and select a restaurant Name or MoreInfo from \"([^\"]*)\" and (\\d+)$")
	public void user_search_a_location_and_select_a_restaurant_Name_or_MoreInfo_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String updatedLocation = testData.get(RowNumber).get("Updated Location");
		String updatedRestaurant = testData.get(RowNumber).get("Updated Restaurant");
		cm.searchAndSelectLocation(updatedLocation);
	    cm.selectRestaurantName(updatedRestaurant);
	}

	@Then("^selects order now and navigates to OrderInfo Page$")
	public void selects_order_now_and_navigates_to_OrderInfo_Page() throws Throwable {
		ScrollAndClickText("ORDER NOW");
	}

	@Then("^validate the updated restaurant Name from \"([^\"]*)\" and (\\d+)$")
	public void validate_the_updated_restaurant_Name_from_and(String SheetName, int RowNumber) throws Throwable {
	List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
	String updatedRestaurant = testData.get(RowNumber).get("Updated Restaurant");
	oi.validateRestaurantName(updatedRestaurant);
	}

	@When("^clicks Confirm$")
	public void clicks_Confirm() throws Throwable {
		oi.clicksConfirmButton();
	}
	
	@Then("^User navigates to HomePage$")
	public void user_navigates_to_HomePage() {
		hs.validateHomePage();
	}
	
	@When("^user searches a location in search bar from \"([^\"]*)\" and (\\d+)$")
	public void user_searches_a_location_in_search_bar_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String location = testData.get(RowNumber).get("Location Search");
		System.out.println(SheetPath);
		cm.searchAndSelectLocation(location);
	}

	@When("^user clicks a favorite icon of a restaurant then the Action required popup should display$")
	public void user_clicks_a_favorite_icon_of_a_restaurant_then_the_Action_required_popup_should_display() throws Throwable {
	ri.clickFavoriteIconAndVerifyPopup();
	}

	@When("^navigates to map view$")
	public void navigates_to_map_view() throws Throwable {
		cm.clickMapView();
	}

	@When("^user clicks a restaurant Name or MoreInfo link from \"([^\"]*)\" and (\\d+)$")
	public void user_clicks_a_restaurant_Name_or_MoreInfo_link_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		if (!osName.equalsIgnoreCase("IOS")) 
		cm.selectRestaurantName(restaurant);
	}	
	
	@When("^user clicks a favorite icon of a restaurant then the Action required popup should display in restaurantInfo page$")
	public void user_clicks_a_favorite_icon_of_a_restaurant_then_the_Action_required_popup_should_display_in_restaurantInfo_page() throws Throwable {
	if (!osName.equalsIgnoreCase("IOS")) 
		ri.clickFavoriteIconAndVerifyPopup();
	}
	
	
	@Given("user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  {string} and {int}")
	public void user_clicked_change_button_and_clicked_edit_button_then_user_navigated_to_select_location_from_and(String SheetName, int RowNumber) throws Throwable {
		List<Map<String,String>> testData = reader.getData(SheetPath, SheetName);
		String restaurant = testData.get(RowNumber).get("Restaurant");
		String userType = testData.get(RowNumber).get("UserType");
		String location = testData.get(RowNumber).get("Location Search");
		hs.editLocation(userType,location,restaurant);
	}
	
	@When("user clicks change button then navigates to OrderInfo page for Guest User")
	public void user_clicks_change_button_then_navigates_to_order_info_page_for_guest_user() {
		cm.clickChangeButtonGuestUser();
	}
	
	@When("user clicks change button then navigates to OrderInfo page for Signed In User")
	public void user_clicks_change_button_then_navigates_to_order_info_page_for_signed_in_user() {
		cm.clickChangeButtonSignedInUser();
	}
	
}
