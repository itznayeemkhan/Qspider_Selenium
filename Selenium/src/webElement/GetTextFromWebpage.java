package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().fullscreen();
		   System.out.println(driver.findElement(By.id("headerContainer")).getText());
		   driver.quit();
	}

}
