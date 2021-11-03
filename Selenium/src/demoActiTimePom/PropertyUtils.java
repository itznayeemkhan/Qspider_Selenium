package demoActiTimePom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	public String PropertyUtils(String filepath,String key) throws Throwable {
	FileInputStream file = new	FileInputStream(filepath);
	Properties properties = new Properties();
	properties.load(file);
	return properties.getProperty(key);
	
	
	
	
		
	}



}
