package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();

	}

}
