package com.fb.pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeliveryOrderDetailPages extends Utilities {
	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);


	@FindBy(id ="fbrstoresearchheader/select-location")
	@AndroidFindBy(accessibility = "select location heading")
	public WebElement SelectLocationHeader;

	@FindBy(id ="fbrstoresearchheader/back")
	@AndroidFindBy(accessibility = "arrow left")
	public WebElement backArrow;

	@FindBy(id = "fbrstoresearchheader/map-button")
	@AndroidFindBy(accessibility = "location")
	public WebElement mapIcon;

	@FindBy(id = "fbrtabmenu/pickup-selected")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/pickup-selected")
	public WebElement pickupTab;

	@FindBy(id = "fbrlocationservicenotenable/enable-location-service")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlocationservicenotenable/enable-location-service")
	public WebElement enableLocationServicesButton;

	@FindBy(id = "fbrtabmenu/delivery-selected")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	public WebElement SwitchToDeliveryScreen;

	@FindBy(id ="fbrstoresearchheader/delivery-address")
	@AndroidFindBy(accessibility = "delivery address heading")
	public WebElement DeliveryAddressHeader;
	
	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[5]/XCUIElementTypeOther")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbremptyview/hide")
	public WebElement locationDesign;
	
	@FindBy(id = "fbrtopbar/Message")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/Message")
	public WebElement mainMessage;
	
	@FindBy(id = "fbrtopbar/SubMessage")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/SubMessage")
	public WebElement subMessage;

	@FindBy(id = "fbrstoresearch/street-city-state-zip")
	@AndroidFindBy(accessibility = "street,city,state,zip")
	public WebElement ClickSearchBar;
	
	@FindBy(id = "fbrstoresearch/close-icon")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/close-icon")
	public WebElement searchClear;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"suggestion row item\"])[3]")
	@AndroidFindBy(accessibility = "Tamuning, Guam")
	public WebElement Click1stSearchOption;

	@FindBy(id = "fbrdeliveryaddressmodal/does-this-address-look-correct?")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/does-this-address-look-correct?")
	public WebElement verifyAddressModule;
	
	@FindBy(id = "fbrdeliveryaddressmodal/deliveryAddress-text")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/deliveryAddress-text")
	public WebElement deliveryAddress;

	@FindBy(id = "fbrdeliveryaddressmodal/onclosemodal")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/sign_up_to_save_address")
	public WebElement signUpToSaveAddress;

	@FindBy(id = "fbrdeliveryaddressmodal/ADD-NEW-ADDRESS")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/ADD-NEW-ADDRESS")
	public WebElement addNewAddress;

	@FindBy(id = "fbrdeliveryaddressmodal/placeHolder-DeliveryAddress")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/placeHolder-DeliveryAddress")
	public WebElement enterAptUnitValue;
	
	@FindBy(id = "fbrdeliveryaddressmodal/optional-Address-text")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/optional-Address-text")
	public WebElement verifyOptional;

	@FindBy(id = "fbrdeliveryaddressmodal/DELIVERY-HERE")
	@AndroidFindBy(accessibility = "deliver here")
	public WebElement clickDeliverHere;
	
	@FindBy(id = "fbrdeliveraddressmodal/close")
	@AndroidFindBy(accessibility = "cancel icon")
	public WebElement closeModel;

	@FindBy(id = "Logo")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrhome/home")
	public WebElement homeHeader;

	@FindBy(id = "fbrlastpickup/pickup-Locations")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/pickup-Locations")
	public WebElement lastDeliveryLocation;

	@FindBy(id = "fbrchange/change-order-details")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details")
	public WebElement clickChangeCTA;

	@FindBy(id = "fbrscheduletimemodal/order-info")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrscheduletimemodal/order-info")
	public WebElement verifyOrderInfoHeader;
	
	@FindBy(id = "fbrtabmenu/delivery-selected")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	public WebElement verifyDeliverytab;

	@FindBy(id = "restaurant-name")
	@AndroidFindBy(accessibility = "Delivery address")
	public WebElement deliveryAddressTitle;
	
	@FindBy(id = "490 S Marine Corps Dr, Tamuning, 96913")
	@AndroidFindBy(accessibility = "delivery address")
	public WebElement verifyDeliveryAddress;

	@FindBy(id = "fbrscheduletime/title")
	@AndroidFindBy(xpath = "//*[@text='SCHEDULE FOR']")
	public WebElement scheduleFor;

	@FindBy(id = "fbroverlay/confirm-address")
	@AndroidFindBy(accessibility = "confirm address")
	public WebElement clickConfirm;

	@FindBy(id = "fbrorderoverlay/edit")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/edit")
	public WebElement clickEditOptionForLogin;
	
	@FindBy(id = "fbrorderoverlay/edit")
	@AndroidFindBy(accessibility = "chevron right")
	public WebElement clickEditOption;
	
	@FindBy(id = "street,city,state,zip")
	@AndroidFindBy(accessibility = "search")
	public WebElement clickSearchIcon;

	@FindBy(id = "fbrstorepickupoutofrange/close-button")
	@AndroidFindBy(accessibility = "close")
	public WebElement clickCloseOption;

	@FindBy(id = "street,city,state,zip")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/street-city-state-zip")
	public WebElement clickSearchBarAgain;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Tamuning, Guam\"])[3]")
	@AndroidFindBy(accessibility = "331 North Marine Drive, Tamuning, Guam")
	public WebElement clickFirstSearchOption;

	@FindBy(id = "fbrlocationservicenotenable/enable-location-service")
	@AndroidFindBy(accessibility = "enable location service")
	public WebElement clickEnableLocationServices;

	@FindBy(id = "Your precise location is used for ordering purposes only.")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	public WebElement verifyGeoPermission;

	@FindBy(id = "Allow While Using App")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public WebElement clickWhileUsingApp;

	@FindBy(id = "confirm")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	public WebElement clickOnlyThisTime;

	@FindBy(id = "fbrstorepickupoutofrange/SORRY-YOU-ARE-OUT-OF-THE-DELIVERY-RANGE")
	@AndroidFindBy(accessibility = " sorry you’re out of the delivery range heading")
	public WebElement verifyOutOfDeliveryRange;

	@FindBy(id = "fbrstorepickupoutofrange/CHANGE-TO-PICKUP")
	@AndroidFindBy(accessibility = "change to pickup title")
	public WebElement verifyChangeToPickUp;

	@FindBy(id = "fbrstorepickupoutofrange/TRY-ANOTHER-ADDRESS")
	@AndroidFindBy(accessibility = "try another address")
	public WebElement verifyTryAnotherAddress;

	@FindBy(id = "fbrstorepickupoutofrange/close-button")
	@AndroidFindBy(accessibility = "cancel icon")
	public WebElement clickCancelIcon;

	@FindBy(id = "Find My Location")
	@AndroidFindBy(accessibility = "find my location delivery")
	public WebElement verifyFindMyLocation;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Atlanta, GA, USA\"])[3]")
	@AndroidFindBy(accessibility = "Atlanta, GA, USA")
	public WebElement click1stSearchOption;
	
	@FindBy(id = "fbroutofdeliveryrange/SORRY-YOU-ARE-OUT-OF-THE-DELIVERY-RANGE")
	@AndroidFindBy(accessibility = "Sorry, you’re out of the delivery rangeheading")
	public WebElement verifyOutOfDeliveyMessage;
	
	@FindBy(id = "fbroutofdeliveryrange/TryPickup-Instead")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroutofdeliveryrange/TryPickup-Instead")
	public WebElement verifyOutOfDeliveySubMessage;
	
	@FindBy(id = "storeStatus/status")
	@AndroidFindBy(accessibility = "Open 10:00 am to 5:00 pm")
	public WebElement verifyStoreTime;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"pickup here\"]")
	@AndroidFindBy(accessibility = "pickup here")
	public WebElement verifyPickUpHere;
	
	@FindBy(id = "see more restaurants chevron right-small")
	@AndroidFindBy(accessibility = "see more restaurants")
	public WebElement verifySeeMoreRestaurant;
	
	@FindBy(id = "fbroutofdeliveryrange/cancel-icon")
	@AndroidFindBy(accessibility = "close")
	public WebElement clickClose;
	
	@FindBy(id = "fbrscheduletime/later")
	@AndroidFindBy(accessibility = "later")
	public WebElement clickLaterOption;
	
	@FindBy(id = "fbrlastpickup/Last-pickup-Timing")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/Last-pickup-Timing")
	public WebElement verifyScheduledTime;
	
	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public DeliveryOrderDetailPages(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	public void verifyOutOfDeliveyRangeMessage() {
		if (verifyOutOfDeliveyMessage.isDisplayed())
			log("Sorry You Are Out Of The Delivery Range Title is Displayed");
		else
			log("Sorry You Are Out Of The Delivery Range Title is not Displayed");
	}
	public void verifyOutOfDeliveyRangeSubMessage() {
		if (verifyOutOfDeliveySubMessage.isDisplayed())
			log("Looks like we don't deliver to that address.Try pickup instead message is Displayed");
		else
			log("Looks like we don't deliver to that address.Try pickup instead message is not Displayed");
	}
	public void verifyStoreTiming() {
		if (verifyStoreTime.isDisplayed())
			log("Store timing is Displayed");
		else
			log("Store timing is not Displayed");
	}
	public void verifyPickUpHereCTA() {
		if (verifyPickUpHere.isDisplayed())
			log("PickUp Here CTA is Displayed");
		else
			log("PickUp Here CTA is not Displayed");
	}
	public void verifySeeMoreRestaurantLink() {
		if (verifySeeMoreRestaurant.isDisplayed())
			log("See More Restaurant Link is Displayed");
		else
			log("See More Restaurant Link is not Displayed");
	}
	public void clickClose() {
		if (clickClose.isDisplayed()) {
			waitFor(2000);
			clickClose.click();
			log("Close Icon is Displayed");
		}
		else
			log("Close Icon is not Displayed");
	}
	
	
	public void getCloseModel(String geoLocation) {
		if (!geoLocation.equals("Don'tAllow")) {
		if (closeModel.isDisplayed()) {
			closeModel.click();
			log("Close Icon is Displayed");
		}
		else {
			log("Close Icon is not Displayed");
		}}
	}
	public void getSelectLocationHeader() {
		if (SelectLocationHeader.isDisplayed())
			log("Select Location Header is Displayed");
		else
			log("Select Location Header is not Displayed");
	}

	public void getBackArrow() {
		if (backArrow.isDisplayed())
			log("Back Arrow is Displayed");
		else
			log("Back Arrow is not Displayed");
	}

	public void getMapIcon() {
		if (mapIcon.isDisplayed())
			log("Map Icon is Displayed");
		else
			log("Map Icon is not Displayed");

	}

	public void getPickupTab() {
		if (pickupTab.isDisplayed())
			log("Pickup Tab is Displayed");
		else
			log("Pickup Tab is not Displayed");

	}

	public void getEnableLocationServicesButton() {
		if (enableLocationServicesButton.isDisplayed())
			log(" Enable Location Services Button is Displayed");
		else
			log("Enable Location Services Button is not Displayed");

	}

	public void SwitchToDeliveryScreen() {
		SwitchToDeliveryScreen.click();
	}

	public void getDeliveryAddressHeader() {
		if (DeliveryAddressHeader.isDisplayed())
			log("Delivery Address Header is Displayed");

		else
			log("Delivery Address Header is not Displayed");
	}
	public void getLocationDesign() {
		if (locationDesign.isDisplayed())
			log("Location Design is Displayed");
		else
			log("Location Design is not Displayed");
	}
	
	public void getMainMessage() {
		if (mainMessage.isDisplayed())
			log("Main Message is Displayed");
		else
			log("Main Message is not Displayed");
	}
	public void getSubMessage() {
		if (subMessage.isDisplayed())
			log("Sub Message is Displayed");
		else
			log("Sub Message is not Displayed");
	}

	public void getClickSearchBar(String location) {
		waitFor(1000);
		ClickSearchBar.click();
		ClickSearchBar.sendKeys(location);
		waitFor(1000);
		commonMethods.autoSuggessitionClick(location);
	}

	public void getVerifyAddressModule() {

		if (verifyAddressModule.isDisplayed()) {
			log("DOES THIS ADDRESS LOOK CORRECT? is not Displayed");
		} else
			log("DOES THIS ADDRESS LOOK CORRECT? is not Displayed");

	}
	public void verifyDeliveryAddress() {
		if (deliveryAddress.isDisplayed())
			log("Delivery Address is Displayed");
		else
			log("Delivery Address not Displayed");
	}
	public void getVerifyOptional() {
		if (verifyOptional.isDisplayed())
			log("Verify Optional is Displayed");
		else
			log("Verify Optional is not Displayed");
	}

	public void getAddNewAddress() {
		if (addNewAddress.isDisplayed())
			log("Add New Address is Displayed");

		else
			log("Add New Address is not Displayed");

	}

	public void getSignUpToSaveAddress() {
		if (signUpToSaveAddress.isDisplayed())
			log("Sign Up To Save Address link is Displayed");

		else
			log("Sign Up To Save Address link  is not Displayed");

	}

	public void getEnterAptUnitValue(String Value) {

		enterAptUnitValue.click();
		enterAptUnitValue.sendKeys(Value);

		if (clickDeliverHere.isDisplayed()) {
			clickDeliverHere.click();
		}
	}

	public void getClickDeliverHere() {
		clickDeliverHere.click();
	}
	public void getHomeHeader() {
		if (homeHeader.isDisplayed())
			log("Home Header is Displayed");
		else
			log("Home Header is not Displayed");
	}

	public void getLastDeliveryLocation() {
		if (lastDeliveryLocation.isDisplayed())
			log("Home Header is Displayed");
		else
			log("Home Header is not Displayed");
	}

	public void getClickChangeCTA() {
		clickChangeCTA.click();
	}

	public void getVerifyOrderInfoHeader() {
		if (verifyOrderInfoHeader.isDisplayed())
			log("Order Info Header is Displayed");
		else
			log("Order Info Header is not Displayed");
	}

	public void getDeliveryAddressTitle() {
		if (deliveryAddressTitle.isDisplayed())
			log("Delivery Address Title is Displayed");
		else
			log("Delivery Address Title is not Displayed");

	}

	public void getScheduleFor() {
		if (scheduleFor.isDisplayed())
			log("Schedule For is Displayed");
		else
			log("Schedule Foris not Displayed");

	}
	
	public void getClickLaterOption() {
		clickLaterOption.click();
	}
	
	public void getVerifyScheduledTime() {
		if (verifyScheduledTime.isDisplayed())
			log("Scheduled for date and Time is Displayed");
		else
			log("Scheduled for date and Time is not Displayed");
	}

	public void getClickConfirm() {
		clickConfirm.click();
	}

	public void getClickEditOption() {
		clickEditOption.click();

	}
	public void getClickEditOptionForLogin() {
		clickEditOptionForLogin.click();
	}

	public void getClickSearchIcon() {
		clickSearchIcon.click();

	}

	public void getClickCloseOption() {
		clickCloseOption.click();
	}

	public void getClickSearchBarAgain(String location) {
		clickSearchBarAgain.click();
			clickSearchBarAgain.sendKeys(location);
			waitFor(2000);
			//WaitVisibilityOfElement(clickFirstSearchOption);
		if (clickFirstSearchOption.isDisplayed()) {
			clickFirstSearchOption.click();
			clickFirstSearchOption.click();
		}
	}

	public void getClickEnableLocationServices() {
		clickEnableLocationServices.click();
	}

	public void getVerifyGeoPermission() {
		if (verifyGeoPermission.isDisplayed())
			log("Verify Geo Location Permission Modal is Displayed");
		else
			log("Verify Geo Location Permission Modal is not Displayed");

	}

	public void getClickWhileUsingApp() {
		if (!osName.equalsIgnoreCase("IOS")) {
			if (clickWhileUsingApp.isDisplayed()) {
				log("The Geo Location Permission Modal is displayed");
				clickWhileUsingApp.click();
				log("While Using The App option is selected");
			}
		}
	}

	public void getClickOnlyThisTime() {
		if (!osName.equalsIgnoreCase("IOS")) {
			if (clickOnlyThisTime.isDisplayed()) {
				log("Click Only This Time Modal is displayed");
				clickOnlyThisTime.click();
				log("Click Only This Time option is selected");
			}
		}
	}

	public void getVerifyOutOfDeliveryRange() {
		if (verifyOutOfDeliveryRange.isDisplayed())
			log("Sorry You Are Out Of The Delivery Range Modal is diplayed");
		else
			log("Sorry You Are Out Of The Delivery Range Modal is not diplayedd");

	}

	public void getVerifyChangeToPickUp() {
		if (verifyChangeToPickUp.isDisplayed())
			log("Verify Change To PickUp Button is Displayed");
		else
			log("Verify Change To PickUp Button is not Displayed");

	}

	public void getVerifyTryAnotherAddress() {
		if (verifyTryAnotherAddress.isDisplayed())
			log("Verify Try Another Address Button is Displayed");
		else
			log("Verify Try Another Address Buttonis not Displayed");

	}

	public void getClickCancelIcon() {
		clickCancelIcon.click();
	}

	public void getVerifyFindMyLocation() {
		if (verifyFindMyLocation.isDisplayed())
			log("Verify Find My Location Buttion is Displayed");
		else
			log("Verify Find My Location Buttion is not Displayed");

	}
	public void clickFindMyLocation() {
		verifyFindMyLocation.click();
	}

	public void clickChangeToPickUp() {
		verifyChangeToPickUp.click();
	}
	
	public void clickTryAnotherAddress() {
		verifyTryAnotherAddress.click();
	}
	
	public void clickSearchBar( ) {
		ClickSearchBar.click();
		ClickSearchBar.sendKeys("Atlanta");
		if (click1stSearchOption.isDisplayed()) {
			click1stSearchOption.click();
			click1stSearchOption.click();
		}
	}

}
