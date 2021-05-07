package ApiPractice;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest1 {
  @Test
  public void apiprac() {
	  
	 // RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/pune";
	  
	/*  RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
	  
	  RequestSpecification api= RestAssured.given();
	  
	  //api.headers("id","xyz");
	  
	  Response res= api.request(Method.GET);
	  
	 Headers s = res.headers();
	 
	 for(Header h:s){
		 System.out.println("key" +"-"+ h.getName() +","+"value"+"-"+h.getValue());
	 }
	  
	 String contenttype=res.header("Content-Type" );
	 
	 Assert.assertEquals(contenttype, "application/json;charset=utf-8");
	 
	  String respbody=res.getBody().asString();
	  
	  System.out.println(respbody);
	  
	  JsonPath jp=res.jsonPath();
	  
	 jp.get("employee_name");
	 
	 //node base evaluation
	 
	 String name=jp.get("status");
	 
	 System.out.println(name);
	 
	Assert.assertEquals(name, "success");*/
	
	//five different http response code
	
/*	int statusCode=res.getStatusCode();
	
 
	Assert.assertEquals(statusCode, 200," statuscode matched");
	
	Assert.assertEquals(statusCode, 201,"statuscode not matched");*/
	  
	//404 not found
	  
    RestAssured.baseURI="http://dummy.restapiexample.com/api//employees";
	  
	  RequestSpecification api1= RestAssured.given();
	  
	  Response res1= api1.request(Method.GET);
	  
		int statusCode2=res1.getStatusCode();
		
		System.out.println(statusCode2);
	
		Assert.assertEquals(statusCode2, 404," statuscode 404 matched");
	
	    //method not allowed 405
		
		 RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		  
		  RequestSpecification api2= RestAssured.given();
		  
		  Response res2= api2.request(Method.POST);
		  
			int statusCode3=res1.getStatusCode();
			
			System.out.println(statusCode2);
		
			Assert.assertEquals(statusCode2, 405," statuscode 405 matched");
			
		//passing incorrect resource
			
			 RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/user";
			  
			  RequestSpecification api3= RestAssured.given();
			  
			  Response res3= api2.request(Method.GET);
			  
				int statusCode4=res1.getStatusCode();
				
				System.out.println(statusCode2);
			
				Assert.assertEquals(statusCode2, 404," statuscode 404 matched");

	  
  }
}
