package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().fullscreen();
		boolean flag = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		if(flag) {
			System.out.println("is enabled");
		}
		else {
			System.out.println("its disabled");
		}
driver.quit();
	}

}
