package com.fb.pageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RestaurantInfoPage extends Utilities {

	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/location-name")
	@FindBy(id = "favorite")
	private WebElement lbl_restaurantNameOI;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrfavorite/addFavorite")
	@FindBy(id = "favorite")
	private WebElement btn_favoriteIcon;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/Get-Directions")
	@FindBy(id = "get directions")
	private WebElement btn_getDirections;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/callRestaurant")
	@FindBy(id = "calling icon")
	private WebElement btn_callRestaurant;

	@AndroidFindBy(accessibility = "dropup icon")
	@FindBy(id = "Open Todaycollapse")
	private WebElement btn_dropUpIconOpened;

	@AndroidFindBy(accessibility = "dropdown icon")
	@FindBy(id = "Closed Todayexpanded")
	private WebElement btn_dropUpIconClosed;
	
	@AndroidFindBy(accessibility = "dropdown icon")
	@FindBy(id = "Open Todaycollapse")
	private WebElement btn_dropDownIconOpened;
	
	@AndroidFindBy(accessibility = "dropup icon")
	@FindBy(id = "Closed Todaycollapse")
	private WebElement btn_dropDownIconClosed;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/PickUp")
	@FindBy(id = "pickup icon")
	private WebElement lbl_pickUp;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/Delivery")
	@FindBy(id = "delivery icon")
	private WebElement lbl_delivery;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details")
	@FindBy(id = "change-order-details")
	private WebElement btn_change;

	@AndroidFindBy(accessibility = "close")
	@FindBy(id = "cancel icon")
	private WebElement btn_close;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrfavorite/addFavorite")
	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[7]/XCUIElementTypeOther/XCUIElementTypeOther")
	private WebElement btn_favorite;
	
	@AndroidFindBy(accessibility = "close")
	@FindBy(id = "close")
	private WebElement btn_closeFavorite;
	
	@AndroidFindBy(accessibility = "sign up")
	@FindBy(id = "sign up")
	private WebElement btn_signUpFavoriote;
	
	@AndroidFindBy(accessibility = "sign in")
	@FindBy(id = "sign in")
	private WebElement btn_signInFavorite;
	
	
	
	

	public RestaurantInfoPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public void restaurantInfoPageFieldValidation(String exp_restaurant, String userType) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		boolean vlu_restaurantNameOI = lbl_restaurantNameOI.isDisplayed();
		String act_restaurantName = lbl_restaurantNameOI.getAttribute(strProperty);
		if (vlu_restaurantNameOI == true & act_restaurantName.equalsIgnoreCase(exp_restaurant))
			logging(condition.pass,"The Button: " + exp_restaurant + " is present and it is same as expected");
		else {
			logging(condition.warning,"The Button: " + exp_restaurant + " is not present or it is not same as expected");
			assertTrue("The Button: " + exp_restaurant + " is not present or it is not same as expected",
					vlu_restaurantNameOI);
		}

		validateFavoriteIconforGuestUser(userType);

		boolean vlu_getDirecrtions = btn_getDirections.isDisplayed();
		if (vlu_getDirecrtions == true)
			logging(condition.pass,"The Button: Get Directions is present as expected");
		else {
			logging(condition.warning,"The Button: Get Directions is not present as expected");
			assertTrue("The Button: Get Directions is not present as expected", vlu_getDirecrtions);

		}

		boolean vlu_callRestaurant = btn_callRestaurant.isDisplayed();
		if (vlu_callRestaurant == true)
			logging(condition.pass,"The Button: Call Restaurant is present as expected");
		else {
			logging(condition.warning,"The Button: Call Restaurant is not present as expected");
			assertTrue("The Button: Call Restaurant is not present as expected", vlu_callRestaurant);

		}

		validateDropbutton();
		if (userType.equalsIgnoreCase("GuestUser"))
			ScrollToText("SELECT LOCATION");
		else
			ScrollToText("ORDER NOW");

		boolean vlu_pickUp = lbl_pickUp.isDisplayed();
		if (vlu_pickUp == true)
			logging(condition.pass,"Pickup Text field is present as expected");
		else {
			logging(condition.warning,"Pickup Text field is not present as expected");
			assertTrue("Pickup Text field is not present as expected", vlu_pickUp);

		}

		boolean vlu_delivery = lbl_delivery.isDisplayed();
		if (vlu_delivery == true)
			logging(condition.pass,"Delivery Text field is present as expected");
		else {
			logging(condition.warning,"Delivery Text field is not present as expected");
			assertTrue("Delivery Text field is not present as expected", vlu_delivery);

		}

		if (userType.equalsIgnoreCase("GuestUser")) {
			WebElement btn_restaurant = driver.findElement(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/select-location-text"));
			boolean vlu_restaurant = btn_restaurant.isDisplayed();
			if (vlu_restaurant == true) {
				logging(condition.pass,"The Restaurant: " + exp_restaurant + " is displayed");
			} else {
				assertTrue("The Select Location button is not displayed or not clickable", vlu_restaurant);
			}
		}

	}

	private void validateFavoriteIconforGuestUser(String userType) {
		boolean vlu_favorite = btn_favoriteIcon.isDisplayed();
		if (vlu_favorite == true)
			logging(condition.pass,"The Button: Favorite is present as expected");
		else {
			logging(condition.warning,"The Button: Favorite is not present as expected");
			assertTrue("The Button: Favorite is not present as expected", vlu_favorite);
		}

		if (userType.equalsIgnoreCase("GuestUser")) {
			btn_favoriteIcon.click();
			boolean vlu_close = btn_close.isDisplayed();
			if (vlu_close == true)
				logging(condition.pass,"The Action Required popup is displayed");
			else {
				logging(condition.warning,"The Action Required popup is not displayed");
				assertTrue("The Action Required popup is not displayed", vlu_close);

			}
			btn_close.click();
		}

	}

	private void validateDropbutton() {
try {
		if (btn_dropUpIconOpened.isDisplayed()) {
			logging(condition.pass,"DropUp button is displayed and clicked as expected");
			btn_dropUpIconOpened.click();
			if (btn_dropDownIconOpened.isDisplayed()) {
				logging(condition.pass,"DropDown button is displayed and clicked as expected");
				btn_dropDownIconOpened.click();
			} else {
				logging(condition.warning,"DropDown button is not displayed as expected");
				assertTrue("DropDown button is not displayed as expected", false);
			}
		} else {
			logging(condition.warning,"DropUp button is not displayed as expected");
			assertTrue("DropUp button is not displayed as expected", false);
		}
} catch (Exception e) {
		if (btn_dropUpIconClosed.isDisplayed()) {
			logging(condition.pass,"DropUp button is displayed and clicked as expected");
			btn_dropUpIconClosed.click();
			if (btn_dropDownIconClosed.isDisplayed()) {
				logging(condition.pass,"DropDown button is displayed and clicked as expected");
				btn_dropDownIconClosed.click();
			} else {
				logging(condition.warning,"DropDown button is not displayed as expected");
				assertTrue("DropDown button is not displayed as expected", false);
			}
		} else {
			logging(condition.warning,"DropUp button is not displayed as expected");
			assertTrue("DropUp button is not displayed as expected", false);
		}
}
	}
	
	public void clickFavoriteIconAndVerifyPopup() {
		WaitVisibilityOfElement(btn_favorite);
		btn_favorite.click();
		WaitVisibilityOfElement(btn_closeFavorite);
		if (btn_closeFavorite.isDisplayed()) {
			logging(condition.pass,"The ActionRequired popup is displayed as expected");
			if (btn_signInFavorite.isDisplayed()&btn_signUpFavoriote.isDisplayed()) 
				logging(condition.pass,"In ActionRequired popup SIGNUP and SIGNIN buttons are displayed");
		} else {
		logging(condition.warning,"The ActionRequired popup is not displayed as expected");
		assertTrue("The ActionRequired popup is not displayed as expected", false);
	}
		btn_closeFavorite.click();
		
	}
	

}
