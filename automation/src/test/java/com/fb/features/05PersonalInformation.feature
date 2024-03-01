@PersonalInformation
Feature: Personal Information
Background:
Given user launched the app 

  

@Personalinfo
 Scenario Outline: To verify sign in user able to view and edit personal information from pickup order type

				When user is on Sign In Page and able to enter  authentication details from "<SheetName>" and <RowNumber>
				And user should see and verify the homepage 
				When user should verify order type as pickup through order info 
				And user closes order info and navigates back to home page
				Then user should see and able to click the hamburger menu from home page
				And verify close icon and able to navigate back on hamburg page
				When user should able to see and tap on your account button
				And verify Account Header is displayed and back navigation
				When user should able to tap on personal info CTA
				And verify Personal info Header is displayed
				Then user should verify the first name column 
				When user clears the values from first name column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Last Name column
				When user clears the values from Last name column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Phone number column
				When user clears the values from Phone number column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Email column
				And user should verify Email format
				Then user should verify Password column and change button
				When user tap on change button
				Then user should verify reset password popup
				And user should verify the decorative icon and close button
				Then user should verify the reset password readonly text
				And user should verify the send email button
				Then User should verify the cancel button
				When user tap on cancel button
				Then user should verify navigating back to personal info landing page
				And user should verify Birthday column and text in birthday column value
				Then user should see and verify Face ID/Touch ID column text
				And user should verify Face ID/Touch ID toggle button 
				Then user should verify required text below each textboxs
				Then user should verify save button 
				And user should see and verify cancel 
				Then user should see and verify delete account CTA
				When user tap on back button
				Then user should verify save your changes popup
				And user should verify save and close button 
				Then user should verify close button
				Then user should verify discard changes button
				
 
		
 Examples: 
      | SheetName    | RowNumber |
      | PersonalInfo |         0 |
      
@Personalinfos   
Scenario Outline: To verify sign in user able to view and edit personal information from delivery order type

				When user is on Sign In Page and able to enter  authentication details from "<SheetName>" and <RowNumber>
				And user should see and verify the homepage 
				When user should change order type as delivery through order info 
				And user closes order info and navigates back to home page
				Then user should see and able to click the hamburger menu from home page
				And verify close icon and able to navigate back on hamburg page
				When user should able to see and tap on your account button
				And verify Account Header is displayed and back navigation
				When user should able to tap on personal info CTA
				And verify Personal info Header is displayed
				Then user should verify the first name column 
				When user clears the values from first name column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Last Name column
				When user clears the values from Last name column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Phone number column
				When user clears the values from Phone number column and enters values from  "<SheetName>" and <RowNumber>
				Then user should see and verify the Email column
				And user should verify Email format
				Then user should verify Password column and change button
				When user tap on change button
				Then user should verify reset password popup
				And user should verify the decorative icon and close button
				Then user should verify the reset password readonly text
				And user should verify the send email button
				Then User should verify the cancel button
				When user tap on cancel button
				Then user should verify navigating back to personal info landing page
				And user should verify Birthday column and text in birthday column value
				Then user should see and verify Face ID/Touch ID column text
				And user should verify Face ID/Touch ID toggle button
				Then user should verify required text below each textboxs 
				Then user should verify save button 
				And user should see and verify cancel 
				Then user should see and verify delete account CTA
				When user tap on back button
				Then user should verify save your changes popup
				And user should verify save and close button 
				Then user should verify close button
				Then user should verify discard changes button
				
				Examples: 
      | SheetName    | RowNumber |
      | PersonalInfo |         1 |      
 
 
 @Personalinfo
 Scenario Outline: To verify sign in user able to verify the character limits of text boxes 

				When user is on Sign In Page and able to enter  authentication details from "<SheetName>" and <RowNumber>
				And user should see and verify the homepage 
				Then user should see and able to click the hamburger menu from home page
				And verify close icon and able to navigate back on hamburg page
				When user should able to see and tap on your account button
				And verify Account Header is displayed and back navigation
				When user should able to tap on personal info CTA
				And verify Personal info Header is displayed
				Then user should verify the first name column 
				Then user should enter values from  "<SheetName>" and <RowNumber>  to first name field and verify the first Name column limit
				Then user should enter values from  "<SheetName>" and <RowNumber>  to last name field and verify the last Name column limit
				Then user should enter values from  "<SheetName>" and <RowNumber>  to phone number field and verify the phone number column limit
				      
				Examples: 
      | SheetName    | RowNumber |
      | PersonalInfo |         2 |      



@Personalinfo
Scenario Outline: To verify sign in user able to verify errors for textbox  

				When user is on Sign In Page and able to enter  authentication details from "<SheetName>" and <RowNumber>
				And user should see and verify the homepage 
				Then user should see and able to click the hamburger menu from home page
				And verify close icon and able to navigate back on hamburg page
				When user should able to see and tap on your account button
				And verify Account Header is displayed and back navigation
				When user should able to tap on personal info CTA
				And verify Personal info Header is displayed
				Then user should verify the first name column 
				When user clears the values from first name column 
				Then user should see and verify the Last Name column
				When user clears the values from Last name column 
				Then user should see and verify the Phone number column
				When user clears the values from Phone number column 
				And user taps on Save button
				Then user should see and verify Please enter a first name error
				And user should see and verify Please enter a last name error
				Then user should see and verify Please enter a phone number error error
				
				
				Examples: 
      | SheetName    | RowNumber |
      | PersonalInfo |         3 |   
				      