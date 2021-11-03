package viter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demoActiTimePom.LoginPage;

public class TestCase {

	public static void main(String[] args) throws Throwable {
		String filepath ="./resources/viger.properties";
		FileInputStream file = new FileInputStream(filepath);
		Properties properties = new Properties();
		properties.load(file);
		String URL = properties.getProperty("URL");
		String username = properties.getProperty("USERNAME");
		String password = properties.getProperty("PASSWORD");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
		Thread.sleep(3000);
		//create an object for LoginPage
		LoginPage loginpage = new LoginPage(driver);
		//using the reference call the getters and identify web elements
		loginpage.login(username,password);
		Thread.sleep(3000);
		driver.quit();

	}

}
