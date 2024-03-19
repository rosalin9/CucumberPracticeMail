Feature: Login scenarios

Scenario Outline: Login into application with valid username and password
Given User launch the application
Then User enter the username "<username>"
Then User enter the password "<password>"
And User click on login button
Then User click on home button
Then User enter FirstName "<firstname>"


Examples:
|username|password|Message|firstname|
|admin123@gmail.com|admin123|Valid|Rosalin|
|admin1234@gmail.com|admin1234|Invalid|Tapas|
