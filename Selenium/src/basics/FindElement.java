package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
           driver.manage().window().fullscreen();
           Thread.sleep(10000);
           driver.findElement( By.partialLinkText("Forgot your ")).click();
           
           
	}

}
