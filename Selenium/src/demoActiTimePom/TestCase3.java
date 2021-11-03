package demoActiTimePom;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws Throwable 
	{
		String filepath ="./resources/prop.properties";
		FileInputStream file = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		String URL = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//create an object for LoginPage
		LoginPage loginpage = new LoginPage(driver);
		//using the reference call the getters and identify web elements
		loginpage.getUsernameTextField().sendKeys(username);
		loginpage.getPasswordTextField().sendKeys(password);
		loginpage.getLoginButton().click();
		driver.quit();

	}

}
