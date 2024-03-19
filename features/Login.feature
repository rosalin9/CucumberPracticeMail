Feature: Login scenarios

Background: Launching the application for each testcase
Given User launch the application

Scenario: Login into application with valid username and invalid password
Then User enter the username "admin123@gmail.com"
Then User enter the password "admin"
And User click on login button
Then User click on home button

Scenario: Login into application with valid username and password
Then User enter the username "admin123@gmail.com"
Then User enter the password "admin123"
And User click on login button
Then User click on home button
