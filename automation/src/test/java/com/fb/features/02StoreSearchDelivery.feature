@StoreSearchDelivery
Feature: Store Search Delivery

  Background: 
    Given Guest user launches the MoEs App
    And Verify Select Location Header is displayed
    And Back button and Map Icon is displayed
    And Pickup tab is displayed
    And Enable Location Services button is displayed

  Scenario Outline: To verify guest user with geo location disabled able to confirm a delivery address on the order info screen
    When user switches to Delivery Screen
    And Verify Delivery Address should be displayed
    When the geo Location is performed from "<SheetName>" and <RowNumber>
    Then enter a store locations on the search bar from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the first value
    And Does This Address Look Correct module will be displayed
    And delivery address is displayed
    And Add New Address CTA is displayed
    And Sign Up To Save Address Link is displayed
    Then enter apartment and unit value on the field "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA it will navigate to Home Screen
    And verify Home header is displayed
    And verify Store location and ASAP is displayed
    Then user tap on Change CTA on the top order details screen
    And verify Order Info screen is displayed
    And Delivery Address Title is displayed
    And Schedule For Title is displayed
    Then tap on Confirm CTA on bottom of the screen

    Examples: 
      | SheetName     | RowNumber |
      | StoreSearch |         9 |

  Scenario Outline: To verify guest user with geo location enabled able to confirm a delivery address on the order info screen
    When user switches to Delivery Screen
    And Verify Delivery Address should be displayed
    When the geo Location is performed from "<SheetName>" and <RowNumber>
    Then enter a store locations on the search bar from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the first value
    And Does This Address Look Correct module will be displayed
    And delivery address is displayed
    And Add New Address CTA is displayed
    And Sign Up To Save Address Link is displayed
    Then enter apartment and unit value on the field "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA it will navigate to Home Screen
    And verify Home header is displayed
    And verify Store location and ASAP is displayed
    Then user tap on Change CTA on the top order details screen
    And verify Order Info screen is displayed
    And Delivery Address Title is displayed
    And Schedule For Title is displayed
    Then tap on Confirm CTA on bottom of the screen

    Examples: 
      | SheetName     | RowNumber |
      | StoreSearch |        10 |

  Scenario Outline: To verify guest user with geo location disabled able to select date and time on order info overlay
    When user switches to Delivery Screen
    And Verify Delivery Address should be displayed
    When the geo Location is performed from "<SheetName>" and <RowNumber>
    Then enter a store locations on the search bar from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the first value
    And Does This Address Look Correct module will be displayed
    And delivery address is displayed
    And Add New Address CTA is displayed
    And Sign Up To Save Address Link is displayed
    Then enter apartment and unit value on the field "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA it will navigate to Home Screen
    And verify Home header is displayed
    And verify Store location and ASAP is displayed
    Then user tap on Change CTA on the top order details screen
    And verify Order Info screen is displayed
    And Delivery Address Title is displayed
    And Schedule For Title is displayed
    Then tap on later option and time fiels should be displayed
    Then tap on Confirm CTA on bottom of the screen
    And scheduled date and time should be displayed on home screen

    Examples: 
      | SheetName     | RowNumber |
      | StoreSearch |        11 |

  Scenario Outline: To verify guest user with geo location enabled able to select date and time on order info overlay
    When user switches to Delivery Screen
    And Verify Delivery Address should be displayed
    When the geo Location is performed from "<SheetName>" and <RowNumber>
    Then enter a store locations on the search bar from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the first value
    And Does This Address Look Correct module will be displayed
    And delivery address is displayed
    And Add New Address CTA is displayed
    And Sign Up To Save Address Link is displayed
    Then enter apartment and unit value on the field "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA it will navigate to Home Screen
    And verify Home header is displayed
    And verify Store location and ASAP is displayed
    Then user tap on Change CTA on the top order details screen
    And verify Order Info screen is displayed
    And Delivery Address Title is displayed
    And Schedule For Title is displayed
    Then tap on later option and time fiels should be displayed
    Then tap on Confirm CTA on bottom of the screen
    And scheduled date and time should be displayed on home screen

    Examples: 
      | SheetName     | RowNumber |
      | StoreSearch |        12 |

  
  Scenario: To verify user able to see Find My Location button under Delivery Tab
    When user click on Enable Location Services button
    And geo location permisson modal is displayed
    Then user click on While using the app option
    Then user switches to Delivery Tab
    And Sorry You Are Out Of The Delivery Range Modal is diplayed
    And verify Change to Pickup button is diplayed
    And verify Try Another Address button is diplayed
    Then click Cancel icon on the modal
    And verify Find My Location button is displayed
    And verify Sorry You Are Out Of The Delivery Range Modal functionalities
    Then verify Sorry You Are Out Of The Delivery Range Modal and navigations
