package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAndIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().fullscreen();
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		Thread.sleep(4000);
		boolean flag1 = checkbox.isDisplayed();
		boolean flag2 = checkbox.isSelected();
		if (flag1 && flag2) {
			System.out.println("test case passed");
		}

		driver.quit();

	}
}