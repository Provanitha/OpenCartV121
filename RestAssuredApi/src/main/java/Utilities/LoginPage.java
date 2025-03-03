package Utilities;

import POJO_Classes.LoginResponse;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;

public class LoginPage {
	 Utils util =  new Utils();
	  TestDataBuild testData = new TestDataBuild();
	  public static String token;
	  public static String userID;
	  public void generateToken() throws Exception {
		  
//  RequestSpecification is used for commonly repetetive actions		  

		   RequestSpecification reqLogin = given().relaxedHTTPSValidation()
				   .spec(util.requestSpecification()).contentType(ContentType.JSON)
				   .body(testData.loginRequestPayload());
			APIResources resourceAPI = APIResources.valueOf("LoginAPI");
			System.out.println(resourceAPI.getResource());

		   Response response = reqLogin.when().post(resourceAPI.getResource())
				  .then().extract().response();
		   if(response.getStatusCode()!=200)
		   throw new Exception("Login Request Failed expected status code is 200 but found "+ Integer.toString(response.getStatusCode()));
		   LoginResponse loginResponse = response.as(LoginResponse.class);
			System.out.println(loginResponse.getToken());
			System.out.println(loginResponse.getUserId());
			System.out.println(loginResponse.getMessage());
			if(!loginResponse.getMessage().equalsIgnoreCase("Login Successfully"))
				   throw new Exception("Login Request Failed expected response message is Login Successfully but found "+ loginResponse.getMessage());
			 token = loginResponse.getToken();
			 userID = loginResponse.getUserId();
		}
		
		
		
		
		
		
		
	

}
