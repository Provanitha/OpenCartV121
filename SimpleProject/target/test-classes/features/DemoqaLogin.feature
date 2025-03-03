Feature: user login

  Background: 
    Given I navigate to the login page

  Scenario: Validate with valid login credentials
    When I enter "Vanitha" as username and "Vani@123" as password
    Then I should be logged into the login page

  Scenario: Validate with invalid login credentials
    When I enter "Vani" as username and "ani@123" as password
    Then I should be able see error as Invalid username or password!
