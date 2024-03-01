Feature: Account-OrderHistory

  Background: 
    Given the user launches the App
	
  Scenario Outline: Verify Sign In user with No Previous	Orders on Order History Screen
    When user is on Sign In Page and able to enter authentication details from "<SheetName>" and <RowNumber>
    Then the geo Location action is performed from "<SheetName>" and <RowNumber>
    Then user searched the location and selected from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Order History Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    Then user should be shown to the order history page with a message as ‘NO PREVIOUS ORDERS’  
    And user should be able to view and access the button ‘ORDER NOW’ in the page

    Examples: 
      | SheetName            | RowNumber |
      | Account-OrderHistory |         0 |
	
  Scenario Outline: Verify Sign In user Order History landing page field validation
    When user is on Sign In Page and able to enter authentication details from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Order History Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    And user should see History header is displayed
    Then user should validate Order History landing page

    Examples: 
      | SheetName            | RowNumber |
      | Account-OrderHistory |         1 |
@AccountOrderHistory
  Scenario Outline: Verify Sign In user able to add Product to cart by using Reorder on PickUp Order History
    When user is on Sign In Page and able to enter authentication details from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Order History Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    And user should see History header is displayed
    Then user should see and click the chevron icon
    And verify Order number, Order Completed and PickUp Restaurant
    Then user should verify Your Order field validations
    Then user should verify Payment Info field validations
    When user Taps on Reorder button, user will navigate to Reorder screen
    Then user should verify Reorder field validations
    When user Taps on Add To Cart button, user will navigate to Order History Lading Page
    And verify confirmation toast message with View Cart link

    Examples: 
      | SheetName            | RowNumber |
      | Account-OrderHistory |         2 |

  Scenario Outline: Verify Sign In user able to add Product to cart by using Reorder on Delivery Order History
    When user is on Sign In Page and able to enter authentication details from "<SheetName>" and <RowNumber>
    Then user should see and able to click the hamburger menu from home page
    And user should see Order History Option and able to click the Chevron and get it from "<SheetName>" and <RowNumber>
    And user should see History header is displayed
    Then user should see and click the chevron icon
    And verify Order number, Order Completed and Delivery Restaurant
    Then user should verify Your Order field validations
    Then user should verify Payment Info field validations
    When user Taps on Reorder button, user will navigate to Reorder screen
    Then user should verify Reorder field validations
    When user Taps on Add To Cart button, user will navigate to Order History Lading Page
    And verify confirmation toast message with View Cart link

    Examples: 
      | SheetName            | RowNumber |
      | Account-OrderHistory |         3 |
