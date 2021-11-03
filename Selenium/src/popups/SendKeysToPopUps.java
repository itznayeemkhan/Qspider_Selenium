package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysToPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert.sendKeys("Nayeem khan");
		alert.accept();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
