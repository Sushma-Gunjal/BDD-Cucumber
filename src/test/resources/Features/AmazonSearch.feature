Feature: Search for product and Add to Cart

  Scenario: Search for shoes with specific criteria and add an item to the cart
    Given I am on the search page
    When I select brands "Puma" and "NIKE"
    And I apply a discount filter of "50% and more"
    And I navigate to the third page 
    And I select an item and add it to the cart
    Then the item should be added to the cart successfully
    
    
    
    Scenario: Filter and purchase baby and kids products
    Given I am on the homepage
    When I select the "Baby and Kids" section
    And I choose the "Crocs" brand from Featured Brands
    And I filter for the "shoes size"
    Then I add the first product to the cart
    Then I should see the product in the cart
    