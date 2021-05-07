package ApiPractice;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class api1 {
	
	@Test
		public static void Api(){

  /*RestAssured.baseURI="https://restapi.demoqa.com/utilities/whethers/city";
	  
	  RequestSpecification api= RestAssured.given();
	  
	  Response res= api.request(Method.GET, "/Hydrabad");
	  
	  String respbody=res.getBody().asString();
	  
	  System.out.println(respbody);*/
		
		 RestAssured.baseURI="http://onlineshopappnew-env-1.eba-eze9bbsz.us-east-1.elasticbeanstalk.com/onlineshop/";
		  
		  RequestSpecification api= RestAssured.given();
		  
		  RestAssuredConfig config = RestAssuredConfig.newConfig();
	        config = config.encoderConfig(config.getEncoderConfig().defaultContentCharset("UTF-8"));
	        config = config.encoderConfig(config.getEncoderConfig().defaultCharsetForContentType("UTF-8", ContentType.URLENC));
	       
	        RestAssured.config = config;
	       
	        Map<String, String> requestParams = new HashMap();
	        requestParams.put("price", "15000");
	        requestParams.put("starRating", "5");
	        requestParams.put("description", "Good Product To Have it");
	        requestParams.put("productName", "Laptop");
	       
	        RestAssured.given()
	                                       .params(requestParams)
	                                        .post("/addProduct ")
	                                        .then()
	                                        .assertThat()
	                                        .statusCode(200);
	                                        //.and()
	                                       // .body(contains("Product details successfully added"));
	  
	 
	

}
}