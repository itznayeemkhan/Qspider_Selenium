package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		String filepath = "./resources/prop.properties";
		 FileInputStream file = new FileInputStream(filepath);
		 Properties properties = new Properties();
		 properties.load(file);
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
		 

	}

}
