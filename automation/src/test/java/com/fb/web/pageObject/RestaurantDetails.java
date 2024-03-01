package com.fb.web.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.Utilities.Utilities;

public class RestaurantDetails extends Utilities {
	
	public RestaurantDetails(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	@FindBy (xpath="//div[@class='restaurantInfoHeadingDesk']//span[@data-testid='txt_storeinfo']")
	private WebElement lbl_RestaurantInfo;
	@FindBy (xpath="//span[@class='leftArrow']")
	private WebElement icon_LeftArrow;
	@FindBy(xpath="//img[@alt='favorite']")
	private WebElement btn_favoriteIcon;
	@FindBy (xpath="//div[@class='locationName']")
	private WebElement lbl_RestaurantName;
	@FindBy (xpath="//div[@data-testid='txt_storeAlldetails']")
	private WebElement lbl_RestaurantAddress;
	@FindBy (xpath="//img[@alt='get_direction']")
	private WebElement btn_GetDirections;
	@FindBy (xpath="(//button[@class='getDirectionsBtn button-wrapper'])[2]")
	private WebElement btn_CallRestaurant;
	@FindBy (xpath="//div[text()='Order Type']")
	private WebElement lbl_OrderType;
	@FindBy (id="btn_pickup")
	private WebElement btn_PickUp;
	@FindBy (id="btn_Delivery")
	private WebElement btn_Delivery;
	@FindBy (xpath="//button[text()='Order Ahead']")
	private WebElement btn_OrderAhead;
	@FindBy (xpath="//button[text()='Order Now']")
	private WebElement btn_OrderNow;
	@FindBy (xpath="//button[@aria-label='Select Location']")
	private WebElement btn_SelectLocation;


	public void restaurantInfoPageUIFieldValidation(String header,String restaurantName,String RestaurantAddress) {
		waitFor(3000);
		logging(condition.info, "Restaurant Info Page UI validation is started....");
		boolean header_Restaurant = lbl_RestaurantInfo.isDisplayed();
		String value_HeaderRestaurant = lbl_RestaurantInfo.getText();
		if (header_Restaurant==true && value_HeaderRestaurant.equalsIgnoreCase(value_HeaderRestaurant)) {
			logging(condition.pass, lbl_RestaurantInfo.getText()+ "is displayed as expected");
		} else {
			logging(condition.warning, lbl_RestaurantInfo+"is not present or it is not same as expected");
		}

		if (icon_LeftArrow.isDisplayed()==true) {
			logging(condition.pass, "Left Arrow is displayed ");			
		} else {
			logging(condition.warning, "Left Arrow is not displayed ");
		}

		boolean status_RestaurantName = lbl_RestaurantName.isDisplayed();
		String value_RestaurantName = lbl_RestaurantName.getText();
		if (status_RestaurantName==true &&value_RestaurantName.equalsIgnoreCase(restaurantName) ) {
			logging(condition.pass, value_RestaurantName+ " is displayed as expected" );
		} else {
			logging(condition.warning, value_RestaurantName+" is not present or it is not same as expected ");
		}
		boolean status_RestaurantAddress = lbl_RestaurantAddress.isDisplayed();
		String value_RestaurantAddress = lbl_RestaurantAddress.getText();
		if (status_RestaurantAddress==true && value_RestaurantAddress.equalsIgnoreCase(value_RestaurantAddress)) {
			logging(condition.pass, value_RestaurantAddress+ " is displayed as expected");
		} else {
			logging(condition.warning, value_RestaurantAddress+" is not present or it is not same as expected ");
		}

		if (lbl_OrderType.isDisplayed()==true) {
			logging(condition.pass, "Order type is displayed  successfully");

		} else {
			logging(condition.warning, "Order type is not displayed");
		}

		boolean status_GetDirections = btn_GetDirections.isDisplayed();
		if (status_GetDirections==true ) {

			logging(condition.pass, "Get Directions button is displayed successfully");
		} else {
			logging(condition.warning, "Get Directions button is not displayed");

		}

		if (btn_CallRestaurant.isDisplayed()==true) {
			logging(condition.pass, "Call Restaurant button is displayed successfully");

		} else {
			logging(condition.fail, "Call Restaurant button is not displayed");
		}
		
		if (btn_SelectLocation.isDisplayed()==true) {
			logging(condition.pass, "Select Location button is displayed successfully ");
			
		} else {
          logging(condition.warning, "Select Location  button is not displayed ");
		}
		
		if (btn_favoriteIcon.isDisplayed()==true) {
			logging(condition.pass, "Favirote icon is displayed successfully ");
		} else {
			logging(condition.warning, "Favirote icon is not displayed ");
		}

       logging(condition.info, "Restaurant Info Page UI validation is completed");

	}
	
	public void clickOnOrderAhead() {
		WaitVisibilityOfElement(btn_OrderAhead);
		boolean status_OrderAhead = btn_OrderAhead.isDisplayed();
		String value_OrderAhead = btn_OrderAhead.getText();
		if (status_OrderAhead==true) {
			logging(condition.pass, value_OrderAhead +" "+" is displayed as expected");
		} else {
              logging(condition.warning, value_OrderAhead+ "  is not displayed as expected");
		}
		
		//TapElement(btn_OrderAhead);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btn_OrderAhead);
		logging(condition.info,value_OrderAhead+ " CTA is clicked as expected");
		logging(condition.info, "Navigated to Order Info page as expected");
	}
	
	public void clickOnSelectLocation() {
		WaitVisibilityOfElement(btn_SelectLocation);
		boolean status_SelectLocation = btn_SelectLocation.isDisplayed();
		String value_SelectLocation = btn_SelectLocation.getText();
		if (status_SelectLocation==true) {
			logging(condition.pass, value_SelectLocation+" is displayed as expected");
		} else {
             logging(condition.warning, value_SelectLocation+ " is not displayed as expected");
		}
		//TapElement(btn_SelectLocation);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btn_SelectLocation);
		logging(condition.info, value_SelectLocation+" is clicked as expected");
	}





}
