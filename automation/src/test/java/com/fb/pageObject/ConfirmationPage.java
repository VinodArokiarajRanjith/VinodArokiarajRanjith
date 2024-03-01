package com.fb.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConfirmationPage extends Utilities {
	
	@AndroidFindBy(accessibility = "confirmation")
	@FindBy(id="confirmation")
	private WebElement lbl_confirmation;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderhelper/we-got")
	@FindBy(name="fbrorderhelper/we-got")
	private WebElement lbl_weHaveGot;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderhelper/seeyousoon")
	@FindBy(name="fbrorderhelper/seeyousoon")
	private WebElement lbl_seeYouSoon;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/confirmation/readyTime")
	@FindBy(name="confirmation/readyTime")
	private WebElement lbl_estimatedTime;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/confirmation/pickupLocation")
	@FindBy(name="confirmation/pickupLocation")
	private WebElement lbl_pickupLocationText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/confirmation/locationName")
	@FindBy(name="confirmation/locationName")
	private WebElement lbl_restaurantNameText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/storeStatus/status")
	@FindBy(name="storeStatus/status")
	private WebElement lbl_restaurantOpenTimeText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/confirmation/locationName")
	@FindBy(name="confirmation/locationName")
	private WebElement lbl_addressText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/Get-Directions")
	@FindBy(name="fbrstoredetailsmodal/Get-Directions")
	private WebElement btn_getDirections;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/callRestaurant")
	@FindBy(name="fbrstoredetailsmodal/callRestaurant")
	private WebElement btn_callRestaurant;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/rewardsCard/title")
	@FindBy(name="rewardsCard/title")
	private WebElement lbl_youEarnedText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/rewardsCard/earnedpts")
	@FindBy(name="rewardsCard/earnedpts")
	private WebElement lbl_earningPoints;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/rewardsCard/viewRewards")
	@FindBy(name="rewardsCard/viewRewards")
	private WebElement btn_viewRewards;
	
	@AndroidFindBy(accessibility = "Order Details")
	@FindBy(name="fbrconfirmation/orderdetailsaccord")
	private WebElement lbl_orderDetailsText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrconfirmation/orderId")
	@FindBy(name="fbrconfirmation/orderId")
	private WebElement lbl_orderNumberText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrconfirmation/created")
	@FindBy(name="fbrconfirmation/created")
	private WebElement lbl_orderedTime;
	
	@AndroidFindBy(accessibility = "Your Order")
	@FindBy(name="fbrconfirmation/accordian")
	private WebElement lbl_yourOrder;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrFoodOrderCard/product-name")
	@FindBy(name="fbrFoodOrderCard/product-name")
	private WebElement lbl_itemName;//use inside method as list<webelement>

	@AndroidFindBy(accessibility = "Payment Info")
	@FindBy(name="fbrconfirmation/fbrconfirmation.paymentInfofbrconfirmation.expanded")
	private WebElement lbl_paymentInfo;
	
    // Delivery
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliverycard/delivery-location")
	@FindBy(name="fbrconfirmation/orderId")
	private WebElement lbl_deliveryLocationText;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/confirmation/yourMoes")
	@FindBy(name="fbrconfirmation/created")
	private WebElement lbl_yourMoeRestaurantText;
	
	

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public ConfirmationPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	public void validateConfirmationTopText() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		WaitVisibilityOfElement(lbl_confirmation);
		if (lbl_confirmation.isDisplayed() == true)
			logging(condition.pass, "The User Navigated to CONFIRMATION page as expected");
		else
			logging(condition.warning, "The User not Navigated to CONFIRMATION page");
		
		String txt_weHaveGot = lbl_weHaveGot.getAttribute(strProperty);
		if (lbl_weHaveGot.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_weHaveGot + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: WE VE GOT is not displayed in Confirmation page as expected" );
		
		String txt_seeYouSoon = lbl_seeYouSoon.getAttribute(strProperty);
		if (lbl_seeYouSoon.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_seeYouSoon + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: WE VE GOT is not displayed in Confirmation page as expected" );
		
		String txt_estimatedTime = lbl_estimatedTime.getAttribute(strProperty);
		if (lbl_estimatedTime.isDisplayed() == true)
			logging(condition.pass,"The Ordered Time: " + txt_estimatedTime + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Ordered Time is not displayed in Confirmation page as expected" );
		
		String txt_pickupLocationText = lbl_pickupLocationText.getAttribute(strProperty);
		if (lbl_pickupLocationText.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_pickupLocationText + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: PICKUP LOCATION is not displayed in Confirmation page as expected" );
	}
	
	public String validateRestaurantName() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		String txt_restaurantNameText = lbl_restaurantNameText.getAttribute(strProperty);
		if (lbl_restaurantNameText.isDisplayed() == true)
			logging(condition.pass,"The Restaurant Name: " + txt_restaurantNameText + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Restaurant Name is not displayed in Confirmation page as expected" );
		return txt_restaurantNameText;
	}
	
	public String validateAddress() {
		String strProperty = "text";
	if (osName.equalsIgnoreCase("IOS"))
		strProperty = "label";
	String txt_addressText = lbl_addressText.getAttribute(strProperty);
	if (lbl_addressText.isDisplayed() == true)
		logging(condition.pass,"The Address: " + txt_addressText + " is displayed in Confirmation page as expected");
	else
		logging(condition.warning,"The Address is not displayed in Confirmation page as expected" );
	return txt_addressText;

	}
	
	public String validateEarnedPoints() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		String txt_yourEarned = lbl_youEarnedText.getAttribute(strProperty);
		if (lbl_youEarnedText.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_yourEarned + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: YOU EARNED is not displayed in Confirmation page as expected" );
		
		String txt_earningPoints = lbl_earningPoints.getAttribute(strProperty);
		if (lbl_earningPoints.isDisplayed() == true)
			logging(condition.pass,"The Earned Points: " + txt_earningPoints + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Earned Points is not displayed in Confirmation page as expected" );
		ScrollToText("Total");
		String txt_viewRewards = btn_viewRewards.getAttribute(strProperty);
		if (btn_viewRewards.isDisplayed() == true)
			logging(condition.pass,"The Button: " + txt_viewRewards + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Button: VIEW REWARDS is not displayed in Confirmation page as expected" );
		return txt_earningPoints;
	}
	
	public void validateOrderDetails() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		ScrollToText("Subtotal");
		String txt_orderDetailsText = lbl_orderDetailsText.getAttribute(strProperty);
		if (lbl_orderDetailsText.isDisplayed() == true)
			logging(condition.pass,"The Header: " + txt_orderDetailsText + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Header: Order Details is not displayed in Confirmation page as expected" );
	}
	
	public String validateOrderNumber() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		ScrollToText("Subtotal");
		String txt_orderNumberText = lbl_orderNumberText.getAttribute(strProperty);
		if (lbl_orderNumberText.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_orderNumberText + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Order Number is not displayed in Confirmation page as expected" );
		return txt_orderNumberText;
	}
	
	public String validateOrderDate() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		ScrollToText("Subtotal");
		String txt_orderedTime = lbl_orderedTime.getAttribute(strProperty);
		if (lbl_orderedTime.isDisplayed() == true)
			logging(condition.pass,"The Ordered Date: " + txt_orderedTime + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Order Date is not displayed in Confirmation page as expected" );
		return txt_orderedTime;
	}
	
	public ArrayList<String> validateItemName() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		List<WebElement> lst_itemName = null;
	//	ScrollToText("Payment Info");
		ArrayList<String> itemName = new ArrayList<String>();
		String txt_yourOrder = lbl_yourOrder.getAttribute(strProperty);
		if (lbl_yourOrder.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_yourOrder + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: Your Order is not displayed in Confirmation page as expected" );
	
		if (!osName.equalsIgnoreCase("IOS"))
		lst_itemName = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrFoodOrderCard/product-name"));
		else
		lst_itemName = driver.findElements(By.name("fbrFoodOrderCard/product-name"));
		
		for (int i = 0; i < lst_itemName.size(); i++) {
			String txt_itemName = lst_itemName.get(i).getAttribute(strProperty);
			if (lst_itemName.get(i).isDisplayed() == true)
				logging(condition.pass,"The ITEM: " + txt_itemName + " is displayed in Confirmation page as expected");
			else
				logging(condition.warning,"The ITEM is not displayed in Confirmation page as expected" );
			itemName.add(txt_itemName);
		}
		
		return itemName;
	}
	
	
	public ArrayList<String> validateItemPrice() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "label";
		List<WebElement> lst_itemPrice = null;
		if (!osName.equalsIgnoreCase("IOS"))
			lst_itemPrice = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrFoodOrderCard/product-price"));
			else
			lst_itemPrice = driver.findElements(By.name("fbrFoodOrderCard/product-price"));
		ArrayList<String> itemPrice = new ArrayList<String>();
		for (int i = 0; i < lst_itemPrice.size(); i++) {
			String txt_itemPrice = lst_itemPrice.get(i).getAttribute(strProperty);
			if (lst_itemPrice.get(i).isDisplayed() == true)
				logging(condition.pass,"The ITEM PRICE: " + txt_itemPrice + " is displayed in Confirmation page as expected");
			else
				logging(condition.warning,"The ITEM PRICE is not displayed in Confirmation page as expected" );
			itemPrice.add(txt_itemPrice);
		}
		
		String txt_paymentInfo = lbl_paymentInfo.getAttribute(strProperty);
		if (lbl_paymentInfo.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_paymentInfo + " is displayed in Confirmation page as expected");
		else
			logging(condition.warning,"The Text: Payment Info is not displayed in Confirmation page as expected" );
		ScrollToText("Total");
     return itemPrice;
	}
	
	
	
	
}
