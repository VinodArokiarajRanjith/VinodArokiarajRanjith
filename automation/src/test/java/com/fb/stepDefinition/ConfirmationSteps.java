package com.fb.stepDefinition;

import java.util.ArrayList;
import java.util.Iterator;

import com.fb.Utilities.Utilities;
import com.fb.pageObject.CartPage;
import com.fb.pageObject.CheckoutPage;
import com.fb.pageObject.ConfirmationPage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.pageObject.HomePage;
import com.fb.pageObject.OrderInfoPage;
import com.fb.pageObject.RestaurantInfoPage;
import com.fb.pageObject.SignInPage;

import io.cucumber.java.en.Then;

public class ConfirmationSteps extends Utilities{

	FBsCommonMethods cm = new FBsCommonMethods(driver);
	HomePage hs = new HomePage(driver);
	RestaurantInfoPage ri = new RestaurantInfoPage(driver);
	OrderInfoPage oi = new OrderInfoPage(driver);
    CartPage cp = new CartPage(driver);
    SignInPage sp = new SignInPage(driver);
    CheckoutPage ck = new CheckoutPage(driver);
    ConfirmationPage cf = new ConfirmationPage(driver);
	static String osName = driver.getCapabilities().getCapability("platformName").toString();
	
	
	@Then("user should click placeOrder")
	public void user_should_click_place_order() {
		ck.clickPlaceOrder();
	}
	@Then("user should validate the Confirmation header, we have Got, see you soon text and estimated time")
	public void user_should_validate_the_confirmation_header_we_have_got_see_you_soon_text_and_estimated_time() {
	    cf.validateConfirmationTopText();
	}
	@Then("user should validate Pickup location header, restaurant name, address and restaurant status")
	public void user_should_validate_pickup_location_header_restaurant_name_address_and_restaurant_status() {
	    String validateRestaurantName = cf.validateRestaurantName();
	    String validateAddress = cf.validateAddress();
	    System.out.println(validateRestaurantName);
	    System.out.println(validateAddress);
	    
	}
	@Then("user should validate you earned text, rewar points and view rewards")
	public void user_should_validate_you_earned_text_rewar_points_and_view_rewards() {
	    String validateEarnedPoints = cf.validateEarnedPoints();
	    System.out.println(validateEarnedPoints);
	}
	@Then("user should validate order details, order number and order date")
	public void user_should_validate_order_details_order_number_and_order_date() {
	    cf.validateOrderDetails();
	    String validateOrderNumber = cf.validateOrderNumber();
	    String validateOrderDate = cf.validateOrderDate();
	    System.out.println(validateOrderNumber);
	    System.out.println(validateOrderDate);
	}
	@Then("user should validate your order, item name and item price")
	public void user_should_validate_your_order_item_name_and_item_price() {
	   ArrayList<String> validateItemName = cf.validateItemName();
	   ArrayList<String> validateItemPrice = cf.validateItemPrice();
	   for (int i = 0; i < validateItemName.size(); i++) {
		System.out.println(validateItemName.get(i));
		System.out.println(validateItemPrice.get(i));
	}
	}
	@Then("user should validate subtotal, TaxesAndFees, Tip and Total")
	public void user_should_validate_subtotal_taxes_and_fees_tip_and_total() {
	    ck.checkoutPickupValidation();
	}
	
	
}
