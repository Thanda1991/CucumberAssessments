@Regression @Test1
Feature: XYZ_Bank

  Scenario Outline: As an existing customer I should be able to successfully login
    Given I have launched the site and I see appropriate login button
    And I click the customer login button
    And I select customer name from the dropdown list of customers <customerName>
    When I click the Login button to login
    Then The welcome message is displayed and I see my account information
    And I get the customer's initial account balance
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to submit deposit amount
    Then I validate that the deposit was successful
    And I check if the new deposit reflect in the customer account
    And I click the logout button to logout
    Examples:
      | customerName | depositAmount |
      | Harry Potter | 1500          |

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

  Scenario Outline: As an existing customer I should be able to successfully login
    Given I have launched the site and I see appropriate login button
    And I click the customer login button
    And I select customer name from the dropdown list of customers <customerName>
    When I click the Login button to login
    Then The welcome message is displayed and I see my account information
    And I get the customer's initial account balance before deposit
    And I click the deposit button to make a deposit
    And I enter the deposit amount <depositAmount>
    When I click the deposit button to submit deposit amount
    And I validate that the deposit was successful
    Then I get the customer's account balance after deposit
    And I click the transaction button to view transactions
    Then I verify that the transaction appears
    And I click the back button to go back
    Then I click the withdrawal button to open withdrawals
    And I put the withdrawal amount <withdrawalAmount>
    Then I click the withdrawal button to confirm withdrawal
    And I verify that the withdrawal was successful
    And I get customer's balance after withdrawal
    And I click the transaction button to view transactions
    Then I verify that the transaction appears
    Then I click the logout button to logout
    Examples:
      | customerName       | depositAmount | withdrawalAmount |
      | Neville Longbottom | 31459         | 31459            |