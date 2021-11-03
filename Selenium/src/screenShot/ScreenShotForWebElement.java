package screenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotForWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().fullscreen();
		File tempFile = driver.findElement(By.xpath("//div[@class='bot_column']")).getScreenshotAs(OutputType.FILE);

		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/" + timeStamp + "webElement.png");
		tempFile.renameTo(destFile);
		driver.quit();

	}

}
