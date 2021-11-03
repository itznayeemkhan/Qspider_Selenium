package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().fullscreen();
		   driver.findElement(By.name("login")).submit();

	}

}
