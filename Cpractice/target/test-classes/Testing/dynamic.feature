Feature: Create user using post api

  Background: 
    * url 'https://gorest.co.in'
    * def dyn_string=
      """
      function(s){
      	
							      var text= "";
							      var pattern = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
							      for(int i=0; i<s; i++)
							      text += pattern.charAt(Math.floor(Math.random()*pattern.length()));
							      return text;
       
      }
   
     """
    * def dynamicstring = dyn_string(11);
    * print dynamicstring
    * def requestPayload =
      """
      {
      	"name": "vanitha",
      	"gender": "female",
      	"status": "active"
      }
      """
    * requestPayload.eamil= dynamicstring + "@gmail.com"
    * print requestPayload

  Scenario: Create a user with the given data
    Given path 'public/v1/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method post
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.email == 'vanitha'
    And match $.data.name == 'vanitha'
