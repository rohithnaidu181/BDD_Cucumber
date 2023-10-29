Feature: Sign-in and Sign-out on Online Shopping Portal
  As a registered user
  I want to be able to sign in and sign out of the shopping portal
  So that I can access my account and securely sign out

  Background:
    Given I am on the login page of the online shopping portal
    And I have a registered account

  Scenario: Successful Sign-in
    When I enter valid login credentials
    And I click the "Sign In" button
    Then I should be signed in successfully

  Scenario: Sign-in with Invalid Credentials
    When I enter invalid login credentials
    And I click the "Sign In" button
    Then I should see an error message indicating invalid credentials

  Scenario: Sign-out
    When I am signed in
    And I click the "Sign Out" button
    Then I should be signed out successfully

  Scenario: Accessing Account Without Signing In
    When I am not signed in
    And I try to access my account
    Then I should be prompted to sign in

