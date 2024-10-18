Feature: Login

  Scenario Outline: As an existing user I should be able to successfully login
    Given I have launched the site and I see appropriate login button
    And I click the customer login button
    And I select my name from the dropdown list of customers <customerName>
    When I click the Login button to login
    Then The welcome message is displayed and I see my account information
    And I verify the customer's original balance
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to make a deposit
    Then I validate that the deposit was successful
    And I click the logout button to logout
    Examples:
      | customerName | depositAmount |
      |Harry Potter   |1500           |
