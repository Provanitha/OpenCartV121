
/*
 * package RestAssuredApi.RestAssuredApi;
 * 
 * 
 * import org.apache.http.HttpException; import org.apache.http.HttpStatus;
 * import org.testng.internal.TestNGMethod;
 * 
 * import java.io.*;
 * 
 * public class HttpClientTutorial {
 * 
 * private static String url = "http://www.apache.org/";
 * 
 * public static void main(String[] args) { // Create an instance of HttpClient.
 * HttpClientTutorial client = new HttpClientTutorial();
 * 
 * // Create a method instance. GetMethod method = new GetMethod(url);
 * 
 * // Provide custom retry handler is necessary
 * method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new
 * DefaultHttpMethodRetryHandler(3, false));
 * 
 * try { // Execute the method. int statusCode = client.executeMethod(method);
 * 
 * if (statusCode != HttpStatus.SC_OK) { System.err.println("Method failed: " +
 * method.getStatusLine()); }
 * 
 * // Read the response body. byte[] responseBody = method.getResponseBody();
 * 
 * // Deal with the response. // Use caution: ensure correct character encoding
 * and is not binary data System.out.println(new String(responseBody));
 * 
 * } catch (HttpException e) { System.err.println("Fatal protocol violation: " +
 * e.getMessage()); e.printStackTrace(); } catch (IOException e) {
 * System.err.println("Fatal transport error: " + e.getMessage());
 * e.printStackTrace(); } finally { // Release the connection.
 * method.releaseConnection(); } } }
 * 
 * 
 * 
 * 
 */