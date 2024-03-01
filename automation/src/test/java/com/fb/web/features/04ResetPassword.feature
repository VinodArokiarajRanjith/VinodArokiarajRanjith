
Feature: To test the Reset password functionality

Background:
When User click on Profile icon
Then  User should navigate to Welcome page
When User should click on Sign in button 
Then User should navigate to Sign In Page
When User should click the Forgot Password link
Then User should navigate to the Reset Password page


Scenario Outline: To validate reset password page Empty Email error message
And  User should view the check your email paragraph from "<SheetName>" and <RowNumber>
When User should provide the empty Email details into Email field from "<SheetName>" and <RowNumber>
And  User should click on Reset Password button
And  User should validate the inline error message from "<SheetName>" and <RowNumber>

Examples:
|SheetName|RowNumber|
|ResetPwdPage|0|
 
Scenario Outline: To validate reset password page Invalid Email error message
When User should provide the invalid Email details into Email field from "<SheetName>" and <RowNumber>
And  User should click on Reset Password button
And  User should validate the inline error message from "<SheetName>" and <RowNumber>
 
Examples:
|SheetName|RowNumber|
|ResetPwdPage|1|
 

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

Scenario: To validate Back button in the Reset Password page
When User should click on the back arrow icon
Then User should navigate to Sign In Page
 
Scenario:: To validate MOEs Profile icon in the Reset Password page
When User should click on the Moes logo
Then User should navigate to home page


Scenario: To validate Know your password?Sign in> link
When User should click on Know your password?Sign in> link
Then User should navigate to Sign In Page


Scenario: To validate reCaptcha label and their links
And  User should be able to view the label from "<SheetName>" and <RowNumber>
When  User click on Privacy Policy link
Then  User should navigate to Privacy Policy URL
When  User click on Terms of Service link
Then  User should navigate to Terms of Service URL

Examples:
|SheetName|RowNumber|
|ResetPwdPage|0|


