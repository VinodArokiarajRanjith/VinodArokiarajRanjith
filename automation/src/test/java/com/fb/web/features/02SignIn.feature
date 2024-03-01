
Feature: Validate all the navigations in the Sign In page 
Background:
When User click on Profile icon
Then User should navigate to welcome page
When User should click on Sign in button 
Then User should navigate to Sign In Page

Scenario Outline: Validate the flows in sign in  page without UserName and Password
And  User should provide empty UserName and empty Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then  User should receive the error Message from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|user_details|0|


Scenario Outline: Validate the flows in sign in page with Invalid UserName and invalid Password
And  User should provide invalid UserName and invalid Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then User should receive the error Message from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|user_details|1|

Scenario Outline: Validate the flows in sign in page with invalid UserName and valid Password 
And  User should provide invalid UserName and valid Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then  User should receive the error Message from "<SheetName>" and <RowNumber>


Examples:
|SheetName|RowNumber|
|user_details|2|

Scenario Outline: Validate the flow for temporarly locked account
And  User should provide temporarily locked UserName and valid Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then  User should receive the error Message from "<SheetName>" and <RowNumber>


Examples:
|SheetName|RowNumber|
|user_details|3|


Scenario Outline: Validate the flows in sign in  page with valid UserName and Password
And  User should provide valid UserName and valid Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then  User should receive the error Message from "<SheetName>" and <RowNumber>
Then User should navigate to home page

Examples:
|SheetName|RowNumber|
|user_details|4|


Scenario: To Test the links
When User should click on Dont have an account? Sign Up link  
Then User should navigate to Create An Account Page
When User should click on Back Arrow
Then User should navigate to Sign In Page
And  User should be able to view the label from "<SheetName>" and <RowNumber>
When  User click on Privacy Policy link
Then  User should navigate to Privacy Policy URL
When  User click on Terms of Service link
Then  User should navigate to Terms of Service URL

Examples:
|SheetName|RowNumber|
|user_details|0|
