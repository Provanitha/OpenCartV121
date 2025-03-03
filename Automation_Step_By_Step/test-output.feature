Feature: Login Feature

  Scenario: Login with valid
    credentials

    Given I am on the login page
    When I enter username as "Vanitha" and password as "Vani@123"
    Then I logged in successfully
