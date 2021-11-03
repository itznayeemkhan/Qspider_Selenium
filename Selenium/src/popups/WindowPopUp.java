package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("https://www.yatra.com");
		   Robot robot= new Robot();
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_P);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyRelease(KeyEvent.VK_P);
		   Thread.sleep(2000);
		   robot.Press(KeyEvent.VK_Enter);
		   robot.Release(KeyEvent.VK_Enter);

	}

}
