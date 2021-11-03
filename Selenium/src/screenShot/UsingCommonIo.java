package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCommonIo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().fullscreen();
		File tempFile = driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getScreenshotAs(OutputType.FILE);

		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/" + timeStamp + "webElement.png");
		
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();


	}

}
