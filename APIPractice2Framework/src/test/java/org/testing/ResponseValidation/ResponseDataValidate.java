package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidate {
	
	public static void responseData(Response res, String expectedData, String jsonpath){
		
		String actualData=res.jsonPath().get(jsonpath);
		
		if(actualData.equals(expectedData)){
			System.out.println("Data is matching");
		}
		else{
			System.out.println("Data is not matching");
		}
		
	}

}
