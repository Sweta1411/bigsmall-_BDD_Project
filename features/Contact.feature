Feature: Contact Us

Scenario Outline: Fill the details and Submit the contact form

Given User lands on Home Page
Then User clicks on Contact Us link
When the User lands on Contact Us form
Then User should enter with name "Sweta Bharti" , Email-id "swetabharti@gmail.com" and Message "bigsmall website"
And User Clicks on submit

