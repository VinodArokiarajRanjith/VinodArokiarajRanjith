package com.fb.pageObject;

import static org.junit.Assert.assertTrue;
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

public class HomePage extends Utilities {


	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageView']")
	@FindBy(id = "select location")
	public WebElement lbl_meos;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/select-location")
	@FindBy(id = "fbrstoresearchheader/select-location")
	public WebElement lbl_selectLocation;
	
	@AndroidFindBy(id= "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/street-city-state-zip")
	@FindBy(id = "street,city,state,zip")
	public WebElement btn_searchBar;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/Message")
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name='fbrlocationservicenotenable/set-a-location-to-get-you-fed'])[1]")
	public WebElement lbl_setALocation;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/SubMessage")
	@FindBy(id = "menu availability and pricing vary by location")
	public WebElement lbl_menuAvailability;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlocationservicenotenable/enable-location-service")
	@FindBy(id = "fbrlocationservicenotenable/enable-location-service")
	public WebElement btn_enableLocation;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='No locations in this area']")
	public WebElement lbl_noLocationsError;
	
	@AndroidFindBy(accessibility = "change-order-details")
	@FindBy(id = "fbrchange/change-order-details")
	public WebElement btn_change;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	@FindBy(id = "fbrtabmenu/delivery-selected")
	public WebElement btn_deliveryTab;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/pickup-selected")
	@FindBy(id = "fbrtabmenu/pickup-selected")
	public WebElement btn_pickupTab;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/map-button")
	@FindBy(id = "fbrstoresearchheader/map-button")
	public WebElement btn_mapView;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/back")
	@FindBy(id = "fbrstoresearchheader/back")
	public WebElement btn_back;
	
	@AndroidFindBy(accessibility = "map search area")
	@FindBy(id = "change order details")
	public WebElement btn_searchThisArea;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/pickup-Locations")
	@FindBy(id = "fbrstoresearchheader/list-button")
	private WebElement lbl_pickupAddress;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopnavigationcart/Shopping-Bag/0-item")
	@FindBy(id = "cart")
	private WebElement btn_cart;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add product']")
	@FindBy(id = "Add product")
	private WebElement btn_addProduct;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add product']")
	@FindBy(id = "Start Order")
	private WebElement btn_startOrder; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/Message")
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'NO LOCATIONS')]")
	private WebElement lbl_noLocationInThisArea; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/SubMessage")
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Try entering a new address or')]")
	private WebElement lbl_tryEnteringNewAddress; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstorepickupoutofrange/SORRY-YOU-ARE-OUT-OF-THE-DELIVERY-RANGE")
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'OUT OF THE DELIVERY RANGE')]")
	private WebElement lbl_outOfDeliveryRange; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstorepickupoutofrange/SubMessage-try-pickup")
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'deliver to that address')]")
	private WebElement lbl_looksLike; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstorepickupoutofrange/CHANGE-TO-PICKUP")
	@FindBy(id = "change to pickup title")
	private WebElement btn_changeToPickup; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstorepickupoutofrange/TRY-ANOTHER-ADDRESS")
	@FindBy(id = "try another address")
	private WebElement btn_tryAnotherAddress;  
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstorepickupoutofrange/close-button")
	@FindBy(id = "cancel icon")
	private WebElement btn_closeOutOfRangePopup;
	
	@AndroidFindBy(id="com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/Last-pickup-Timing")
	private WebElement lbl_timeOptions;
	
	@AndroidFindBy(accessibility = "menu")
	@FindBy(id = "fbrhome/home")
	public WebElement btn_Hamburg;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name")
	@FindBy(id = "Your Account")
	public WebElement btn_YourAccount;

	@AndroidFindBy(accessibility = "back")
	@FindBy(id = "fbrstoresearchheader/back")
	public WebElement btn_CloseButton;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccount/list-name")
	@FindBy(id = "PERSONAL INFO")
	public WebElement btn_PersonalInfo;

	@AndroidFindBy(accessibility = "Account")
	@FindBy(id = "fbraccount/account")
	public WebElement btn_AccountHeader;

	@AndroidFindBy(accessibility = "back")
	@FindBy(id = "fbrstoresearchheader/back")
	public WebElement btn_AccountBack;
	
	
	public HomePage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	static String platformVersion = System.getProperty("platformVersion");
    static String osName = driver.getCapabilities().getCapability("platformName").toString();
    OrderInfoPage oi = new OrderInfoPage(driver);
    FBsCommonMethods cm = new FBsCommonMethods(driver);
    
	public void selectLocationPagePickupTabFieldValidation(String exp_selectLocation, String exp_pickUp, String exp_enableLocation) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS")) 
			strProperty = "label";
	Boolean vlu_selectLocation = lbl_selectLocation.isDisplayed();
	String actual_text = lbl_selectLocation.getAttribute(strProperty); //iOS: select location
	
	
	if (osName.equalsIgnoreCase("IOS")) 
		 actual_text = lbl_selectLocation.getAttribute(strProperty).toLowerCase();
	if (vlu_selectLocation == true & actual_text.equalsIgnoreCase(exp_selectLocation)) 
		logging(condition.pass,"The SelectLocation Header is present and text is same as expected");
	else {
		logging(condition.warning,"The SelectLocation Header is not present or text is not same as expected");
	assertTrue("The SelectLocation Header is not present or text is not same as expected", vlu_selectLocation);
	}
	
	boolean vlu_mapView = btn_mapView.isDisplayed();
	if (vlu_mapView == true) 
		logging(condition.pass,"MapView button is displayed");
	else {
		logging(condition.warning,"MapView button is not displayed");
	    assertTrue("MapView button is not displayed", vlu_mapView);
	}	
	
	boolean vlu_back = btn_back.isDisplayed();
	if (vlu_back == true) 
		logging(condition.pass,"Back button is displayed");
	else {
		logging(condition.warning,"Back button is not displayed");
	    assertTrue("Back button is not displayed", vlu_back);
	}	
	
	boolean vlu_pickUp = btn_pickupTab.isDisplayed();
	String actual_pickUp = btn_pickupTab.getAttribute(strProperty); // iOS: Not Present
    if (osName.equalsIgnoreCase("IOS")) 
    	actual_pickUp = "PICKUP";
	if (vlu_pickUp == true & actual_pickUp.equals(exp_pickUp)) 
		logging(condition.pass,"The Pickup button is present and the text is same as expected");
	else {
		logging(condition.warning,"The Pickup button is not present or the text is not same as expected");
	    assertTrue("The Pickup button is not present or the text is not same as expected", vlu_pickUp);
	}	
	
	if (btn_searchBar.isDisplayed() == true ) 
		logging(condition.pass,"The Searchbar text field is present and the text present inside the text field is same as expected");
	else {
		logging(condition.warning,"The Searchbar text field is not present or the text present inside the text field is not same as expected");
	    assertTrue("The Searchbar text field is not present or the text present inside the text field is not same as expected", btn_searchBar.isDisplayed());
	}	
	
	List<WebElement> lbl_setALocatio = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrtopbar/Message"));
	if (lbl_setALocatio.size() > 0) {
		String actual_setALocation = lbl_setALocation.getAttribute(strProperty); 
		if (lbl_setALocation.isDisplayed()) {
		if (actual_setALocation.toUpperCase().contains("SET A LOCATION") & actual_setALocation.toUpperCase().contains("TO GET YOU FED")) 
			logging(condition.pass,"The text: "+actual_setALocation+" is present and it is same as expected");
			else {
				logging(condition.warning,"The text: "+actual_setALocation+" is not present or it is not same as expected");
			    assertTrue("The text: "+actual_setALocation+" is not present or it is not same as expected", lbl_setALocation.isDisplayed());
			}	
		}
		boolean vlu_menuAvailability = lbl_menuAvailability.isDisplayed();
		String actual_menuAvailability = lbl_menuAvailability.getAttribute(strProperty); // iOS: Menu availability and pricing vary by location.
		if (vlu_menuAvailability == true) {
		if (actual_menuAvailability.toLowerCase().contains("menu availability and pricing vary") & actual_menuAvailability.contains("by location")) 
			logging(condition.pass,"The text: "+actual_menuAvailability+" is present and it is same as expected");
		else {
			logging(condition.warning,"The text: "+actual_menuAvailability+" is not present or it is not same as expected");
		    assertTrue("The text: "+actual_menuAvailability+" is not present or it is not same as expected", vlu_menuAvailability);
		}	
		}
		boolean vlu_enableLocation = btn_enableLocation.isDisplayed();
		String actual_enableLocation = btn_enableLocation.getAttribute(strProperty); //iOS: enable location service
		System.out.println(actual_enableLocation + exp_enableLocation);
		if (vlu_enableLocation == true & exp_enableLocation.toLowerCase().contains(actual_enableLocation.toLowerCase())) 
			logging(condition.pass,"The text: "+exp_enableLocation+" is present and it is same as expected");
		else {
			logging(condition.warning,"The text: "+exp_enableLocation+" is not present or it is not same as expected");
		    assertTrue("The text: "+exp_enableLocation+" is not present or it is not same as expected", vlu_enableLocation);
		}	
		}else {
		logging(condition.pass,"The text: SWITCH TO MAP VIEW is present and it is same as expected");
		String actual_noLocation = lbl_noLocationInThisArea.getAttribute(strProperty);
		if (lbl_noLocationInThisArea.isDisplayed()) {
			logging(condition.pass,"The text: "+actual_noLocation+" is present and it is same as expected");
			}
		else {
			logging(condition.warning,"The text: "+actual_noLocation+" is not present or it is not same as expected");
			    assertTrue("The text: "+actual_noLocation+" is not present or it is not same as expected", lbl_noLocationInThisArea.isDisplayed());
			}
		String actual_tryEnteringNewAddress = lbl_tryEnteringNewAddress.getAttribute(strProperty);
		if (lbl_tryEnteringNewAddress.isDisplayed()) {
			logging(condition.pass,"The text: "+actual_tryEnteringNewAddress+" is present and it is same as expected");
			}
		else {
			logging(condition.warning,"The text: "+actual_tryEnteringNewAddress+" is not present or it is not same as expected");
			    assertTrue("The text: "+actual_tryEnteringNewAddress+" is not present or it is not same as expected", lbl_tryEnteringNewAddress.isDisplayed());
			}
	}
	}
	
	public void selectLocationDeliveryTabFieldValidation(String exp_deliveryTab, String exp_enableLocation) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS")) 
			strProperty = "label";
		List<WebElement> lbl_switchToMapView = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrlist/switch-to-map-view"));
		btn_deliveryTab.click();
		if (lbl_switchToMapView.size() > 0) {
			String actual_outOfDelivery = lbl_outOfDeliveryRange.getAttribute(strProperty);
		if (lbl_outOfDeliveryRange.isDisplayed()) 
			logging(condition.pass,"The text: "+actual_outOfDelivery+" is present and it is same as expected");
	    	else {
	    		logging(condition.warning,"The text: "+actual_outOfDelivery+" is not present or it is not same as expected");
	    	    assertTrue("The text: "+actual_outOfDelivery+" is not present or it is not same as expected", lbl_outOfDeliveryRange.isDisplayed());
	    	}
		
		String actual_looksLike = lbl_looksLike.getAttribute(strProperty);
		if (lbl_looksLike.isDisplayed()) 
			logging(condition.pass,"The text: "+actual_looksLike+" is present and it is same as expected");
	    	else {
	    		logging(condition.warning,"The text: "+actual_looksLike+" is not present or it is not same as expected");
	    	    assertTrue("The text: "+actual_looksLike+" is not present or it is not same as expected", lbl_looksLike.isDisplayed());
	    	}
		
		String actual_changeToPickup = btn_changeToPickup.getAttribute(strProperty);
		if (btn_changeToPickup.isDisplayed()) 
			logging(condition.pass,"The text: "+actual_changeToPickup+" is present and it is same as expected");
	    	else {
	    		logging(condition.warning,"The text: "+actual_changeToPickup+" is not present or it is not same as expected");
	    	    assertTrue("The text: "+actual_changeToPickup+" is not present or it is not same as expected", btn_changeToPickup.isDisplayed());
	    	}
		
		String actual_tryAnotherAddress = btn_tryAnotherAddress.getAttribute(strProperty);
		if (btn_tryAnotherAddress.isDisplayed()) 
			logging(condition.pass,"The text: "+actual_tryAnotherAddress+" is present and it is same as expected");
	    	else {
	    		logging(condition.warning,"The text: "+actual_tryAnotherAddress+" is not present or it is not same as expected");
	    	    assertTrue("The text: "+actual_tryAnotherAddress+" is not present or it is not same as expected", btn_tryAnotherAddress.isDisplayed());
	    	}
		btn_closeOutOfRangePopup.click();
		}else {
		 boolean vlu_deliveryTab = btn_deliveryTab.isDisplayed();
		 String  act_deliveryTab = btn_deliveryTab.getAttribute(strProperty);
		 if (osName.equalsIgnoreCase("IOS")) 
		 act_deliveryTab = "DELIVERY";
    	if (vlu_deliveryTab == true & act_deliveryTab.equals(exp_deliveryTab)) 
    		logging(condition.pass,"The Button: "+exp_deliveryTab+" is present and it is same as expected");
    	else {
    		logging(condition.warning,"The Button: "+exp_deliveryTab+" is not present or it is not same as expected");
    		 assertTrue("The Button: "+exp_deliveryTab+" is not present or it is not same as expected", vlu_deliveryTab);
    	}	
    	
    	boolean vlu_setALocation = lbl_setALocation.isDisplayed();
    	String actual_setALocation = lbl_setALocation.getAttribute(strProperty); // iOS: SET A LOCATION TO GET YOU FED
    	if (vlu_setALocation == true) {
    	if (actual_setALocation.toUpperCase().contains("SET A LOCATION") & actual_setALocation.toUpperCase().contains("TO GET YOU FED")) 
    		logging(condition.pass,"The text: "+actual_setALocation+" is present and it is same as expected");
    		else {
    			logging(condition.warning,"The text: "+actual_setALocation+" is not present or it is not same as expected");
    		    assertTrue("The text: "+actual_setALocation+" is not present or it is not same as expected", vlu_setALocation);
    		}	
    	}
    		
    	
    	boolean vlu_menuAvailability = lbl_menuAvailability.isDisplayed();
    	String actual_menuAvailability = lbl_menuAvailability.getAttribute(strProperty); // iOS: Menu availability and pricing vary by location.
    	if (vlu_menuAvailability == true) {
    	if (actual_menuAvailability.contains("menu availability and pricing vary") & actual_menuAvailability.contains("by location")) 
    		logging(condition.pass,"The text: "+actual_menuAvailability+" is present and it is same as expected");
    	else {
    		logging(condition.warning,"The text: "+actual_menuAvailability+" is not present or it is not same as expected");
    	    assertTrue("The text: "+actual_menuAvailability+" is not present or it is not same as expected", vlu_menuAvailability);
    	}	
    	}    		
    	
    	boolean vlu_enableLocation = btn_enableLocation.isDisplayed();
    	String act_enableLocation = btn_enableLocation.getAttribute(strProperty);
    	if (vlu_enableLocation == true & exp_enableLocation.toLowerCase().contains(act_enableLocation.toLowerCase())) 
    		logging(condition.pass,"The text: "+exp_enableLocation+" is present and it is same as expected");
    	else {
    		logging(condition.warning,"The text: "+exp_enableLocation+" is not present or it is not same as expected");
    	    assertTrue("The text: "+exp_enableLocation+" is not present or it is not same as expected", vlu_enableLocation);
    	}	
		}
    	
    	btn_pickupTab.click();	
	}
	
	
	public void homePageFieldValidation(String exp_restaurant) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS")) 
			strProperty = "value";
		
		String act_pickUpRestaurant = lbl_pickupAddress.getAttribute(strProperty);
		if (lbl_pickupAddress.isDisplayed() & act_pickUpRestaurant.toLowerCase().contains(exp_restaurant.toLowerCase())) 
			logging(condition.pass,"The text: "+act_pickUpRestaurant+" is present and it is same as expected");
    	else {
    		logging(condition.warning,"The text: "+act_pickUpRestaurant+" is not present or it is not same as expected");
    	    assertTrue("The text: "+act_pickUpRestaurant+" is not present or it is not same as expected", lbl_pickupAddress.isDisplayed());
    	}	
		
		if (btn_cart.isDisplayed()) 
			logging(condition.pass,"The Button: CART is displayed as expected");
    	else {
    		logging(condition.warning,"The Button: CART is not displayed as expected");
    	    assertTrue("The Button: CART is not displayed as expected", btn_cart.isDisplayed());
    	}	
			
        if (btn_addProduct.isDisplayed()) 
        	logging(condition.pass,"The Button: ADD PRODUCT is displayed as expected");
    	else {
    		logging(condition.warning,"The Button: ADD PRODUCT is not displayed as expected");
    	    assertTrue("The Button: ADD PRODUCT is not displayed as expected", btn_addProduct.isDisplayed());
    	}		
        
        if (btn_startOrder.isDisplayed()) 
        	logging(condition.pass,"The Button: START ORDER is displayed as expected");
    	else {
    		logging(condition.warning,"The Button: START ORDER is not displayed as expected");
    	    assertTrue("The Button: START ORDER is not displayed as expected", btn_startOrder.isDisplayed());
    	}	
        
        if (btn_change.isDisplayed()) 
        	logging(condition.pass,"The Button: CHANGE is displayed as expected");
    	else {
    		logging(condition.warning,"The Button: CHANGE is not displayed as expected");
    	    assertTrue("The Button: CHANGE is not displayed as expected", btn_change.isDisplayed());
    	}	
        
	}
	
	
	public void validateHomePage() {
		boolean vlu_change = btn_change.isDisplayed();
		if (vlu_change == true) 
		logging(condition.pass,"User Navigated to the HomePage as expected");
		else
		logging(condition.warning,"User is not Navigated to the HomePage as expected");	
	}
	
	public void editLocation(String userType,String location, String restaurant) {
		List<WebElement> vlu_change = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details"));
		if (vlu_change.size() > 0) {
			waitFor(3000);
     WaitVisibilityOfElement(btn_change);
     btn_change.click();
     oi.clickEditButton();
	}else {
	cm.selectLocationIfNotSelected(userType, location, restaurant);	
	}
	}
	
	public void ClickOnHamburgButton() {
		btn_Hamburg.click();
		if (btn_YourAccount.isDisplayed())
			logging(condition.info, "User Navigated to Hamburg page");
		else
			logging(condition.info, "User failed to naviagte to Hamburg page");
	}

	public void verifyAccountHeaderandBackButton() {
		if (btn_AccountHeader.isDisplayed())

			logging(condition.info, "account header is displaying");

		else
			logging(condition.info, "account header is not displaying");

	}

}
