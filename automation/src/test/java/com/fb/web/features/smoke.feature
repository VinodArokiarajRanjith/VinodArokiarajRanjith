
Feature: To validate smoke validation

Background: 
Given User should launch the MoEs app

Then User should navigate to home page
When User click on Profile icon
Then User should navigate to welcome page
When User should click the CREATE AN ACCOUNT button
Then the user should be able to navigate to the CREATE AN ACCOUNT page


Scenario Outline: Validate the flows in sign in  page with valid UserName and Password
And  User should provide valid UserName and valid Password from "<SheetName>" and <RowNumber>  
When User should click on Sign In button to login
Then  User should receive the error Message from "<SheetName>" and <RowNumber>
Then User should navigate to home page

Examples:
|SheetName|RowNumber|
|user_details|4|

Scenario Outline:: To validate reset password page Valid Email
When User should provide the valid Email details into Email field from "<SheetName>" and <RowNumber>
And  User should click on Reset Password button
And  User should validate the inline success message from "<SheetName>" and <RowNumber>
And  User should view the Enter the email paragram from "<SheetName>" and <RowNumber>
And  User should view the Didnt receive an email? Resend> content from "<SheetName>" and <RowNumber>
When  User should view the Return to Sign-in CTA
Then User should navigate to Sign In Page

Examples:
|SheetName|RowNumber|
|ResetPwdPage|2|
