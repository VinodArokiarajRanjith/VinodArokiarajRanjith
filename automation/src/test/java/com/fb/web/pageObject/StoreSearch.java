package com.fb.web.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.web.commonmethods.Webcommonmethods;

public class StoreSearch extends Utilities{


	private static Logger logger = LogManager.getLogger(SignUpPage.class);
	Webcommonmethods webcommon = new Webcommonmethods(driver);
	RestaurantDetails restaurant=new RestaurantDetails(driver);
	WelcomePage welcomepage = new WelcomePage(driver);

	public StoreSearch(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	//..........Store Search Page locators...........
	@FindBy(id = "BTN_STARTORDER")
	private WebElement btn_StoreSearch;
	@FindBy(id = "img_moesLogo")
	private WebElement logo_MoEs;
	@FindBy(xpath = "//h2[@data-testid='txt_selectloction']")
	private WebElement label_SelectionLocation;
	@FindBy(id = "btn_pickup")
	private WebElement btn_PickUp;
	@FindBy(id = "btn_delivery")
	private WebElement btn_Delivery;
	@FindBy(id="store-search-label")
	private WebElement label_StoreSearch;
	@FindBy(id="store-search-input")
	private WebElement inputField_StoreSearch;
	@FindBy (id="btn_submit_store_search")
	private WebElement icon_Search;
	@FindBy(xpath="//button[text()='Recents']")
	private WebElement btn_Recents;
	@FindBy(id="//button[text()='Nearby']")
	private WebElement lbl_nearBy;
	@FindBy(xpath="//div[@data-testid='txt_accuratePricingText']")
	private WebElement txt_SetALocation;
	@FindBy (xpath="//div[@data-testid='txt_menuAvailabilityText']")
	private WebElement txt_MenuAvailability;
	@FindBy(id="btn_enableLocation")
	private WebElement btn_EnableLocation;
	@FindBy (xpath="//button[@data-testid='link_back']//img[@aria-label='close']")
	private WebElement icon_close;
	@FindBy(xpath="//div[text()='Sign up to view recent locations']")
	private WebElement txt_SignUpToView;
	@FindBy(id="btn_signup")
	private WebElement btn_SignUp;
	@FindBy (xpath="//button[@aria-label='find my location']")
	private WebElement btn_FindMyLocation;
	@FindBy (xpath="//div[@class='locationName']")
	private WebElement lbl_RestaurantName;
	@FindBy (xpath="//div[@class='restaurantInfoHeadingDesk']//span[@data-testid='txt_storeinfo']")
	private WebElement lbl_RestaurantInfo;
	
	//Delivery Tab
	@FindBy (xpath="//div[@data-testid='txt_accuratePricing']")
	private WebElement txt_SetALocationDelivery;
	@FindBy (xpath="//div[@data-testid='txt_menuAvailability']")
	private WebElement txt_MenuAvailabilityDelivery;
	@FindBy (xpath="//button[@aria-label='find my location']")
	private WebElement btn_FindMyLocationCTA;

	//...welcome Page
	@FindBy (xpath="//a[@data-testid='txt_guest_account']")
	private WebElement link_GuestUser;
	
	//...Home Page
	@FindBy (id="order_changeButtonId")
	private WebElement btn_Change;

	public void clickOnStoreSearch() {
		TapElement(btn_StoreSearch);
	}

	

	public void verifyUISelectLocationPickUp(String setALocation,String menuAvailability) {
		logging(condition.info, "Select Location UI validation is started for Pick Up......" );
		WaitVisibilityOfElement(label_SelectionLocation);
		boolean status_SelectLocation = label_SelectionLocation.isDisplayed();
		String value_SelectLocation = label_SelectionLocation.getText();
		if (status_SelectLocation==true) {
			logging(condition.pass, value_SelectLocation + " is displayed as expected");
		} else {
			logging(condition.warning, value_SelectLocation + " is displayed as expected");
		}

		boolean status_PickUpCTA = btn_PickUp.isDisplayed();
		if (status_PickUpCTA==true) {
			logging(condition.pass, "Pick Up CTA is displayed as expected");
		} else {
			logging(condition.warning, "Pick Up CTA not is displayed as expected");
		}

		
		boolean status_SearchIcon = icon_Search.isDisplayed();
		if(status_SearchIcon==true)
		{
			logging(condition.pass, "User is able to view search Icon");
		}
		else {
			logging(condition.warning, "User is not able to view search Icon");
		}

		boolean status_StoreSearchLabel = label_StoreSearch.isDisplayed();
		String value_StoreSearchLabel = label_StoreSearch.getText();
		if (status_StoreSearchLabel==true) {
			logging(condition.pass, value_StoreSearchLabel + " is displayed as expected");
		} else {
			logging(condition.warning, value_StoreSearchLabel + " not is displayed as expected");
		}

		String value_SetALocation = txt_SetALocation.getText().toUpperCase();
		if (value_SetALocation.equals(setALocation)) {
			logging(condition.pass, value_SetALocation + " is displayed as expected");
		} else {
			logging(condition.warning, value_SetALocation + " is not displayed as expected");
		}

		String value_menuAvailability = txt_MenuAvailability.getText();
		if (value_menuAvailability.equals(menuAvailability)) {
			logging(condition.pass, value_menuAvailability + " is displayed as expected");
		} else {
			logging(condition.warning, value_menuAvailability+ " is not displayed as expected");
		}

		boolean status_EnableLocationCTA = btn_EnableLocation.isDisplayed();
		if (Webcommonmethods.scrollDownToElement(driver, btn_EnableLocation)) {
			logging(condition.pass, btn_EnableLocation.getText()+" until scroll down");
			if (status_EnableLocationCTA==true) {
				logging(condition.pass, "User is able to view Enable Location Services CTA as expected");
			} else {
				logging(condition.warning, "User is unable to view Enable Location Services CTA as expected");
			}
		}
		logging(condition.info, "Select Location UI validation is completed for Pick Up......");
	}

	
	public void verifyUISelectLocationDelivery(String setALocation,String menuAvailability) {
		logging(condition.info, "Select Location UI validation is started for Delivery......" );
		boolean status_SearchIcon = icon_Search.isDisplayed();
		if(status_SearchIcon==true)
		{
			logging(condition.pass, "User is able to view search Icon");
		}
		else {
			logging(condition.warning, "User is not able to view search Icon");
		}
		
		boolean status_DeliveryCTA = btn_Delivery.isDisplayed();
		if (status_DeliveryCTA==true) {
			logging(condition.pass, "Pick Up CTA is displayed as expected");
		} else {
			logging(condition.warning, "Pick Up CTA not is displayed as expected");
		}
		
		boolean status_StoreSearchLabel = label_StoreSearch.isDisplayed();
		String value_StoreSearchLabel = label_StoreSearch.getText();
		if (status_StoreSearchLabel==true) {
			logging(condition.pass, value_StoreSearchLabel + " is displayed as expected");
		} else {
			logging(condition.warning, value_StoreSearchLabel + " not is displayed as expected");
		}
		
		String value_SetALocation = txt_SetALocationDelivery.getText().toUpperCase();
		if (value_SetALocation.equals(setALocation)) {
			logging(condition.pass, value_SetALocation + " is displayed as expected");
		} else {
			logging(condition.warning, value_SetALocation + " is not displayed as expected");
		}
		
		String value_MenuAvailability = txt_MenuAvailabilityDelivery.getText();
		if (status_StoreSearchLabel) {
			logging(condition.pass, value_MenuAvailability + " is displayed as expected");
		} else {
			logging(condition.warning, value_MenuAvailability+ "is not displayed as expected");
		}
		
		boolean status_FindMyLocation = btn_FindMyLocationCTA.isDisplayed();
		if (status_FindMyLocation==true) {
			logging(condition.pass, " Find My Location CTA is displayed as expected");
		} else {
			logging(condition.warning, " Find My Location CTA is not displayed as expected");
		}
	
	}









	public void verifyTextMenuAvailabilityDeliveryTab(String menuAvialabilityText) {
		WaitVisibilityOfElement(txt_MenuAvailability);
		String menuAvailabilityInDelivery = txt_MenuAvailability.getText();

		if(menuAvailabilityInDelivery.equals(menuAvialabilityText))
		{
			logging(condition.pass, "Menu availability and prices may vary by location."+"displayed in Delivery tab");
		}
		else {
			logging(condition.fail, "Menu availability and prices may vary by location."+"not displayed in Delivery tab");
		}

	}





	public void clickOnDeliveryTab() {
		TapElement(btn_Delivery);
	}

	public void verifyNearByTab() {
		WaitVisibilityOfElement(lbl_nearBy);
		if(lbl_nearBy.isDisplayed()==true)
		{
			logging(condition.pass, "User is navigated to NearBy Tab successfully");
		}
		else {
			logging(condition.fail, "User is not navigated to NearBy Tab");
		}
	}

	public void verifyRecentsTab() {
		WaitVisibilityOfElement(btn_Recents);
		if(btn_Recents.isDisplayed()==true)
		{
			logging(condition.pass, "User is navigated to Recents Tab successfully");
		}
		else {
			logging(condition.fail, "User is not navigated to Recents Tab");
		}
	}





	

	




	public void verifySignUpToViewContent() {
		WaitVisibilityOfElement(txt_SignUpToView);
		if(txt_SignUpToView.isDisplayed()==true)
		{
			logging(condition.pass, "User is able to view Sign Up to View ... content in Delivery tab");
		}
		else {
			logging(condition.fail, "User is unable to view Sign Up to view ... content in Delivery tab");
		}
	}

	public void verifySignUpBtn() {
		WaitVisibilityOfElement(btn_SignUp);
		if (btn_SignUp.isDisplayed()==true) {
			logging(condition.pass, "User is able to view the Sign Up button in Delivery tab");
		} else {
			logging(condition.fail, "User is unable to view the Sign Up button in Delivery tab");
		}

	}


	public void verifyCloseIcon() {
		WaitVisibilityOfElement(icon_close);
		if (icon_close.isDisplayed()==true) {
			logging(condition.pass, "User is able to view the close icon");
		} else {
			logging(condition.fail, "User is unable to view the close icon");
		}

	}

	public void clickOnCloseIcon() {
		TapElement(icon_close);
	}

	public void verifySearchLocationInputField() {
		//WaitVisibilityOfElement(inputField_StoreSearch);
		waitFor(2000);
		if(inputField_StoreSearch.isDisplayed()==true)
		{
			logging(condition.pass, "User is able to view search input field successfully");
		}
		else {
			logging(condition.fail, "User is not able to view search input field");
		}

	}

	public void verifyFindMyLocationCTA() {
		WaitVisibilityOfElement(btn_FindMyLocation);
		if(btn_FindMyLocation.isDisplayed()==true)
		{
			logging(condition.pass, "User is able to view Find My Location CTA");
		}
		else {
			logging(condition.fail, "User is unable to view able to view Find My Location CTA");
		}

	}

	public void verifyPreSelectedTab() {
		//WaitVisibilityOfElement(btn_PickUp);
		waitFor(2000);
		verifyDefaultTab(btn_PickUp);
	}

	public void verifyDefaultTab(WebElement elementref) {
		boolean selected = elementref.isSelected();

		if (selected) {

			logging(condition.pass, elementref.getText()+" is selected as default");

		} else {
			logging(condition.fail, elementref.getText()+" is not selected as default");

		}


	}

	public void clickOnRestaurant() {
		waitFor(3000);
		Actions a = new Actions(driver);
		//lbl_RestaurantName.click();
		a.moveToElement(lbl_RestaurantName).perform();
		waitFor(3000);
	}

	public void clickOnEnableLocationServices() {
		Alert alert = driver.switchTo().alert();
		String alertMessage= alert.getText();
		waitFor(10000);
		webcommon.scrollDownToElement(driver, btn_EnableLocation);
		TapElement(btn_EnableLocation);

	}

	public void verifyRestaurantInfo() {
		waitFor(3000);
		if (lbl_RestaurantInfo.isDisplayed()==true) {
			logging(condition.pass, "User is able to navigate to"+lbl_RestaurantInfo.getText()+ "Page successfully");

		} else {
			logging(condition.warning, "User is unable to navigate to"+lbl_RestaurantInfo.getText()+ "Page successfully");
		}
	}



	public void clickOnGuestUserLink() {
		welcomepage.clickOnGuestUserLink();
				
	}
	
	public void clickOnChangeCTA() {
		waitFor(2000);
		//TapElement(btn_Change);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btn_Change);
		logging(condition.pass, "User is clicked Change CTA as expected");
	}

	public void verifySelectionLocationHeader() {
		WaitVisibilityOfElement(label_SelectionLocation);
		boolean status_SelectLocation = label_SelectionLocation.isDisplayed();
		if (status_SelectLocation==true) {
			logging(condition.pass, "User is navigated to Select Location page");
		} else {
			logging(condition.warning, "User is not navigated to Select Location page");
		}
	}






}
