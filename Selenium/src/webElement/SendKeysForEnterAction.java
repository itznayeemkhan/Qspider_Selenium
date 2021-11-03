package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForEnterAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().fullscreen();
		   driver.findElement(By.id("username")).sendKeys("admin");
		   WebElement password = driver.findElement(By.name("pwd"));
		   password.sendKeys("manager");
		   password.sendKeys(Keys.ENTER);
		   Thread.sleep(5000);
		   driver.quit();

	}

}
