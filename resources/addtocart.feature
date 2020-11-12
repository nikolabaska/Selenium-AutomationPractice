Feature: Add to cart validation

Scenario: Try to add produt into the art

Given User is login with valid credentials
When User navigate and click on Woman main menu
And User click on prodcut
And User click on the add to cart button
Then User should see product into the cart