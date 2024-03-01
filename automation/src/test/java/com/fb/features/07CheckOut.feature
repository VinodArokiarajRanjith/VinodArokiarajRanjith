@checkOut
Feature: CHECKOUT
Background:
Given user launched the app 


Scenario Outline: Verify the Checkout page and delivery type as pickup - Inside for guest user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
Then user should select a pickup location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then User clicks Inside
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup


Examples:
|SheetName|RowNumber|
|Checkout|0|


Scenario Outline: Verify the Checkout page and delivery type as pickup - CurbSide for guest user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
Then user should select a pickup location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then User clicks Curbside
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup


Examples:
|SheetName|RowNumber|
|Checkout|1|


Scenario Outline: Verify the Checkout page and delivery type as pickup - InSide for Signed In user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
Then user should validate the delvery location as pickup if not user should change it to pickup location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then User clicks Inside
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup


Examples:
|SheetName|RowNumber|
|Checkout|2|


Scenario Outline: Verify the Checkout page and delivery type as pickup - CurbSide for Signed In user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
Then user should validate the delvery location as pickup if not user should change it to pickup location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then User clicks Curbside
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for pickup


Examples:
|SheetName|RowNumber|
|Checkout|3|

Scenario Outline: Verify the Checkout page and delivery type as delivery - Leave at Door for guest user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
Then user should select the delivery location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then user should validates the Restaurant information
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then user should select Leave at Door and enter some values in Add Note text field
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for delivery


Examples:
|SheetName|RowNumber|
|Checkout|4|

Scenario Outline: Verify the Checkout page and delivery type as delivery - Hand It to me for guest user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
Then user should select the delivery location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then user should validates the Restaurant information
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then user should select Hand It to me and enter some values in Add Note text field
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for delivery


Examples:
|SheetName|RowNumber|
|Checkout|5|

Scenario Outline: Verify the Checkout page and delivery type as delivery - Hand It to me for Signed In user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user navigates to Home page and should change and select delivery location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then user should validates the Restaurant information
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then user should select Hand It to me and enter some values in Add Note text field
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for delivery


Examples:
|SheetName|RowNumber|
|Checkout|6|

Scenario Outline: Verify the Checkout page and delivery type as delivery - Leave at Door for Signed In user
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user navigates to Home page and should change and select delivery location from "<SheetName>" and <RowNumber>
When user lands on HomePage then user should select AddProduct CTA and selects a item from "<SheetName>" and <RowNumber>
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
And click Chekcout button then navigates to chekcout page
Then validates the Header, Change button, back button, delivery type, schedule type fields in checkout page
Then user should validates the Restaurant information
Then validate and enter values in FirstName, LastName, Email and PhoneNumber from "<SheetName>" and <RowNumber>
Then user should select Leave at Door and enter some values in Add Note text field
Then validate and Add Tip from "<SheetName>" and <RowNumber>
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”, Total amount and “PlaceOrder” CTA should display at bottom for delivery


Examples:
|SheetName|RowNumber|
|Checkout|7|
