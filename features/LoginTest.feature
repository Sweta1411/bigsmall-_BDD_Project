Feature: Login Test

Scenario: Validating Login

Given User lands on Home Page
And Clicks on sign in
Then User enters username and password
And Click on submit
Then let user manually enter captcha and My Account section should be displayed