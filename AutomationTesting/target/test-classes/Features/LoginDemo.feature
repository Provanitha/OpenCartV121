Feature: Test login functionality

  Scenario Outline: Check login is Successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <email> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | email | password |
      | vanithadasari98@gmail.com  | dasari@123 |
