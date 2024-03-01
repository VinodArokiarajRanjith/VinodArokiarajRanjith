package com.fb.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FBsCommonMethods extends Utilities {



	@FindBy(id = "fbrstoresearchheader/select-location")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/select-location")
	private WebElement lbl_selectLocation;

	@FindBy(id = "fbrlocationservicenotenable/enable-location-service")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlocationservicenotenable/enable-location-service")
	private WebElement btn_enableLoationService;

	@FindBy(id = "Your precise location is used for ordering purposes only.")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement lbl_locationServicePopup;

	@FindBy(id = "Allow Once")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement btn_allowOnce;

	@FindBy(id = "Allow While Using App")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement btn_allowWhileUsingApp;

	@FindBy(id = "Don’t Allow")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	private WebElement btn_dontAllow;

	@FindBy(id = "near by tab")
	@AndroidFindBy(accessibility = "near by tabselectedout of 3 tabsText")
	private WebElement lbl_nearBy;

	@FindBy(id = "fbrstoresearchheader/map-button")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/map-button")
	private WebElement btn_mapView;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement lbl_geoLocationPrecise;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlist/switch-to-map-view")
	@FindBy(id = "fbrlist/switch-to-map-view")
	private WebElement btn_switchToMapView;

	@FindBy(id = "street,city,state,zip")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/street-city-state-zip")
	private WebElement txt_searchBar;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name='error'])[1]/XCUIElementTypeOther[2]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='error']/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement error_autoSugessitionNotWorking;

	@FindBy(xpath = "//XCUIElementTypeOther[@name='No locations in this area']")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='error']/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement error_noLocationFound;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/close-icon-container")
	@FindBy(id = "close")
	private WebElement btn_clearText;

	@AndroidFindBy(accessibility = "change-order-details")
	@FindBy(id = "fbrchange/change-order-details")
	public WebElement btn_change;

	@AndroidFindBy(accessibility = "arrow left")
	@FindBy(xpath = "(//XCUIElementTypeImage[@name='Icon-component'])[5]/XCUIElementTypeOther/XCUIElementTypeOther")
	private WebElement btn_backOverLay;

	@AndroidFindBy(accessibility = "arrow left")
	@FindBy(id = "fbrtopbar/back")
	private WebElement btn_restaurantInfoBack;

	@AndroidFindBy(accessibility = "saved tabselectedout of 3 tabsText")
	@FindBy(id = "saved tab")
	private WebElement btn_savedTab;

	@AndroidFindBy(accessibility = "sign in")
	@FindBy(id = "nosavedcontent/sign-in")
	private WebElement btn_signIn;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text(),'Login'])[4]")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private WebElement btn_login;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text(),'Login'])[5]")
	@FindBy(id = "Cancel")
	private WebElement btn_loginCancel;

	@AndroidFindBy(xpath = "(//com.horcrux.svg.SvgView[@content-desc='favorite selected']/com.horcrux.svg.GroupView/com.horcrux.svg.PathView)[1]")
	@FindBy(xpath = "(//XCUIElementTypeOther[@name='Added to favorite'])[4]")
	private WebElement lbl_savedFavorited;

	@AndroidFindBy(accessibility = "map search area")
	@FindBy(id = "map search area")
	private WebElement btn_searchThisAres;

	@AndroidFindBy(accessibility = "Login Falied")
	@FindBy(id = "Login Falied")
	private WebElement lbl_loginFailed;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement btn_keepAppLocation;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrhome/Add-product")
	private WebElement btn_AddProduct;

	@FindBy(name = "fbrlocationservicenotenable/enable-location-service")
	private WebElement btn_enableLocation;

	@AndroidBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/order-now-text")
	private WebElement btn_orderNow;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	@FindBy(id = "fbrtabmenu/delivery-selected")
	private WebElement btn_deliveryTab;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/does-this-address-look-correct?")
	private WebElement lbl_doesThisAddress;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/placeHolder-DeliveryAddress")
	private WebElement txt_optionalDelivery;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/DELIVERY-HERE")
	private WebElement btn_deiverHere;

	@AndroidFindBy(accessibility = "close")
	private WebElement btn_close;

	@FindBy(id = "fbrstoresearchheader/delivery-address")
	@AndroidFindBy(accessibility = "delivery address heading")
	private WebElement DeliveryAddressHeader;

	@FindBy(id = "fbrhome/home")
	@AndroidFindBy(accessibility = "menu icon")
	private WebElement btn_hamburgerMenu;

	@FindBy(id = "fbrstoresearchheader/back")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/back")
	private WebElement btn_crossIcon;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Your Account\"]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name")
	private WebElement lbl_yourAccount;

	@FindBy(id = "fbrstoresearchheader/back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_back;

	@FindBy(id = "fbraccount/account")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccount/account")
	private WebElement lbl_accountHeader;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[6]")
	@AndroidFindBy(accessibility = "address")
	private WebElement lbl_addressesIcon;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ADDRESSES\"]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name")
	private WebElement lbl_accountAddresses;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[7]")
	@AndroidFindBy(accessibility = "ADDRESSEScollapsed")
	private WebElement btn_addressesChevron;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/select-Different-Locations")
	private WebElement txt_locationClosedPopup;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrclosedlocationmodal/order_for_later")
	private WebElement btn_orderForLater;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrclosedlocationmodal/find_new_location")
	private WebElement btn_findNewLocation;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroutofdeliveryrange/SORRY-YOU-ARE-OUT-OF-THE-DELIVERY-RANGE")
	private WebElement lbl_sorryOutOfRange;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroutofdeliveryrange/TryPickup-Instead")
	private WebElement lbl_sorryOutOfRangeBottomText;

	@AndroidFindBy(accessibility = "pickup here")
	private WebElement btn_pickUpHerePopup;

	@AndroidFindBy(accessibility = "try another address")
	private WebElement btn_tryAnotherAddressPopup;

	@AndroidFindBy(accessibility = "see more restaurants")
	private WebElement btn_seeMoreRestaurantPopup;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/edit")
	private WebElement btn_edit;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/pickup-Locations")
	private WebElement lbl_deliveryTypeHomePage;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/address")
	private WebElement btn_greaterSymbol;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrscheduletimemodal/order-info")
	private WebElement lbl_orderInfo;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroverlay/confirm-address")
	private WebElement btn_confirm;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[8]")
	@AndroidFindBy(accessibility = "time icon")
	private WebElement lbl_timeIcon;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[9]")
	@AndroidFindBy(accessibility = "ORDER HISTORYcollapsed")
	private WebElement lbl_orderHistoryChevron;

	@FindBy(id = "fbrpersonalinfo/back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_backIcon;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HISTORY\"]")
	@AndroidFindBy(xpath = "//*[@text='HISTORY']")
	private WebElement lbl_historyHeader;

	@FindBy(id = "NO-OrderHistory-SAVED")
	@AndroidFindBy(xpath = "//*[@text='No Previous Orders']")
	private WebElement lbl_noPreviousOrders;

	@FindBy(id = "reoder")
	@AndroidFindBy(xpath = "//*[@text='ORDER NOW']")
	private WebElement btn_orderNow1;
	
	@FindBy(id = "back")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrpersonalinfo/back")
	private WebElement btn_backOrderRecipt;
	
	@FindBy(xpath = "(//*[starts-with(@name,'ORDER #')])[1]")
	@AndroidFindBy(xpath ="//*[starts-with(@text,'ORDER')]")
	private WebElement lbl_orderNumber;
	
	@FindBy(id = "fbrorderinfo/meal-to-remember-text")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/meal-to-remember-text")
	private WebElement lbl_aMealToRemember;
	
	@FindBy(id = "fbrorderinfo/order-status-text")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/order-status-text")
	private WebElement lbl_orderCompleted;
	
	@FindBy(id = "fbrOrderInfo/date1")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrOrderInfo/date1")
	private WebElement lbl_orderDate;

	@FindBy(id = "fbrOrderInfo/date2")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrOrderInfo/date2")
	private WebElement lbl_orderTime;
	
	@FindBy(id = "fbrorderinfo/contact-info2")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/contact-info2")
	private WebElement lbl_userFirstName;
	
	@FindBy(id = "fbrorderinfo/contact-info5")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/contact-info5")
	private WebElement lbl_userLastName;
	
	@FindBy(id = "fbrorderinfo/contact-info4")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/contact-info4")
	private WebElement lbl_userContactNumber;
	
	@FindBy(id = "fbrorderinfo/contact-info3")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrorderinfo/contact-info3")
	private WebElement lbl_userMailId;
	
	@FindBy(id = "fbrOrderInfo/pick-up-text")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrOrderInfo/pick-up-text")
	private WebElement lbl_pickUpResttaurant;
	
	@FindBy(id = "location")
	@AndroidFindBy(accessibility ="location")
	private WebElement lbl_pickUpLocationIcon;
	
	@FindBy(id = "fbrOrderInfo/location-text")
	@AndroidFindBy(id ="com.focusbrands.appcuisine.dev.moes:id/fbrOrderInfo/location-text")
	private WebElement lbl_pickUpLocationName;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/select-location-text")
	private WebElement btn_selectLocationInRestaurantPage;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoredetailsmodal/Get-Directions")
	@FindBy(id = "get directions")
	private WebElement btn_getDirections;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/pickup-selected")
	@FindBy(id = "fbrtabmenu/pickup-selected")
	private WebElement btn_pickUp;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/address")
	private WebElement btn_editArrow;
	

	public FBsCommonMethods(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public FBsCommonMethods(WebDriver wDriver) {
		PageFactory.initElements(wDriver, this);
	}
	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();
	

	public enum signInTypes {
		signIn, guest
	}

	public enum geoLocationType {
		allowOnce, allowWhileUsingApp, dontAllow
	}

	/**
	 * This method will perform the sign in operation
	 */
	public void logIn(signInTypes value) {

		switch (value) {
		case signIn:

			break;

		case guest:

			break;
		}

	}

	/**
	 * @param geoLocation - String To perform the geo location action, pass the
	 *                    value in test data sheet
	 */
	public void geoLocationService(String geoLocation) {
		String geoLocationAction = property.getProperty("GEOLOCATION");
		if (geoLocationAction.equalsIgnoreCase("YES")) {
			if (geoLocation.equalsIgnoreCase("AllowOnce"))
				handleLocationService(geoLocationType.allowOnce);
			else if (geoLocation.equalsIgnoreCase("AllowWhileUsingApp"))
				handleLocationService(geoLocationType.allowWhileUsingApp);
			else
				log("User selects DONT ALLOW in testdata sheet so geo location is not enabled");
		}
	}

	private void handleLocationService(geoLocationType value) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		if (osName.equalsIgnoreCase("IOS")) {
			List<WebElement> lbl_switchToMapView = driver
					.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrlist/switch-to-map-view"));
			if (lbl_switchToMapView.size() > 0) {
				log("The Geo Location is already enabled");
			}
		} else {
			WaitVisibilityOfElement(btn_enableLoationService);
			if (btn_enableLoationService.isDisplayed()) {
				btn_enableLoationService.click();
				WaitVisibilityOfElement(lbl_locationServicePopup);
				if (lbl_locationServicePopup.isDisplayed()) {
					log("The Geo Location Service popup is displayed as expected");
					switch (value) {
					case allowOnce:
						btn_allowOnce.click();
						if (!osName.equalsIgnoreCase("IOS")) {
							waitFor(2000);
							log("The popup:" + lbl_geoLocationPrecise.getAttribute(strProperty)
									+ " location popup is displayed");
							btn_allowOnce.click();

						}
						log("Allow Once is clicked as expected");
						break;

					case allowWhileUsingApp:
						btn_allowWhileUsingApp.click();
						log("Allow while using app is clicked as expected");
						if (!osName.equalsIgnoreCase("IOS")) {
							waitFor(2000);
							log("The popup:" + lbl_geoLocationPrecise.getAttribute(strProperty)
									+ " location popup is displayed");
							btn_keepAppLocation.click();
						}
						break;

					case dontAllow:
						btn_dontAllow.click();
						log("Dont Allow is clicked as expected");
						break;
					}
				} else
					log("The Geo Location Service popup is not displayed as expected");
			} else
				log("The ENABLE LOCATION SERVICES button is not displayed");
		}
	}

	/**
	 * Searching a location and selecting a location from auto suggestion list
	 * 
	 * @param location, String, Pass the value in test data sheet
	 */
	public void searchAndSelectLocation(String location) {

		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(txt_searchBar);
		txt_searchBar.click();
		EnterInput(txt_searchBar, location);
		boolean vlu_Clear = btn_clearText.isDisplayed();
		if (vlu_Clear == true) {
			logging(condition.info,"Clear button is enabled in search bar");
		}
		try {
			autoSuggessitionClick(location);
			lbl_nearBy.isDisplayed();
			logging(condition.info,"User navigated to restaurant search list page as expected");
		} catch (Exception e) {
			if (!osName.equalsIgnoreCase("IOS")) {
				List<WebElement> error_message = driver.findElements(By.xpath(
						"//android.view.ViewGroup[@content-desc=\"error\"]/android.view.ViewGroup[2]/android.widget.TextView"));
				if (error_message.size() > 0) {
					error_message.get(0).isDisplayed();
					String txt_error = error_message.get(0).getAttribute(strProperty);
					logging(condition.fail,"The Error: " + txt_error + " is showing");
				}
			} else {
				List<WebElement> error_message = driver
						.findElements(By.xpath("(//XCUIElementTypeOther[@name='error'])[1]/XCUIElementTypeOther[2]"));
				if (error_message.size() > 0) {
					error_message.get(0).isDisplayed();
					String txt_error = error_message.get(0).getAttribute(strProperty);
					logging(condition.fail,"The Error: " + txt_error + " is showing");
				}
			}
		}
	}

	/**
	 * To selecting the restaurant from the search list
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void selectRestaurant(String restaurant) {
		String strProperty = "content-desc";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		List<WebElement> txt_restuarantName = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/select-location-text"));
		for (int i = 0; i < txt_restuarantName.size(); i++) {
			String txt_restaurantName = txt_restuarantName.get(i).getAttribute(strProperty);
			if (txt_restaurantName.contains(restaurant)) {
				logging(condition.info,"The Restaurant: " + restaurant + " is displayed and SELECT LOCATION button is selected");
				txt_restuarantName.get(i).click();
				waitFor(2000);
				List<WebElement> lst_change = driver
						.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details"));
				if (lst_change.size() > 0) {
					boolean vlu_change = btn_change.isDisplayed();
					if (vlu_change == true) {
						logging(condition.info,"User Navigated to the HomePage as expected");
						assertTrue("User Navigated to the HomePage as expected", vlu_change);
					} else
						logging(condition.fail,"The given Restaurant: " + restaurant + " is invalid or not showed in the result");
				} else
					validateLocationClosed();
				break;

			}
		}
	}

	/**
	 * To selecting the restaurant from the search list
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void selectRestaurantName(String restaurant) {
		String strProperty = "content-desc";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		List<WebElement> txt_restuarantName = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/location-name-txt"));
		for (int i = 0; i < txt_restuarantName.size(); i++) {
			String txt_restaurantName = txt_restuarantName.get(i).getAttribute(strProperty);
			if (txt_restaurantName.contains(restaurant)) {
				logging(condition.info,"The Restaurant: " + restaurant + " is displayed and SELECT LOCATION button is selected");
				txt_restuarantName.get(i).click();
				WaitVisibilityOfElement(btn_getDirections);
				boolean vlu_backOverLay = btn_getDirections.isDisplayed();
				logging(condition.info,"User Navigated to the Restaurant Info as expected");
				assertTrue("User Navigated to the Restaurant Info as expected", vlu_backOverLay);
				break;
			}
		}
	}

	/**
	 * To selecting the restaurant from the search list for logged in user
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void selectRestaurantLogin(String restaurant) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		List<WebElement> txt_restuarantName = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/location-name-txt"));
		for (int i = 0; i < txt_restuarantName.size(); i++) {
			String txt_restaurantName = txt_restuarantName.get(i).getAttribute(strProperty);
			if (txt_restaurantName.equals(restaurant)) {
				logging(condition.info,"The Restaurant: " + restaurant + " is displayed and more Info button is selected");
				txt_restuarantName.get(i).click();
				WaitVisibilityOfElement(btn_restaurantInfoBack);
				boolean vlu_backOverLay = btn_restaurantInfoBack.isDisplayed();
				logging(condition.info,"User Navigated to the Restaurant Info as expected");
				assertTrue("User Navigated to the Restaurant Info as expected", vlu_backOverLay);
				break;
			}
		}
	}

	/**
	 * To selecting the MoreInfo button of a restaurant from the search list
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void selectRestaurantsMoreInfo(String restaurant) {
		WebElement btn_moreInfo = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"" + restaurant
				+ " more info\"]/android.widget.TextView)[1] | //XCUIElementTypeOther[@label=\"" + restaurant
				+ " more info\"]"));
		boolean vlu_restaurant = btn_moreInfo.isDisplayed();
		if (vlu_restaurant == true) {
			logging(condition.info,"The Restaurant: " + restaurant + " is displayed and more Info button is selected");
			btn_moreInfo.click();
			waitFor(2000);
			boolean vlu_backOverLay = btn_restaurantInfoBack.isDisplayed();
			logging(condition.info,"User Navigated to the Restaurant Info as expected");
			assertTrue("User Navigated to the Restaurant Info as expected", vlu_backOverLay);
		} else
			logging(condition.fail,"The given Restaurant: " + restaurant + " is invalid or not showed in the result");
	}

	/**
	 * To selecting the MoreInfo button of a restaurant from the search list
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void selectRestaurantsMoreInfoFromMapView(String restaurant) {
		WebElement btn_moreInfo = null;
		if (!osName.equalsIgnoreCase("IOS"))
			btn_moreInfo = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"" + restaurant
					+ " more info\"]/android.widget.TextView)[1]"));
		else
			btn_moreInfo = driver
					.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"fbrstoresearchitem/more-info\"])[2]"));
		boolean vlu_restaurant = btn_moreInfo.isDisplayed();
		if (vlu_restaurant == true) {
			logging(condition.info,"The Restaurant: " + restaurant + " is displayed and more Info button is selected");
			btn_moreInfo.click();
			waitFor(2000);
			boolean vlu_backOverLay = btn_restaurantInfoBack.isDisplayed();
			logging(condition.info,"User Navigated to the Restaurant Info as expected");
			assertTrue("User Navigated to the Restaurant Info as expected", vlu_backOverLay);
		} else
			logging(condition.fail,"The given Restaurant: " + restaurant + " is invalid or not showed in the result");
	}

	/**
	 * Clicking the select location from the Restaurant Info page
	 */
	public void selectLocationFromRestaurantInfoPage() {
		ScrollToText("SELECT LOCATION");
		WaitVisibilityOfElement(btn_selectLocationInRestaurantPage);
    	btn_selectLocationInRestaurantPage.click();
		boolean vlu_change = btn_change.isDisplayed();
		logging(condition.info,"User Navigated to the HomePage as expected");
		assertTrue("User Navigated to the HomePage as expected", vlu_change);
	}

	public void clickChangeButton() {
		btn_change.click();
		waitFor(2000);
		boolean vlu_backOverLay = btn_backOverLay.isDisplayed();
		logging(condition.info,"User Navigated to the Order Info page as expected");
		assertTrue("User Navigated to the Order Info page as expected", vlu_backOverLay);
	}

	public void signingInFromSavedTab() {
		boolean vlu_miles = lbl_nearBy.isDisplayed();
		if (vlu_miles == true) {
			if (btn_savedTab.isDisplayed()) {
				btn_savedTab.click();
				log("User navigated to Saved Tab as expected");
				btn_signIn.isDisplayed();
				btn_signIn.click();
				WaitVisibilityOfElement(btn_login);
				boolean vlu_login = btn_login.isDisplayed();
				boolean vlu_loginCancel = btn_loginCancel.isDisplayed();
				if (vlu_loginCancel == true & vlu_login == true) {
					log("User navigated to login page and the Login and Cancel buttons are displayed as expected");
					btn_login.click();
					WaitVisibilityOfElement(lbl_nearBy);
					log("User signed in successfully as expected");
					lbl_nearBy.click();
				}
			}
		}
	}

	public void clearTextInSearchBar() {

		try {
			boolean vlu_Clear = btn_clearText.isDisplayed();
			if (vlu_Clear == true) {
				logging(condition.info,"Clear button is enabled in search bar");
				WaitVisibilityOfElement(btn_clearText);
				btn_clearText.click();
				logging(condition.info,"Clear button is clicked in search bar");
			}
		} catch (Exception e) {
			logging(condition.warning,"Clear button is not enabled and displayed in search bar");
		}

	}

	public void clickMapView() {
		WaitVisibilityOfElement(btn_mapView);
		if (btn_mapView.isDisplayed()) {
			btn_mapView.click();
			logging(condition.info,"MapView button is displayed and clicked");
			WaitVisibilityOfElement(btn_searchThisAres);
			if (btn_searchThisAres.isDisplayed())
				logging(condition.info,"User Navigated to MapView as expected");
		} else {
			logging(condition.warning,"MapView button is not displayed");
		}

	}

	public void autoSuggessitionClick(String location) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		waitFor(3000);
		List<WebElement> autoSuggesitionList = driver.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < autoSuggesitionList.size(); i++) {
			String txt_suggesitionList = autoSuggesitionList.get(i).getAttribute(strProperty);
			if (txt_suggesitionList.contains(location)) {
				logging(condition.info,"The LOCATION: " + txt_suggesitionList + " is selected as expected");
				waitFor(1000);
				driver.navigate().back();
				waitFor(1000);
				ActionClick(autoSuggesitionList.get(i));
				break;
			}
		}
	}

	/**
	 * To selecting the restaurant from the search list
	 * 
	 * @param restaurant, Pass the value in test data sheet
	 */
	public void clickOrderNow(String restaurant) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		List<WebElement> txt_restuarantName = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchitem/order-now-text"));
		for (int i = 0; i < txt_restuarantName.size(); i++) {
			String txt_restaurantName = txt_restuarantName.get(i).getAttribute(strProperty);
			if (txt_restaurantName.contains("ORDER NOW")) {
				logging(condition.info,"The Restaurant: " + restaurant + " is displayed and SELECT LOCATION button is selected");
				txt_restuarantName.get(i).click();
				waitFor(2000);
				List<WebElement> lst_change = driver
						.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details"));
				if (lst_change.size() > 0) {
					boolean vlu_change = btn_change.isDisplayed();
					if (vlu_change == true) {
						logging(condition.info,"User Navigated to the HomePage as expected");
						assertTrue("User Navigated to the HomePage as expected", vlu_change);
					} else
						logging(condition.warning,"The given Restaurant: " + restaurant + " is invalid or not showed in the result");
				} else
					validateLocationClosed();
				break;

			}
		}
	}

	public void searchAndSelectDeliveryLocation(String location, String geoLocation, String userType) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(btn_deliveryTab);
		btn_deliveryTab.click();
		waitFor(2000);
		WaitVisibilityOfElement(txt_searchBar);
		txt_searchBar.click();
		EnterInput(txt_searchBar, location);
		waitFor(2000);
		List<WebElement> txt_locationNames = driver.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < txt_locationNames.size(); i++) {
			String txt_locationName = txt_locationNames.get(i).getAttribute(strProperty);
			if (txt_locationName.equalsIgnoreCase(location)) {
				driver.navigate().back();
				txt_locationNames.get(i).click();
				break;
			}
		}
		waitFor(2000);
		List<WebElement> lst_doesThisModel = driver.findElements(By
				.id("com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/does-this-address-look-correct?"));
		if (lst_doesThisModel.size() > 0) {
			WaitVisibilityOfElement(lbl_doesThisAddress);
			String vlu_doesThisAddress = lbl_doesThisAddress.getAttribute(strProperty);
			if (lbl_doesThisAddress.isDisplayed() == true) {
				logging(condition.info,"The Popup: " + vlu_doesThisAddress + " is displayed as expected");
				assertTrue("The Popup: " + vlu_doesThisAddress + " is displayed as expected", true);
			} else
				logging(condition.warning,"The popup is not displayed");

			EnterInput(txt_optionalDelivery, "Testing");
			btn_deiverHere.click();
			boolean vlu_change = btn_change.isDisplayed();
			if (vlu_change == true) {
				logging(condition.info,"User Navigated to the HomePage as expected");
				assertTrue("User Navigated to the HomePage as expected", vlu_change);
			} else
				logging(condition.warning,"User is not Navigated to the HomePage as expected");
		} else
			validateOutOfRangeModal();
	}

	/**
	 * @param geoLocation on Delivery Address - String To perform the geo location
	 *                    action, pass the value in test data sheet
	 */
	public void locationService(String geoLocation) {
		if (geoLocation.equalsIgnoreCase("YES")) {
			if (geoLocation.equalsIgnoreCase("AllowOnce"))
				handllingLocationService(geoLocationType.allowOnce);
			else if (geoLocation.equalsIgnoreCase("AllowWhileUsingApp"))
				handllingLocationService(geoLocationType.allowWhileUsingApp);
			else
				logging(condition.info,"User selects DONT ALLOW in testdata sheet so geo location is not enabled");
		}
	}

	private void handllingLocationService(geoLocationType value) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		if (btn_enableLoationService.isDisplayed()) {
			btn_enableLoationService.click();
			WaitVisibilityOfElement(lbl_locationServicePopup);
			if (lbl_locationServicePopup.isDisplayed()) {
				logging(condition.info,"The Geo Location Service popup is displayed as expected");
				switch (value) {
				case allowOnce:
					btn_allowOnce.click();
					if (!osName.equalsIgnoreCase("IOS")) {
						waitFor(2000);
						logging(condition.info,"The popup:" + lbl_geoLocationPrecise.getAttribute(strProperty)
								+ " location popup is displayed");
						btn_keepAppLocation.click();

					}
					logging(condition.info,"Allow Once is clicked as expected");
					break;

				case allowWhileUsingApp:
					btn_allowWhileUsingApp.click();
					logging(condition.info,"Allow while using app is clicked as expected");
					if (!osName.equalsIgnoreCase("IOS")) {
						waitFor(2000);
						logging(condition.info,"The popup:" + lbl_geoLocationPrecise.getAttribute(strProperty)
								+ " location popup is displayed");
						btn_keepAppLocation.click();
					}
					break;

				case dontAllow:
					btn_dontAllow.click();
					logging(condition.info,"Dont Allow is clicked as expected");
					break;
				}
			} else
				logging(condition.info,"The Geo Location Service popup is not displayed as expected");
		} else
			logging(condition.info,"The ENABLE LOCATION SERVICES button is not displayed");
		WaitVisibilityOfElement(DeliveryAddressHeader);
		if (DeliveryAddressHeader.isDisplayed())
			logging(condition.info,"User able to see Delivery Address Header");
		else
			logging(condition.info,"User unable to see Delivery Address Header");
	}

	public void clickYourAccountFromHamburgerMenu() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		waitFor(2000);
		boolean hamburgerMenu = btn_hamburgerMenu.isDisplayed();
		if (hamburgerMenu == true) {
			if (btn_hamburgerMenu.isDisplayed()) {
				btn_hamburgerMenu.click();
				logging(condition.info, "User navigated to profile");
				btn_crossIcon.isDisplayed();
				logging(condition.info, "Cross icon is displayed");
				List<WebElement> yourAccount = driver
						.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name"));
				for (int i = 0; i < yourAccount.size(); i++) {
					waitFor(2000);
					String account = yourAccount.get(i).getAttribute(strProperty);
					if (account.contains("Your Account")) {
						yourAccount.get(i).click();
						logging(condition.info, "User navigated to Account Screen");
						break;
					}
				}
			}
		}
	}

	public void clickAccountOption(String account) {
		String strProperty = "content-desc";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		waitFor(2000);
		boolean back = btn_back.isDisplayed();
		if (back == true) {
			if (lbl_accountHeader.isDisplayed()) {
				logging(condition.info, "Back icon is displayed");
				lbl_addressesIcon.isDisplayed();
				logging(condition.info, "User can see Addresses Icon is expected");
				btn_addressesChevron.isDisplayed();
				logging(condition.info, "User can see chevron icon is expected");
				lbl_timeIcon.isDisplayed();
				logging(condition.info, "User can view Time Icon is expected");
				lbl_orderHistoryChevron.isDisplayed();
				logging(condition.info, "User can see Order History with chevron icon is expected");
				List<WebElement> addresses = driver
						.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name"));
				for (int i = 0; i < addresses.size(); i++) {
					waitFor(2000);
					String address = addresses.get(i).getAttribute(strProperty);
					if (address.contains(account)) {
						addresses.get(i).click();
						waitFor(2000);
						logging(condition.info, "User navigated to addresses screen");
						break;
					}
				}
			}
		}
	}

	private void validateLocationClosed() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		List<WebElement> lbl_locationClosed = driver.findElements(
				By.id("com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/THIS-LOCATION-IS-CURRENTLY-CLOSED"));
		if (lbl_locationClosed.size() > 0) {
			logging(condition.info,
					"The Popup:" + lbl_locationClosed.get(0).getAttribute(strProperty) + " is displayed as expected");
			if (txt_locationClosedPopup.isDisplayed() == true)
				logging(condition.info,
						"The Text:" + txt_locationClosedPopup.getAttribute(strProperty) + " is displayed as expected");
			else
				logging(condition.fail, "The Text:" + txt_locationClosedPopup.getAttribute(strProperty)
						+ " is not displayed as expected");

			if (btn_orderForLater.isDisplayed() == true)
				logging(condition.info,
						"The button:" + btn_orderForLater.getAttribute(strProperty) + " is displayed as expected");
			else
				logging(condition.fail,
						"The button:" + btn_orderForLater.getAttribute(strProperty) + " is not displayed as expected");

			if (btn_findNewLocation.isDisplayed() == true)
				logging(condition.info,
						"The button:" + btn_findNewLocation.getAttribute(strProperty) + " is displayed as expected");
			else
				logging(condition.fail, "The button:" + btn_findNewLocation.getAttribute(strProperty)
						+ " is not displayed as expected");

			logging(condition.fail, "Since the location is closed can't able to proceed further");
		}

	}

	private void validateOutOfRangeModal() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		if (lbl_sorryOutOfRange.isDisplayed() == true)
			logging(condition.info,
					"The Header:" + lbl_sorryOutOfRange.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"The Header:" + lbl_sorryOutOfRange.getAttribute(strProperty) + " is not displayed as expected");

		if (lbl_sorryOutOfRangeBottomText.isDisplayed() == true)
			logging(condition.info, "The Content Text:" + lbl_sorryOutOfRangeBottomText.getAttribute(strProperty)
					+ " is displayed as expected");
		else
			logging(condition.fail, "The Content Text:" + lbl_sorryOutOfRangeBottomText.getAttribute(strProperty)
					+ " is not displayed as expected");

		if (btn_pickUpHerePopup.isDisplayed() == true)
			logging(condition.info, "The Button: PICKUP HERE is displayed as expected");
		else
			logging(condition.fail, "The Button: PICKUP HERE is not displayed as expected");

		if (btn_tryAnotherAddressPopup.isDisplayed() == true)
			logging(condition.info, "The Button: TRY ANOTHER ADDRESS is displayed as expected");
		else
			logging(condition.fail, "The Button: TRY ANOTHER ADDRESS is not displayed as expected");

		if (btn_seeMoreRestaurantPopup.isDisplayed() == true) {
//			logging(condition.info,	"The Button:" + btn_seeMoreRestaurantPopup.getAttribute(strProperty) + " is displayed as expected");
			logging(condition.fail, "The Header:" + lbl_sorryOutOfRange.getAttribute(strProperty) + " is displayed");
		} else
			logging(condition.fail, "The Button:" + btn_seeMoreRestaurantPopup.getAttribute(strProperty)
					+ " is not displayed as expected");
	}

	public void selectLocationIfNotSelected(String userType, String location, String restaurant) {
		List<WebElement> lbl_change = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details"));
		if (lbl_change.size() > 0)
			logging(condition.info, "The user navigated to HOME page as expected");
		else {
			searchAndSelectLocation(location);
			if (userType.trim().equals("GuestUser".trim()))
				selectRestaurant(restaurant);
			else
				clickOrderNow(restaurant);
			if (btn_change.isDisplayed())
				logging(condition.pass, "User Navigated to the HomePage as expected");
			else
				logging(condition.fail,
						"The given Restaurant: " + restaurant + " is invalid or not showed in the result");
		}
	}

	public void searchAndSelectDeliveryLocationFromHomePage(String location, String geoLocation, String userType) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		waitFor(2000);
		WaitVisibilityOfElement(txt_searchBar);
		txt_searchBar.click();
		EnterInput(txt_searchBar, location);
		waitFor(2000);
		List<WebElement> txt_locationNames = driver.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < txt_locationNames.size(); i++) {
			String txt_locationName = txt_locationNames.get(i).getAttribute(strProperty);
			if (txt_locationName.equalsIgnoreCase(location)) {
				driver.navigate().back();
				txt_locationNames.get(i).click();
				break;
			}
		}
		waitFor(2000);
		List<WebElement> lst_doesThisModel = driver.findElements(By
				.id("com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/does-this-address-look-correct?"));
		if (lst_doesThisModel.size() > 0) {
			WaitVisibilityOfElement(lbl_doesThisAddress);
			String vlu_doesThisAddress = lbl_doesThisAddress.getAttribute(strProperty);
			if (lbl_doesThisAddress.isDisplayed() == true) {
				logging(condition.info,"The Popup: " + vlu_doesThisAddress + " is displayed as expected");
				assertTrue("The Popup: " + vlu_doesThisAddress + " is displayed as expected", true);
			} else
				assertTrue("The popup is not displayed", false);

			EnterInput(txt_optionalDelivery, "Testing");
			btn_deiverHere.click();
			WaitVisibilityOfElement(lbl_orderInfo);
			boolean vlu_orderInfo = lbl_orderInfo.isDisplayed();
			if (vlu_orderInfo == true)
				logging(condition.pass, "User is Navigated to the HomePage as expected");
			else
				logging(condition.fail, "User is not Navigated to the HomePage as expected");
		} else
			validateOutOfRangeModal();
	}

	public void selectDeliveryLocation(String location, String geoLocation, String userType) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		try {
			WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
			logging(condition.info, "The user navigated to HOME page as expected");
			String vlu_deliveryType = lbl_deliveryTypeHomePage.getAttribute(strProperty);
			if (vlu_deliveryType.toLowerCase().contains("deliver"))
				logging(condition.info, "The delivery location is selected already");
			else {
				logging(condition.info, "The delivery location is not selected already");
				waitFor(3000);
				WaitVisibilityOfElement(btn_change);
				btn_change.click();
				WaitVisibilityOfElement(btn_deliveryTab);
				btn_deliveryTab.click();
				WaitVisibilityOfElement(btn_edit);
				btn_edit.click();
				searchAndSelectDeliveryLocationFromHomePage(location, geoLocation, userType);
				WaitVisibilityOfElement(btn_confirm);
				btn_confirm.click();
				WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
				String vlu_deliveryTypeUpdated = lbl_deliveryTypeHomePage.getAttribute(strProperty);
				System.out.println(vlu_deliveryTypeUpdated);
				if (vlu_deliveryTypeUpdated.toLowerCase().contains("deliver"))
					logging(condition.pass,
							"The Delivery location is updated: " + vlu_deliveryTypeUpdated + " as expected");
				else
					logging(condition.fail, "The Delivery location is not updated as expected");
			}
		} catch (Exception e) {
			e.printStackTrace();
			searchAndSelectDeliveryLocation(location, geoLocation, userType);
		}

	}

	public void velidateEmptyOrderHistoryLandingScreen() {

		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		if (btn_backIcon.isDisplayed())
			logging(condition.info, "Back navigation button is displayed as expected");
		else
			logging(condition.fail, "Back navigation button is not displayed as expected");

		if (lbl_historyHeader.isDisplayed())
			logging(condition.info,
					"Header:" + lbl_historyHeader.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Header:" + lbl_historyHeader.getAttribute(strProperty) + "is not displayed as expected");

		if (lbl_noPreviousOrders.isDisplayed() == true)
			logging(condition.info,
					"Message: " + lbl_noPreviousOrders.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Message: " + lbl_noPreviousOrders.getAttribute(strProperty) + " is not displayed as expected");

		if (btn_orderNow1.isDisplayed())
			logging(condition.info, "Order Now Button is displayed as expected");
		else
			logging(condition.fail, "Order Now Button is not displayed as expected");
	}
	
	public void velidatePickUpOrderReciptStatus() {
		waitFor(2000);
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		if (btn_backOrderRecipt.isDisplayed()==true)
			logging(condition.info, "Back navigation button is displayed as expected");
		else
			logging(condition.fail, "Back navigation button is not displayed as expected");
		if (lbl_orderNumber.isDisplayed()==true)
			logging(condition.info,
					"Header:" + lbl_orderNumber.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Header:" + lbl_orderNumber.getAttribute(strProperty) + "is not displayed as expected");
		if (lbl_aMealToRemember.isDisplayed() == true)
			logging(condition.info,
					"Message: " + lbl_aMealToRemember.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Message: " + lbl_aMealToRemember.getAttribute(strProperty) + " is not displayed as expected");
		if (lbl_orderCompleted.isDisplayed() == true)
			logging(condition.info,
					"Title: " + lbl_orderCompleted.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Title: " + lbl_orderCompleted.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_orderDate.isDisplayed() == true)
			logging(condition.info,
					"Date: " + lbl_orderDate.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Date: " + lbl_orderDate.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_orderTime.isDisplayed() == true)
			logging(condition.info,
					"Time: " + lbl_orderTime.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Time: " + lbl_orderTime.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_userFirstName.isDisplayed() == true)
			logging(condition.info,
					"First Name: " + lbl_userFirstName.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"First Name: " + lbl_userFirstName.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_userLastName.isDisplayed() == true)
			logging(condition.info,
					"Last Name: " + lbl_userLastName.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Last Name: " + lbl_userLastName.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_userContactNumber.isDisplayed() == true)
			logging(condition.info,
					"Contact Number: " + lbl_userContactNumber.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Contact Number: " + lbl_userContactNumber.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_userMailId.isDisplayed() == true)
			logging(condition.info,
					"Mail ID: " + lbl_userMailId.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Mail ID: " + lbl_userMailId.getAttribute(strProperty) + " is not displayed as expected");
		if (lbl_pickUpResttaurant.isDisplayed() == true)
			logging(condition.info,
					"Title: " + lbl_pickUpResttaurant.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"Title: " + lbl_pickUpResttaurant.getAttribute(strProperty) + " is not displayed as expected");	
		if (lbl_pickUpLocationIcon.isDisplayed()==true)
			logging(condition.info, "Location Icon is displayed as expected");
		else
			logging(condition.fail, "Location Icon is not displayed as expected");
		if (lbl_pickUpLocationName.isDisplayed() == true)
			logging(condition.info,
					"PickUp Resrtaurant Name: " + lbl_pickUpLocationName.getAttribute(strProperty) + " is displayed as expected");
		else
			logging(condition.fail,
					"PickUp Resrtaurant Name: " + lbl_pickUpLocationName.getAttribute(strProperty) + " is not displayed as expected");
	}
	
	public void clickChangeButtonGuestUser() {
	       btn_change.click();
	       waitFor(2000);
			boolean vlu_backOverLay = btn_backOverLay.isDisplayed();
			log("User Navigated to the Order Info page as expected");
			assertTrue("User Navigated to the Order Info page as expected", vlu_backOverLay);
		}
		
		public void clickChangeButtonSignedInUser() {
		       waitFor(2000);
				boolean vlu_backOverLay = btn_backOverLay.isDisplayed();
				log("User Navigated to the Order Info page as expected");
				assertTrue("User Navigated to the Order Info page as expected", vlu_backOverLay);
			}
		public void changeToPickUpLocationIfNotSelected(String location, String restaurant) {
			String strProperty = "text";
			if (osName.equalsIgnoreCase("IOS"))
				strProperty = "value";
		 
			 WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
					logging(condition.info,"The user navigated to HOME page as expected");
					String vlu_deliveryType = lbl_deliveryTypeHomePage.getAttribute(strProperty);
					if (vlu_deliveryType.toLowerCase().contains("pickup")) 
						logging(condition.info,"The Pickup location is selected already");
					else {
						logging(condition.info,"The Pickup location is not selected already");
						waitFor(3000);
						WaitVisibilityOfElement(btn_change);
						btn_change.click();
						WaitVisibilityOfElement(btn_pickUp);
						btn_pickUp.click();
						WaitVisibilityOfElement(btn_editArrow);
						btn_editArrow.click();
						searchAndSelectLocation(location);
						selectRestaurantName(restaurant);
					    ScrollAndClickText("ORDER NOW");
						WaitVisibilityOfElement(btn_confirm);
						btn_confirm.click();
						WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
						String vlu_deliveryTypeUpdated = lbl_deliveryTypeHomePage.getAttribute(strProperty);
						if (vlu_deliveryTypeUpdated.toLowerCase().contains("pickup")) 
							logging(condition.pass,"The Delivery location is updated: "+vlu_deliveryTypeUpdated+" as expected");
						else 
							logging(condition.fail,"The Delivery location is not updated as expected");
					}
					
		}
		
		public void cheangeDeliveryLocationforSignedInUser(String location, String geoLocation, String userType) {
			String strProperty = "text";
			if (osName.equalsIgnoreCase("IOS"))
				strProperty = "value";
		 try {
			 WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
					logging(condition.info,"The user navigated to HOME page as expected");
					String vlu_deliveryType = lbl_deliveryTypeHomePage.getAttribute(strProperty);
						logging(condition.info,"The delivery location is not selected already");
						waitFor(3000);
						WaitVisibilityOfElement(btn_change);
						btn_change.click();
						WaitVisibilityOfElement(btn_deliveryTab);
						btn_deliveryTab.click();
						WaitVisibilityOfElement(btn_edit);
						btn_edit.click();
						searchAndSelectDeliveryLocationFromHomePage(location, geoLocation, userType);
						WaitVisibilityOfElement(btn_confirm);
						btn_confirm.click();
						WaitVisibilityOfElement(lbl_deliveryTypeHomePage);
						String vlu_deliveryTypeUpdated = lbl_deliveryTypeHomePage.getAttribute(strProperty);
						if (vlu_deliveryTypeUpdated.toLowerCase().contains("deliver")) 
							logging(condition.pass,"The Delivery location is updated: "+vlu_deliveryTypeUpdated+" as expected");
						else 
							logging(condition.fail,"The Delivery location is not updated as expected");
		} catch (Exception e) {
			e.printStackTrace();
				searchAndSelectDeliveryLocation(location, geoLocation, userType);
				}
			
		}
	

}
