package RestAssuredApi.RestAssuredApi;





import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GET_Request {
	
	
//weather conditions
    
    @Test
   public void getweatherDetails() {
        
        //specify base URI
        RestAssured.baseURI="https://reqres.in/api/users?page=2";
        
        //request object
        RequestSpecification httprequest=RestAssured.given();
        
        //response object
        
        Response response=httprequest.request(Method.GET,"/2");
        
        //print response in console window
        
    String responseBody=response.getBody().asString();
    System.out.println("Response Body is:" +responseBody);
    
    //Status code validation
    int statusCode=response.getStatusCode();
    System.out.println("Status code is: "+statusCode);
    Assert.assertEquals(statusCode, 201);
    
    // status line Verification
    String statusline=response.getStatusLine();
    System.out.println("Staus line is:"+ statusline);
    Assert.assertEquals(statusline,"HTTP/1.1 200 OK");
    
    }



}



