package com.fb.pageObject;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.fb.Utilities.Utilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends Utilities {



	@AndroidFindBy(accessibility = "cart")
	private WebElement btn_cart;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/cartTitle")
	private WebElement lbl_myCart;

	@AndroidFindBy(accessibility = "back")
	private WebElement btn_back;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/pickup-Locations")
	private WebElement lbl_deliveryTypeAndAddress;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/Last-pickup-Timing")
	private WebElement lbl_scheduleType;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrchange/change-order-details")
	private WebElement btn_change;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ORDER NOW']")
	private WebElement btn_orderNow;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Add product\"]")
	private WebElement btn_addProduct;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrlastpickup/your-Order-Heading")
	private WebElement lbl_yourOrder;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/duplicate-Item-text")
	private WebElement btn_duplicate;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/edit-text")
	private WebElement btn_edit;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/remove-item-text")
	private WebElement btn_remove;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/vcartPrice-text")
	private WebElement lbl_itemPrice;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/cart-item")
	private WebElement lbl_itemCount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/cart-add-promo-code-Text")
	private WebElement lbl_addPromoCode;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/priceList-subTotal")
	private WebElement lbl_subTotal;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/taxes-And-Fee")
	private WebElement lbl_taxexAndFees;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/price-subTotal")
	private WebElement lbl_subTotalAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/taxes")
	private WebElement lbl_taxesAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-amount")
	private WebElement lbl_totalAmount;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrprice/Checkout-name")
	private WebElement btn_checkout;

	@AndroidFindBy(id = "com.focusbrands.appcuisine.dev.moes:id/fbrPrice/cart-utensils")
	private WebElement lbl_includeUtensils;

	@AndroidFindBy(accessibility = "Remove Item heading")
	private WebElement lbl_removeItem;

	@AndroidFindBy(accessibility = "accessiblityLabel.removeButton")
	private WebElement btn_removePopup;

	@AndroidFindBy(accessibility = "accessiblityLabel.nevermindButton")
	private WebElement btn_neverMind;

	@AndroidFindBy(xpath = "//com.horcrux.svg.SvgView[@content-desc=\"info iicon\"]/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement btn_taxesInfo;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"date picker\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement lbl_headerTaxes;

	@AndroidFindBy(accessibility = "cancel icon")
	private WebElement btn_close;

	@AndroidFindBy(accessibility = "minus icon")
	private WebElement btn_minus;

	@AndroidFindBy(accessibility = "plus icon")
	private WebElement btn_plus;

	static String platformVersion = System.getProperty("platformVersion");
	static String osName = driver.getCapabilities().getCapability("platformName").toString();

	public CartPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void clickCartButton() {
		try {
			waitFor(5000);
		WaitElementToBeClickable(btn_cart);
		btn_cart.click();
		WaitVisibilityOfElement(lbl_myCart);
		} catch (Exception e) {
			logging(condition.warning,"API response is slow");
			WaitElementToBeClickable(btn_cart);
			btn_cart.click();
		}
		WaitVisibilityOfElement(lbl_myCart);
		if (lbl_myCart.isDisplayed() == true) {
			log("User Navigated to My Cart page as expected");
			assertTrue("User Navigated to My Cart page as expected", true);
		} else
			assertTrue("User is not Navigated to My Cart page as expected", false);
	}

	public void clickBackButton() {
		WaitVisibilityOfElement(btn_back);
		btn_back.click();
	}

	public void commonCartFieldValidation() {

		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		if (btn_back.isDisplayed() == true) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Back button is displayed in Cart page as expected");
			assertTrue("Back button is displayed in Cart page as expected", true);
		} else
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Back button is not displayed in Cart page");

		if (btn_cart.isDisplayed() == true) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Cart button is displayed in Cart page as expected");
			assertTrue("Cart button is displayed in Cart page as expected", true);
		} else
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Cart button is not displayed in Cart page");

		if (btn_change.isDisplayed() == true) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Change button is displayed in Cart page as expected");
			assertTrue("Change button is displayed in Cart page as expected", true);
		} else
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Change button is not displayed in Cart page");

		String txt_deliveryType = lbl_deliveryTypeAndAddress.getAttribute(strProperty);
		if (lbl_deliveryTypeAndAddress.isDisplayed() == true) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"The Delivery type: " + txt_deliveryType + " is displayed in the Cart page as expected");
			assertTrue("The Delivery type: " + txt_deliveryType + " is displayed in the Cart page as expected", true);
		} else
			assertTrue("The Delivery type is not displayed in the Cart page as expected", false);

		String txt_scheduleType = lbl_scheduleType.getAttribute(strProperty);
		if (lbl_deliveryTypeAndAddress.isDisplayed() == true) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"The Schedule type: " + txt_scheduleType + " is displayed in the Cart page as expected");
			assertTrue("The Schedule type: " + txt_scheduleType + " is displayed in the Cart page as expected", true);
		} else
			assertTrue("The Schedule type is not displayed in the Cart page as expected", false);

	}

	public void emptyCartFieldValidation() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		String txt_orderNow = btn_orderNow.getAttribute(strProperty);
		if (btn_orderNow.isDisplayed() == true) {
			log("The Button: " + txt_orderNow + " is displayed in Cart page as expected");
			assertTrue("The Button: " + txt_orderNow + " is displayed in Cart page as expected", true);
		} else
			assertTrue("The ORDER NOW button is not displayed in the Cart page as expected", false);
	}

	public void itemAddedCartValidatoin() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		String txt_yourOrder = lbl_yourOrder.getAttribute(strProperty);
		if (lbl_yourOrder.isDisplayed() == true) {
			log("The Header: " + txt_yourOrder + " is displayed in Cart page as expected");
			assertTrue("The Header: " + txt_yourOrder + " is displayed in Cart page as expected", true);
		} else
			assertTrue("The Header:" + txt_yourOrder + " is not displayed in the Cart page as expected", false);
		int itemCount = validateCartIconCount();
		System.out.println(itemCount);
		List<WebElement> btn_duplicate = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/duplicate-Item-text"));
		List<WebElement> btn_edit = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/edit-text"));
		List<WebElement> btn_remove = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/remove-item-text"));
		List<WebElement> lbl_itemPrice = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/vcartPrice-text"));
		List<WebElement> lbl_itemName = driver
				.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/item-Name"));
		for (int i = 0; i < itemCount; i++) {
			String vlu_itemName = lbl_itemName.get(i).getAttribute(strProperty);
			if (lbl_itemName.get(i).isDisplayed() == true) {
				log("The ItemName: " + vlu_itemName + " is displayed in Cart page as expected");
				assertTrue("The ItemName: " + vlu_itemName + " is displayed in Cart page as expected", true);
			} else
				assertTrue("The ItemName:" + vlu_itemName + " is not displayed in the Cart page as expected", false);
			String vlu_duplicate = btn_duplicate.get(i).getAttribute(strProperty);
			if (btn_duplicate.get(i).isDisplayed() == true) {
				log("The Button: " + vlu_duplicate + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected");
				assertTrue("The Button: " + vlu_duplicate + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected", true);
			} else
				assertTrue("The Button:" + vlu_duplicate + " is not displayed in the Cart page as expected", false);

			String vlu_edit = btn_edit.get(i).getAttribute(strProperty);
			if (btn_edit.get(i).isDisplayed() == true) {
				log("The Button: " + vlu_edit + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected");
				assertTrue("The Button: " + vlu_edit + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected", true);
			} else
				assertTrue("The Button:" + vlu_edit + " is not displayed in the Cart page as expected", false);

			String vlu_remove = btn_remove.get(i).getAttribute(strProperty);
			if (btn_remove.get(i).isDisplayed() == true) {
				log("The Button: " + vlu_remove + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected");
				assertTrue("The Button: " + vlu_remove + " is displayed for the ItemName: " + vlu_itemName
						+ " in Cart page as expected", true);
			} else
				assertTrue("The Button:" + vlu_remove + " is not displayed in the Cart page as expected", false);

			String vlu_itemPrice = lbl_itemPrice.get(i).getAttribute(strProperty);

			if (lbl_itemPrice.get(i).isDisplayed() == true) {
				log("The Item: " + vlu_itemName + " price is: " + vlu_itemPrice
						+ " is displayed in Cart page as expected");
				assertTrue("The Item: " + vlu_itemName + " price is: " + vlu_itemPrice
						+ " is displayed in Cart page as expected", true);
			} else
				assertTrue("The Item Name or Item Price is not displayed in cart page", false);
		}

	}

	public void clickAddProductAndAddItem(String exp_item) {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(btn_addProduct);
		btn_addProduct.click();
		waitFor(2000);
		List<WebElement> lst_items = driver
				.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < lst_items.size(); i++) {
			WaitVisibilityOfElement(lst_items.get(i));
			String act_item = lst_items.get(i).getAttribute(strProperty);
			if (act_item.equalsIgnoreCase(exp_item)) {
				lst_items.get(i).click();
				log("The ITEM: " + act_item + " is selected in Add Product as expected");
				break;
			}
		}
	}

	public int validateCartIconCount() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WebElement btn_cart = driver.findElement(
				By.xpath("//android.widget.Button[contains(@content-desc,'Shopping-Bag')]/android.widget.TextView"));
		int vlu_cart = Integer.parseInt(btn_cart.getAttribute(strProperty));
		if (vlu_cart > 0)
			log("The Cart icon count is updated as: " + vlu_cart + " as expected");
		else
			assertTrue("The Cart icon count is not updated", false);
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
			log("The Cart icon Count and Item Count - " + itemCount + " are same as expected");
		else
			assertTrue("The Cart icon Count and Item Count are not same as expected", false);

		String vlu_addPromoCode = lbl_addPromoCode.getAttribute(strProperty);
		if (lbl_addPromoCode.isDisplayed() == true)
			log("The Text: " + vlu_addPromoCode + " is displayed in cart page as expected");
		else
			assertTrue("The Text: Add Promo Code is not displayed in cart page as expected", false);

		String vlu_subTotal = lbl_subTotal.getAttribute(strProperty);
		if (lbl_subTotal.isDisplayed() == true)
			log("The Text: " + vlu_subTotal + " is displayed in cart page as expected");
		else
			assertTrue("The Text: Subtotal is not displayed in cart page as expected", false);

		String vlu_texesAndFees = lbl_taxexAndFees.getAttribute(strProperty);
		if (lbl_taxexAndFees.isDisplayed() == true)
			log("The Text: " + vlu_texesAndFees + " is displayed in cart page as expected");
		else
			assertTrue("The Text: Taxes & Fees is not displayed in cart page as expected", false);

		String vlu_includeUtensils = lbl_includeUtensils.getAttribute(strProperty);
		if (lbl_taxexAndFees.isDisplayed() == true)
			log("The Text: " + vlu_includeUtensils + " is displayed in cart page as expected");
		else
			assertTrue("The Text: Include Utensils is not displayed in cart page as expected", false);

		float vlu_subtotalAmount = Float.parseFloat(lbl_subTotalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_subTotalAmount.isDisplayed() == true)
			log("The SubTotal Amount: " + vlu_subtotalAmount + " is displayed in cart page as expected");
		else
			assertTrue("The SubTotal Amount is not displayed in cart page as expected", false);

		float vlu_taxesAmount = Float.parseFloat(lbl_taxesAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_taxesAmount.isDisplayed() == true)
			log("The SubTotal Amount: " + vlu_taxesAmount + " is displayed in cart page as expected");
		else
			assertTrue("The SubTotal Amount is not displayed in cart page as expected", false);

		String vlu_checkOut = btn_checkout.getAttribute(strProperty);
		if (btn_checkout.isDisplayed() == true)
			log("The Text: " + vlu_checkOut + " is displayed in cart page as expected");
		else
			assertTrue("The Text: CHECKOUT is not displayed in cart page as expected", false);

		float vlu_subTotalAndTaxes = vlu_subtotalAmount + vlu_taxesAmount;
		float vlu_totalAmount = Float.parseFloat(lbl_totalAmount.getAttribute(strProperty).replace("$", ""));
		if (lbl_totalAmount.isDisplayed() == true | vlu_subTotalAndTaxes == vlu_totalAmount)
			log("The Addition of Subtotal and Taxes: " + vlu_totalAmount + " and Total Amount:" + vlu_totalAmount
					+ " are equal and displayed in cart page as expected");
		else
			assertTrue("The total amount is not displayed or the addition of subtotal and taxes: " + vlu_totalAmount
					+ " is not equal to total amount", false);
	}

	public void validateTaxesAndFeesPopUp() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";

		WaitVisibilityOfElement(btn_taxesInfo);
		btn_taxesInfo.click();
		WaitVisibilityOfElement(lbl_headerTaxes);

		String vlu_headerTaxes = lbl_headerTaxes.getAttribute(strProperty);
		if (lbl_headerTaxes.isDisplayed() == true)
			log("The Header: " + vlu_headerTaxes + " is displayed in the popup as expected");
		else
			assertTrue("The Header: Include Utensils is not displayed in the popup", false);
		btn_close.click();
	}

	public void validateDuplicate() {
		ScrollToText("Duplicate");
		WaitVisibilityOfElement(btn_duplicate);
		btn_duplicate.click();
		waitFor(2000);
		List<WebElement> lbl_items = driver.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/item-Name"));
		if (lbl_items.size() > 1) {
			log("The duplicate item is added successfully as expected");
			assertTrue("The duplicate item is added successfully as expected", true);
		} else
			assertTrue("The duplicate item is not added successfully as expected", false);
	}

	public void validateEdit() {
		ScrollToText("Edit");
		WaitVisibilityOfElement(btn_edit);
		btn_edit.click();
		log("The user clicked EDIT button and navigated to next page as expected");
		assertTrue("The user clicked EDIT button and navigated to next page as expected", true);
		driver.navigate().back();
	}

	public void validateRemove() {
		ScrollToText("Remove");
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(btn_remove);
		btn_remove.click();
		WaitVisibilityOfElement(btn_removePopup);
		waitFor(2000);
		List<WebElement> txt_removePopup = driver.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < txt_removePopup.size(); i++) {
			String txt_remove = txt_removePopup.get(i).getAttribute(strProperty);
			log("The Text: " + txt_remove + " is displayed as expected");
			assertTrue("The Text: " + txt_remove + " is displayed as expected", true);
		}

		String vlu_removeItem = lbl_removeItem.getAttribute(strProperty);
		if (lbl_removeItem.isDisplayed() == true) {
			log("The popup: " + vlu_removeItem + " is displayed as expected");
			assertTrue("The popup: " + vlu_removeItem + " is displayed as expected", true);
		} else
			assertTrue("The user clicked EDIT button and navigated not to next page as expected", false);

		if (btn_neverMind.isDisplayed() == true) {
			log("The NEVERMIND button is displayed as expected");
			assertTrue("The NEVERMIND button is displayed as expected", true);
			btn_neverMind.click();
			WaitVisibilityOfElement(btn_duplicate);
			if (btn_duplicate.isDisplayed() == true) {
				log("The user navigated to previous page as expected");
				assertTrue("The user navigated to previous page as expected", true);
				btn_remove.click();
			} else
				assertTrue("The user is not navigated to previous page as expected", false);

		} else
			assertTrue("The NEVERMIND button is not displayed as expected", false);

		WaitVisibilityOfElement(btn_removePopup);
		if (btn_removePopup.isDisplayed() == true) {
			log("The REMOVE button is displayed as expected");
			assertTrue("The REMOVE button is displayed as expected", true);
			btn_removePopup.click();
			WaitVisibilityOfElement(btn_remove);
			waitFor(2000);
			List<WebElement> lbl_items = driver
					.findElements(By.id("com.focusbrands.appcuisine.dev.moes:id/fbrproductinfo/item-Name"));
			if (lbl_items.size() == 1) {
				log("The item is removed successfully as expected");
				assertTrue("The item is removed successfully as expected", true);
			} else
				assertTrue("The item is notremoved successfully as expected", false);
		} else
			assertTrue("The user clicked EDIT button and navigated not to next page as expected", false);
	}

	public void validateNonCustomizablecart() {
		String strProperty = "text";
		if (osName.equalsIgnoreCase("IOS"))
			strProperty = "value";
		WaitVisibilityOfElement(btn_minus);
		if (btn_minus.isDisplayed() == true) {
			log("The Icon: - is displayed as expected");
			assertTrue("The Icon: - is displayed as expected", true);
		} else
			assertTrue("The Icon: - is not displayed as expected", false);

		if (btn_plus.isDisplayed() == true) {
			log("The Icon: + is displayed as expected");
			assertTrue("The Icon: + is displayed as expected", true);
		} else
			assertTrue("The Icon: + is not displayed as expected", false);

		List<WebElement> vlu_text = driver.findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < vlu_text.size(); i++) {
			String act_text = vlu_text.get(i).getAttribute(strProperty);
			if (act_text.equals("Remove")) {
				log("The Button: Remove is displayed as expected");
				assertTrue("The Button: Remove is displayed as expected", true);
				vlu_text.get(i).click();
				log("The REMOVE ITEM popup is displayed as expected");
				btn_close.click();
				break;
			}
		}

	}

}
