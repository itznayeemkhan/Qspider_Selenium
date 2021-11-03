package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   String windowid = driver.getWindowHandle();
		   System.out.println(windowid);
		   driver.quit();

	}

}
