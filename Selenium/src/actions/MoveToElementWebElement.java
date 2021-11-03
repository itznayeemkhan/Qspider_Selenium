package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().fullscreen();
		WebElement text = driver.findElement(By.linkText("WOMEN"));
		Actions action = new Actions(driver);
		action.moveToElement(text).perform();
		Thread.sleep(4000);
		driver.quit();
	}
}
