package ApiPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiAssignment {

	@Test
	
	public void apiAssign(){
		//
	
		 RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		  
		 /* RestAssured.basePath="/api/v1";
			
		  String endpoint="/employees/{id}";*/
		  
		  RequestSpecification api= RestAssured.given();
		  
		Response res=api.pathParam("id", 1).get("/{id}") ;
		
	String responseBody=res.getBody().asString();
		System.out.println(responseBody);
	}

}

