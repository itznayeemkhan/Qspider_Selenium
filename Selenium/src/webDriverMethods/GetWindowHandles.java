package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.naukri.com");
		   Set<String> windowid = driver.getWindowHandles();
		   for(String ids:windowid) {
			   System.out.println(ids);
		   }
		   driver.quit();


	}

}
