Feature: TestME validation for cart

@Sanity
Scenario: User cross-check for adding item into the cart
Given application launched by registered user
Then user verify added item
@Regression
Scenario: User cross-check for removing item into the cart
Given application launched by registered user
Then user verify removed item
@Sanity @Regression
Scenario: User cross-check for max count in the cart
Given application launched by registered user
Then user verify counted item