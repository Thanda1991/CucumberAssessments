@Regression @Test1
Feature: Test 1

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