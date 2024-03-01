package com.fb.web.stepDefinition;

import java.util.List;
import java.util.Map;
import com.fb.Utilities.*;
import com.fb.web.pageObject.HomePage;
import com.fb.web.pageObject.StoreSearch;
import io.cucumber.java.en.*;

public class HomePageSteps extends Utilities{

	HomePage homePage = new HomePage(driver);
	StoreSearch storeSearch = new StoreSearch(driver);
	
	@Given("User should launch the MoEs app")
	public void user_should_launch_the_mo_es_app() {
	   logging(condition.info, "User is launch MoEs app URL as expected");
	}

	@Given("User Validate the UI components from {string} and {int}")
	public void user_validate_the_ui_components_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String commercialLinks = testData.get(RowNumber).get("CommercialLink");
		String apps = testData.get(RowNumber).get("GettingApps");
		String statusSmartPhone = testData.get(RowNumber).get("smartPhoneStatus");
		homePage.homePageUIValidations(commercialLinks, apps, statusSmartPhone);
	}
	
	@Given("User Validate the Hero Image components from {string} and {int}")
	public void user_validate_the_hero_image_components_from_and(String SheetName, Integer RowNumber) throws Throwable{
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String heroTitle1 = testData.get(RowNumber).get("Herobannertitle1");
		String heroTitle2 = testData.get(RowNumber).get("Herobannertitle2");
		String heroHeader1 = testData.get(RowNumber).get("HeroImageheader1");
		String heroHeader2 = testData.get(RowNumber).get("HeroImageheader2");
		String heroDescription = testData.get(RowNumber).get("HeroImageDescription");
		String heroTerms = testData.get(RowNumber).get("HeroImageTerms");
		homePage.heroImageUIValidation(heroTitle1, heroTitle2, heroHeader1, heroHeader2, heroDescription, heroTerms);	
	}
	
	@Given("User Validate the Suggessted Sell compents from {string} and {int}")
	public void user_validate_the_suggessted_sell_compents_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String Suggessteddescription = testData.get(RowNumber).get("SuggesstedSellDescription");
		logging(condition.info, "Suggsted Sell component UI validation is started....");
		homePage.verifySuggesstedSellTitle(Suggessteddescription);
		homePage.verifySuggesstedSellCount();
		homePage.verifySuggesstedSellName();
		homePage.verifySuggesstedSellCost();
		homePage.verifyBatchIcon();
		homePage.verifyViewMenuCTA();
		logging(condition.info, "Suggsted Sell component UI validation is completed....");
	}
	
	@Given("User Validate the Rewards banner components from {string} and {int}")
	public void user_validate_the_rewards_banner_components_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String titleRewards = testData.get(RowNumber).get("RewardsTitle");
		String descriptionRewards = testData.get(RowNumber).get("RewardsDescription");
		String taxRewards = testData.get(RowNumber).get("RewardsTax");
		homePage.verifyRewardsBannerUI(titleRewards, descriptionRewards, taxRewards);
	
		
	}
	
	@Given("User Validate the Right side banner components from {string} and {int}")
	public void user_validate_the_right_side_banner_components_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String title_RightSideBanner = testData.get(RowNumber).get("Rightsidebannertitle");
		String subTitle_RightSideBanner = testData.get(RowNumber).get("Rightsidebannersubtitle");
		String descripton_rightSideBanner = testData.get(RowNumber).get("Rightsidebannerdescription");
		String tax_rightSideBanner = testData.get(RowNumber).get("RightSideBannerTax");
		homePage.verifyRightSideBannerUI(title_RightSideBanner, subTitle_RightSideBanner, descripton_rightSideBanner, tax_rightSideBanner);
	}
	
	@Given("User Validate the Left side banner components from {string} and {int}")
	public void user_validate_the_left_side_banner_components_from_and(String SheetName, Integer RowNumber)throws Throwable {
		List<Map<String, String>> testData = reader.getData(SheetPath, SheetName);
		String title_LeftSideBanner = testData.get(RowNumber).get("Leftsidebannertitle");
		String description_LeftSideBanner = testData.get(RowNumber).get("LeftsidebannerDescription");
		homePage.verifyLeftSideBannerUI(title_LeftSideBanner, description_LeftSideBanner);
	}
	
	@When("User should verify Stay connected links and their navigations")
	public void user_should_verify_stay_connected_links_and_their_navigations() {
	   homePage.verifyStayConnectedLinks();
	}
	
	@When("User should verify Get the MoEs app links and their navigations")
	public void user_should_verify_get_the_mo_es_app_links_and_their_navigations() {
	  homePage.verifyGettingAppsLink();
	}
	
	@When("User should click on close icon on Welcome page")
	public void user_should_click_on_close_icon_on_welcome_page() {
	    homePage.clickOnCloseIconWelcomePage();
	}
	
	

	@When("User click on Profile icon")
	public void user_click_on_profile_icon() {
		homePage.clickOnProfile();
	}
	
	@Then("User should navigate to welcome page")
	public void user_should_navigate_to_welcome_page() {
	    homePage.verifyWelcomePage();
	}
	
	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    homePage.verifyHomePage();
	}
	@When("User should click on Order Now button")
	public void user_should_click_on_order_now_button() {
	   homePage.clickOnOrderNowCTA();
	}

	@When("User should click on Start Order button")
	public void user_should_click_on_start_order_button() {
	    homePage.clickOnStartOrderBtn();
	}
	@Then("User should navigate to Select Location page")
	public void user_should_navigate_to_select_location_page()  {
	    homePage.verifySelectLocation();
	}
	
	@When("User should click on Sign Up Here link")
	public void user_should_click_on_sign_up_here_link() {
		homePage.clickOnSignUpLink();
	}
		
	@When("User should click on Animal Welfare link")
	public void user_should_click_on_animal_welfare_link() {
	   homePage.clickOnAnimalWelfare();
	}
	@Then("User should navigate to Animal Welfare page")
	public void user_should_navigate_to_animal_welfare_page() {
		confirmPageNavigation();
	}

	@When("User should click on Accessibility Link")
	public void user_should_click_on_accessibility_link() {
	    homePage.clickOnAccessibilityLink();
	}
	@Then("User should navigate to Accessibility page")
	public void user_should_navigate_to_accessibility_page() {
		confirmPageNavigation();
	}
	
	@When("User should click on close icon in Select Location Page")
	public void user_should_click_on_close_icon_in_select_location_page() {
		storeSearch.clickOnCloseIcon();    
	}

	@Then("User should view {string} in Suggessted sell")
	public void user_should_view_in_suggessted_sell(String suggestedSellTitle) {
	  homePage.verifySuggesstedSellTitle(suggestedSellTitle);
	}
	
	@When("User should click on Order Now CTA")
	public void user_should_click_on_order_now_cta() {
	  homePage.clickOnOrderNowCTA();   
	}
	@Then("User should navigate to store search page if location is not set")
	public void user_should_navigate_to_store_search_page_if_location_is_not_set() {
	    homePage.verifySelectLocation();   
	}

	@When("User should click on close icon in Store search page")
	public void user_should_click_on_close_icon_in_store_search_page() {
	    homePage.clickOnCloseIcon();   
	}
	
	@When("User should click on Sign Up CTA")
	public void user_should_click_on_sign_up_cta() {
		homePage.clickOnSignUpCTA();
	}

	
	@When("User should click on View Menu button")
	public void user_should_click_on_view_menu_button() {
	   homePage.clickOnViewMenuCTA();
	    
	}
	@Then("User should navigate to Menu landing page")
	public void user_should_navigate_to_menu_landing_page() {
	   homePage.verifyMenulanding();
	    
	}
	@When("User should click on Home icon")
	public void user_should_click_on_home_icon() {
	   homePage.clickOnHomeImgIcon();
	  
	    
	}

	@When("User should click on Explore Menu button")
	public void user_should_click_on_explore_menu_button() {	
		homePage.clickOnExploreMenuCTA();  
		
	}
	
	@When("User should click on Learn More button")
	public void user_should_click_on_learn_more_button() {
	    homePage.clickOnLearnMoreCTA();   
	}
	@Then("User should navigate to another window to show the image")
	public void user_should_navigate_to_another_window_to_show_the_image() {  
		waitFor(3000);
		confirmPageNavigation();
	}
	@When("User should navigate to Select location page while click on Order Now CTA")
	public void user_should_navigate_to_select_location_page_while_click_on_order_now_cta() {
	   homePage.verifyOrderNowCTA();
	}


}