package com.training.utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesfile {
	 FileInputStream fileinput;
	public String getproperty (String key) {
		String userdir= System.getProperty("user.dir");
		 String fileseparator=System.getProperty("file.separator");
	String filepath=userdir+fileseparator+"Properties"+fileseparator+"application.properties";
 System.out.println(filepath);
 

try {
	fileinput = new FileInputStream(filepath);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Properties prop=new Properties();
 try {
	prop.load(fileinput);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String value=  prop.getProperty(key);
return value;
	}

}
