@PayBills
Feature: Automating Pay Bills

  Background:
    Given I am on the Login page
    Then I login with username "username" and password "password"
    And I click the online banking button

  Scenario:As an authorized user I should be able to pay
    Given I click the Pay Bills button
    Then page should have the title "Zero - Pay Bills"
    And I click the Payee and click any options
    Then I click the Account and click any options
    When I should fill in Amount ,Date and Description
    Then I click the Pay button
    And I should be have this message "The payment was successfully submitted."

  Scenario:As an authorized user I should NOT be able to pay
    Given I click the Pay Bills button
    Then page should have the title "Zero - Pay Bills"
    And I click the Payee and click any options
    Then I click the Account and click any options
    Then I click the Pay button
    And I should be have this message "Please fill in this field."

