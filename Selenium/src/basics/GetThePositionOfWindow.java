package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetThePositionOfWindow {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   Point get = driver.manage().window().getPosition();
		   System.out.println(get);
		   driver.quit();

	}

}
