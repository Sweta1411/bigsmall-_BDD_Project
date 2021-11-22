Feature: AddToCart

Scenario: AddToCart and CheckOut

Given User lands on Home Page
And Clicks on Cart
Then User selects the item and click on it
When the Page loads the details user clicks on add to cart
And Clicks on checkout option and close the popups
Then A page with the order summary should be displayed