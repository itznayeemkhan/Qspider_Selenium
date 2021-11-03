package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class readMultipledata {

	public static void main(String[] args) throws IOException {
		String filepath = "./resources/prop.properties";
		 FileInputStream file = new FileInputStream(filepath);
		 Properties properties = new Properties();
		 properties.load(file);
		Set<Object> keySet = properties.keySet();
		for(Object key:keySet) {
			System.out.println(key);
			System.out.println(properties.get(key));
		}
		 

	}

}
