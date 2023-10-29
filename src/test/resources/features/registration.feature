Feature: Registration on Online Shopping Portal
  As a new user
  I want to be able to register on the shopping portal
  So that I can start shopping online

  Background:
    Given I am on the registration page of the online shopping portal

  Scenario: Successful Registration
    When I enter valid registration details
    And I click the "Register" button
    Then I should be registered successfully

  Scenario: Registration with Existing Email
    When I enter an email address that is already registered
    And I enter valid registration details
    And I click the "Register" button
    Then I should see an error message indicating the email is already registered

  Scenario: Registration with Invalid Data
    When I enter invalid registration details
    And I click the "Register" button
    Then I should see validation error messages

  Scenario: Registration with Password Mismatch
    When I enter valid registration details with mismatched passwords
    And I click the "Register" button
    Then I should see an error message indicating password mismatch

  Scenario: Registration without Agreeing to Terms
    When I enter valid registration details
    And I do not agree to the terms and conditions
    And I click the "Register" button
    Then I should see an error message indicating I need to agree to the terms

