package screenShot;

import java.io.File;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotOfTheWebpage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().fullscreen();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);

		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/" + timeStamp + "webpage.png");
		tempFile.renameTo(destFile);
		driver.quit();
	}

}
