@AccountAddresses
Feature: Account-Addresses

  Background: 
    Given the user launches the App
     
  Scenario Outline: Verify first time sign in user with geo location disabled able to save the address from Accounts section
    When user is on Sign In Page and able to enter authendication details from "<SheetName>" and <RowNumber>
    Then user searched the location and selected from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Addresses Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    Then verify No Addresses Saved text is displayed and able to click Add New Address CTA
    When user scroll to bottom of the screen and click the Save CTA
    When I click on Enter Address chevron, Add New Address screen with search field has been displayed
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    Then tap on Recently searched location
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    And user able to enter Apt / Unit / Suite value from "<SheetName>" and <RowNumber> and click Use Address CTA
    Then user able to enter Location Name and get it from "<SheetName>" and <RowNumber>
    And able to enter user delivery Notes and get it from "<SheetName>" and <RowNumber>
    And user should see the check box and able to check in
    Then tap on Save CTA and verify selected address should be displayed on Addresses Screen
    And user should see and tap on edit link
    And scroll to bottom of the screen and Verify Remove This Address modal functionalities
    And verify Address Removed Pop up is displayed

    Examples: 
      | SheetName         | RowNumber |
      | Account-Addresses |         0 |
	
  Scenario Outline: Verify first time sign in user with geo location enabled able to save the address from Accounts section
    When user is on Sign In Page and able to enter authendication details from "<SheetName>" and <RowNumber>
    Then the geo Location action is performed from "<SheetName>" and <RowNumber>
    Then user searched the location and selected from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Addresses Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    Then verify No Addresses Saved text is displayed and able to click Add New Address CTA
    When user scroll to bottom of the screen and click the Save CTA
    When I click on Enter Address chevron, Does This Address Look Correct Modal will	be displayed
    And user able to enter Apt / Unit / Suite value from "<SheetName>" and <RowNumber> and click Use Address CTA
    Then tap on Enter Address chevron and Does This Address Look Correct Modal will	be displayed
    And able to click Re-Enter CTA and It will display Add  New Address screen
    Then tap on Find My Location CTA, and close the Does This Address Look Correct? Modal
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    When I tap on Clear CTA Recent Searches should be disappear
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    And user able to enter Apt / Unit / Suite value from "<SheetName>" and <RowNumber> and click Use Address CTA
    Then user able to enter Location Name and get it from "<SheetName>" and <RowNumber>
    And able to enter user delivery Notes and get it from "<SheetName>" and <RowNumber>
    And user should see the check box and able to check in
    Then tap on Save CTA and verify selected address should be displayed on Addresses Screen

    Examples: 
      | SheetName         | RowNumber |
      | Account-Addresses |         1 |
	
  Scenario Outline: Verify existing sign in user with geo location enabled able to save the address from Accounts section
   When user is on Sign In Page and able to enter authendication details from "<SheetName>" and <RowNumber>
    Then the geo Location action is performed from "<SheetName>" and <RowNumber>
    Then user searched the location and selected from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Addresses Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    Then user able to see and click the Add New Address CTA
    When user scroll to bottom of the screen and click the Save CTA
    Then tap on Add New Addresses CTA from saved Addresses screen
    When I click on Enter Address chevron, Does This Address Look Correct Modal will	be displayed
    And user able to enter Apt / Unit / Suite value from "<SheetName>" and <RowNumber> and click Use Address CTA
    Then tap on Enter Address chevron and Does This Address Look Correct Modal will	be displayed
    And able to click Re-Enter CTA and It will display Add  New Address screen
    Then tap on Find My Location CTA, and close the Does This Address Look Correct? Modal
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    When I tap on Clear CTA Recent Searches should be disappear
    And user able to search new address and the location is get it from "<SheetName>" and <RowNumber>
    And user able to enter Apt / Unit / Suite value from "<SheetName>" and <RowNumber> and click Use Address CTA
    Then user able to enter Location Name and get it from "<SheetName>" and <RowNumber>
    And able to enter user delivery Notes and get it from "<SheetName>" and <RowNumber>
    And user should see the check box and able to check in
    Then tap on Save CTA and verify selected address should be displayed on Addresses Screen

    Examples: 
      | SheetName         | RowNumber |
      | Account-Addresses |         2 |
	
  Scenario Outline: Verify existing user has able to Edit and Save the saved Address on Account section
    When user is on Sign In Page and able to enter  authentication details from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Addresses Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    And user should see and tap on edit link
    And verify Edit Address header is displayed
    Then user should select Hand It To Me Drop Off Instructions
    Then Tap on Back Navigation Arrow and Save Your Changes Modal will be displaying
    And verify the Save Your Changes modal and then close the Modal
    Then Tap on Back Navigation Arrow and Save Your Changes Modal will be displaying
    And verify Discard Changes CTA and  tap on Discard Changes CTA
    And user should see and tap on edit link
    Then user able to enter Location Name and get it from "<SheetName>" and <RowNumber>
    Then Tap on Back Navigation Arrow and Save Your Changes Modal will be displaying
    And user should see and tap on Save & Close CTA
    And user should see and tap on edit link
    Then scroll to bottom of the screen and tap on Cancel CTA and it will navigate to Addresses Screen
    And user should see and tap on edit link
    Then user should select Hand It To Me Drop Off Instructions
    And scroll to bottom of the screen and tap on Cancel CTA
    And verify the Save Your Changes modal and then close the Modal
    Then user should select Leave at Door Drop Off Instructions
    And scroll to bottom of the screen and tap on Cancel CTA
    And user should see and tap on Save & Close CTA

    Examples: 
      | SheetName         | RowNumber |
      | Account-Addresses |         3 |
