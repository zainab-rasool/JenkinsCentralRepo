package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

//Status code validate
public class ResponseStatusCodeValidate {
	
	public static void ResponseStatusCode(Response res, int expectedStatusCode){
		//res.StatusCode()
		if(res.getStatusCode()==expectedStatusCode){
			System.out.println("Status code is matching");
		}
		else
		{
			System.out.println("Status code is not matching");
		}
		
		
	}

}
