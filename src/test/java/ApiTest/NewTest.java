package ApiTest;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;


import org.hamcrest.Matchers;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class NewTest {
	
	final static String url="http://restapi.demoqa.com/utilities/weather";
	//final static String url="http://restapi.demoqa.com/customer";
	  
 /* @Test
  
  public void getTest() {
	  RestAssured ra=new RestAssured();
	  
	  Response res=get(url+"/pune");
	  System.out.println(res.asString());
	 // res.then().body("id", hasItems(1,2));
	  //res.then().body("WeatherDescription",("clear sky"));
	  
	  //to get response body
	  
	  //ResponseBody body = res.getBody();
	  
	 // String bodyAsString =body.asString();
	 String bodyAsString =res.asString();
	  
	 // Assert.assertEquals(bodyAsString.contains("Pune"), true);
	  
	  //to validate node test from response
	  
	  JsonPath jsonPathEvaluator = res.jsonPath();
	  
	  String city = jsonPathEvaluator.get("City");
	  
	  System.out.println("City received from Response " + city);
	  
	  Assert.assertEquals("received city", "Pune", city);
	    
  }
  */
	
  //@Test
   
 /* public void postTest(){
	  Response res=given().contentType(ContentType.JSON).accept(ContentType.JSON)
			  .body("{ \"City\": \"khamgaon\",\"Temperature\": \"40.49 Degree celsius\",\"Humidity\": \"62 Percent\",\"WeatherDescription\": \"clear sky\", \"WindSpeed\": \"9.19 Km per hour\", \"WindDirectionDegree\": \"90 Degree\"}")
			  .when().post(url+"/city");
						
	  System.out.println("rsponse"+res.asString());
}*/
  
	  
	 /* public void RegistrationSuccessful() throws JSONException
	  {		
	  	RestAssured.baseURI ="http://restapi.demoqa.com/customer";
	  	RequestSpecification request = RestAssured.given();

	  	JSONObject requestParams = new JSONObject();
	  	
	  	
	  	requestParams.put("FirstName", "Virender"); // Cast
	  	requestParams.put("LastName", "Singh");
	  	requestParams.put("UserName", "sdimpleuser2dd2011");
	  	requestParams.put("Password", "password1");

	  	requestParams.put("Email",  "sample2ee26d9@gmail.com");
	  	
	  	request.body(requestParams.toJSONString());
	  	
	  	Response response = request.post("/register");

	  	int statusCode = response.getStatusCode();
	  	Assert.assertEquals(statusCode, "201");
	  	String successCode = response.jsonPath().get("SuccessCode");
	  	Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	  }
*/	  
  }
  
  
