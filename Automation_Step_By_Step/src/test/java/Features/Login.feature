Feature: User login

  Background: 
    Given I navigate to the login page

  Scenario: Validate with valid login credentials
    When I enter "Vanitha" as username and "Vani@123" as password
    Then I should be redirected to the Bookspage
     Then I click on logoutbutton

  