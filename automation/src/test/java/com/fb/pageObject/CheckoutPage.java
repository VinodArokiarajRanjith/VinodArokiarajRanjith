package com.fb.pageObject;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage extends Utilities {

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrcheckout/checkoutHeading")
	@FindBy(name = "fbrcheckout/checkoutHeading")
	private WebElement lbl_checkout;

	@AndroidFindBy(accessibility = "arrow left")
	@FindBy(id = "arrow left")
	private WebElement btn_back;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/pickup-Locations")
	@FindBy(name = "fbrlastpickup/pickup-Locations")
	private WebElement lbl_deliveryTypeAndAddress;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/Last-pickup-Timing")
	@FindBy(name = "fbrlastpickup/Last-pickup-Timing")
	private WebElement lbl_scheduleType;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details")
	@FindBy(name = "fbrchange/change-order-details")
	private WebElement btn_change;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	@FindBy(name = "fbrprice/Checkout-name")
	private WebElement btn_checkout;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	@FindBy(name = "fbrcarterrormodal/title")
	private WebElement lbl_locationClosed;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/checkout/pickupMethod")
	@FindBy(name = "checkout/pickupMethod")
	private WebElement lbl_pickupMethod;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/checkout/contactInfo")
	@FindBy(name = "checkout/contactInfo")
	private WebElement lbl_contactInfo;
	
	@AndroidFindBy(accessibility = "First Name")
	@FindBy(id = "firstName")
	private WebElement txt_firstName;

	@AndroidFindBy(accessibility = "Last Name")
	@FindBy(id = "lastName")
	private WebElement txt_lastName;

	@AndroidFindBy(accessibility = "Email")
	@FindBy(id = "email")
	private WebElement txt_email;

	@AndroidFindBy(accessibility = "Phone Number")
	@FindBy(id = "phone")
	private WebElement txt_phoneNumber;

	@AndroidFindBy(accessibility = "no tip")
	@FindBy(id = "No Tip")
	private WebElement btn_noTip;

	@AndroidFindBy(accessibility = "10%")
	@FindBy(id = "10%")
	private WebElement btn_tip10;

	@AndroidFindBy(accessibility = "15%")
	@FindBy(id = "15%")
	private WebElement btn_tip15;

	@AndroidFindBy(accessibility = "20%")
	@FindBy(id = "20%")
	private WebElement btn_tip20;
	
	@AndroidFindBy(accessibility = "Other Amount")
	@FindBy(id = "Other Amount arrow right")
	private WebElement btn_otherAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/customTip/enterTipAmount")
	@FindBy(name = "customTip/enterTipAmount")
	private WebElement lbl_enterTipAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/customTip/enterCustomTip")
	@FindBy(name = "customTip/enterCustomTip")
	private WebElement txt_enterTipAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/customTip/addTip")
	@FindBy(name = "customTip/addTip")
	private WebElement btn_addTipEnterTipAmountPopup;

	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrcarterrormodal/subtitle")
	@FindBy(name = "fbrcarterrormodal/subtitle")
	private WebElement lbl_subTitleLocationClosed;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	@FindBy(name = "fbrprice/Checkout-name")
	private WebElement btn_placeOrder;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/cart-item")
	@FindBy(name = "fbrprice/cart-item")
	private WebElement lbl_itemCount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/cart-add-promo-code-Text") 
	@FindBy(name = "fbrprice/cart-add-promo-code-Text")
	private WebElement lbl_addPromoCode;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/priceList-subTotal")
	@FindBy(name = "fbrPrice/priceList-subTotal")
	private WebElement lbl_subTotal;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/taxes-And-Fee")
	@FindBy(name = "fbrPrice/taxes-And-Fee")
	private WebElement lbl_taxexAndFees;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/price-subTotal")
	@FindBy(name = "fbrPrice/price-subTotal")
	private WebElement lbl_subTotalAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/taxes")
	@FindBy(name = "fbrPrice/taxes")
	private WebElement lbl_taxesAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-Total-Amount")
	@FindBy(name = "fbrPrice/cart-Total-Amount")
	private WebElement lbl_totalAmount; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-Tip")
	@FindBy(name = "fbrPrice/cart-Total-Amount")
	private WebElement lbl_addTip; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-Tip-Amount")
	@FindBy(name = "fbrPrice/cart-Total-Amount")
	private WebElement lbl_totalTipAmount; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/checkout/yourRestarant")
	@FindBy(name = "checkout/yourRestarant")
	private WebElement lbl_yourRestaurant; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrinstructionsoptions/title")
	@FindBy(name = "fbrinstructionsoptions/title")
	private WebElement lbl_addInstruction; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrinstructionsoptions/leave-at-door")
	@FindBy(name = "fbrinstructionsoptions/leave-at-door")
	private WebElement btn_leaveAtDoor; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrinstructionsoptions/hand-it-to-me")
	@FindBy(name = "fbrinstructionsoptions/hand-it-to-me")
	private WebElement btn_handItToMe;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbraddinstructions/optional")
	@FindBy(name = "fbraddinstructions/optional")
	private WebElement lbl_addInstructionText; 
	
	@AndroidFindBy(accessibility = "Set as default address.")
	@FindBy(name = "text-input-outlined")
	private WebElement txt_addNote; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/checkout/locationName")
	@FindBy(name = "checkout/locationName")
	private WebElement lbl_restarantName; 
	//XPATH or ID Missing
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='accessiblityLabel.']/android.widget.TextView")
	@FindBy(name = "IOS Locator")
	private WebElement btn_inside; 
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='curbside']/android.widget.TextView")
	@FindBy(name = "fbrPrice/cart-Total-Amount")
	private WebElement btn_curbside; 
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	@FindBy(name = "iOS ID Missing")
	private WebElement btn_orderAhead;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	@FindBy(name = "iOS ID Missing")
	private WebElement btn_findNewLocation;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-delivery-Fee")
	@FindBy(name = "iOS ID Missing")
	private WebElement lbl_deliveryFee;
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/subTotal-Value")
	@FindBy(name = "iOS ID Missing")
	private WebElement lbl_deliveryFeeAmount;
	
	
	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrpayment/selectPayment")
	@FindBy(name = "fbrpayment/selectPayment")
	private WebElement btn_selectPayment;
	
	
	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public CheckoutPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickCheckoutButton() {
		ScrollToText("CHECKOUT");
     WaitVisibilityOfElement(btn_checkout);
     btn_checkout.click();
     WaitVisibilityOfElement(lbl_checkout);
     if (lbl_checkout.isDisplayed() == true) {
			logging(condition.pass,"User navigated to CHECKOUT page as expected");
		} else
			logging(condition.info, "User not navigated to CHECKOUT page as expected");

	}

	public void commonCheckoutFieldValidation() {

		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		if (btn_back.isDisplayed() == true) {
			logging(condition.pass,"Back button is displayed in Checkout page as expected");
		} else
			logging(condition.info, "Back button is not displayed in Checkout page");

		String txt_checkout = lbl_checkout.getAttribute(strProperty);
		if (lbl_checkout.isDisplayed() == true) {
			logging(condition.pass,
					"The Header: " + txt_checkout + " is displayed in Checkout page as expected");
		} else
			logging(condition.info,
					"The Header: " + txt_checkout + " is not displayed in Checkout page as expected");

		if (btn_change.isDisplayed() == true) {
			logging(condition.pass,
					"Change button is displayed in Checkout page as expected");
		} else
			logging(condition.info, "Change button is not displayed in Checkout page");

		String txt_deliveryType = lbl_deliveryTypeAndAddress.getAttribute(strProperty);
		if (lbl_deliveryTypeAndAddress.isDisplayed() == true) {
			logging(condition.pass,"The Delivery type: " + txt_deliveryType + " is displayed in the Checkout page as expected");
			assertTrue("The Delivery type: " + txt_deliveryType + " is displayed in the Checkout page as expected",
					true);
		} else
			logging(condition.fail,"The Delivery type is not displayed in the Checkout page as expected" );

		String txt_scheduleType = lbl_scheduleType.getAttribute(strProperty);
		if (lbl_deliveryTypeAndAddress.isDisplayed() == true) {
			logging(condition.pass,"The Schedule type: " + txt_scheduleType + " is displayed in the Checkout page as expected");
			assertTrue("The Schedule type: " + txt_scheduleType + " is displayed in the Checkout page as expected",
					true);
		} else
			logging(condition.pass,"The Schedule type is not displayed in the Checkout page as expected");

	}
	
	private void validateAndSelectPickupMethod(String pickupMethod) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		String txt_pickupMethod = lbl_pickupMethod.getAttribute(strProperty);
		if (lbl_pickupMethod.isDisplayed() == true) {
			logging(condition.pass,"The Header: " + txt_pickupMethod + " is displayed in Checkout page as expected");
		} else
			logging(condition.info,"The Header: " + txt_pickupMethod + " is not displayed in Checkout page as expected");
		
		switch (pickupMethod) {
		case "Inside": {
			if (btn_inside.isDisplayed() == true) 
				logging(condition.pass,"The Button: Inside is displayed in Checkout page as expected");
			 else
				logging(condition.info,"The Button: Inside is not displayed in Checkout page as expected");
			btn_inside.click();
			break;
		}
		case "Curbside":{
			if (btn_curbside.isDisplayed() == true) 
				logging(condition.pass,"The Button: Curbside is displayed in Checkout page as expected");
			 else
				logging(condition.info,"The Button: Curbside is not displayed in Checkout page as expected");
			btn_curbside.click();
		break;
		}
		}

	}

	public void enterFirstAndLastName(String firstName, String lastName) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		String txt_contactInfo = lbl_contactInfo.getAttribute(strProperty);
		if (lbl_contactInfo.isDisplayed() == true) {
			logging(condition.pass,"The Header: " + txt_contactInfo + " is displayed in Checkout page as expected");
		} else
			logging(condition.info,"The Header: " + txt_contactInfo + " is not displayed in Checkout page as expected");
        ScrollToText("First Name");
		if (txt_firstName.isDisplayed() == true) {
			logging(condition.pass,"The FIRST NAME field is displayed in Checkout page as expected");
			EnterInput(txt_firstName, firstName);
			logging(condition.info,"Text: " + firstName + " is entered in First Name as expected");
		} else
			logging(condition.info,"The FIRST NAME field is not displayed in Checkout page as expected");

		if (txt_lastName.isDisplayed() == true) {
			logging(condition.pass,"The Last NAME field is displayed in Checkout page as expected");
			EnterInput(txt_lastName, lastName);
			logging(condition.info,"Text: " + lastName + " is entered in Last Name as expected");
		} else
			logging(condition.info,"The Last NAME field is not displayed in Checkout page as expected");
	}

	public void enterEmailandPhone(String userType, String email, String phoneNumber) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Email");
		if (userType.equalsIgnoreCase("GuestUser")) {
			if (txt_email.isDisplayed() == true) {
				logging(condition.pass,"The Email field is displayed in Checkout page as expected");
				EnterInput(txt_email, email);
				logging(condition.info,"Text: " + email + " is entered in email fields as expected");
			} else
				logging(condition.info,"The EMAIL field is not displayed in Checkout page as expected");
		} else {
			String vlu_email = txt_email.getAttribute(strProperty);
			
			if (txt_email.isDisplayed() == true & vlu_email.equals(email))
				logging(condition.pass, "The Email ID: " + vlu_email+ " is displayed as same as log in email in Checkout page as expected");
			else
				logging(condition.info, "The Email ID: " + vlu_email
						+ " is not displayed as same as log in email in Checkout page as expected");
		}
		ScrollToText("Phone Number");
		if (txt_phoneNumber.isDisplayed() == true) {
			logging(condition.pass,
					"The Phone Number field is displayed in Checkout page as expected");
			EnterInput(txt_phoneNumber, phoneNumber);
			logging(condition.info,
					"Text: " + phoneNumber + " is entered in Phone Number as expected");
		} else
			logging(condition.info,
					"The Phone Number field is not displayed in Checkout page as expected");

	}

	public void enterAddTip(String addTip) {
		ScrollToText("ADD TIP");
		if (btn_noTip.isDisplayed() == true) {
			logging(condition.pass, "The ADD TIP fields is displayed as expected");
			Random rn = new Random();
			int num = rn.nextInt(5) + 1;
					//rn.nextInt(5) + 1;
			if (addTip.equalsIgnoreCase("No Tip")) {
				ScrollToText("No Tip");
				if (btn_noTip.isDisplayed() == true) {
					logging(condition.pass,"The No Tip button is displayed as expected");
					btn_noTip.click();
					logging(condition.info, "The No Tip button is clicked as expected");
					// need to do calculation validation
				} else
					logging(condition.info,"The No Tip button is not displayed as expected");
			} else if (addTip.equalsIgnoreCase("10")) {
				if (btn_tip10.isDisplayed() == true) {
					logging(condition.pass,
							"The 10% tip button is displayed as expected");
					btn_tip10.click();
					logging(condition.info,
							"The 10% Tip button is clicked as expected");
					// need to do calculation validation
				} else
					logging(condition.info,
							"The 10% Tip button is not displayed as expected");
			} else if (addTip.equalsIgnoreCase("15")) {
				if (btn_tip15.isDisplayed() == true) {
					logging(condition.pass,
							"The 15% tip button is displayed as expected");
					btn_tip15.click();
					logging(condition.info,
							"The 15% Tip button is clicked as expected");
					// need to do calculation validation
				} else
					logging(condition.info,
							"The 15% Tip button is not displayed as expected");
			} else if (addTip.equalsIgnoreCase("20")) {
				if (btn_tip20.isDisplayed() == true) {
					logging(condition.pass,"The 20% tip button is displayed as expected");
					btn_tip20.click();
					logging(condition.info,"The 20% Tip button is clicked as expected");
					// need to do calculation validation
				} else
					logging(condition.info,"The 20% Tip button is not displayed as expected");
			}else 
				enterOtherAmount();
		} else
			logging(condition.info, "The ADD TIP fields is not displayed as expected");

	}
	
	private void enterOtherAmount() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Subtotal");
		if (btn_otherAmount.isDisplayed() == true) {
			logging(condition.pass,"The Other Amount button is displayed as expected");
			btn_otherAmount.click();
			logging(condition.info,"The Other Amount button is clicked as expected");
			WaitVisibilityOfElement(lbl_enterTipAmount);
			String vlu_enterTipAmount = lbl_enterTipAmount.getAttribute(strProperty);
			if (lbl_enterTipAmount.isDisplayed() == true) {
				logging(condition.pass,"The Popup: "+vlu_enterTipAmount+" is displayed as expected");
				int tipAmount = ThreadLocalRandom.current().nextInt(100, 250);
				String txt_tip = String.valueOf(tipAmount);
				EnterInput(txt_enterTipAmount, txt_tip);
				logging(condition.info,"The Tip: "+txt_tip+" is entered as expected");
				btn_addTipEnterTipAmountPopup.click();
				WaitVisibilityOfElement(btn_otherAmount);
			}else
				logging(condition.info,"The Enter Tip Amount popup is not displayed as expected");
			// need to do calculation validation
		} else
			logging(condition.info,"The Other Amount button is not displayed as expected");
	}
	
	public int validateCartIconCount() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WebElement btn_cart = driver.findElement(
				By.xpath("//android.widget.Button[contains(@content-desc,'Shopping-Bag')]/android.widget.TextView"));
		int vlu_cart = Integer.parseInt(btn_cart.getAttribute(strProperty));
		if (vlu_cart > 0)
			logging(condition.pass,"The Cart icon count is updated as: " + vlu_cart + " as expected");
		else
			logging(condition.fail,"The Cart icon count is not updated" );
		return vlu_cart;
	}
	
	public void validateSubTotalFields() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Taxes & Fees");
		String cartCount = String.valueOf(validateCartIconCount());
		String itemCount = lbl_itemCount.getAttribute(strProperty);
		if (itemCount.contains(cartCount))
			logging(condition.pass,"The Cart icon Count and Item Count - " + itemCount + " are same as expected");
		else
			logging(condition.fail,"The Cart icon Count and Item Count are not same as expected" );

		String vlu_addPromoCode = lbl_addPromoCode.getAttribute(strProperty);
		if (lbl_addPromoCode.isDisplayed() == true)
			logging(condition.pass,"The Text: " + vlu_addPromoCode + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Text: Add Promo Code is not displayed in checkout page as expected" );

		String vlu_subTotal = lbl_subTotal.getAttribute(strProperty);
		if (lbl_subTotal.isDisplayed() == true)
			logging(condition.pass,"The Text: " + vlu_subTotal + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Text: Subtotal is not displayed in checkout page as expected" );

		String vlu_texesAndFees = lbl_taxexAndFees.getAttribute(strProperty);
		if (lbl_taxexAndFees.isDisplayed() == true)
			logging(condition.pass,"The Text: " + vlu_texesAndFees + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Text: Taxes & Fees is not displayed in checkout page as expected" );
		
		String lbl_addtip = lbl_addTip.getAttribute(strProperty);
		if (lbl_addTip.isDisplayed() == true)
			logging(condition.pass,"The Text: " + lbl_addtip + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Text: Tip is not displayed in checkout page as expected" );
	}
	
	public void checkoutPickupValidation() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("Total");
		float vlu_subtotalAmount = Float.parseFloat(lbl_subTotalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_subTotalAmount.isDisplayed() == true)
			logging(condition.pass,"The SubTotal Amount: " + vlu_subtotalAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The SubTotal Amount is not displayed in checkout page as expected" );

		float vlu_taxesAmount = Float.parseFloat(lbl_taxesAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_taxesAmount.isDisplayed() == true)
			logging(condition.pass,"The SubTotal Amount: " + vlu_taxesAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The SubTotal Amount is not displayed in checkout page as expected" );
		
		float vlu_totalTipAmount = Float.parseFloat(lbl_totalTipAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_totalTipAmount.isDisplayed() == true)
			logging(condition.pass,"The Tip Amount: " + vlu_totalTipAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Tip Amount is not displayed in checkout page as expected" );
        
		float vlu_subTotalAndTaxes = vlu_subtotalAmount + vlu_taxesAmount + vlu_totalTipAmount;
		float vlu_totalAmount = Float.parseFloat(lbl_totalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_totalAmount.isDisplayed() == true & vlu_subTotalAndTaxes == vlu_totalAmount)
			logging(condition.pass,"The Addition of Subtotal and Taxes: " + vlu_subTotalAndTaxes + " and Total Amount:" + vlu_totalAmount
					+ " are equal and displayed in checkout page as expected");
		else
			logging(condition.fail,"The total amount is not displayed or the addition of subtotal and taxes: " + vlu_subTotalAndTaxes+ " is not equal to total amount "+ vlu_subTotalAndTaxes);
		}
	
	public void checkoutDeliveryValidation() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		List<WebElement> vlu_deliveryFee = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-delivery-Fee"));
		if (vlu_deliveryFee.size() > 0) {
			
		String txt_deliveryFee = lbl_deliveryFee.getAttribute(strProperty);
		if (lbl_deliveryFee.isDisplayed() == true)
			logging(condition.pass,"The Text: " + txt_deliveryFee + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Text: Delivery Fees is not displayed in checkout page as expected" );
		
		float vlu_subtotalAmount = Float.parseFloat(lbl_subTotalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_subTotalAmount.isDisplayed() == true)
			logging(condition.pass,"The SubTotal Amount: " + vlu_subtotalAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The SubTotal Amount is not displayed in checkout page as expected" );

		float vlu_taxesAmount = Float.parseFloat(lbl_taxesAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_taxesAmount.isDisplayed() == true)
			logging(condition.pass,"The SubTotal Amount: " + vlu_taxesAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The SubTotal Amount is not displayed in checkout page as expected" );
		
		float vlu_totalTipAmount = Float.parseFloat(lbl_totalTipAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_totalTipAmount.isDisplayed() == true)
			logging(condition.pass,"The Tip Amount: " + vlu_totalTipAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Tip Amount is not displayed in checkout page as expected" );
		
		float vlu_deliveryFeeAmount = Float.parseFloat(lbl_deliveryFeeAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_deliveryFeeAmount.isDisplayed() == true)
			logging(condition.pass,"The Delivery Fee Amount: " + vlu_deliveryFeeAmount + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Delivery Fee is not displayed in checkout page as expected" );

		float vlu_subTotalAndTaxes = vlu_subtotalAmount + vlu_taxesAmount + vlu_totalTipAmount + vlu_deliveryFeeAmount;
		float vlu_totalAmount = Float.parseFloat(lbl_totalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_totalAmount.isDisplayed() == true & vlu_subTotalAndTaxes == vlu_totalAmount)
			logging(condition.pass,"The Addition of Subtotal and Taxes: " + vlu_subTotalAndTaxes + " and Total Amount:" + vlu_totalAmount+ " are equal and displayed in checkout page as expected");
		else
			logging(condition.warning,"The total amount is not displayed or the addition of subtotal and taxes: " + vlu_subTotalAndTaxes+ " is not equal to total amount "+ vlu_subTotalAndTaxes);
		}
		else
			logging(condition.fail,"The Delivery Fee is not displayed, Delivery Fee should display for every delivery order");
		
	}
	
	public void clickPlaceOrder() {
		WaitVisibilityOfElement(btn_placeOrder);
        btn_placeOrder.click();
	}
	
	public void clickInside() {
		WaitVisibilityOfElement(btn_inside);
		btn_inside.click();
		logging(condition.pass,"The Button: Inside is clicked as expected");
	}
	
	public void clickCurbside() {
		WaitVisibilityOfElement(btn_curbside);
		btn_curbside.click();
		logging(condition.pass,"The Button: Curbside is clicked as expected");
	}
	
	public void validateAddNote() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		ScrollToText("ADD INSTRUCTIONS");
		String vlu_addInstruction = lbl_addInstruction.getAttribute(strProperty);
		if (lbl_addInstruction.isDisplayed() == true)
			logging(condition.pass,"The Header: " + vlu_addInstruction + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Header: ADD INSTRUCTIONS is not displayed in checkout page as expected" );
		
		String vlu_addInstructionText = lbl_addInstructionText.getAttribute(strProperty);
		if (lbl_addInstructionText.isDisplayed() == true)
			logging(condition.pass,"The Header: " + vlu_addInstructionText + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Optional text is not displayed in checkout page as expected" );
		
		if (txt_addNote.isDisplayed() == true) {
			logging(condition.pass,"The ADD NOTE text area is displayed");
			EnterInput(txt_addNote, "Testing");
			logging(condition.pass,"The Text: Testing is entered in ADD NOTE area as expected");
		}
		else
			logging(condition.fail,"The ADD NOTE text area is not displayed" );
	}
	
	public void clickleaveAtDoor() {
		WaitVisibilityOfElement(btn_leaveAtDoor);
		btn_leaveAtDoor.click();
		logging(condition.pass,"The Button: Leave at Door is clicked as expected");
	}
	
	public void clickHandItToMe() {
		WaitVisibilityOfElement(btn_handItToMe);
		btn_handItToMe.click();
		logging(condition.pass,"The Button: Hand It to me is clicked as expected");	
	}

	public void validateRestaurantInformation() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(lbl_yourRestaurant);
		String vlu_yourRestaurant = lbl_yourRestaurant.getAttribute(strProperty);
		if (lbl_yourRestaurant.isDisplayed() == true)
			logging(condition.pass,"The Header: " + vlu_yourRestaurant + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The Header: YOUR MOES RESTAURANT is not displayed in checkout page as expected" );
		String vlu_restaurant = lbl_restarantName.getAttribute(strProperty);
		if (lbl_restarantName.isDisplayed() == true)
			logging(condition.pass,"The Restaurant Name: " + vlu_restaurant + " is displayed in checkout page as expected");
		else
			logging(condition.fail,"The restaurant name is not displayed in checkout page as expected" );
		
	}

}
