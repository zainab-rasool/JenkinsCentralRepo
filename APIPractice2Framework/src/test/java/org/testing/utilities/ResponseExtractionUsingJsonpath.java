package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtractionUsingJsonpath {
	
	public static String responseExtract(String jsonpath, Response res){
	
		return res.jsonPath().get(jsonpath);
		
	}

}
