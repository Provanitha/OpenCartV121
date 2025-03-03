Feature: Delete Method

Scenario: Deletes put deatils

Given url 'https://reqres.in/api/users/2'
And request { name: 'morpheus', job: 'zion resident'}
When method delete
Then status 204
