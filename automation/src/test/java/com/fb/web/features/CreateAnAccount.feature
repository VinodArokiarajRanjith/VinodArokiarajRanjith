Feature: To validate the Create An Account Page

  Background: 
    Given User should launch the MoEs app

  Scenario Outline: To test the Create An Account Page UI and Link validation
    When User click on Profile icon
    Then User should navigate to welcome page
    When User click on Create An Account button
    Then User should navigate to Create An Account Page
    And User validate the UI Functionalities on Create An Account Page
    When User should click on Back Arrow
    Then User should navigate to Welcome page
    When User click on Create An Account button
    Then User should navigate to Create An Account Page
    Then User should see the Email field with Alphabets and Numbres and special characters from "<SheetName>" and <RowNumber>
    And User should allow  Maximum 128 characters to Email field from "<SheetName>" and <RowNumber>
    When User should enter the valid Email ID and click on Continue button from "<SheetName>" and <RowNumber>
    Then User should navigate to Lets get started page
    When User should click on Back Arrow
    Then User should navigate to Create An Account Page
    When User should click on Continue with Apple button
    Then User should navigate to Continue or cancel Apple window
    When User should click on continue button in Apple window
    Then User should be navigated to Apple signup flow
    When User should click on Continue with Apple button
    When User should click on Cancel button
    Then User should navigate to Create An Account Page
    When User should clicks on Continue with facebook button
    Then User should navigate to Continue or cancel facebook window
    When User should click on continue button in facebook window
    Then User should be navigated to facebook flow
    When User should clicks on Continue with facebook button
    When User should click on Cancel button
    Then User should navigate to Create An Account Page
   
    When User click on Privacy Policy link
    Then User should navigate to Privacy Policy URL
    When User click on Terms of Service link
    Then User should navigate to Terms of Service URL
     When User should click on Already have an account?Sign In> link
    Then User should navigate to Sign In Page

    Examples: 
      | SheetName       | RowNumber |
      | CreateAnAccount |         0 |
