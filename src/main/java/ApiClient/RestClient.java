package ApiClient ;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import ApiPractice.Api_base;

public class RestClient extends Api_base{
	
	//get method
	public void get(String url) throws ClientProtocolException, IOException, JSONException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget =new HttpGet(url); 
	    CloseableHttpResponse httpRespose=	httpClient.execute(httpget);  //to hit api
	    
	     int statuscode=httpRespose.getStatusLine().getStatusCode();
	   System.out.println(statuscode);
	
	//to get complete string
	String responseString=EntityUtils.toString(httpRespose.getEntity(),"UFT-8");
	
	//convert into json 
	JSONObject jsobj=new JSONObject(responseString);
	
	System.out.println(jsobj);
	
	Header[] headerarry=  (Header[]) httpRespose.getAllHeaders();
	
	HashMap<String, String> allheader= new HashMap<String, String>();
	
	for(Header header:headerarry){
		
		allheader.put(header.getName(), header.getValue());
	
	}
	System.out.println(allheader);
	}
	


}
