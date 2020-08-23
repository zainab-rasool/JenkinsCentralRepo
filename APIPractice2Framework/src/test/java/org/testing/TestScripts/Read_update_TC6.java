package org.testing.TestScripts;

import java.io.FileNotFoundException;
//import java.util.Set;

import org.json.JSONArray;
//import org.json.JSONObject;
import org.testing.utilities.JsonFileRead;
//import org.testing.utilities.jsonHandlingUsingOrg;

//import com.jayway.restassured.response.Response;
/*Create a json file in the payload and put some json data
inside that. 

in tc6, you have to read that json file and you have to
insert a new key:value in that and you have to update
existing key's value in that json payload.


tc6, you have to update the data(where key is 3 inside 
options in the whole json file)

you have to create a generic method inside utiltity

let suppose, you hit a request in the response you got
the data(here data which we are taking from the json file)*/
public class Read_update_TC6 {
	
	public static void tc6() throws FileNotFoundException{
		String body=JsonFileRead.bodyDataRead("..//APIPractice2Framework//src//test//java//org//testing//PayloadData//data.json");
		//Response res=jsonHandlingUsingOrg.jsonHandling(body, "options", "hh");
		JSONArray j=new JSONArray(body);
		System.out.println(j.toString());
	
		
		/*JSONObject j=new JSONObject(body);
		Set<String> all=j.keySet();
		
		for(String i :all){
			System.out.println(j.get(i));
		}
	}*/

}
}