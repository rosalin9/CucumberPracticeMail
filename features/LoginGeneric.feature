Feature: Login scenarios

Background: Launching the application for each testcase
Given User launch the application


Scenario: Login into application with valid username and password
Then User Enter into the Textbox "username" "admin123@gmail.com"
Then User Enter into the Textbox "password" "admin123"
Then User Click on "LoginButton"
Then User Click on "Home"


Scenario: Login into application with valid username and password
Then User Enter into the Textbox "username" "admin123@gmail.com"
Then User Enter into the Textbox "password" "admin123"
Then User Click on "LoginButton"
Then User Click on "Home"
Then User Enter into the Textbox "Firstname" "Rosalin"
Then User Enter into the Textbox "Lastname" "Mahapatra"


