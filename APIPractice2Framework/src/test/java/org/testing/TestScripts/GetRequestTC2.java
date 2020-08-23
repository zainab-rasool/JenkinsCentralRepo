package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

//import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


@Test
public class GetRequestTC2 {
	//get request(based upon id)---id you are taking from first testcase
	
	public void tc2() throws IOException{
		Properties pr=PropertiesFileLoad.propertiesfile();
		
		HTTPMethods http=new HTTPMethods(pr);
		
		//Response res=http.GetRequest("QA_URI");
		Response res=http.GetRequest("QA_URI", PostRequestTC1.id);
		
		System.out.println("TC2:- Get request");
		System.out.println("Response:-   " +res.asString());
		ResponseStatusCodeValidate.ResponseStatusCode(res, 200);
		//ResponseDataValidate.responseData(res, "handa", "[3].lastname"); //get request -in this data is array form 
		
		
	}

}
