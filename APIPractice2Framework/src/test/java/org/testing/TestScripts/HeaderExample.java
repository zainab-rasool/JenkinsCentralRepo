package org.testing.TestScripts;

import java.util.HashMap;
import java.util.List;

import com.jayway.restassured.response.Header;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;


import static com.jayway.restassured.RestAssured.*;

public class HeaderExample {


	public static void main(String[] args){
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("Header1", "value1");
		hm.put("Header2", "value2");
		hm.put("Header3", "value3");
		hm.put("Header4", "value4");
		
/*		Request header
 
         given()
		.headers(hm)
		.when()
		.post("");
		
		*/
		
		//Response header
		
		Response res=
		 given()
		 .contentType(ContentType.JSON)
			.when()
			.get("https://intellisuggest.fareportal.com/api/IntelliSuggest/2.0/json/AutoSuggest/AIR/ALL/mia");
		
		/*one header value        String headervalue=res.getHeader("Headername");*/
	    String headervalue=res.getHeader("server");
	    System.out.println(headervalue);
		
		/*all header, and also pick one header*/
	 Headers headers=res.getHeaders();
	  String headervalue1=headers.get("server").toString();
	 
	System.out.println(headervalue1);
	String headervalue2=headers.get("x-aspnet-version").toString();
	System.out.println(headervalue2);
		
		
		List<Header> allkeys=headers.asList();
		for(Header h : allkeys){
			System.out.println(h);
			//System.out.println(headers.get(h.toString()));
		}
	}

}
