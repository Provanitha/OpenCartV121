Feature: Gmail login

Background:

  Given I navigate to the URL 

Scenario: Login with valid credentials

When I enter my username and password
And I click on the login button
Then I should be logged in successfully

Scenario Outline:

When I enter my "<Email>" and "<password>"
And I click on the login button
Then I should "<expectedOutcome>"

Example:

   |Email                    |password         |expectedOutcome        |
   |vanithadasari98@gmail.com|dasari@123       |should be logged in    |
   |vanithadasari@gmail.com  |dasari@12        |should not be logged in| 