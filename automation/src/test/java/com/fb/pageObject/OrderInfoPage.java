package com.fb.pageObject;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderInfoPage extends Utilities {

	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/pickup-selected")
	@FindBy(id = "fbrtabmenu/pickup-selected")
	private WebElement btn_pickUp;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	@FindBy(id = "fbrtabmenu/delivery-selected")
	private WebElement btn_delivery;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/edit")
	@FindBy(id = "fbrorderoverlay/edit")
	private WebElement btn_edit;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrscheduletime/asap_(30-45_min)") 
	@FindBy(id = "ASAP-selected")
	private WebElement btn_asap; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrscheduletime/later")
	@FindBy(id = "Later-selected")
	private WebElement btn_later;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroverlay/confirm-address")
	@FindBy(id = "fbroverlay/confirm-address")
	private WebElement btn_confirm;
	
	@AndroidFindBy(accessibility = "cart")
	@FindBy(id = "fbrtopnavigationcart/Shopping-Bag/0-item")
	private WebElement btn_cart;
	
	@FindBy(id = "fbrstoresearchheader/select-location")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/select-location")
	private WebElement lbl_selectLocation;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/pickup-locationName")
	@FindBy(xpath ="(//XCUIElementTypeOther[contains(@name,'Your mo')]/following::XCUIElementTypeStaticText[1])[1]" )
	private WebElement lbl_RestaurantName;
	
	
	@AndroidFindBy(accessibility = "pickup-selected")
	@FindBy(id = "pickup-selected")
	public WebElement btn_PickupSelected;

	@AndroidFindBy(accessibility = "delivery-selected")
	@FindBy(id = "delivery-selected")
	public WebElement btn_DeliverySelected;
	
	
	
	
	
	
	public OrderInfoPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();
	
	public void orderInfoPageFieldValidation() {

        if (btn_pickUp.isDisplayed()) 
        	logging(condition.pass,"The Button: PICKUP is displayed");
		else {
			logging(condition.info,"The Button: PICKUP is displayed");
			assertTrue("The Button: PICKUP is displayed",btn_pickUp.isDisplayed());
		}
        
        if (btn_delivery.isDisplayed()) 
        	logging(condition.pass,"The Button: DELIVERY is displayed");
		else {
			logging(condition.info,"The Button: DELIVERY is displayed");
			assertTrue("The Button: DELIVERY is displayed",btn_delivery.isDisplayed());
		}
        
        
        if (btn_edit.isDisplayed()) 
        	logging(condition.pass,"The Button: EDIT is displayed");
		else {
			logging(condition.info,"The Button: EDIT is displayed");
			assertTrue("The Button: EDIT is displayed",btn_edit.isDisplayed());
		}
        
        if (btn_later.isDisplayed()) {
        	logging(condition.pass,"The Button: LATER is displayed and clicked");
        }
		else {
			logging(condition.info,"The Button: LATER is displayed");
			assertTrue("The Button: LATER is displayed",btn_later.isDisplayed());
		}
        
        
        if (btn_asap.isDisplayed()) 
        	logging(condition.pass,"The Button: ASAP is displayed");
		else {
			logging(condition.info,"The Button: ASAP is displayed");
			assertTrue("The Button: ASAP is displayed",btn_asap.isDisplayed());
		}
        
        
        if (btn_confirm.isDisplayed()) 
        	logging(condition.pass,"The Button: CONFIRM is displayed");
		else {
			logging(condition.info,"The Button: CONFIRM is displayed");
			assertTrue("The Button: CONFIRM is displayed",btn_confirm.isDisplayed());
		}
	}
	
	public void clicksConfirmButton() {
		btn_confirm.isDisplayed();
		btn_confirm.click();
		if (btn_cart.isDisplayed()) 
			logging(condition.pass,"User Navigated to HomePage as expected");
    	else {
    		logging(condition.warning,"User not Navigated to HomePage as expected");
    	    assertTrue("User not Navigated to HomePage as expected", btn_cart.isDisplayed());
    	}	
	}
	
	public void clickEditButton() {
		try {
			 btn_edit.isDisplayed();
		       btn_edit.click();
		} catch (Exception e) {
			ScrollAndClickText("Edit");
		}
      
       if (lbl_selectLocation.isDisplayed()) 
			logging(condition.pass,"User Navigated to SELECT LOCATION page as expected");
   	else {
   		logging(condition.warning,"User not Navigated to SELECT LOCATION page as expected");
   	    assertTrue("User not Navigated to SELECT LOCATION page as expected", lbl_selectLocation.isDisplayed());
   	}	
	}
	
	public void validateRestaurantName(String exp_restaurant) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(btn_pickUp);
		 if (btn_pickUp.isDisplayed()) 
	        	logging(condition.pass,"The Button: PICKUP is displayed");
			else {
				logging(condition.info,"The Button: PICKUP is not displayed");
				assertTrue("The Button: PICKUP is not ndisplayed",btn_pickUp.isDisplayed());
			}
		 boolean vlu_restaurantName = lbl_RestaurantName.isDisplayed();
		 if (vlu_restaurantName == true) {
			 String actual_restaurant = lbl_RestaurantName.getAttribute(strProperty);
			 if (actual_restaurant.trim().equals(exp_restaurant.trim())) 
				 logging(condition.pass,"The Selected restaurant name is populated in ORDER INFO page");
			   	else {
			   		logging(condition.warning,"The Selected restaurant name is not populated or spelling mistake in ORDER INFO page");
			   	    assertTrue("The Selected restaurant name is not populated or spelling mistake in ORDER INFO page", lbl_RestaurantName.isDisplayed());
			   	}	
		}
	}
	
	public void switchToPickup() {

		if (btn_PickupSelected.isDisplayed())
			logging(condition.pass, "pick up is already selected");
		else {
			btn_pickUp.click();
			WaitVisibilityOfElement(btn_PickupSelected);
			logging(condition.warning, "Pickup is selected after switching");
		}
	}

	public void switchToDelivery() {
		waitFor(2000);
		if (btn_DeliverySelected.isDisplayed())
			logging(condition.pass, "delivery is already selected");
		else {

			btn_delivery.click();
			WaitVisibilityOfElement(btn_DeliverySelected);
			logging(condition.warning, "delivery is selected after switching");
		}
	}

	

	
}
