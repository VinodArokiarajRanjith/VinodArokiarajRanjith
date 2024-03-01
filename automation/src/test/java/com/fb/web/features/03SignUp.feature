
Feature: Validate all the pages for the Create An Account 

Background:
When User click on Profile icon
Then  User should navigate to Welcome page
When  User click on Create An Account button
Then  User should navigate to Create An Account Page


Scenario Outline: Validate the flow for complete Sign up
When User should enter the valid Emails ID and clicks on Continue button from "<SheetName>" and <RowNumber> 
Then User should navigate to Lets get started page
And  User should enter the firstname and last name and phone number and valid password and Confirm password from "<SheetName>" and <RowNumber> 
And  Click on Continue button and User should navigate to Score Exclusive Perks page
And  User should enter birthday and referral code from "<SheetName>" and <RowNumber> and click on complete Sign up 
Then User should navigate to MoEs welcome page
When User should click on Continue button in MoEs welcome page
Then User should navigate to MEMBERSHIP HAS ITS (DELICIOUS) REWARDS page
When User should click on Continue button in MEMBERSHIP HAS ITS (DELICIOUS) REWARDS page
Then User should navigate to MOBILE ORDERING MADE FAST AND EASY page
When click on LetsGetStarted button
Then User should navigate to home page

Examples:
|SheetName|RowNumber|
|Signupdetails|0|



Scenario Outline: To test the Skip button in Welcome To MoE's Page 
When User should enter the valid Email ID and click on Continue button from "<SheetName>" and <RowNumber> 
Then User should navigate to Lets get started page
And  User should enter the firstname and last name and phone number and valid password and Confirm password from "<SheetName>" and <RowNumber> 
And  Click on Continue button and User should navigate to Score Exclusive Perks page
And  User should enter birthday and referral code from "<SheetName>" and <RowNumber> and click on complete Sign up 
Then User should navigate to MoEs welcome page
When User should click on Continue button in MoEs welcome page
When User should click on Skip button
Then User should navigate to home page

Examples:
|SheetName|RowNumber|
|Signupdetails|2|

Scenario Outline: To test the Skip button in Welcome To MoE's Page 
When User should enter the valid Email ID and click on Continue button from "<SheetName>" and <RowNumber> 
Then User should navigate to Lets get started page
And  User should enter the firstname and last name and phone number and valid password and Confirm password from "<SheetName>" and <RowNumber> 
And  Click on Continue button and User should navigate to Score Exclusive Perks page
And  User should enter birthday and referral code from "<SheetName>" and <RowNumber> and click on complete Sign up 
Then User should navigate to MoEs welcome page
When User should click on Continue button in MoEs welcome page
Then User should navigate to MEMBERSHIP HAS ITS (DELICIOUS) REWARDS page
When User should click on Skip button
Then User should navigate to home page

Examples:
|SheetName|RowNumber|
|Signupdetails|3|








