package webElement;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().fullscreen();
		String name = driver.findElement(By.id("username")).getTagName();
		System.out.println(name);
		driver.quit();

	}

}
