package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnotherUrl {

	public static void main(String[] args) throws MalformedURLException  {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.selenium.dev");
	     URL url= new URL("https://flipkart.com");
	     driver.navigate().to(url);
	     driver.quit();

	}

}
