@CartFlow
Feature: CART
Background:
Given user launched the app 


Scenario Outline: Field Validation and verify the empty cart and add a item to cart for pickUp using Guest user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
Then validate DUPLICATE button from "<SheetName>" and <RowNumber>
Then validate EDIT button from "<SheetName>" and <RowNumber>
Then validate REMOVE button from "<SheetName>" and <RowNumber>
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|0|

Scenario Outline: Field Validation and verify the empty cart and add a item to cart for pickUp sing Guest user with GeoLocation disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
Then validate DUPLICATE button from "<SheetName>" and <RowNumber>
Then validate EDIT button from "<SheetName>" and <RowNumber>
Then validate REMOVE button from "<SheetName>" and <RowNumber>
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|1|

Scenario Outline: Field Validation and verify the empty cart and add a item to cart for pickUp using Signed In user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then validate DUPLICATE button from "<SheetName>" and <RowNumber>
Then validate EDIT button from "<SheetName>" and <RowNumber>
Then validate REMOVE button from "<SheetName>" and <RowNumber>
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|2|

Scenario Outline: Field Validation and verify the empty cart and add a item to cart for pickUp using Signed In user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then validate DUPLICATE button from "<SheetName>" and <RowNumber>
Then validate EDIT button from "<SheetName>" and <RowNumber>
Then validate REMOVE button from "<SheetName>" and <RowNumber>
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|3|


Scenario Outline: Field Validation and verify the empty cart and add a item to cart for delivery using Guest user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
When user selected a delivery location from  "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|4|

Scenario Outline: Field Validation and verify the empty cart and add a item to cart for delivery using Guest user with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
When user selected a delivery location from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|5|
@CartFlow
Scenario Outline: Field Validation and verify the empty cart and add a item to cart for delivery using Signed In user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user navigates to Home page and verify the delivery type if delivery type is pickup then user should change and select delivery location from "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|6|

Scenario Outline: Field Validation and verify the empty cart and add a item to cart for delivery using Signed In user with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user navigates to Home page and verify the delivery type if delivery type is pickup then user should change and select delivery location from "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
Then user should do the field validation in empty cart page and clicks back button to navigates back to Home page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify the added item and price 
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|7|


Scenario Outline: verify Non-Customisable item in cart using Guest user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
Then verify +, - and Remove button
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|8|

Scenario Outline: verify Non-Customisable item in cart using Guest user with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
Then verify +, - and Remove button
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|9|

Scenario Outline: verify Non-Customisable item in cart using Signed In user with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify +, - and Remove button
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|10|

Scenario Outline: verify Non-Customisable item in cart using Signed In user with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicks Cart icon then user should navigates to Cart page from "<SheetName>" and <RowNumber>
When user selects “Add Product” CTA then menu page should display and user should select a item from "<SheetName>" and <RowNumber>
Then user should navigate to HomePage and in cart icon should update the number of count added to cart
When user clicks Cart icon then user should navigates to Cart page after add product
Then user should validates the field in cart page “Order Types”, “Schedule Type”, “Change” CTA, “Cart” CTA and other fields
Then verify +, - and Remove button
Then user should validate the “Subtotal”, “Taxes & Fees”, “Include Utensils”, “Add Promo Code”  and “Checkout” CTA with Total amount should display at bottom
When user clicks Taxes & Fees then popup should display and breaking fees should displayed in the popup when user clicks “x” then popup should closed

Examples:
|SheetName|RowNumber|
|Cart|11|