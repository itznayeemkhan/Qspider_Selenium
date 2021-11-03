package webDriverMethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods 
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.get("https://www.flipkart.com");
	     driver.get("https://www.amazon.com");
	     Navigation navigation = driver.navigate();
	     navigation.back();
	     navigation.refresh();
	     navigation.back();
	     navigation.refresh();
	     navigation.forward();
	     navigation.refresh();
	     navigation.forward();
	     navigation.refresh();
	     driver.quit();
	     
  }

}
