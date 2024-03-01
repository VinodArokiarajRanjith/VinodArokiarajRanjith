package com.fb.pageObject;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountAddressesPage extends Utilities {
	FBsCommonMethods commonMethods = new FBsCommonMethods(driver);



	@FindBy(id = "back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_listBack;

	@FindBy(id = "savedAddressPage/addresses")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/savedAddressPage/addresses")
	private WebElement lbl_listAddressesHeader;

	@FindBy(id = "fbraddress/no-address-saved")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/no-address-saved")
	private WebElement lbl_noAddressesSaved;

	@FindBy(id = "fbraddress/add-new-address-icon")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-new-address-icon")
	private WebElement btn_addButton;

	@FindBy(id = "fbraddress/add-new-address-text")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-new-address-text")
	private WebElement lbl_addNewAddress;

	@FindBy(id = "fbraddress/add-button")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-button")
	private WebElement btn_addButtonSavedPage;

	@FindBy(id = "fbraddress/add-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-address")
	private WebElement lbl_addNewAddressSavedPage;

	@FindBy(id = "fbrAddAddressModal/back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_backArrow;

	@FindBy(id = "fbrAddAddressModal/add-new-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrAddAddressModal/add-new-address")
	private WebElement lbl_addNewAddressHeader;

	@FindBy(id = "fbraddaddrmodal/arrow-right-icon")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/address")
	private WebElement lbl_enterAddress;

	@FindBy(id = "fbraddaddrmodal/apt-unit-suite")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/apt-unit-suite-label-inactive")
	private WebElement lbl_AptUnitSuite;

	@FindBy(id = "fbraddaddrmodal/find-my-location")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/find-my-location-label-inactive")
	private WebElement lbl_locationName;

	@FindBy(id = "Drop-off Instructions")
	@AndroidFindBy(xpath = "//*[@text='Drop-off Instructions']")
	private WebElement lbl_dropOffInstructions;

	@FindBy(id = "fbraddaddrmodal/checkbox-label")
	@AndroidFindBy(accessibility = "Save this address for next time.")
	private WebElement lbl_setAsDefaultAddress;

	@FindBy(id = "fbraddaddrmodal/save")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/save")
	private WebElement btn_save;

	@FindBy(id = "fbraddaddrmodal/no-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/no-address")
	private WebElement lbl_errorNoAddressEntered;

	@FindBy(id = "fbraddaddrmodal/arrow-right")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/arrow-right")
	private WebElement btn_enterAddressArrow;

	@FindBy(id = "fbraddaddrmodal/edit-txt")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/arrow-right")
	private WebElement btn_enterAddressArrowWithText;

	@FindBy(id = "fbrdeliveryaddressmodal/does-this-address-look-correct?")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/does-this-address-look-correct?")
	private WebElement lbl_doesThisAddressLookCorrect;

	@FindBy(id = "fbrdeliveryaddressmodal/DELIVERY-HERE")
	@AndroidFindBy(accessibility = "Use Address")
	private WebElement btn_useAddress;

	@FindBy(id = "fbrdeliveryaddressmodal/ADD-NEW-ADDRESS")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/ADD-NEW-ADDRESS")
	private WebElement btn_reEnter;

	@FindBy(id = "text-input-flat")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveryaddressmodal/placeHolder-DeliveryAddress")
	private WebElement btn_AptUnitValue;

	@FindBy(id = "fbrdeliveraddressmodal/close")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrdeliveraddressmodal/close")
	private WebElement btn_cancel;

	@FindBy(id = "fbrAddAddressModal/add-new-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrAddAddressModal/add-new-address")
	private WebElement lbl_addNewAddressFML;

	@FindBy(id = "fbrAddAddressModal/back")
	@AndroidFindBy(accessibility = "arrow left")
	private WebElement btn_backArrowFML;

	@FindBy(id = "fbr-select-address-modal/find-my-location")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbr-select-address-modal/find-my-location")
	private WebElement btn_findMyLocationCTA;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Recents Searches\"]")
	@AndroidFindBy(xpath = "//*[@text='Recents Searches']")
	private WebElement lbl_recentSearches;

	@FindBy(id = "clear recent searches")
	@AndroidFindBy(accessibility = "clear recent searches")
	private WebElement btn_clear;

	@FindBy(id = "fbrstoresearch/close-icon")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/close-icon-container")
	private WebElement btn_clearSearch;

	@FindBy(id = "fbrstoresearch/street-city-state-zip")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrstoresearch/street-city-state-zip")
	private WebElement btn_searchField;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Atlanta, GA, USA\"])[3]")
	@AndroidFindBy(accessibility = "Atlanta, GA, USA")
	private WebElement btn_searchListFirstOption;

	@FindBy(id = "Location Name (ie. Home, Work) Location Name (ie. Home, Work)")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/find-my-location")
	private WebElement btn_locationName;

	@FindBy(id = "text-input-outline")
	@AndroidFindBy(accessibility = "Set as default address.")
	private WebElement btn_deliveryNote;

	@FindBy(id = "fbraddaddrmodal/un-checked")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/un-checked")
	private WebElement btn_checkBox;

	@FindBy(id = "fbraddaddrmodal/save")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/save")
	private WebElement btn_saveCTA;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[3]/XCUIElementTypeOther")
	@AndroidFindBy(accessibility = "star notSelected")
	private WebElement lbl_starIcon;

	@FindBy(id = "fbraddress/default")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/default")
	private WebElement lbl_defaultText;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"fbraddress/address\"])[1]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/address")
	private WebElement lbl_address;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"fbraddress/city/state/postalCode\"])[1]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddress/city/state/postalCode")
	private WebElement lbl_address1;

	@FindBy(id = "fbraddaddrmodal/edit-txt")
	@AndroidFindBy(accessibility = "Editnorth picknup")
	private WebElement btn_edit;

	@FindBy(xpath = "(//XCUIElementTypeImage[@name=\"Icon-component\"])[3]/XCUIElementTypeOther")
	@AndroidFindBy(accessibility = "time icon")
	private WebElement lbl_timeIcon;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"fbraddress/edit-address\"])[1]")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrAddAddressModal/add-new-address")
	private WebElement lbl_editAddress;

	@FindBy(id = "fbraddaddrmodal/remove")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/remove")
	private WebElement btn_removeThisAddress;

	@FindBy(id = "fbraccountdeletemodal/delete-account")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccountdeletemodal/delete-account")
	private WebElement lbl_areYouSureYouWantToRemove;

	@FindBy(id = "fbraccountdeletemodal/delete")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccountdeletemodal/delete")
	private WebElement btn_yesContinue;

	@FindBy(id = "fbraccountdeletemodal/cancel")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraccountdeletemodal/cancel")
	private WebElement btn_noGoBack;

	@FindBy(id = "fbraccountdeletemodal/close")
	@AndroidFindBy(accessibility = "cancel icon")
	private WebElement btn_close;

	@FindBy(id = "savedAddressPage/addresses")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/savedAddressPage/addresses")
	private WebElement lbl_addressRemovedPopUp;

	@FindBy(id = "fbrAddAddressModal/add-new-address")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrAddAddressModal/add-new-address")
	private WebElement lbl_editAddressHeader;

	@FindBy(id = "fbrinstructionsoptions/leave-at-door")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrinstructionsoptions/leave-at-door")
	private WebElement btn_leaveAtDoor;

	@FindBy(id = "fbrinstructionsoptions/hand-it-to-me")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrinstructionsoptions/hand-it-to-me")
	private WebElement btn_handItToMe;

	@FindBy(id = "fbrsavemodal/saveyourchanges")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/saveyourchanges")
	private WebElement lbl_saveYourChanges;

	@FindBy(id = "fbrsavemodal/save-and-close")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/save-and-close")
	private WebElement btn_saveAndClose;

	@FindBy(id = "fbrsavemodal/discard-changes")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrsavemodal/discard-changes")
	private WebElement btn_discardChanges;

	@FindBy(id = "fbraddaddrmodal/cancel")
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddaddrmodal/cancel")
	private WebElement btn_cancelCTA;

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public AccountAddressesPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void commonValidations() {
		waitFor(2000);
		if (btn_listBack.isDisplayed() == true)
			logging(condition.info, "Back navigation button is displayed");
		else
			logging(condition.fail, "Back navigation button is not displayed");

		if (lbl_listAddressesHeader.isDisplayed() == true)
			logging(condition.info, "Saved Addresses header is displayed");
		else
			logging(condition.fail, "Saved Addresses header is not displayed");

		if (lbl_noAddressesSaved.isDisplayed() == true)
			logging(condition.info, "No Addresses saved text is displayed");
		else
			logging(condition.fail, "No Addresses saved text is not displayed");
		if (lbl_addNewAddress.isDisplayed() == true)
			logging(condition.info, "Add New Addresses text is displayed on CTA");
		else
			logging(condition.fail, "Add New Addresses text is not displayed on CTA");
		WaitVisibilityOfElement(btn_addButton);
		btn_addButton.click();
	}

	public void addNewAddressPageValidation() {
		waitFor(2000);
		if (lbl_addNewAddressHeader.isDisplayed() == true)
			logging(condition.info, "Add New Address header is displayed");
		else
			logging(condition.fail, "Add New Address header is not displayed");
		if (lbl_enterAddress.isDisplayed() == true)
			logging(condition.info, "Enter address text is displayed");
		else
			logging(condition.fail, "Enter address text is not displayed");
		if (lbl_AptUnitSuite.isDisplayed() == true)
			logging(condition.info, "Apt/Unite/Suite,Company field is displayed");
		else
			logging(condition.fail, "Apt/Unite/Suite,Company field is not displayed");
		waitFor(2000);
		if (lbl_locationName.isDisplayed() == true)
			logging(condition.info, "Apt/Unite/Suite,Company field is displayed");
		else
			logging(condition.fail, "Apt/Unite/Suite,Company field is not displayed");
		if (lbl_dropOffInstructions.isDisplayed() == true)
			logging(condition.info, "Drop Off Instructions Header is displayed");
		else
			logging(condition.fail, "Drop Off Instructions Header is not displayed");

		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Save");

		if (lbl_setAsDefaultAddress.isDisplayed() == true)
			logging(condition.info, "Set as default address text is displayed");
		else
			logging(condition.fail, "Set as default address text is not displayed");

		WaitVisibilityOfElement(btn_save);
		btn_save.click();

		if (lbl_errorNoAddressEntered.isDisplayed() == true)
			logging(condition.info, "No address entered error message is displayed");
		else
			logging(condition.fail, "No address entered error message is not displayed");
		waitFor(1000);
		btn_backArrow.click();
		waitFor(1000);
		List<WebElement> addNewAddressButton = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-new-address-icon"));
		for (int i = 0; i < addNewAddressButton.size(); i++) {
			try {
				addNewAddressButton.get(i).click();
			} catch (StaleElementReferenceException e) {
				List<WebElement> addNewAddressButtonSaved = driver
						.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbraddress/add-button"));
				addNewAddressButtonSaved.get(i).click();
			}
		}
	}

	public void clickEnterAddressArrow() {
		waitFor(1000);
		btn_enterAddressArrow.click();
		WaitVisibilityOfElement(lbl_doesThisAddressLookCorrect);
		if (lbl_doesThisAddressLookCorrect.isDisplayed() == true)
			logging(condition.info, "Does This Address Look Correct? message is displayed");
		else
			logging(condition.fail, "Does This Address Look Correct? is not displayed");
	}

	public void clickEnterAddressArrowWithText() {
		waitFor(1000);
		btn_enterAddressArrowWithText.click();
		WaitVisibilityOfElement(lbl_doesThisAddressLookCorrect);
		if (lbl_doesThisAddressLookCorrect.isDisplayed() == true)
			logging(condition.info, "Does This Address Look Correct? message is displayed");
		else
			logging(condition.fail, "Does This Address Look Correct? is not displayed");
	}

	public void clickUseAddress() {
		waitFor(1000);
		btn_useAddress.click();
	}

	public void clickCancel() {
		waitFor(1000);
		btn_cancel.click();
	}

	public void clickReEnter() {
		waitFor(1000);
		btn_reEnter.click();
	}

	public void enterAptUnitValue(String Value) {

		btn_AptUnitValue.click();
		btn_AptUnitValue.sendKeys(Value);
		waitFor(1000);
		lbl_doesThisAddressLookCorrect.click();

		if (btn_useAddress.isDisplayed()) {
			btn_useAddress.click();
		}
	}

	public void verifyAddNewAddressHeaderFML() {
		waitFor(1000);
		WaitVisibilityOfElement(lbl_addNewAddressFML);
		if (lbl_addNewAddressFML.isDisplayed() == true)
			logging(condition.info, "Add New Address Header is displayed");
		else
			logging(condition.fail, "Add New Address Header is not displayed");
		waitFor(1000);
		btn_backArrowFML.click();
	}

	public void clickFindMyLocationCTA() {
		WaitVisibilityOfElement(btn_findMyLocationCTA);
		btn_findMyLocationCTA.click();
	}

	public void clickSearchBar(String location) {
		waitFor(1000);
		btn_searchField.click();
		btn_searchField.sendKeys(location);
		waitFor(1000);
		commonMethods.autoSuggessitionClick(location);
	}

	public void clickClearCTA() {

		WaitVisibilityOfElement(lbl_recentSearches);
		if (lbl_recentSearches.isDisplayed() == true)
			logging(condition.info, "Recent searches title is displayed");
		else
			logging(condition.fail, "Recent searches title is not displayed");
		waitFor(1000);
		btn_clear.click();
	}

	public void clickAndClearSearch() {
		btn_searchField.click();
		waitFor(1000);
		btn_clearSearch.click();
	}

	public void enterLocationName(String name) {

		btn_locationName.clear();
		waitFor(1000);
		btn_locationName.sendKeys(name);

		if (lbl_dropOffInstructions.isDisplayed()) {
			btn_locationName.click();
		}
	}

	public void enterDeliveryNotes(String notes) {
		waitFor(1000);
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Save");
		btn_deliveryNote.click();
		btn_deliveryNote.sendKeys(notes);

		if (lbl_dropOffInstructions.isDisplayed()) {
			lbl_dropOffInstructions.click();
		}
	}

	public void clickCheckBox() {
		waitFor(1000);
		btn_checkBox.click();
	}

	public void clickSaveCTA() {
		waitFor(1000);
		btn_saveCTA.click();
	}

	public void clickEnterAddressArrowRight() {
		btn_enterAddressArrow.click();
		waitFor(2000);
		WaitVisibilityOfElement(lbl_addNewAddressFML);
		if (lbl_addNewAddressFML.isDisplayed() == true)
			logging(condition.info, "Add New Address Header is displayed");
		else
			logging(condition.fail, "Add New Address Header is not displayed");

		WaitVisibilityOfElement(btn_backArrowFML);
		if (btn_backArrowFML.isDisplayed() == true)
			logging(condition.info, "Back navigation arrow is displayed");
		else
			logging(condition.fail, "ack navigation arrow is not displayed");

		WaitVisibilityOfElement(btn_searchField);
		if (btn_searchField.isDisplayed() == true)
			logging(condition.info, "Global Search field is displayed is expected");
		else
			logging(condition.fail, "Global Search field is displayed is expected");

		WaitVisibilityOfElement(btn_findMyLocationCTA);
		if (btn_findMyLocationCTA.isDisplayed() == true)
			logging(condition.info, "Find My Location CTA is displayed");
		else
			logging(condition.fail, "Find My Location CTA is not displayed");

	}

	public void clickRecentSearch() {
		btn_cancel.click();
		waitFor(1000);
		lbl_timeIcon.click();
		WaitVisibilityOfElement(lbl_doesThisAddressLookCorrect);
		if (lbl_doesThisAddressLookCorrect.isDisplayed() == true)
			logging(condition.info, "Does This Address Look Correct? message is displayed");
		else
			logging(condition.fail, "Does This Address Look Correct? is not displayed");
		waitFor(1000);
		btn_cancel.click();
	}

	public void savedAddressesValidation() {
		waitFor(1000);
		if (lbl_starIcon.isDisplayed() == true)
			logging(condition.info, "Star Icon is displayed for default address");
		else
			logging(condition.fail, "Star Icon is not displayed for default address");

		if (lbl_defaultText.isDisplayed() == true)
			logging(condition.info, "Default text is displayed When we checkin the set as default address");
		else
			logging(condition.fail, "Default text is not displayed When we checkin the set as default address");

		if (lbl_address.isDisplayed() == true)
			logging(condition.info, "Apt/Unit/Value, Company value is displayed");
		else
			logging(condition.fail, "Apt/Unit/Value, Company value is not displayed");
		if (lbl_address1.isDisplayed() == true)
			logging(condition.info, "Entire Saved address is displayed");
		else
			logging(condition.fail, "Entire Saved address is nnot displayed");
		if (btn_edit.isDisplayed() == true)
			logging(condition.info, "Edit CTA is displayed for saved address screen");
		else
			logging(condition.fail, "Edit CTA is not displayed for saved address screen");
		if (lbl_addNewAddressSavedPage.isDisplayed() == true)
			logging(condition.info, "Add New Addresses text is displayed on CTA");
		else
			logging(condition.fail, "Add New Addresses text is not displayed on CTA");

	}

	public void clickEditCTA() {
		btn_edit.click();
		WaitVisibilityOfElement(lbl_editAddress);
		if (lbl_editAddress.isDisplayed() == true)
			logging(condition.info, "Edit address header is displayed");
		else
			logging(condition.fail, "Edit address header is not displayed");
	}

	public void clickRemoveThisAddressCTA() {
		waitFor(1000);
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Save");

		WaitVisibilityOfElement(btn_removeThisAddress);
		if (btn_removeThisAddress.isDisplayed() == true)
			btn_removeThisAddress.click();

		WaitVisibilityOfElement(lbl_areYouSureYouWantToRemove);
		if (lbl_areYouSureYouWantToRemove.isDisplayed() == true)
			logging(condition.info, "ARE YOU SURE YOU WANT TO REMOVE message is displayed");
		else
			logging(condition.fail, "ARE YOU SURE YOU WANT TO REMOVE message is not displayed");

		if (btn_close.isDisplayed() == true)
			logging(condition.info, "Close option is displayed for close this drawer");
		else
			logging(condition.fail, "Close option is not displayed for close this drawer");

		if (btn_yesContinue.isDisplayed() == true)
			logging(condition.info, "YES, CONTINUE CTA is displayed");
		else
			logging(condition.fail, "YES, CONTINUE CTA is not displayed");

		if (btn_noGoBack.isDisplayed() == true)
			logging(condition.info, "NO, GO BACK CTA is displayed");
		else
			logging(condition.fail, "NO, GO BACK CTA is not displayed");

	}

	public void removeThisAddressActions() {
		btn_close.click();
		WaitVisibilityOfElement(btn_removeThisAddress);
		btn_removeThisAddress.click();
		WaitVisibilityOfElement(btn_noGoBack);
		btn_noGoBack.click();
		WaitVisibilityOfElement(btn_removeThisAddress);
		btn_removeThisAddress.click();
		WaitVisibilityOfElement(btn_yesContinue);
		btn_yesContinue.click();
		waitFor(2000);
	}

	public void addressRemovedPopup() {
		WaitVisibilityOfElement(lbl_addressRemovedPopUp);
		if (lbl_addressRemovedPopUp.isDisplayed() == true)
			logging(condition.info, "Address Removed PopUp is displayed as expected");
		else
			logging(condition.fail, "Address Removed PopUp is not displayed as expected");

	}

	public void clickAddNewAddressFromSavedAddresses() {
		waitFor(1000);
		WaitVisibilityOfElement(btn_addButtonSavedPage);
		lbl_addNewAddressSavedPage.click();
		if (lbl_addNewAddressHeader.isDisplayed() == true)
			logging(condition.info, "Add New Addresses header is displayed");
		else
			logging(condition.fail, "Add New Addresses header is not displayed");
	}

	public void verifyEditAddressHeader() {
		WaitVisibilityOfElement(lbl_editAddressHeader);
		if (lbl_editAddressHeader.isDisplayed() == true)
			logging(condition.info, "Edit Address header is displayed");
		else
			logging(condition.fail, "Edit Address header is not displayed");
	}

	public void clickHandItToMe() {
		waitFor(1000);
		WaitVisibilityOfElement(btn_handItToMe);
		if (btn_handItToMe.isDisplayed() == true)
			btn_handItToMe.click();
		logging(condition.info, "Hand It To Me Option is displayed and selected for drop of instructions");
	}

	public void clickLeaveAtDoor() {
		WaitVisibilityOfElement(btn_leaveAtDoor);
		if (btn_leaveAtDoor.isDisplayed() == true)
			btn_leaveAtDoor.click();
		logging(condition.info, "Leave At Door Option is displayed and selected for drop of instructions");
	}

	public void clickBackArrow() {
		WaitVisibilityOfElement(btn_backArrow);
		btn_backArrow.click();
	}

	public void saveYourChangesValidation() {
		waitFor(1000);
		if (lbl_saveYourChanges.isDisplayed() == true)
			logging(condition.info, "Save Your Changes? Text is displayed");
		else
			logging(condition.fail, "Save Your Changes? Text is not displayed");
		if (btn_saveAndClose.isDisplayed() == true)
			logging(condition.info, "Save & Close CTA is displayed");
		else
			logging(condition.fail, "Save & Close CTA is not displayed");
		if (btn_discardChanges.isDisplayed() == true)
			logging(condition.info, "Discard Changes CTA is displayed");
		else
			logging(condition.fail, "Discard Changes CTA is not displayed");
		WaitVisibilityOfElement(btn_close);
		btn_close.click();

	}

	public void clickDiscardChangesCTA() {
		if (btn_discardChanges.isDisplayed() == true)
			btn_discardChanges.click();
		logging(condition.info, "Discard Changes CTA is displayed");

	}

	public void clickSaveAndCloseCTA() {
		if (btn_saveAndClose.isDisplayed() == true)
			btn_saveAndClose.click();
		logging(condition.info, "Discard Changes CTA is displayed");

	}

	public void clickCancelCTA() {
		waitFor(1000);
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Save");
		btn_cancelCTA.click();

	}

	public void clickSaveButton() {
		waitFor(1000);
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Save");
		btn_saveCTA.click();

	}

}
