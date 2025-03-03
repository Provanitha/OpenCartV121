Feature: Testing API endpoints

Background:
  * url 'https://reqres.in/api/users'


Scenario: POST data and then use it in PUT method

Given request { name: "morpheus" , job: "leader" }
When method POST
Then status 201
And def postId = response.id   


Given path 'api/users/2' + postId
And request { name: "vanitha" , job: "software" } 
When method PUT
Then status 200

