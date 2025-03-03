Feature: Get API feature

 Scenario: get user details
 
 Given url "https://gorest.co.in/public/v2/users"
 When method GET
 Then status 200
 
 Scenario: get user id details
 
 Given url "https://gorest.co.in/public/v2/users"
 And path "6771859"
 When method GET
 Then status 200
 
 
 Scenario: get user id details - user not found
 
 Given url "https://gorest.co.in/public/v2/users"
 And path "69"
 When method GET
 Then status 404
 