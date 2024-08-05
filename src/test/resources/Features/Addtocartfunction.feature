Feature: Add product to cart and verify cart content

Background: 

  Given the user is on the Amazon home page


 
 Scenario: Add the first product from search results to the cart
    Given the user opens the Amazon homepage
    When the user searches for "laptop"
    And the user selects the first product from the search results
    And the user adds the product to the cart
    Then the product should be added to the cart successfully
    
    
    
    Scenario: User checks the cart contents
    
    Given the user has added a product to the cart
    When the user navigates to the cart
    Then the cart should contain the added product