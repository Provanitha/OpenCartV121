package API_TestCases;


import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class SampleTest {
	
	@Test
	public void test() {
		String name="com.ofss.digx.app.sms.dto.user.UserResponseDTO.kycFlag";
		String genericName="kycFlag";
		String value="true";
		String datatype="boolean";
		String fullyQualifiedClassName="com.ofss.digx.app.sms.dto.user.UserResponseDTO";

		String a="abc";
		String b="abcd";
		String c="abcde";
		String d="abcdef";

		
		String strRequestBody = "{" + System.lineSeparator() + "\"dictionaryArray\": [{" + System.lineSeparator()
		+ "\"nameValuePairDTOArray\": [" + System.lineSeparator() + "{" + System.lineSeparator()
		+ "\"name\": \"" + name.toString() + "\"," + System.lineSeparator()
		+ "\"genericName\": \"" + genericName.toString() + "\","
		+ System.lineSeparator() + "\"value\": \"" + value.toString() + "\","
		+ System.lineSeparator() + "\"datatype\": \"" + datatype.toString() + "\""
		+ System.lineSeparator() + "}" + System.lineSeparator() + "]," + System.lineSeparator()
		+ "\"fullyQualifiedClassName\": \"" + fullyQualifiedClassName.toString()
		+ "\"" + System.lineSeparator() + "}],";

       System.out.println(strRequestBody);
       String strRequestBody1 = strRequestBody + System.lineSeparator() + "\"paymentType\": \""
				+ a.toString() + "\"," + System.lineSeparator() + "\"amount\": { "
				+ System.lineSeparator() + "\"currency\": \"" + b.toString() + "\","
				+ System.lineSeparator() + "\"amount\": "
				+ c.toString() + System.lineSeparator() + "},"
				+ System.lineSeparator() + "\"tracerNo\": \"" + d.toString() + "\""
				+ System.lineSeparator() + "}";
		System.out.println(strRequestBody1); 
       
//       RequestSpecification body = given().body(strRequestBody);
//       System.out.println(body);
       JsonObject bodyJson = JsonParser.parseString(strRequestBody1).getAsJsonObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		strRequestBody1 = gson.toJson(bodyJson);
		System.out.println(strRequestBody1);

	}


	
	

}
