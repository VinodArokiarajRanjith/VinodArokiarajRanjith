
Feature: Validate the Store Search functionalities

Background:
Given User should launch the MoEs app URL
When User click on Profile icon
Then  User should navigate to Welcome page


@web
Scenario: Field and Functionality validation for PickUp Searching and selecting a location flow for guestUser
Given User should select user type from "<SheetName>" and <RowNumber>
And User should validate the UI Functionality for Pick up tab "<SheetName>" and <RowNumber>
When User should select the location in Search location field from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
When User should click on Select Location CTA
When User should click on Order Ahead CTA
Then User should navigate to Order Info Page
And  User should validate the fields in Order Info Page from "<SheetName>" and <RowNumber>
When User should click on Later CTA
And  User should select the Date and Time from "<SheetName>" and <RowNumber>
And  User should click on Confirm CTA
Then User should navigate to home page
And  User should validate order details in home page



Examples:
    |SheetName|RowNumber|
    |StoreSearch|0|

Scenario: Field and Functionality validation for Delivery Searching and selecting a location flow for guestUser
Given User should select user type from "<SheetName>" and <RowNumber>
And User should validate the UI Functionality for Delivery tab "<SheetName>" and <RowNumber>
When User should select the location in Search location field from "<SheetName>" and <RowNumber>




Examples:
    |SheetName|RowNumber|
    |StoreSearch|1|





















































Scenario: Field and Functionality validation for PickUp Searching and selecting a location flow for SignedUser
Given User should select user type from "<SheetName>" and <RowNumber>
When User should select the location in Search location field from "<SheetName>" and <RowNumber>
And click the Restaurant name or more info link from "<SheetName>" and <RowNumber>
Then validate the fields in Restaurant Info page from "<SheetName>" and <RowNumber> and functionality validation of favorite and drop up button
When User should click on Select Location CTA
When User should click on Order Ahead CTA
Then User should navigate to Order Info Page
And  User should validate the fields in Order Info Page from "<SheetName>" and <RowNumber>
When User should click on Later CTA
And  User should select the Date and Time from "<SheetName>" and <RowNumber>
And  User should click on Confirm CTA
Then User should navigate to home page
And  User should validate order details in home page

Examples:
    |SheetName|RowNumber|
    |StoreSearch|2|

#And  User should view the tabs Nearby and Recents
#And  User should view Restaurant name
#And  User should view Restaurant Address
#And  User should view Restaurant timing
#And  User should view favorite image
#And  User should view distance of Miles
#And  User should view the store Locations details
#When User should click on SELECT LOCATION CTA
#Then User should navigate to home page
#And  User should click on More Info link
#When User should navigate to Restaurant Info page

Examples:
|SheetName|RowNumber|
|StoreSearch|0|

Scenario: Verify Restaurant Info workflow
And  User should select Pick Up tab
When User should select the location in Search location field
And  User should click on More Info link
Then User should navigate to Restaurant Info page
And  User should view Restaurant name
And  User should view Restaurant Address
And  User should view favorite image
And  User should view Get Directions button
And  User should view Call Restaurant button
And  User should view the timinings for all days
And  User should view Order type


Scenario: Verify Enable Location Service
Given User should navigate to home page
When User should click on Start Order button
Then User should navigate to Select Location Page
When User should navigate to Enable Location Services
















