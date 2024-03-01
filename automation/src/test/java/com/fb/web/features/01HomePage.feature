
Feature: Validate all the navigations in the home page

Background:

Given User should launch the MoEs app

  Scenario Outline: Validate the Home page UI components and link validations
    And User Validate the UI components from "<SheetName>" and <RowNumber>
    And  User Validate the Hero Image components from "<SheetName>" and <RowNumber>
    And  User Validate the Suggessted Sell compents from "<SheetName>" and <RowNumber>
    And  User Validate the Rewards banner components from "<SheetName>" and <RowNumber>
    And  User Validate the Right side banner components from "<SheetName>" and <RowNumber>
    And  User Validate the Left side banner components from "<SheetName>" and <RowNumber>
    When User click on Profile icon
    Then User should navigate to welcome page
    When User should click on close icon on Welcome page
    Then User should navigate to home page
    When User should verify Stay connected links and their navigations 
    When User should verify Get the MoEs app links and their navigations
    When User should click on Sign Up Here link
    Then User should navigate to Create An Account Page
    When User should click on Back Arrow
    Then User should navigate to home page
    When User should click on Animal Welfare link
    Then User should navigate to Animal Welfare page
    When User should click on Accessibility Link
    Then User should navigate to Accessibility page
    When User should click on Start Order button
    Then User should navigate to Select Location page
    When User should click on close icon in Select Location Page
    Then User should navigate to home page
    When User should navigate to Select location page while click on Order Now CTA
    When User should click on View Menu button
    Then User should navigate to Menu landing page
    When  User should click on Home icon
    Then User should navigate to home page
    When User should click on Explore Menu button
    Then User should navigate to Menu landing page
    When User should click on Home icon
    Then User should navigate to home page
    When User should click on Learn More button
    Then User should navigate to another window to show the image

    Examples:
    |SheetName|RowNumber|
    |HomePageDetails|0|

  