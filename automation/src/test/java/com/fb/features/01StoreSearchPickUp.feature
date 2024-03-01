@StoreSearchPickup
Feature: Store Search Pickup 
Background:
Given user launched the app and logged in

Scenario Outline: Field Validation and Functionality validation for PickUp Searching and selecting a location flow for guestUser with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
Then validating the text and buttons present in SelectLocation page from  "<SheetName>" and <RowNumber>
And validating the text and buttons present in DeliveryAddress pagefrom  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
And Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
And click Select Location button present in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
And validate the fields present in HomePage from "<SheetName>" and <RowNumber>
When user clicks change button then navigates to OrderInfo page for Guest User
Then validate the fields in OrderInfo page from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|StoreSearch|0|

Scenario Outline: Validation for PickUp Searching and selecting a location flow for guestUser with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
Then validating the text and buttons present in SelectLocation page from  "<SheetName>" and <RowNumber>
And validating the text and buttons present in DeliveryAddress pagefrom  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
And Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
And click Select Location button present in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
And validate the fields present in HomePage from "<SheetName>" and <RowNumber>
When user clicks change button then navigates to OrderInfo page for Guest User
Then validate the fields in OrderInfo page from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|StoreSearch|1|

Scenario Outline: Field Validation and Functionality validation for PickUp Searching and selecting a location flow for Signed In User with GeoLocation Disabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  "<SheetName>" and <RowNumber>
Then validating the text and buttons present in SelectLocation page from  "<SheetName>" and <RowNumber>
And validating the text and buttons present in DeliveryAddress pagefrom  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
And Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
And click Select Location button present in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
And validate the fields present in HomePage from "<SheetName>" and <RowNumber>
When user clicks change button then navigates to OrderInfo page for Signed In User
Then validate the fields in OrderInfo page from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|StoreSearch|2|

Scenario Outline: Field Validation and Functionality validation for PickUp Searching and selecting a location flow for Signed In User with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  "<SheetName>" and <RowNumber>
Then validating the text and buttons present in SelectLocation page from  "<SheetName>" and <RowNumber>
And validating the text and buttons present in DeliveryAddress pagefrom  "<SheetName>" and <RowNumber>
When The Geo Location action is performed from "<SheetName>" and <RowNumber>
And Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
And click Select Location button present in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
And validate the fields present in HomePage from "<SheetName>" and <RowNumber>
When user clicks change button then navigates to OrderInfo page for Signed In User
Then validate the fields in OrderInfo page from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|StoreSearch|3|

Scenario Outline: Selecting and changing the pickup location for guestUser with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
When The Geo Location is performed from "<SheetName>" and <RowNumber>
Then The Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or moreInfo link from "<SheetName>" and <RowNumber>
And click Select Location button in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
When user clicks change button then navigates to OrderInfo page for Guest User
And click edit button 
Then User navigates to Select Location Page
And User search a location and select a restaurant Name or MoreInfo from "<SheetName>" and <RowNumber>
And selects order now and navigates to OrderInfo Page
Then validate the updated restaurant Name from "<SheetName>" and <RowNumber>
When clicks Confirm
Then User navigates to HomePage


Examples:
|SheetName|RowNumber|
|StoreSearch|4|

Scenario Outline: Selecting and changing the pickup location for guestUser with GeoLocation Disabled 
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  "<SheetName>" and <RowNumber>
When The Geo Location is performed from "<SheetName>" and <RowNumber>
Then The Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or moreInfo link from "<SheetName>" and <RowNumber>
And click Select Location button in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
When user clicks change button then navigates to OrderInfo page for Guest User
And click edit button 
Then User navigates to Select Location Page
And User search a location and select a restaurant Name or MoreInfo from "<SheetName>" and <RowNumber>
And selects order now and navigates to OrderInfo Page
Then validate the updated restaurant Name from "<SheetName>" and <RowNumber>
When clicks Confirm
Then User navigates to HomePage


Examples:
|SheetName|RowNumber|
|StoreSearch|5|

Scenario Outline: Selecting and changing the pickup location for Signed In User with GeoLocation Disabled 
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  "<SheetName>" and <RowNumber>
When The Geo Location is performed from "<SheetName>" and <RowNumber>
Then The Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or moreInfo link from "<SheetName>" and <RowNumber>
And click Select Location button in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
When user clicks change button then navigates to OrderInfo page for Signed In User
And click edit button 
Then User navigates to Select Location Page
And User search a location and select a restaurant Name or MoreInfo from "<SheetName>" and <RowNumber>
And selects order now and navigates to OrderInfo Page
Then validate the updated restaurant Name from "<SheetName>" and <RowNumber>
When clicks Confirm
Then User navigates to HomePage


Examples:
|SheetName|RowNumber|
|StoreSearch|6|

Scenario Outline: Selecting and changing the pickup location for Signed In User with GeoLocation Enabled
And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>
And user clicked CHANGE button and clicked EDIT button then user navigated to SELECT LOCATION from  "<SheetName>" and <RowNumber>
When The Geo Location is performed from "<SheetName>" and <RowNumber>
Then The Location is searched and selected from "<SheetName>" and <RowNumber>
And click the Restaurant name or moreInfo link from "<SheetName>" and <RowNumber>
And click Select Location button in restaurant info page from "<SheetName>" and <RowNumber> and navigates to HomePage
When user clicks change button then navigates to OrderInfo page for Signed In User
And click edit button 
Then User navigates to Select Location Page
And User search a location and select a restaurant Name or MoreInfo from "<SheetName>" and <RowNumber>
And selects order now and navigates to OrderInfo Page
Then validate the updated restaurant Name from "<SheetName>" and <RowNumber>
When clicks Confirm
Then User navigates to HomePage


Examples:
|SheetName|RowNumber|
|StoreSearch|7|

Scenario Outline: To verify add favorite popup for guest user

And logged in as signed in or guest user from  "<SheetName>" and <RowNumber>   
 When user searches a location in search bar from "<SheetName>" and <RowNumber>
 And user clicks a favorite icon of a restaurant then the Action required popup should display
 When navigates to map view 
 And user clicks a favorite icon of a restaurant then the Action required popup should display
 When user clicks a restaurant Name or MoreInfo link from "<SheetName>" and <RowNumber>
 When user clicks a favorite icon of a restaurant then the Action required popup should display in restaurantInfo page
 
Examples:
|SheetName|RowNumber|
|StoreSearch|8|
     
     

     
    
    
