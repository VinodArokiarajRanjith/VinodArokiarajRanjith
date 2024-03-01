Feature: To Test the Welcome Page

Background:
Given User should launch the MoEs app URL
When User click on Profile icon
Then User should navigate to welcome page

Scenario Outline: To validate the UI components and link validation in Welcome Page
And   User validate the UI components from  "<SheetName>" and <RowNumber>
When User should click on Sign in button 
Then User should navigate to Sign In Page
When User should click on Back Arrow
Then  User should navigate to Welcome page
When  User click on Create An Account button
Then  User should navigate to Create An Account Page
When User should click on Back Arrow
Then  User should navigate to Welcome page
When  User click on Guest user link
Then   User should navigate to home page
When User click on Profile icon
Then  User should navigate to Welcome page
When  User click on Privacy Policy link
Then  User should navigate to Privacy Policy URL
When  User click on Terms of Service link
Then  User should navigate to Terms of Service URL

Examples:
|SheetName|RowNumber|
|WelcomePage|0|
