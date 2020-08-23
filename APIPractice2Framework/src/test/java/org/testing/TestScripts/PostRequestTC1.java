package org.testing.TestScripts;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseExtractionUsingJsonpath;
/*import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseExtractionUsingJsonpath;*/
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class PostRequestTC1 {
	//post request------------extracting id and firstname
	 static String id;
	 static String lastname;
		

	public static void tc1() throws IOException{
	
	
	//Body data ready	
	String body=JsonFileRead.bodyDataRead("../APIPractice2Framework/src/test/java/org/testing/PayloadData/body.json");
	
	//Variable Value replacement
	Random r=new Random();
	Integer i=r.nextInt();
	body=JsonVariableReplacement.jsonVariable(body, "id", i.toString());
	body=JsonVariableReplacement.jsonVariable(body, "lastname", "test");
		
	//Properties file load
	Properties pr=PropertiesFileLoad.propertiesfile();
	
	//
	HTTPMethods http=new HTTPMethods(pr);
	
	Response res=http.PostRequest(body, "QA_URI");
	
	//System.out.println("Status code:- " +res.statusCode());
	//System.out.println("Response:-   " +res.asString());
	
	System.out.println("TC1:- Post request");
	System.out.println("Response:-   " +res.asString());
	ResponseStatusCodeValidate.ResponseStatusCode(res, 201);
	ResponseDataValidate.responseData(res, "mini33", "firstname");  //post request -in this data is object form - jsonpath different
	
	id=ResponseExtractionUsingJsonpath.responseExtract("id", res);
	lastname=ResponseExtractionUsingJsonpath.responseExtract("lastname", res);  //lastname=test
	
	}
}
