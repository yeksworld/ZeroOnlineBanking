@AccountActivity
Feature: Account Activity

  Background:
    Given I am on the Login page
    Then I login with username "username" and password "password"


  Scenario: Account Activity
    Given I click the online banking button
    Given I click the Account Activity button
    Given Account Activity page should have the title "Zero - Account Activity"
    And In the Account drop down default option should be "Savings".
    Then Account drop down should have the following options: "Savings", "Checking", "Loan", "Credit Card", "Brokerage"
    And Transactions table should have column names "Date", "Description", "Deposit", "Withdrawal"