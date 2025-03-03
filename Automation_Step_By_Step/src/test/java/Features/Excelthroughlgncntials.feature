Feature: Launch URL and Login

  Scenario: Open application and enter login credentials through Excelfile
    Given I read the URL and credentials from the Excel file
    When I launch the URL in browser
    And I enter username and password
    Then I should be logged in successfully
