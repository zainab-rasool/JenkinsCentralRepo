package org.testing.TestScripts;

import java.io.IOException;
//import java.util.Collection;
import java.util.Properties;
//import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
//import org.testing.utilities.JsonFileRead;
//import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

//Update the existing record

/*TC4-------------------?(Test Case4)--------inside testScript package
1) body data ready using org.json
2) properties file object
3) HTTP Method Call(Put Request)
4) Response Status Code Validation
5) Response Data Validation
(Update based upon API Chaining means take the id value from
the TC1)*/


@Test

public class PutRequest_TC4 {
	



	public void tc4() throws IOException{
		//String id = null;
		//String body =JsonFileRead.bodyDataRead("..//APIPractice2Framework//src//test//java//org//testing//PayloadData//body.json");
		//Random r=new Random();
		//Integer i=r.nextInt();
		//body=JsonVariableReplacement.jsonVariable(body, id, i.toString());
		
		JSONObject body=new JSONObject();
		body.put("firstname", "mini");
		body.put("lastname", "ggh");
		body.put("id", PostRequestTC1.id);
		body.put("designation", "TL");
		
		
		Properties pr=PropertiesFileLoad.propertiesfile();
		
		
		HTTPMethods http=new HTTPMethods(pr);
		
		Response res=http.PutRequest(body.toString(), "QA_URI", PostRequestTC1.id);
		System.out.println("TC4:- post request");
		System.out.println("Response:-   " +res.asString());
		ResponseStatusCodeValidate.ResponseStatusCode(res, 200);
		ResponseDataValidate.responseData(res, "ggh", "lastname");
		
	}

}
