@smoke
@regression
Feature: Automating login functionality

  Background:
    Given I am on the Login page

  Scenario: As an authorized user I should be able to login
    And I login with username "username" and password "password"
    Then the Account Summary page should be displayed


  Scenario: As an unauthorized user I should NOT be able to login
    When I login with username "yek" and password "asdf"
    Then Error message "Login and/or password are wrong." should be displayed.

