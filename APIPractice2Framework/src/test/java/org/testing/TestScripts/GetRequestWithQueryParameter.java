package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class GetRequestWithQueryParameter {
	
	//get request(based upon lastname)--query parameter---lastname you are taking from the first testcase

	public void tc3() throws IOException{
		Properties pr=PropertiesFileLoad.propertiesfile();
		
		HTTPMethods http=new HTTPMethods(pr);
		
	//http://localhost:3000/friendlist?lastname=test

		Response res=http.GetRequestWithQuery("QA_URI", "lastname", PostRequestTC1.lastname);
		
		System.out.println("TC3:- Get request with query parameter");
		System.out.println("Response:-   " +res.asString());
		ResponseStatusCodeValidate.ResponseStatusCode(res, 200);
		
		
		
	}
}
