package com.fb.web.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fb.Utilities.Utilities;

public class OrderInfoPage extends Utilities{

	public OrderInfoPage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	@FindBy(xpath="//button[@id='link_back']//img")
	private WebElement arrow_Back;
	@FindBy (xpath="//button[@id='link_back']//following::h1")
	private WebElement lbl_OrderInfo;
	@FindBy (id="btn_pickup")
	private WebElement btn_Pickup;
	@FindBy  (id="btn_delivery")
	private WebElement btn_Delivery;
	@FindBy (xpath="(//div[@class='fbrRestaurantInfo']//div[@class='fbrOrderInfoTitle'])[1]")
	private WebElement lbl_YourMoEsRestaurant;
	@FindBy (xpath="//div[@class='fbrInnerTextTwo']//div[@class='fbrLeftContent']")
	private WebElement lbl_RestaurantName;
	@FindBy (xpath="//div[@class='fbrInnerTextTwo']//div[@class='fbrAddressContent']")
	private WebElement lbl_RestaurantAddress;
	@FindBy (id="fbrOrderInfoEdit")
	private WebElement btn_Edit;
	@FindBy (xpath="//div[@class='fbrAvailableTime']//div//div//span//img")
	private WebElement icon_AvilabilityTime;
	@FindBy (xpath="(//div[@class='fbrAvailableTime']//following::span)[1]")
	private WebElement time_StoreAvailability;
	@FindBy (xpath="(//div[@class='fbrRestaurantInfo']//div[@class='fbrOrderInfoTitle'])[2]")
	private WebElement lbl_ScedudleFor;
	@FindBy (id="fbrOrderInfoAsapBtn")
	private WebElement btn_ASAP;
	@FindBy (id="fbrOrderInfoLaterBtn")
	private WebElement btn_Later;
	@FindBy (xpath="(//img[@class='searchImg'])[1]")
	private WebElement icon_DatePickerSearch;
	@FindBy (xpath="(//img[@class='searchImg'])[2]")
	private WebElement icon_TimePickerSearch;
	@FindBy (xpath="//input[@data-testid='orderInfoInputDate']")
	private WebElement btn_OrderInfoInputDate;
	@FindBy (xpath="//input[@data-testid='orderInfoInputTime']")
	private WebElement btn_OrderInfoInputTime;
	@FindBy (xpath="(//img[@class='arrowImg'])[1]")
	private WebElement arrow_DatePicker;
	@FindBy (xpath="(//img[@class='arrowImg'])[2]")
	private WebElement arrow_TimePicker;
	@FindBy (id="fbrOrderInfoConfirmBtn")
	private WebElement btn_Confirm;


	public void orderInfoPageUIValidation(String header,String label1,String Label2,String restName,String restAddress)
	{
		logging(condition.info, "Order Info Page UI validation is started.....");
		waitFor(3000);
		if (arrow_Back.isDisplayed()==true) {
			logging(condition.pass, "Back Arrow is displayed as expected");

		} else {
			logging(condition.warning, "Back Arrow is not displayed as expected ");
		}

		boolean status_Label = lbl_OrderInfo.isDisplayed();
		String value_Header = lbl_OrderInfo.getText();
		if (status_Label==true && value_Header.equals(header)) {
			logging(condition.pass, lbl_OrderInfo.getText()+ "is displayed as expected");
		} else {
			logging(condition.warning, lbl_OrderInfo.getText()+"is not displayed as expected");
		}

		if (btn_Pickup.isDisplayed()==true) {
			logging(condition.pass, "User is able to view Pick Up button as expected");
		} else {
			logging(condition.warning, "User is unable to view Pick Up button as expected");
		}

		if (btn_Delivery.isDisplayed()==true) {
			logging(condition.pass, "User is able to view Delivery button as expected");
		} else {
			logging(condition.warning, "User is unable to view Delivery button as expected");
		}

		boolean status_Label1 = lbl_YourMoEsRestaurant.isDisplayed();
		String value_Label1 = lbl_YourMoEsRestaurant.getText();
		if (status_Label1==true &&value_Label1.equals(label1) ) {
			logging(condition.pass," User is able to view " +value_Label1+" is displayed as expected" );
		} else {
			logging(condition.warning," User is unable to view " +value_Label1+" is displayed as expected" );
		}

		boolean status_RestName = lbl_RestaurantName.isDisplayed();
		String value_RestaurantName = lbl_RestaurantName.getText();
		if (status_RestName==true && value_RestaurantName.equals(restName)) {
			logging(condition.pass, " User is able to view " + value_RestaurantName+"is displayed as expected");
		} else {
			logging(condition.warning, "User is unable to view " + value_RestaurantName+"is displayed as expected");
		}

		boolean status_RestAddr = lbl_RestaurantAddress.isDisplayed();
		String value_RestAddr = lbl_RestaurantAddress.getText();
		if (status_RestAddr==true &&value_RestAddr.equals(restAddress) ) {
			logging(condition.pass, "User is able to view " + value_RestAddr+"is displayed as expected");
		} else {
			logging(condition.warning, "User is unable to view " + value_RestAddr+"is displayed as expected");
		}

		if (btn_Edit.isDisplayed()==true) {
			logging(condition.pass, "User is able to view is Edit button as expected");

		} else {
			logging(condition.warning, "User is unable to view is Edit button as expected");
		}

		if (icon_AvilabilityTime.isDisplayed()==true) {
			logging(condition.pass, "User is able to view Avialability time Icon as expected");	
		} else {
			logging(condition.warning, "User is unable to view Avialability time Icon as expected");
		}

		if (btn_OrderInfoInputTime.isDisplayed()==true) {
			logging(condition.pass, "User is able to view Avialability time as: "+" "+btn_OrderInfoInputTime.getText()+" "+" as expected");
		} else {
			logging(condition.warning, "User is unable to view Avialability time as:"+" "+btn_OrderInfoInputTime.getText()+" as expected");
		}
		
		boolean status_Label2 = lbl_ScedudleFor.isDisplayed();
		String value_Label2 = lbl_ScedudleFor.getText();
		if (status_Label2==true && value_Label2.equals(Label2)) {
			logging(condition.pass, "User is able to view the title as "+value_Label2+" as expected");
		} else {
			logging(condition.warning, "User is unable to view the title as "+value_Label2+" as expected");
		}
		
		if (btn_ASAP.isDisplayed()==true) {
			logging(condition.pass, "ASAP button is displayed as expected");
		} else {
			logging(condition.warning, "ASAP button is not displayed as expected");
		}
		
		if (icon_DatePickerSearch.isDisplayed()==true) {
			logging(condition.pass, "Date Picker search icon is displayed as expected");
		} else {
			logging(condition.warning, "Date Picker search icon is not displayed as expected");
		}
		
		if (icon_TimePickerSearch.isDisplayed()==true) {
			logging(condition.pass, "Time Picker search icon is displayed as expected");
		} else {
			logging(condition.warning, "Time Picker search icon is not displayed as expected");
		}
		
		if (btn_OrderInfoInputDate.isDisplayed()==true) {
			logging(condition.pass, "Order Input Date button is displayed as expected");
		} else {
			logging(condition.warning, "Order Input Date button is not displayed as expected");
		}
		
		if (btn_OrderInfoInputTime.isDisplayed()==true) {
			logging(condition.pass, "Order Input time button is displayed as expected");
		} else {
			logging(condition.warning, "Order Input time button is displayed as expected");
		}
		
		if (btn_Confirm.isDisplayed()==true) {
			logging(condition.pass, "Confirm button is displayed as expected");
		} else {
			logging(condition.warning, "Confirm button is displayed as expected");
		}
		
		if (arrow_DatePicker.isDisplayed()==true) {
			logging(condition.pass, "Date Picker arrow is displayed as expected");
		} else {
			logging(condition.warning, "Date Picker arrow is not displayed as expected");
		}
		
		if (arrow_TimePicker.isDisplayed()==true) {
			logging(condition.pass, "Time Picker arrow is displayed as expected");
		} else {
			logging(condition.warning, "Time Picker arrow is not displayed as expected");
		}
		
		logging(condition.info, "Order Info Page UI validation is completed.....");

	}
	
	public void verifyOrderInfoPage() {
		waitFor(3000);
		boolean status_OrderInfo = lbl_OrderInfo.isDisplayed();
		String value_OrderInfo = lbl_OrderInfo.getText();
		if (status_OrderInfo==true) {
			logging(condition.pass,"Navigated to: "+ value_OrderInfo +"Page as expected" );
			
		} else {
			logging(condition.warning,"Not navigated to: "+ value_OrderInfo +"Page as expected" );
		}	
	}
	
	public void clickOnLaterCTA() {
		WaitVisibilityOfElement(btn_Later);
		boolean status_LaterCTA = btn_Later.isDisplayed();
		String value_LaterCTA = btn_Later.getText();
		if (status_LaterCTA==true) {
			logging(condition.pass, value_LaterCTA+ " is displayed as expected");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", btn_Later);
			logging(condition.pass, value_LaterCTA+" is clicked as expected");
		} else {
			logging(condition.warning, value_LaterCTA+ " is not displayed as expected");
			logging(condition.warning, value_LaterCTA+" is not clicked as expected");
		}
		
		
	}

	public void selectOrderTime(String orderInputDate, String orderInputTime) {
		WaitVisibilityOfElement(btn_OrderInfoInputDate);
		btn_OrderInfoInputDate.sendKeys(orderInputDate);
		btn_OrderInfoInputTime.sendKeys(orderInputTime);
	}
	
	public void clickOnConfirmCTA() {
		WaitVisibilityOfElement(btn_Confirm);
		String value_ConfirmCTA = btn_Confirm.getText();	
		if (btn_Confirm.isDisplayed()==true) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", btn_Confirm);
			logging(condition.pass, value_ConfirmCTA+ " is clicked as expected as expected");
		} else {
			logging(condition.pass, value_ConfirmCTA+ " is not clicked as expected ");
		}
		}
	
	public void clickOnEditCTA() {
		waitFor(3000);
		TapElement(btn_Edit);
		logging(condition.pass, "User is clicked Edit CTA as expected");
	}

}
