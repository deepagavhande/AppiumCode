package ApiPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_base {
	public static Properties prop;
	
	public Api_base(){
		
		/*try{
			prop=new Properties();
			FileInputStream ip= new FileInputStream("D:\\Softwares\\JAVA\\NOTES\\com.GeneralPracticeDeepa\\src\\main\\java\\ApiConfig\\testApi.properties");
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}*/
		
		
	}
	public static void main(String[] args) {
		
		 RestAssured.baseURI="https://restapi.demoqa.com/utilities/whethers/city";
		  
		  RequestSpecification api= RestAssured.given();
		  
		  Response res= api.request(Method.GET, "/Hydrabad");
		  
		  String respbody=res.getBody().asString();
		  
		  System.out.println(respbody);
	}

}
