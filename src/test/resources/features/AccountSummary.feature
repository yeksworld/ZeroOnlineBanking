@AccountSummary
Feature: Automating Account Summary Page

  Background:
    Given I am on the Login page
    Then I login with username "username" and password "password"

  Scenario: Account Summary
    Given the Account Summary page should be displayed
    When I click the online banking button
    Then Page should have the title "Zero - Free Access to Online Banking"
    When I click  the account summary button
    And Page should have the title "Zero - Account Summary"
    Then Account summary page should have the following account types: "Cash Accounts", "Investment Accounts", "Credit Accounts", "Loan Accounts"
    And "Credit Accounts" table must have columns
