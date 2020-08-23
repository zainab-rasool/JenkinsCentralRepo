package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	public static String jsonVariable(String body, String VariableName, String VariableValue){
		
		body=body.replaceAll(Pattern.quote("{{"+VariableName+"}}"), VariableValue);
		return body;
	}

}
