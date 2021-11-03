package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindow {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  Dimension dimension = new Dimension(500,600);
		  driver.manage().window().setSize(dimension);
		  driver.quit();
	}

}

