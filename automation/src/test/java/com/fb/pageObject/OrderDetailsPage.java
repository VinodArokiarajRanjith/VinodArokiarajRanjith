package com.fb.pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderDetailsPage extends Utilities {



	@FindBy(id = "fbrchange/change-order-details")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details")
	public WebElement clickChangeCTA;

	@FindBy(id = "fbrscheduletimemodal/order-info")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrscheduletimemodal/order-info")
	public WebElement verifyOrderInfoHeader;

	@FindBy(id = "fbrorderoverlay/your-restorent")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/your-restorent")
	public WebElement yourMoesRestaurant;

	@FindBy(id = "fbrscheduletime/title")
	@AndroidFindBy(xpath = "//*[@text='SCHEDULE FOR']")
	public WebElement scheduleFor;

	@FindBy(id = "fbrorderoverlay/edit")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/edit")
	public WebElement clickEdit;

	@FindBy(id = "fbrstoresearchheader/select-location")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearchheader/select-location")
	public WebElement verifySelectLocationHeader;

	@FindBy(id = "fbrstoresearch/street-city-state-zip")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/street-city-state-zip")
	public WebElement clickPickupSearchField;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Moe's Sandbox 1, Revel Est. 11 ***MASTER MENU***, 331 North Marine Drive, Tamuning, GU, 96913\"])[3]")
	@AndroidFindBy(accessibility = "Moe's Sandbox 1, Revel Est. 11 ***MASTER MENU***, 331 North Marine Drive, Tamuning, GU, 96913")
	public WebElement clickFirstAutoSuggested;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"fbrstoresearchitem/order-now-text\"])[1]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Moe's Sandbox 1, Revel Est. 11 ***MASTER MENU***order now\"])[2]")
	public WebElement clickOrderNowCTA;

	@FindBy(id = "fbrorderoverlay/pickup-locationName")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/pickup-locationName")
	public WebElement verifyUpdatedPickUpAddress;

	@FindBy(id = "fbrtabmenu/delivery-selected")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrtabmenu/delivery-selected")
	public WebElement switchToDeliveryTab;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"fbrorderoverlay/delivery-address\"]")
	@AndroidFindBy(accessibility = "delivery address")
	public WebElement updatedDeliveryAddress;

	@FindBy(id = "fbrhome/Add-product")
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Add product\"]")
	public WebElement addProduct;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Add Product Modal\"])[6]")
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Add Product Modal\"])[1]")
	public WebElement addProductToCart;

	@FindBy(id = "fbrtopnavigationcart/Shopping-Bag/1-item")
	@AndroidFindBy(accessibility = "Shopping-Bag1-item")
	public WebElement clickCart;

	@FindBy(id = "fbrlastpickup/cartTitle")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/cartTitle")
	public WebElement verifyMyCartHeader;

	@FindBy(id = "fbrlastpickup/checkout_menu")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/checkout_menu")
	public WebElement clickCheckout;

	@FindBy(id = "fbrcheckout/checkoutHeading")
	@AndroidFindBy(accessibility = "checkout heading")
	public WebElement verifyCheckoutHeader;

	@FindBy(id = "fbrcheckout/yourealmostThere")
	@AndroidFindBy(accessibility = "rightcrown icon")
	public WebElement verifyYouAreAlmostThere;

	@FindBy(id = "checkout/pickupMethod")
	@AndroidFindBy(xpath = "//*[@text='PICKUP METHOD']")
	public WebElement verifyPickupMethod;

	@FindBy(id = "fbrcheckout/")
	@AndroidFindBy(accessibility = "inside")
	public WebElement verifyInsideOption;

	@FindBy(id = "fbrcheckout/curbside")
	@AndroidFindBy(accessibility = "curbside")
	public WebElement verifyCurbsideOption;

	@FindBy(id = "confirm")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrorderoverlay/edit")
	public WebElement clickEditOptionForLogin;

	@FindBy(id = "fbrorderoverlay/edit")
	@AndroidFindBy(accessibility = "chevron right")
	public WebElement clickEditOption;

	@FindBy(id = "fbrstorepickupoutofrange/close-button")
	@AndroidFindBy(accessibility = "cancel icon")
	public WebElement clickCloseOption;

	@FindBy(id = "fbrdeliverycomponent/your-Saved-Address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliverycomponent/your-Saved-Address")
	public WebElement verifySavedAddresses;

	@FindBy(id = "fbrdeliverycomponent/update-Saved-Address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliverycomponent/update-Saved-Address")
	public WebElement verifyUpdateCTA;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Recents Searches\"]")
	@AndroidFindBy(xpath = "//*[@text='Recents Searches']")
	public WebElement verifyRecentSearches;

	@FindBy(id = "clear recent searches")
	@AndroidFindBy(accessibility = "clear recent searches")
	public WebElement verifyClearCTA;

	@FindBy(id = "fbrhome/start-order")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrhome/start-order")
	public WebElement clickStartOrderCTA;

	@FindBy(id = "fbrconfirmordertype/Confirmordertype")
	@AndroidFindBy(accessibility = "confirm heading")
	public WebElement verifyConfirmOrderTypeHeader;

	@FindBy(id = "fbrconfirmordertype/pickupText")
	@AndroidFindBy(xpath = "//*[@text=' Pickup  ASAP at Tamuning']")
	public WebElement verifyLastOrderType;

	@FindBy(id = "fbrconfirmordertype/address")
	@AndroidFindBy(xpath = "//*[@text='331 North Marine Drive']")
	public WebElement verifyLastOrderAddress;

	@FindBy(id = "fbrconfirmordertype/confirm")
	@AndroidFindBy(accessibility = "conform")
	public WebElement verifyConfirmCTA;

	@FindBy(id = "fbrconfirmordertype/change")
	@AndroidFindBy(accessibility = "change")
	public WebElement verifyChangeCTA;

	@FindBy(id = "fbroverlay/confirm-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbroverlay/confirm-address")
	public WebElement clickConfirmCTA;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[5]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/cartTitle")
	public WebElement verifyMenuCartPage;

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public OrderDetailsPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void getClickChangeCTA() {
		// waitFor(2000);
		clickChangeCTA.click();
	}

	public void getVerifyOrderInfoHeader() {
		if (verifyOrderInfoHeader.isDisplayed())
			log("Order Info Header Is Displayed");
		else
			log("Order Info Header Is Not Displayed");
	}

	public void getYourMoesRestaurant() {
		if (yourMoesRestaurant.isDisplayed())
			log("Your Moes Restaurant Title Is Displayed");
		else
			log("Your Moes Restaurant Title Is Not Displayed");
	}

	public void getScheduleFor() {
		if (scheduleFor.isDisplayed())
			log("Schedule For Title Is Displayed");
		else
			log("Schedule For Title Is Not Displayed");
	}

	public void getClickEdit() {
		clickEdit.click();
	}

	public void getVerifySelectLocationHeader() {
		if (verifySelectLocationHeader.isDisplayed())
			log("Verify Select Location Header Is Displayed");
		else
			log("Verify Select Location Header Is not Displayed");
	}

	public void getClickSearchBar(String location) {
		waitFor(2000);
		clickPickupSearchField.click();
		clickPickupSearchField.sendKeys(location);
		if (clickFirstAutoSuggested.isDisplayed()) {
			WaitVisibilityOfElement(clickFirstAutoSuggested);
			clickFirstAutoSuggested.click();
			clickFirstAutoSuggested.click();
		}
	}

	public void getClickOrderNowCTA() {
		clickOrderNowCTA.click();
	}

	public void getVerifyUpdatedPickUpAddress() {
		if (verifyUpdatedPickUpAddress.isDisplayed())
			log("Verify Updated PickUp Address Is Displayed");
		else
			log("Verify Updated PickUp Address Is not Displayed");
	}

	public void getSwitchToDeliveryTab() {
		waitFor(2000);
		switchToDeliveryTab.click();
	}

	public void getUpdatedDeliveryAddress() {
		if (updatedDeliveryAddress.isDisplayed())
			log("Updated Delivery Address Is Displayed");
		else
			log("Updated Delivery Address Is Not Displayed");
	}

	public void getAddProduct() {
		addProduct.click();
	}

	public void getAddProductToCart() {
		addProductToCart.click();
	}

	public void getClickCart() {
		WaitVisibilityOfElement(clickCart);
		clickCart.click();
	}

	public void getVerifyMyCartHeader() {
		if (verifyMyCartHeader.isDisplayed())
			log("Verify My Cart Header Is Displayed");
		else
			log("Verify My Cart Header Is Not Displayed");
	}

	public void getClickCheckout() {
		// WaitVisibilityOfElement(clickCheckout);
		clickCheckout.click();
	}

	public void verifyCheckoutHeader() {
		WaitVisibilityOfElement(verifyCheckoutHeader);
		if (verifyCheckoutHeader.isDisplayed())
			log("Verify Checkout Header Is Displayed");
		else
			log("Verify Checkout Header Is Not Displayed");
	}

	public void getVerifyYouAreAlmostThere() {
		WaitVisibilityOfElement(verifyYouAreAlmostThere);
		if (verifyYouAreAlmostThere.isDisplayed())
			log("Verify You Are Almost There Message Is Displayed");
		else
			log("Verify You Are Almost There Message Is Not Displayed");
	}

	public void getVerifyPickupMethod() {
		WaitVisibilityOfElement(verifyPickupMethod);
		if (verifyPickupMethod.isDisplayed())
			log("Verify Pickup Method Title Is Displayed");
		else
			log("Verify Pickup Method Title Is Not Displayed");
	}

	public void getVerifyInsideOption() {
		WaitVisibilityOfElement(verifyInsideOption);
		if (verifyInsideOption.isDisplayed())
			log("Verify Inside Option Is Displayed");
		else
			log("Verify Inside Option Is Not Displayed");
	}

	public void getVerifyCurbsideOption() {
		WaitVisibilityOfElement(verifyCurbsideOption);
		if (verifyCurbsideOption.isDisplayed())
			log("Verify Curbside Option Is Displayed");
		else
			log("Verify Curbside Option Is Not Displayed");
	}

	public void getClickEditOption() {
		clickEditOption.click();

	}

	public void getClickEditOptionForLogin() {
		clickEditOptionForLogin.click();
	}

	public void getClickCloseOption() {
		waitFor(3000);
		clickCloseOption.click();
	}

	public void getVerifySavedAddresses() {
		WaitVisibilityOfElement(verifySavedAddresses);
		if (verifySavedAddresses.isDisplayed())
			log("Verify Your Saved Addresses Title Is Displayed");
		else
			log("Verify Your Saved Addresses Title Is Not Displayed");
	}

	public void getVerifyUpdateCTA() {
		WaitVisibilityOfElement(verifyUpdateCTA);
		if (verifyUpdateCTA.isDisplayed())
			log("Verify Update CTA Is Displayed");
		else
			log("Verify Update CTA Is Not Displayed");
	}

	public void getVerifyRecentSearches() {
		WaitVisibilityOfElement(verifyRecentSearches);
		if (verifyRecentSearches.isDisplayed())
			log("Verify Recent Searches Title Is Displayed");
		else
			log("Verify Recent Searches Title Is Not Displayed");
	}

	public void getVerifyClearCTA() {
		WaitVisibilityOfElement(verifyClearCTA);
		if (verifyClearCTA.isDisplayed())
			log("Verify Clear CTA Is Displayed");
		else
			log("Verify Clear CTA Is Not Displayed");
	}

	public void getClickStartOrderCTA() {
		waitFor(2000);
		clickStartOrderCTA.click();
	}

	public void getVerifyConfirmOrderTypeHeader() {
		WaitVisibilityOfElement(verifyConfirmOrderTypeHeader);
		if (verifyConfirmOrderTypeHeader.isDisplayed())
			log("Verify Confirm Order Type Header Is Displayed");
		else
			log("Verify Confirm Order Type Header Is Not Displayed");
	}

	public void getVerifyLastOrderType() {
		WaitVisibilityOfElement(verifyLastOrderType);
		if (verifyLastOrderType.isDisplayed())
			log("Verify Last Order Type Pickup with ASAP Is Displayed");
		else
			log("Verify Last Order Type Pickup with ASAP Is Not Displayed");
	}

	public void getVerifyLastOrderAddress() {
		WaitVisibilityOfElement(verifyLastOrderAddress);
		if (verifyLastOrderAddress.isDisplayed())
			log("Verify Last Order Address Is Displayed");
		else
			log("Verify Last Order Address Is Not Displayed");
	}

	public void getVerifyConfirmCTA() {
		WaitVisibilityOfElement(verifyConfirmCTA);
		if (verifyConfirmCTA.isDisplayed())
			log("Verify Confirm CTA Is Displayed");
		else
			log("Verify Confirm CTA  Is Not Displayed");
	}

	public void getVerifyChangeCTA() {
		WaitVisibilityOfElement(verifyChangeCTA);
		if (verifyChangeCTA.isDisplayed())
			log("Verify Change CTA Is Displayed");
		else
			log("Verify Change CTA  Is Not Displayed");
	}

	public void clickChangeCTA() {
		waitFor(2000);
		verifyChangeCTA.click();
	}

	public void getClickConfirmCTA() {
		waitFor(2000);
		clickConfirmCTA.click();
	}

	public void ClickConfirmCTA() {
		waitFor(2000);
		verifyConfirmCTA.click();
	}

	public void getVerifyMenuCartPage() {
		WaitVisibilityOfElement(verifyMenuCartPage);
		if (verifyMenuCartPage.isDisplayed())
			log("Verify Menu Page With Bold Flavors Await Message Is Displayed");
		else
			log("Verify Menu Page With Bold Flavors Await Message Is Not Displayed");
	}

}
