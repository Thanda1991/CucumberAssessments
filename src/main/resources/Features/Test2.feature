@Regression @Test2
Feature: Test 2

  Scenario Outline: As an existing customer I should be able to successfully login
    Given I have launched the site and I see appropriate login button
    And I click the customer login button
    And I select customer name from the dropdown list of customers <customerName>
    When I click the Login button to login
    Then The welcome message is displayed and I see my account information
    And I get the customer's first account balance before deposit
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to submit deposit amount
    Then I validate that the deposit was successful
    And I get the customer's first account balance after deposit

    Then I select the customer's second account <customerSecondAccountNumber>
    And I get the customer's second account balance before deposit
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to submit deposit amount
    Then I validate that the deposit was successful
    And I get the customer's second account balance after deposit

    Then I select the customer's second account <customerThirdAccountNumber>
    And I get the customer's third account balance before deposit
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to submit deposit amount
    Then I validate that the deposit was successful
    And I get the customer's third account balance after deposit
    Then I click the logout button to logout

    Examples:
      | customerName | customerSecondAccountNumber | customerThirdAccountNumber | depositAmount |
      | Ron Weasly   | 1008                        | 1009                       | 1500          |