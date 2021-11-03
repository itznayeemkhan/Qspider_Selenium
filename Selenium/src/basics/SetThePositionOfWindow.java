package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetThePositionOfWindow {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   Point point = new Point(1000,5);
		   driver.manage().window().setPosition(point);
		   driver.quit();

	}

}
