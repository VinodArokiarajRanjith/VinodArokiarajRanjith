@confirmation
Feature: CONFIRMATION
Background:
Given user launched the app 




Scenario Outline: Verify the Checkout page and delivery type as pickup - InSide for Signed In user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
Then user should validate the delvery location as pickup if not user should change it to pickup location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
And click Chekcout button then navigates to chekcout page
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup
Then user should click placeOrder
Then user should validate the Confirmation header, we have Got, see you soon text and estimated time
Then user should validate Pickup location header, restaurant name, address and restaurant status
Then user should validate you earned text, rewar points and view rewards
Then user should validate order details, order number and order date
Then user should validate your order, item name and item price
Then user should validate subtotal, TaxesAndFees, Tip and Total

Examples:
|SheetName|RowNumber|
|Checkout|2|


