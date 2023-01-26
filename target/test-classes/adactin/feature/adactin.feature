Feature: Adactin hotel booking

Scenario: Adactin app log in
Given User open the Chrome
And User enter the navigate
And User enter the UserName
And User enter the PAssword
When User click the login button
Then Login Successfull

Scenario: Hotel search in Adactin
Given User click the Select location
And User click the select Hotel
And User select the Room Type
And User select number of rooms
And User check In date
And  User check out date
And Select adults per Room
And Select Child per Room
Then User enter the search button
 
Scenario: Confirmation hotel booking
Given User select the Hotel
Then User click the continue button

Scenario: User Enter the User details
Given User Enter the First Name
And User Enter the last Name
And User Enter the Address
And User Enter the Credit Number
And User click the credit Card type
And User Enter the Expiry Month
And User Enter the Expiry Year
And User Enter the cvv number
Then User click the booknow button