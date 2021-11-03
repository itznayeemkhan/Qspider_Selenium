package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.navigate().to("http://www.flipkart.com");
	     driver.quit();

	}

}
