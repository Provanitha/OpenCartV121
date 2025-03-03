package RestAssuredApi.RestAssuredApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpAbc {
public static void main(String ar[]) throws IOException {
	URL url = new URL ("https://reqres.in/api/users");
/*	From the above URL object, we can invoke the openConnection method to get the HttpURLConnection object.

	We can't instantiate HttpURLConnection directly, as it's an abstract class:*/
	HttpURLConnection con = (HttpURLConnection)url.openConnection();
	// post method
	con.setRequestMethod("POST");
	//json format
	con.setRequestProperty("Content-Type", "application/json");
	// To send request content, let's enable the URLConnection object's doOutput property to true.
  //Otherwise, we won't be able to write content to the connection output stream:
	con.setDoOutput(true);
	// req body
	String jsonInputString = "{name: Upendra, job: Programmer}";
	
	try(OutputStream os = con.getOutputStream()) {
	    byte[] input = jsonInputString.getBytes("utf-8");
	    os.write(input, 0, input.length);	
	    
	    try(BufferedReader br = new BufferedReader(
	    		  new InputStreamReader(con.getInputStream(), "utf-8"))) {
	    		    StringBuilder response = new StringBuilder();
	    		    String responseLine = null;
	    		    while ((responseLine = br.readLine()) != null) {
	    		        response.append(responseLine.trim());
	    		    }
	    		    System.out.println(response.toString());
	    		}
	}
}
}
