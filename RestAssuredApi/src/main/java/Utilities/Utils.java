package Utilities;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.Reporter;
import com.API_Testing.Listeners.APIExtentManager;
import com.API_Testing.Listeners.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import java.util.Properties;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification requestSpec;
	Response response;

	public RequestSpecification requestSpecification() throws IOException {
		if (requestSpec == null) {

			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			requestSpec = new RequestSpecBuilder().setBaseUri(getGlobalValues("baseUrl"))
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
			return requestSpec;
		}
		return requestSpec;

	}

	public String getGlobalValues(String key) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\WebApplication\\API Automation\\TestNG_RestAssuredFramework\\src\\main\\java\\Utilities\\Global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

	// 1.Without path and querry parameter
	public Response requestWithHeaderAndJsonBody(LinkedHashMap<String, String> addHeader, Object obj,
			EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).body(obj);

		try {
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBody(int a, LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> formData, EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = null;
		try {
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).params(formData);
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).formParams(formData);
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBodyWithMultiPart(LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> formData, LinkedHashMap<String, String> multipart,
			EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> mp : multipart.entrySet()) {
				key = mp.getKey();
				value = mp.getValue();
				break;
			}
			RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).params(formData)
					.multiPart(key, new File(value));
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndMultiPart(LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> multipart, EnumHelper.HTTP_Method method, String reqUrl) throws IOException {
		String key = null;
		String value = null;
		for (Map.Entry<String, String> mp : multipart.entrySet()) {
			key = mp.getKey();
			value = mp.getValue();
			break;
		}
		RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).multiPart(key,
				new File(value));
		switch (method) {
		case GET:
			response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

			APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
					response.asString());
			com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
					+ 1;

			break;

		case POST:
			response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

			APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
					response.asString());
			com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
					+ 1;

			break;

		case PUT:
			response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

			APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
					response.asString());
			com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
					+ 1;

			break;

		case PATCH:
			response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

			APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
					response.asString());
			com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
					+ 1;

			break;

		case DELETE:
			response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

			APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
					response.asString());
			com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
					+ 1;

			break;

		default:
			break;
		}
		return response;
	}

	public Response requestWithHeader(LinkedHashMap<String, String> addHeader, EnumHelper.HTTP_Method method,
			String reqUrl) throws Exception {
		RequestSpecification request = given().spec(requestSpecification()).headers(addHeader);
		try {
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

//2.Separate path and querry param

	public Response requestWithHeaderAndJsonBody_WithParameter(int a, LinkedHashMap<String, String> addHeader,
			Object obj, LinkedHashMap<String, String> param, EnumHelper.HTTP_Method method, String reqUrl)
			throws Exception {
		RequestSpecification request = null;
		try {
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(param).body(obj);
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).queryParams(param).body(obj);
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBody_WithParameter(int a, LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> formData, LinkedHashMap<String, String> param, EnumHelper.HTTP_Method method,
			String reqUrl) throws Exception {
		RequestSpecification request = null;
		try {
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(param).params(formData);

			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).queryParams(param)
						.formParams(formData);
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBodyWithMultiPart_WithParameter(int a,
			LinkedHashMap<String, String> addHeader, LinkedHashMap<String, String> formData,
			LinkedHashMap<String, String> param, LinkedHashMap<String, String> multipart, EnumHelper.HTTP_Method method,
			String reqUrl) throws Exception {
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> mp : multipart.entrySet()) {
				key = mp.getKey();
				value = mp.getValue();
				break;
			}
			RequestSpecification request = null;
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(param).params(formData)
						.multiPart(key, new File(value));
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).queryParams(param).params(formData)
						.multiPart(key, new File(value));
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndMultiPart_WithParameter(int a, LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> multipart, LinkedHashMap<String, String> param, EnumHelper.HTTP_Method method,
			String reqUrl) throws Exception {
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> mp : multipart.entrySet()) {
				key = mp.getKey();
				value = mp.getValue();
				break;
			}
			RequestSpecification request = null;
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(param).multiPart(key,
						new File(value));
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).queryParams(param).multiPart(key,
						new File(value));
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndParameter(int a, LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> param, EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = null;

		try {
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(param);
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).queryParams(param);
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().delete(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

//3.Both Path parameter and Querry parameter at a time using	

	public Response requestWithHeaderAndJsonBody_WithBothParameters(LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> pathParam, LinkedHashMap<String, String> querryParam, Object obj,
			EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
				.queryParams(querryParam).body(obj);
		try {
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBody_WithBothParameters(int a, LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> pathParam, LinkedHashMap<String, String> querryParam,
			LinkedHashMap<String, String> formData, EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = null;
		try {
			if (a == 1) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
						.queryParams(querryParam).params(formData);
			} else if (a == 2) {
				request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
						.queryParams(querryParam).formParams(formData);
			}
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndFormDataBodyWithMultiPart_WithBothParameters(
			LinkedHashMap<String, String> addHeader, LinkedHashMap<String, String> pathParam,
			LinkedHashMap<String, String> querryParam, LinkedHashMap<String, String> formData,
			LinkedHashMap<String, String> multipart, EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> mp : multipart.entrySet()) {
				key = mp.getKey();
				value = mp.getValue();
				break;
			}
			RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
					.queryParams(querryParam).params(formData).multiPart(key, new File(value));
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAndMultiPart_WithBothParameters(LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> pathParam, LinkedHashMap<String, String> querryParam,
			LinkedHashMap<String, String> multipart, EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> mp : multipart.entrySet()) {
				key = mp.getKey();
				value = mp.getValue();
				break;
			}
			RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
					.queryParams(querryParam).multiPart(key, new File(value));
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}

	public Response requestWithHeaderAnd_BothParameters(LinkedHashMap<String, String> addHeader,
			LinkedHashMap<String, String> pathParam, LinkedHashMap<String, String> querryParam,
			EnumHelper.HTTP_Method method, String reqUrl) throws Exception {
		RequestSpecification request = given().spec(requestSpecification()).headers(addHeader).pathParams(pathParam)
				.queryParams(querryParam);
		try {
			switch (method) {
			case GET:
				response = request.when().get(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case POST:
				response = request.when().post(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PUT:
				response = request.when().put(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case PATCH:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			case DELETE:
				response = request.when().patch(reqUrl).then().extract().response();
//			Reporter.log("Response is " + response.asString(), true);
//			ExtentTestManager.getTest().log(LogStatus.INFO, "Response is " + response.asString());

				APIExtentManager.apitest.log(LogStatus.PASS, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
				com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.PASSED_TC_COUNTER
						+ 1;

				break;

			default:
				break;
			}
			return response;
		} catch (Exception e) {
			if (e.getMessage().contains("Error Response"))
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine()
						+ "<div id=error_response>" + e.getMessage() + "</div>"
						+ "<div id=refer_resp>Refer Response <span id=hand_icon>  &#10524; &#10524; &#10524;</span></div>",
						response.asString());
			else
				APIExtentManager.apitest.log(LogStatus.FAIL, response.getStatusCode() + " " + response.getStatusLine(),
						response.asString());
			e.getMessage();
			e.printStackTrace();
			com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER = com.API_Testing.Listeners.BaseTest.FAILED_TC_COUNTER
					+ 1;
			throw new Exception(e.getMessage());
		}

	}



}
