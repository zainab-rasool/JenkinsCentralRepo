package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class Delete_TC5 {
	public void tc5() throws IOException{
	
		Properties pr=PropertiesFileLoad.propertiesfile();
		HTTPMethods http=new HTTPMethods(pr);
		
		Response res=http.DeleteRequest("QA_URI", PostRequestTC1.id);
		System.out.println("TC5:- Delete request");
		ResponseStatusCodeValidate.ResponseStatusCode(res, 200);
	}
}
