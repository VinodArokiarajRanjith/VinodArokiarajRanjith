package com.fb.web.pageObject;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.fb.Utilities.Utilities;
import com.fb.Utilities.Utilities.condition;
import com.fb.pageObject.AccountAddressesPage;
import com.fb.pageObject.FBsCommonMethods;
import com.fb.web.commonmethods.Webcommonmethods;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends Utilities{

	public HomePage(RemoteWebDriver driver) {
		PageFactory.initElements(Utilities.driver, this);
	}

	Webcommonmethods webcommon = new Webcommonmethods(driver);

	@FindBy(id = "img_moesLogo")
	private WebElement logo_MoEs;
	@FindBy(id = "link_menu")
	private WebElement linkMenu;
	@FindBy(id = "link_rewards")
	private WebElement linkRewards;
	@FindBy(id = "link_catering")
	private WebElement linkCatering;
	@FindBy(id = "link_giftcards")
	private WebElement linkGiftCards;
	@FindBy(id = "link_guestProfile")
	private WebElement icon_Profile;
	@FindBy (id ="BTN_STARTORDER")
	private WebElement btn_StartOrder;
	@FindBy(id = "link_youtube")
	private WebElement linkYoutube;
	@FindBy(id = "link_facebook")
	private WebElement link_FaceBook;
	@FindBy(id="link_twitter")
	private WebElement link_Twitter;
	@FindBy(id="link_instagram")
	private WebElement link_Instagram;
	@FindBy(id="txt_stayconnected")
	private WebElement txt_StayConnected;
	@FindBy(id="txt_getthemoesapp")
	private WebElement txt_GetMoEsApp;
	@FindBy(id="img_appStore")
	private WebElement img_AppStore;
	@FindBy(id="img_googlePlay")
	private WebElement img_GooglePlay;
	@FindBy(xpath="//span[@data-testid='txt_Nosmartphone']")
	private WebElement txt_NoSmartPhone;
	@FindBy(id="link_Accessibility")
	private WebElement link_Accessibility;


	//......Hero Image locators.......
	@FindBy (xpath="//span[@data-testid='text_welcome']")
	private WebElement text_WelcomeTo;
	@FindBy (xpath="//span[@data-testid='banner_double_text_first']")
	private WebElement text_MoEs;
	@FindBy (xpath="//h4[@data-testid='badge_id']")
	private WebElement header_MoEMonday;
	@FindBy (xpath="//h2[@data-testid='head_title_id']")
	private WebElement details_MoEMondayOffer;
	@FindBy (xpath="//p[@data-testid='text_banner_description']")
	private WebElement description_HeroImage;
	@FindBy (xpath="//a[@data-testid='button_title']")
	private WebElement btn_OrderNow;
	@FindBy (xpath="//a[@data-testid='text_tac']")
	private WebElement term_HeroImage;

	//..SuggesstedSell locators.....
	@FindBy (xpath ="//div[@class='gallery']//div[@class='gallerySliderBox']")
	private List<WebElement> suggesstdCellsCount;
	@FindBy (xpath ="//div[@class='galleryTextContainer']//h2")
	private List<WebElement> suggesstedSellNames;
	@FindBy (xpath ="//div[@class='galleryDescription']//span[contains(text(),'$')]")
	private List<WebElement> cost_SuggesstedSells;
	@FindBy (xpath ="(//div[@class='galleryDescription']//span[contains(text(),'$')]//following-sibling::span)[2]")
	private List<WebElement> cal_SuggesstedSells;
	@FindBy (xpath="//a[@href='/cart']//img[@class='addicon']")
	private WebElement addIcon_SuggesstedSell;
	@FindBy (xpath="//div[text()='New' or text()='Expiring soon']")
	private WebElement batchIcon_SuggesstedSell;
	@FindBy (xpath="(//button[text()='View Menu' and @aria-label='View Menu'])[1]")
	private WebElement btn_ViewMenu;
	@FindBy (xpath = "(//div[@class='relative'])[2]//span[1]")
	private WebElement title_SuggestedSell;

	//..Rewards Banner locators....

	@FindBy (xpath="(//div[@class='relative']//span[text()='Queso Awaits!'])[1]")
	private WebElement title_RewardsBanner;
	@FindBy (xpath="//div[contains(text(),'Join Moe')]")
	private WebElement description_RewardsBanner;
	@FindBy (xpath="//div[@data-testid='text_rewards_tac_two']")
	private WebElement tax_RewardsBanner;
	@FindBy(id="link_signuphere")
	private WebElement link_SignUpHere;

	//..RightSide Banner locators...
	@FindBy (xpath="//a[text()='EXPLORE MENU']")
	private WebElement btn_ExploreMenu;
	@FindBy (xpath ="(//span[contains(text(),'INTRODUCING NEW')])[1]")
	private WebElement title_RightSideImageBanner;
	@FindBy (xpath ="(//div[@class='menuVarietieOfferRight']//following::h2)[1]")
	private WebElement subTitle_RightSideImageBanner;
	@FindBy (xpath="(//div[@class='moesDescription'])[1]")
	private WebElement description_RightSideBanner;
	@FindBy (xpath="//a[@data-testid='text_content_img_right_tac']")
	private WebElement terms_RightSideBanner;

	//..LeftSide Banner locators...
	@FindBy (xpath ="(//div[@class='menuVarietieOfferRight']//following::h2)[2]")
	private WebElement Title_LeftSideImageBanner;
	@FindBy (xpath="(//div[@class='moesDescription'])[2]")
	private WebElement description_LeftSideBanner;
	@FindBy (xpath="//a[@aria-label='LEARN MORE']")
	private WebElement btn_LearnMore;


	//Other Page locators
	@FindBy (xpath="//img[@aria-label='close']")
	private WebElement icon_closewelcoePage;
	@FindBy(xpath="//a[@data-testid='link_signin']")
	private WebElement link_AlreadySignIn;
	@FindBy (xpath="//a[@data-testid='link_forgotPassword']")
	private WebElement link_ForgotPwd;
	@FindBy (xpath="//button[@data-testid='link_back']")
	private WebElement arrow_Back;
	@FindBy (xpath ="//button[@id='btn_pickup']")
	private WebElement btn_PickUp;
	@FindBy (xpath ="//h1[text()='Welcome']")
	private WebElement heading_WelcomePage;
	@FindBy (xpath ="//h1[@data-testid='txt_cookin']")
	private WebElement heading_CookIn;
	@FindBy (xpath="(//a[@aria-label='Terms and conditions apply.'])[1]")
	private WebElement text_TermsInHeroImage;
	@FindBy (id ="reward-sign-up")
	private WebElement btn_RewardSignUp;
	@FindBy (xpath ="(//div[text()='Taxes and fees apply'])[1]")
	private WebElement content_TaxesAndFees;
	@FindBy (id="link_menu")
	private WebElement tab_Menu;
	@FindBy (xpath="//a[@data-testid='breadcrumb_test_id']")
	private WebElement img_Home;
	@FindBy (xpath="(//a[text()='Terms and conditions apply.'])[2]")
	private WebElement content_TermsConditions;
	@FindBy (xpath ="//button[@data-testid='link_back']")
	private WebElement icon_closeStoreSearch;
	@FindBy (xpath="//label[@class='typeLabel']")
	private WebElement restName_OrderConfirmationPickup;
	@FindBy (xpath="//label[@class='clockLabel text-error']")
	private WebElement time_OrderConfirmationPickup;
	@FindBy (xpath="//button[@data-testid='order_changeButtonId']")
	private WebElement btn_Change;
	@FindBy (id="order_locationId")
	private WebElement icon_LocationID;
	@FindBy (id="order_clockId")
	private WebElement icon_Clock;
	

	public void homePageUIValidations(String connectionText,String getApps,String smartPhonestatus) {
		logging(condition.info, "HomePage UI validation is started..");
		boolean status_Logo = logo_MoEs.isDisplayed();
		if (status_Logo==true) {
			logging(condition.pass, "The Logo: MoEs is displayed as expected");
		} else {
			logging(condition.warning, "The Logo: MoEs is not displayed");
			assertTrue("The Logo: MoEs is not displayed", logo_MoEs.isDisplayed());
		}

		boolean status_Menu = linkMenu.isDisplayed();
		if (status_Menu==true) {
			logging(condition.pass, "The link: Menu is displayed as expected");
		} else {
			logging(condition.warning, "The link: Menu is not displayed");
			assertTrue("The Logo: MoEs is not displayed", linkMenu.isDisplayed());
		}

		boolean status_Rewards = linkRewards.isDisplayed();
		if (status_Rewards==true) {
			logging(condition.pass, "The link:Rewards is displayed as expected");
		} else {
			logging(condition.warning, "The link: Rewards is not displayed");
			assertTrue("The link: Rewards is not displayed", linkRewards.isDisplayed());
		}

		boolean status_Catering = linkCatering.isDisplayed();
		if (status_Catering==true) {
			logging(condition.pass, "The link:Catering is displayed as expected");
		} else {
			logging(condition.warning, "The link: Catering is not displayed");
			assertTrue("The link: Catering is not displayed", linkCatering.isDisplayed());
		}

		boolean status_GiftCards = linkGiftCards.isDisplayed();
		if (status_GiftCards==true) {
			logging(condition.pass, "The link:GiftCards is displayed as expected");
		} else {
			logging(condition.warning, "The link: GiftCards is not displayed as expected");
			assertTrue("The link:GiftCard is not displayed", linkGiftCards.isDisplayed());
		}

		boolean status_Profile = icon_Profile.isDisplayed();
		if (status_Profile==true) {
			logging(condition.pass, "The icon:Profile is displayed as expected");
		} else {
			logging(condition.warning, "The icon:Profile is not displayed as expected");
			assertTrue("The icon:Profile is not displayed", icon_Profile.isDisplayed());
		}

		boolean status_FaceBook=link_FaceBook.isDisplayed();
		if (status_FaceBook==true) {
			logging(condition.pass, "The Link:Facebook is displayed as expected");
		} else {
			logging(condition.warning, "The Link:Facebook is not displayed as expected");
			assertTrue("The Link:Facebook is not displayed", link_FaceBook.isDisplayed());
		}

		boolean status_Twitter=link_Twitter.isDisplayed();
		if (status_Twitter==true) {
			logging(condition.pass, "The Link:Twitter is displayed as expected");
		} else {
			logging(condition.warning, "The Link:Twitter is not displayed as expected");
			assertTrue("The Link:Twitter is not displayed", link_Twitter.isDisplayed());
		}

		boolean status_Instagram=link_Instagram.isDisplayed();
		if (status_Instagram==true) {
			logging(condition.pass, "The Link:Instagram is displayed as expected");
		} else {
			logging(condition.warning, "The Link:Instagram is not displayed");
			assertTrue("The Link:Instagram is not displayed", link_Instagram.isDisplayed());
		}

		String value_stayConnected = txt_StayConnected.getText();
		boolean status_stayConnected = txt_StayConnected.isDisplayed();
		if (status_stayConnected==true && value_stayConnected.equals(connectionText)) {
			logging(condition.pass,"User is able to view "+value_stayConnected+" displayed as expected");
		} else {
			logging(condition.warning, "User is not able to view "+value_stayConnected+" displayed as expected");
		}

		String value_GetApp = txt_GetMoEsApp.getText();
		boolean status_GetApp = txt_GetMoEsApp.isDisplayed();
		if (status_GetApp==true && value_GetApp.equals(getApps)) {
			logging(condition.pass,"User is able to view "+value_GetApp+" displayed as expected");
		} else {
			logging(condition.warning, "User is not able to view "+value_GetApp+" displayed as expected");
		}

		boolean status_AppStore = img_AppStore.isDisplayed();
		if (status_AppStore==true) {
			logging(condition.pass, "The Link:AppStore is displayed as expected");
		} else {
			logging(condition.warning, "The Link:AppStore is not displayed");
			assertTrue("The Link:AppStore is not displayed", img_AppStore.isDisplayed());
		}

		boolean status_GooglePlay = img_GooglePlay.isDisplayed();
		if (status_GooglePlay==true) {
			logging(condition.pass, "The Link:GooglePlay is displayed as expected");
		} else {
			logging(condition.warning, "The Link:GooglePlay is not displayed");
			assertTrue("The Link:AppStore is not displayed", img_GooglePlay.isDisplayed());
		}

		boolean status_noSmartPhone = txt_NoSmartPhone.isDisplayed();
		String value_smartPhone = txt_NoSmartPhone.getText();
		if (status_noSmartPhone==true &&value_smartPhone.equals(smartPhonestatus) ) {
			logging(condition.pass,value_smartPhone+" is displayed as expected");
		} else {
			logging(condition.warning, value_smartPhone+ "  is not displayed");

		}

		boolean status_signUpHere = link_SignUpHere.isDisplayed();
		if (status_signUpHere==true) {
			logging(condition.pass, "The Link:SignUpHere is displayed as expected");
		} else {
			logging(condition.warning,"The Link:SignUpHere is not displayed as expected");
			assertTrue("The Link:SignUpHere is not displayed", link_SignUpHere.isDisplayed());
		}

		boolean status_Accessibility = link_Accessibility.isDisplayed();
		if (status_Accessibility==true) {
			logging(condition.pass, "The Link:Accessibility is displayed as expected");
		} else {
			logging(condition.warning, "The Link:Accessibility is not displayed as expected");
			assertTrue("The Link:Accessibility is not displayed as expected", link_Accessibility.isDisplayed());
		}

		boolean status_AnimalWalfare = link_AnimalWalfare.isDisplayed();
		if (status_AnimalWalfare==true) {
			logging(condition.pass, "The Link:AnimalWalfare is displayed as expected");
		} else {
			logging(condition.warning, "The Link:AnimalWalfare is not displayed as expected");
			assertTrue("The Link:AnimalWalfare is not displayed as expected", link_AnimalWalfare.isDisplayed());
		}
		logging(condition.warning, "HomePage UI validation is completed..");
	}

	public void heroImageUIValidation(String title1,String title2,String header1,String header2,String Description,String Terms)
	{
		logging(condition.info, "Hero Image validation is started.....");
		WaitVisibilityOfElement(text_WelcomeTo);
		boolean status_WelcomeTo = text_WelcomeTo.isDisplayed();
		String value_WelcomeTo = text_WelcomeTo.getText().trim();
		if (status_WelcomeTo==true && value_WelcomeTo.equals(title1)) {
			logging(condition.pass, "User is able to view "+text_WelcomeTo.getText()+"  as expected");
		} else {
			logging(condition.warning, "User is unable to view "+text_WelcomeTo.getText()+" as expected");	
		}

		waitFor(15000);
		boolean status_MoEs = text_MoEs.isDisplayed();
		String value_MoEs = text_MoEs.getText();
		if (status_MoEs==true && value_MoEs.equals(title2)) {
			logging(condition.pass, "User is able to view "+value_MoEs+" as expected");
		} else {
			logging(condition.warning, "User is unable to view "+value_MoEs+" as expected");	
		}

		waitFor(3000);
		boolean status_header1 = header_MoEMonday.isDisplayed();
		String value_header1 = header_MoEMonday.getText();
		if (status_header1==true && value_header1.equals(header1)) {
			logging(condition.pass, "User is able to view "+value_header1+" as expected");
		} else {
			logging(condition.warning, "User is unable to view "+value_header1+" as expected");	
		}

		waitFor(3000);
		boolean status_header2 = details_MoEMondayOffer.isDisplayed();
		String value_header2 = details_MoEMondayOffer.getText();
		if (status_header2==true && value_header2.equals(header2)) {
			logging(condition.pass, "User is able to view "+value_header2+" as expected");
		} else {
			logging(condition.warning, "User is unable to view "+value_header2+" as expected");	
		}
		waitFor(3000);
		boolean status_Description = description_HeroImage.isDisplayed();
		String value_Description = description_HeroImage.getText();
		if (status_Description==true && value_Description.equals(Description)) {
			logging(condition.pass, "User is able to view "+value_Description+" as expected");
		} else {
			logging(condition.warning, "User is unable to view "+value_Description+" as expected");	
		}

		waitFor(3000);
		boolean status_Terms = term_HeroImage.isDisplayed();
		String value_Terms = term_HeroImage.getText();
		if (status_Terms==true && value_Description.equals(Terms)) {
			logging(condition.pass, "User is able to view "+value_Terms+" as expected");
		} else {
			logging(condition.warning, "User is unable to view "+value_Terms+" as expected");	
		}

		waitFor(6000);
		boolean status_OrderNow = btn_OrderNow.isDisplayed();
		if (status_OrderNow==true) {
			logging(condition.pass, "User is able to view Order now CTA as expected");
		} else {
			logging(condition.warning, "User is unable to view Order now CTA as expected");	
		}
		
		logging(condition.info, "Hero Image validation is completed.....");
	}

	public void verifySuggesstedSellCount()
	{
		waitFor(5000);
		int suggesstedCells=0;
		List<WebElement> li = new ArrayList<WebElement>();
		li.addAll(suggesstdCellsCount);
		for (WebElement webElement : suggesstdCellsCount) {
			suggesstedCells++;
		}
		if (suggesstedCells<=3) {
			logging(condition.pass, "User is able to view suggessted cell count" +suggesstedCells +" as expected" );
		} else {
			logging(condition.warning, "User is unable to view suggessted cell count"+suggesstedCells +" as expected");
		}
	}

	public void verifySuggesstedSellName()
	{
		waitFor(5000);
		String suggesstedSellsName="";
		List<WebElement> li = new ArrayList<WebElement>();
		li.addAll(suggesstedSellNames);
		System.out.println("SugesstedSell Item names are: ");
		for (WebElement webElement : suggesstedSellNames) {
			suggesstedSellsName=webElement.getText();
			logging(condition.info, "SuggesstedSell items name:" +suggesstedSellsName+" is displayed as expected");
		}
	}

	public void verifySuggesstedSellCost() {

		String cost="";
		List<WebElement> li = new ArrayList<WebElement>();
		li.addAll(cost_SuggesstedSells);
		System.out.println("SugesstedSell Item costs are: ");
		for (WebElement webElement : cost_SuggesstedSells) {
			cost=webElement.getText();
			logging(condition.info, "Suggessted Sell cost: "+cost+" is displayed as expected");
		}
	}

	public void verifySuggesstedSellCalories() {

		String calories="";
		List<WebElement> li = new ArrayList<WebElement>();
		li.addAll(cal_SuggesstedSells);
		System.out.println("SugesstedSell Item calories are: ");
		for (WebElement webElement : cal_SuggesstedSells) {
			calories=webElement.getText();
			logging(condition.info, "Suggessted sell calories: "+calories+" displayed as expected");
		}
	}



	public void verifyBatchIcon() {
		WaitVisibilityOfElement(batchIcon_SuggesstedSell);
		if (batchIcon_SuggesstedSell.isDisplayed()==true) {
			logging(condition.pass, "User is able to see batch icon as New or Expiring soon in suggessted Sell");
		} else {
			logging(condition.warning, "User is unable to see batch icon as New or Expiring soon in suggessted sell");
		}
	}

	public void verifyViewMenuCTA() {
		WaitVisibilityOfElement(btn_ViewMenu);
		if (btn_ViewMenu.isDisplayed()==true) {
			logging(condition.pass, "User is able to see View Menu as expected");
		} else {
			logging(condition.warning, "User is unable to see view menu as expected");
		}
	}

	public void verifySuggesstedSellTitle(String suggesstedSelltitle )
	{
		waitFor(5000);
		scrollDownToElement(driver, title_SuggestedSell);
		boolean status_Picks = title_SuggestedSell.isDisplayed();
		String value_Picks = title_SuggestedSell.getText().trim();

		if (status_Picks==true&&value_Picks.equals(suggesstedSelltitle)) {
			logging(condition.pass, "User is able to view the suggessted sell title as  "+value_Picks);
		} else {
			logging(condition.warning, "User is able to unview the suggessted sell title as  "+value_Picks);
		}
	}

	public void verifyRewardsBannerUI(String title,String description, String tax)
	{
		logging(condition.info, "Rewards Banner UI validation is started....");
		waitFor(5000);
		scrollDownToElement(driver, title_RewardsBanner);
		boolean status_Queso = title_RewardsBanner.isDisplayed();
		String value_Queso = title_RewardsBanner.getText().trim();

		if (status_Queso==true&&value_Queso.equals(title)) {
			logging(condition.pass, "User is able to view the Rewards Banner title as  "+value_Queso);
		} else {
			logging(condition.warning, "User is unable to view the Rewards Banner title as  "+value_Queso);
		}

		waitFor(2000);
		boolean status_JoinMoe = description_RewardsBanner.isDisplayed();
		String value_status_JoinMoe = description_RewardsBanner.getText().trim()+"!";

		if (status_JoinMoe==true&&value_status_JoinMoe.equals(description)) {
			logging(condition.pass, "User is able to view the Rewards Banner title as  "+value_status_JoinMoe);
		} else {
			logging(condition.warning, "User is unable to view the Rewards Banner title as  "+value_status_JoinMoe);
		}

		waitFor(2000);
		boolean status_Tax = tax_RewardsBanner.isDisplayed();
		String value_Tax = tax_RewardsBanner.getText().trim();

		if (status_Tax==true&&value_Tax.equals(tax)) {
			logging(condition.pass, "User is able to view the Rewards Banner title as  "+value_Tax);
		} else {
			logging(condition.warning, "User is unable to view the Rewards Banner title as  "+value_Tax);
		}
		
		boolean status_SignUp = link_SignUpHere.isDisplayed();
		if (status_SignUp==true) {
			logging(condition.pass, "User is able to view Sign Up CTA as expected");
		} else {
			logging(condition.warning, "User is unable to view Sign Up CTA as expected");
		}
		
		logging(condition.info, "Rewards Banner UI validation is completed....");
	}

	

	public void verifyRightSideBannerUI(String title1,String title2,String description,String terms) {
          logging(condition.info, "Right side banner UI validation is started....");
		waitFor(5000);
		scrollDownToElement(driver, title_RightSideImageBanner);
		boolean status_Introducing = title_RightSideImageBanner.isDisplayed();
		String value_Introducing = title_RightSideImageBanner.getText().trim();

		if (status_Introducing==true&&value_Introducing.equals(title1)) {
			logging(condition.pass, "User is able to view the Rightside Banner title as : "+value_Introducing);
		} else {
			logging(condition.warning, "User is unable to view the RightSide Banner title as:  "+value_Introducing);
		}

		waitFor(5000);
		boolean status_ATMOEs = subTitle_RightSideImageBanner.isDisplayed();
		String value_ATMOEs = subTitle_RightSideImageBanner.getText().trim();

		if (status_ATMOEs==true&&value_ATMOEs.equals(title2)) {
			logging(condition.pass, "User is able to view the Rightside Banner subtitle as:  "+value_ATMOEs);
		} else {
			logging(condition.warning, "User is unable to view the RightSide Banner subtitle as:  "+value_ATMOEs);
		}

		boolean status_TrySignature = description_RightSideBanner.isDisplayed();
		String value_TrySignature = description_RightSideBanner.getText().trim();

		if (status_TrySignature==true&&value_TrySignature.equals(description)) {
			logging(condition.pass, "User is able to view the Rightside Banner description as:  "+value_TrySignature);
		} else {
			logging(condition.warning, "User is unable to view the RightSide Banner description as : "+value_TrySignature);
		}

		boolean status_Term = terms_RightSideBanner.isDisplayed();
		String value_Terms = terms_RightSideBanner.getText().trim();

		if (status_Term==true&&value_Terms.equals(terms)) {
			logging(condition.pass, "User is able to view the Rightside Banner condition as:  "+value_Terms);
		} else {
			logging(condition.warning, "User is unable to view the RightSide Banner condition as:  "+value_Terms);
		}

		boolean status_ExploreMenuCTA = btn_ExploreMenu.isDisplayed();
		if (status_ExploreMenuCTA) {
			logging(condition.pass, "User is able to view Explore Menu CTA");
		} else {
			logging(condition.warning, "User is unable to view Explore Menu CTA");

		}
		
		logging(condition.info, "Right side banner UI validation is completed....");
	}

	public void verifyLeftSideBannerUI(String title,String description){
		logging(condition.info, "Left side banner image validation is started....");
		scrollDownToElement(driver, Title_LeftSideImageBanner);
		boolean status_title=Title_LeftSideImageBanner.isDisplayed();
		String value_title=Title_LeftSideImageBanner.getText();
		if (status_title==true && value_title.equals(title)) {
			logging(condition.pass, "User is able to view left side banner title as : "+value_title);
		} else {
			logging(condition.warning, "User is unable to view left side banner title as :"+value_title);

		}

		boolean status_description=description_LeftSideBanner.isDisplayed();
		String value_description=description_LeftSideBanner.getText();
		if (status_description==true && value_description.equals(description)) {
			logging(condition.pass, "User is able to view left side banner title as :"+value_description);
		} else {
			logging(condition.warning, "User is unable to view left side banner title as :"+value_description);

		}

		boolean status_LearnMoreCTA=btn_LearnMore.isDisplayed();
		if (status_LearnMoreCTA==true) {
			logging(condition.pass, "User is able to view Learn More CTA");
		} else {
			logging(condition.warning, "User is unable to view Learn More CTA");

		}
		logging(condition.info, "Left side banner image validation is completed....");
	}

	public void clickOnCloseIconWelcomePage()
	{
		WaitVisibilityOfElement(icon_closewelcoePage);
		TapElement(icon_closewelcoePage);
		logging(condition.pass, "User is clicked : close icon as expected");
	}

	public void verifyCreateAnAccount() {
		waitFor(3000);
		if (link_AlreadySignIn.isDisplayed()==true) {
			logging(condition.pass, "User is navigate to Create An Account page");
		} else {
			logging(condition.warning, "User is not navigated to Create An Account page");
		}
	}

	public void clickOnBackArrow() {
		waitFor(2000);
		driver.navigate().back();
	}

	public void verifyStayConnectedLinks()
	{
		logging(condition.info, "Stay connected link validation is started");
		WaitVisibilityOfElement(linkYoutube);
		TapElement(linkYoutube);
		logging(condition.pass, "User is clicked : YouTube link as expected");
		confirmPageNavigation();
		WaitVisibilityOfElement(link_Twitter);
		TapElement(link_Twitter);
		logging(condition.pass, "User is clicked : Twitter link as expected");
		confirmPageNavigation();
		WaitVisibilityOfElement(link_Instagram);
		TapElement(link_Instagram);
		logging(condition.pass, "User is clicked : Instagram link as expected");
		confirmPageNavigation();
		WaitVisibilityOfElement(link_FaceBook);
		TapElement(link_FaceBook);
		logging(condition.pass, "User is clicked : Facebook link as expected");
		confirmPageNavigation();
		logging(condition.info, "Stay connected link validation is completed");	
	}

	public void verifyGettingAppsLink()
	{
		logging(condition.info, "GET THE MOE’S APP links validation is started");
		WaitVisibilityOfElement(img_AppStore);
		TapElement(img_AppStore);
		logging(condition.pass, "User is clicked : App Store link as expected");
		confirmPageNavigation();
		WaitVisibilityOfElement(img_GooglePlay);
		TapElement(img_GooglePlay);
		logging(condition.pass, "User is clicked : Google Play link as expected");
		WaitVisibilityOfElement(img_GooglePlay);
		confirmPageNavigation();
		logging(condition.info, "GET THE MOE’S APP links validation is completed");
	}

	public void verifyOrderNowCTA()
	{
	   waitFor(3000);
		TapElement(btn_OrderNow);
		if (btn_OrderNow.isDisplayed()==true) {
			TapElement(btn_OrderNow);
			
			if (btn_PickUp.isDisplayed()==true) {
				logging(condition.pass, "Navigated to Select Location page as expected");
			} else {
               logging(condition.warning, "Unable to navigate to Select Location page as expected");
			}
			
		} else {
			driver.close();
			driver.get("https://moes.pqa.focusbrands.com/");

		}
	}

	public void verifyHomePage() {
		waitFor(2000);
		if (icon_Profile.isDisplayed()==true) {
			logging(condition.pass,"User is navigated to home page as expected");
		} else {
			logging(condition.warning, "User is not navigated to home page as expected");
		}

	}

	public void clickOnSignUpCTA() {
		WaitVisibilityOfElement(btn_RewardSignUp);
		if (scrollDownToElement(driver, btn_RewardSignUp)) {
			logging(condition.pass, btn_RewardSignUp.getText()+" until scroll down");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", btn_RewardSignUp);
			logging(condition.pass, btn_RewardSignUp.getText()+" is clicked as expected");
		}

		else {
			logging(condition.warning,"User is unable to click  " + btn_RewardSignUp.getText());
		}
	}

	public void clickOnProfile() {
		logging(condition.info, "User is navigated to Home Page as execpted");
		TapElement(icon_Profile);
		logging(condition.info, "User is clicked : Profile image as execpted");
	}

	public void verifyWelcomePage() {
		WaitVisibilityOfElement(heading_CookIn);
		if (heading_CookIn.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Welcome page as execpted");			
		} else {
			logging(condition.warning, "User is not able to navigate to Welcome Page as execpted");
		}
	}

	public void clickOnSignUpLink()
	{
		TapElement(link_SignUpHere);
		logging(condition.pass, "User is clicked : Sign Up CTA as expected");
	}

	public void clickOnStartOrderBtn() {
		waitFor(3000);
		TapElement(btn_StartOrder);
		logging(condition.pass, "User is clicked : Start Order CTA as expected");
	}
	public void verifySelectLocation()  {
		WaitVisibilityOfElement(btn_PickUp);
		if (btn_PickUp.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Select Location Page as execpted");
		} else {
			logging(condition.warning, "User is not navigated to Select LocationPage as execpted");
		}
	}	

	public void clickOnViewMenuCTA() {

		WaitVisibilityOfElement(btn_ViewMenu);
		if (scrollDownToElement(driver, btn_ViewMenu)) {
			logging(condition.pass, btn_ViewMenu.getText()+" until scroll down");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", btn_ViewMenu);
			logging(condition.pass, "User is clicked: "+ btn_ViewMenu.getText()+ " as expected");
		}
		else {
			logging(condition.warning, "User is clicked: "+ btn_ViewMenu.getText()+ " as expected");
		}

	}

	public static boolean scrollDownToElement(WebDriver driver, WebElement elementref) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		boolean elementFound = false;
		int maxScrollAttempts = 10; 

		for (int i = 0; i < maxScrollAttempts; i++) {
			WebElement targetElement = elementref;
			if (targetElement.isDisplayed()) {
				elementFound = true;
				break;
			}
			jsExecutor.executeScript("window.scrollBy(0, 300);");
		}

		if (!elementFound) {
			System.out.println("Element not found after scrolling.");
		}
		return elementFound;
	}

	public void verifyMenulanding() {
		WaitVisibilityOfElement(tab_Menu);
		if (tab_Menu.isDisplayed()==true) {
			logging(condition.pass, "User is navigated to Menu landing page as expected ");
		} else {
			logging(condition.warning, "User is not navigated to Menu landing page as expected");
		}
	}

	public void clickOnHomeImgIcon()
	{
		TapElement(img_Home);
		logging(condition.pass, "User is clicked : Home Image as expected");
	}

	public void verifyRightSideBannerTitle(String rightSideBannerTittle) {
		WaitVisibilityOfElement(title_RightSideImageBanner);
		scrollDownToElement(driver, title_RightSideImageBanner);
		String title = title_RightSideImageBanner.getText();
		if (title.equals(rightSideBannerTittle)) {

			logging(condition.pass, "User is able to view the title as: "+title+ " as expected");

		} else {
			logging(condition.warning, "User is not able to view the title as: "+title+ " as expected");
		}
	}

	public void clickOnExploreMenuCTA() {
		WaitVisibilityOfElement(btn_ExploreMenu);
		scrollDownToElement(driver, btn_ExploreMenu);
		TapElement(btn_ExploreMenu);
		logging(condition.pass, "User is clicked : ExploreMenu CTA as expected");
	}
	
	public void clickOnLearnMoreCTA() {
		WaitVisibilityOfElement(btn_LearnMore);
		scrollDownToElement(driver, btn_LearnMore);
		TapElement(btn_LearnMore);
		logging(condition.pass, "User is clicked : LearnMore CTA as expected");
	}

	public void clickOnOrderNowCTA() {
		waitFor(3000);
		TapElement(btn_OrderNow);
		logging(condition.pass, "User is clicked : Order Now CTA as expected");
	}

	public void clickOnCloseIcon() {
		WaitVisibilityOfElement(icon_closeStoreSearch);
		TapElement(icon_closeStoreSearch);
		logging(condition.pass, "User is clicked : Close Icon as expected");
	}

	public void clickOnAnimalWelfare() {
		WaitVisibilityOfElement(link_AnimalWalfare);
		TapElement(link_AnimalWalfare);	
		logging(condition.pass, "User is clicked : Animal Welfare link as expected");
	}

	public void clickOnAccessibilityLink() {
		WaitVisibilityOfElement(link_Accessibility);
		TapElement(link_Accessibility);
		logging(condition.pass, "User is clicked : Accessibility link as expected");
	}
	
	public void verifyOrderConfirmation() {
		logging(condition.info, "Order confirmation validation is started in homepage.....");
		WaitVisibilityOfElement(icon_LocationID);
		if (icon_LocationID.isDisplayed()==true) {
			logging(condition.pass, "Location symbol is available as expected");
		} else {
           logging(condition.warning, "Location symbol is not available as expected");
		}
		
		boolean status_orderConfiramtionPickup = restName_OrderConfirmationPickup.isDisplayed();
		String value_orderConfirmationPickup = restName_OrderConfirmationPickup.getText();
		if (status_orderConfiramtionPickup==true) 
		{
			logging(condition.pass, "User is able to view the order confirmaton address as: "+ value_orderConfirmationPickup );
		} else {
			logging(condition.warning, "User is unable to view the order confirmaton address as: "+ value_orderConfirmationPickup );
		}
		
		boolean status_ClockIcon = icon_Clock.isDisplayed();
		if (status_ClockIcon==true) {
			logging(condition.pass, "Clock icon is displayed as expected");
		} else {
			logging(condition.warning, "Clock icon is displayed as expected");

		}
		boolean status_orderConfirmationTime = time_OrderConfirmationPickup.isDisplayed();
		String value_orderConfiramtionTime = time_OrderConfirmationPickup.getText();
		if (status_orderConfirmationTime==true) {
			logging(condition.pass, "User is able to view the order confirmaton timing as: "+ value_orderConfiramtionTime );
		} else {
			logging(condition.warning, "User is unable to view the order confirmaton timing as: "+ value_orderConfiramtionTime );
		}
		logging(condition.info, "Order confirmation validation is completed in homepage.....");
		
	}

}








































































































































