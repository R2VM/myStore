Feature: Cart feature of My Store

  Scenario: Cart of My Store Feature
    Given when user is on Home page with cart section
    When user searches for a product and click search button
    Then user select a product, moves mouse over and clicks on Add to Cart button
    Then user click on Proceed to checkout button
    Then user enter email id and password to signin
    Then user selects My address and clicks Proceed to checkout button
    Then user clicks Shipping date & confirmation and clicks on Final Proceed to checkout button
