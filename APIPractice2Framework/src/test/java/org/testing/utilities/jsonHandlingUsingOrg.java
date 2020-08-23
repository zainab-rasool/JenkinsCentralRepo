package org.testing.utilities;

//import java.util.LinkedHashSet;
//import java.util.Set;

import org.json.JSONArray;
//import org.json.JSONObject;

import com.jayway.restassured.response.Response;

public class jsonHandlingUsingOrg {
	public static Response jsonHandling(String bodyData,String KeyName,String insertValue)
	{
		JSONArray j=new JSONArray(bodyData);
		System.out.println(j);
		
		/*for(String i :all){
			System.out.println(j.getInt(i).toString());
		}
		*/
		
		return null;





	}
}
