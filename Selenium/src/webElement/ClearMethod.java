package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().fullscreen();
		   driver.findElement(By.id("username")).sendKeys("khan");
		   Thread.sleep(3000);
		   driver.findElement(By.id("username")).clear();
		   Thread.sleep(3000);
		   driver.findElement(By.id("username")).sendKeys("something");
		   Thread.sleep(3000);
		   driver.findElement(By.id("username")).clear();
		   driver.quit();
		   
		   
		   

	}

}
