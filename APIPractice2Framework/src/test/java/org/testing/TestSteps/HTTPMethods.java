package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.given;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr){
		this.pr=pr;
	}

	public Response PostRequest(String bodyData, String urikey){
		Response res=given()
				 .contentType(ContentType.JSON)
				 .body(bodyData)
				 .when()
				 .post(pr.getProperty(urikey));
				
				 return res;
	}
	
	
    public Response GetRequest(String urikey)
    {
	 Response res=given()
			      .contentType(ContentType.JSON)
			      .when()
			      .get(pr.getProperty(urikey));
	return res;
    }
    
    public Response GetRequest(String urikey, String Endpoint)
    {
    	String uri=pr.getProperty(urikey)+"/"+Endpoint;
	 Response res=given()
			      .contentType(ContentType.JSON)
			      .when()
			      .get(uri);
	return res;
    }
    
    public Response GetRequestWithQuery(String urikey, String QueryParameter, String QueryValue)
    {
    	String uri=pr.getProperty(urikey)+"?"+QueryParameter+"="+QueryValue;
    	
	 Response res=given()
			      .contentType(ContentType.JSON)
			      .when()
			      .get(uri);
	return res;
    }
    
    public Response PutRequest(String body, String urikey, String Endpoint){
    	
    	String uri =pr.getProperty(urikey)+"/"+Endpoint;
    	
    	Response res=given()
    			.contentType(ContentType.JSON)
    			.body(body)
    			.when()
    			.put(uri);
		return res;
    	
    }
    
    public Response DeleteRequest(String urikey, String Endpoint){
    	
    	String uri=pr.getProperty(urikey)+"/"+Endpoint;
    	
    	Response res=given()
    			.contentType(ContentType.JSON)
    			.when()
    			.delete(uri);
		return res;
    	
    	
    	
    }
}
