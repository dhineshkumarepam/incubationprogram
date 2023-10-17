Feature: User Login
Registered User should be ableto loginto access account details

Scenario: Login with valid credentials 
Given User navigates to Login page 
When User enters valid email address "dhineshKumar@gmail.com"
And Enter valid Password  "123456"
And Clicks on login button
Then User should login successfully
