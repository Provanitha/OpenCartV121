package API_TestCases;



import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import POJO_Classes.AddBookRequest;
import Utilities.APIResources;
import Utilities.Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddBook {

Utils util = new Utils();

	
	
	@Test
	public void validateAddBook() throws IOException {
		AddBookRequest a = new AddBookRequest();
		a.setName(new Faker().address().firstName());
		a.setIsbn(new Faker().address().firstName());
		a.setAisle(Integer.toString(new Faker().random().nextInt(100,1000)));
		a.setAuthor(new Faker().book().author());
       LinkedHashMap<String, String> header = new LinkedHashMap<String,String>();
       LinkedHashMap<String, Object> mul = new LinkedHashMap<String,Object>();
       mul.put("filename", new File(""));
       header.put("Content-Type", "application/json");
//		Response response = util.requestAndGetResponse("json", header, mul, null, 
//				"POST", APIResources.valueOf("AddBookAPI").getResource(), a);
//		
//		System.out.println(response.getStatusCode());
		
		
	}
	
}
