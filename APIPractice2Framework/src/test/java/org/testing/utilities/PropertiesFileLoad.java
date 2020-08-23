package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFileLoad {
 public static Properties propertiesfile() throws IOException{
	 File f=new File("../APIPractice2Framework/Environment.properties");
	 FileInputStream fi=new FileInputStream(f);
	 Properties pr=new Properties();
	 pr.load(fi);
	 return pr;
 }
}
