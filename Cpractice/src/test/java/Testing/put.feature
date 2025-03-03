Feature: Update Post details

Scenario: deatils update

Given url 'https://reqres.in/api/users/2'
And request { name: 'morpheus', job: 'zion resident'}
When method PUT
Then status 200