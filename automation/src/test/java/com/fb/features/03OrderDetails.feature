@OrderDetails
Feature: OrderDetails

  Background: 
    Given the user launches the App
  Scenario Outline: To verify guest user with geo location enabled able to edit Pickup address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then click on Pickup edit option in the order info screen
    And its navigate back to Select Location screen under Nearby tab
    Then user able to search new Pickup address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    Then tap on Order Now CTA and user will navigate to Order Info Overlay
    And verify updated Pickup Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         0 |

  Scenario Outline: To verify guest user with geo location disabled able to edit Pickup address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then click on Pickup edit option in the order info screen
    And its navigate back to Select Location screen under Nearby tab
    Then user able to search new Pickup address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    Then tap on Order Now CTA and user will navigate to Order Info Overlay
    And verify updated Pickup Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         1 |

  Scenario Outline: To verify sign in user with geo location enabled able to edit Pickup address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then click on Pickup edit option in the order info screen
    And its navigate back to Select Location screen under Nearby tab
    Then user able to search new Pickup address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    Then tap on Order Now CTA and user will navigate to Order Info Overlay
    And verify updated Pickup Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         2 |

  Scenario Outline: To verify sign in user with geo location disabled able to edit Pickup address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then click on Pickup edit option in the order info screen
    And its navigate back to Select Location screen under Nearby tab
    Then user able to search new Pickup address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    Then tap on Order Now CTA and user will navigate to Order Info Overlay
    And verify updated Pickup Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         3 |

  Scenario Outline: To verify guest user with geo location enabled able to edit delivery address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    And ‘Changing to Delivery Could affect item availability and pricing’ popup is displayed
    Then click on delivery edit option in the order info overlay
    And user able to search new delivery address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    And Does This Address Look Correct module will be displayed
    Then enter apartment and unit address when the value get it from "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA and user will navigate to Order Info Overlay
    And Delivery Address Title is displayed
    And verify updated delivery Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         4 |

  Scenario Outline: To verify guest user with geo location disabled able to edit delivery address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    And ‘Changing to Delivery Could affect item availability and pricing’ popup is displayed
    Then click on delivery edit option in the order info overlay
    And user able to search new delivery address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    And Does This Address Look Correct module will be displayed
    Then enter apartment and unit address when the value get it from "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA and user will navigate to Order Info Overlay
    And Delivery Address Title is displayed
    And verify updated delivery Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         5 |

  Scenario Outline: To verify sign in user with geo location enabled able to edit delivery address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    And ‘Changing to Delivery Could affect item availability and pricing’ popup is displayed
    Then click on delivery edit option in the order info overlay
    And user able to search new delivery address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    And Does This Address Look Correct module will be displayed
    Then enter apartment and unit address when the value get it from "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA and user will navigate to Order Info Overlay
    And Delivery Address Title is displayed
    And verify updated delivery Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         6 |

  Scenario Outline: To verify sign in user with geo location disabled able to edit delivery address on Order Info Overlay
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    And ‘Changing to Delivery Could affect item availability and pricing’ popup is displayed
    Then click on delivery edit option in the order info overlay
    And user able to search new delivery address when the location selected from "<SheetName>" and <RowNumber>
    And auto suggested values are displayed then select the second value
    And Does This Address Look Correct module will be displayed
    Then enter apartment and unit address when the value get it from "<SheetName>" and <RowNumber>
    Then tap on Deliver Here CTA and user will navigate to Order Info Overlay
    And Delivery Address Title is displayed
    And verify updated delivery Address is displayed

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         7 |

  Scenario Outline: Verify guest user with geo location enabled Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options are available on checkout screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Add Product CTA
    Then select Moe Meat Moe Cheese Burrito product and tap on cart Icon
    And scroll down and tap on Checkout CTA
    And Checkout header is displayed
    Then verify Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         8 |

  Scenario Outline: Verify guest user with geo location disabled Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options are available on checkout screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Add Product CTA
    Then select Moe Meat Moe Cheese Burrito product and tap on cart Icon
    And scroll down and tap on Checkout CTA
    And Checkout header is displayed
    Then verify Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |         9 |

  Scenario Outline: Verify sign in user with geo location enabled Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options are available on checkout screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Add Product CTA
    Then select Moe Meat Moe Cheese Burrito product and tap on cart Icon
    And scroll down and tap on Checkout CTA
    And Checkout header is displayed
    Then verify Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        10 |

  Scenario Outline: Verify sign in user with geo location disabled Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options are available on checkout screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Add Product CTA
    Then select Moe Meat Moe Cheese Burrito product and tap on cart Icon
    And scroll down and tap on Checkout CTA
    And Checkout header is displayed
    Then verify Pickup method as Inside / Inside and Curbside /  Inside and DriveThru / Inside, Curbside and DriveThru options

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        11 |

  Scenario Outline: Verify sign in user with geo location enabled able to view Your Saved Addresses and Recent Searches on delivery address screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Change CTA
    Then the Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    Then click edit CTA in the order info screen
    And its navigate back to delivery address screen and verify delivery address header is displayed
    And it’s a returning logged in user and able to see “Your Saved Addresses” with all the Saved address and Update CTA
    And user able to see “Recent Searches” with all the Recent address and Clear CTA

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        12 |

  Scenario Outline: Verify sign in user with geo location disabled able to view Your Saved Addresses and Recent Searches on delivery address screen
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user is on Home Screen and tap on Change CTA
    Then the Order Info Overlay and Order Info header is displayed
    And Your Moes Restaurant Title is displayed
    And Schedule For Title is displayed
    Then user switch pickup to Delivery tab
    Then click edit CTA in the order info screen
    And its navigate back to delivery address screen and verify delivery address header is displayed
    And it’s a returning logged in user and able to see “Your Saved Addresses” with all the Saved address and Update CTA
    And user able to see “Recent Searches” with all the Recent address and Clear CTA

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        13 |

  Scenario Outline: Verify sign in user with geo location enabled Confirming the Order Type drawer and its navigations
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user clicks on Start Order
    Then the user should see Confirm Order Type Modal with the user’s last Order Type
    And verify Confirm CTA Is displayed
    And verify Change CTA Is displayed
    And User should see Change CTA to change the order details, which will lead the user to Order Info Page
    And User should see Confirm CTA to confirm and use the last Order Details, which will lead user’s to Menu Page

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        14 |

  Scenario Outline: Verify sign in user with geo location disabled Confirming the Order Type drawer and its navigations
    When the Geo Location is performed from "<SheetName>" and <RowNumber>
    And select the user type from "<SheetName>" and <RowNumber>
    When user Selected the location from "<SheetName>" and <RowNumber>
    When the user clicks on Start Order
    Then the user should see Confirm Order Type Modal with the user’s last Order Type
    And verify Confirm CTA Is displayed
    And verify Change CTA Is displayed
    And User should see Change CTA to change the order details, which will lead the user to Order Info Page
    And User should see Confirm CTA to confirm and use the last Order Details, which will lead user’s to Menu Page

    Examples: 
      | SheetName    | RowNumber |
      | OrderDetails |        15 |
