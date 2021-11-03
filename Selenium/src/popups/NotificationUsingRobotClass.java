package popups;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationUsingRobotClass {

	public static void main(String[] args, Object KeyEvent) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("https://www.yatra.com");
		   Thread.sleep(2000);
		   Robot robot = new Robot();
		  
		   

	}

}
