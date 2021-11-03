package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementWebElementXoffsetYoffset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");
		driver.manage().window().fullscreen();
		WebElement text = driver.findElement(By.id("rating1"));
		Actions action = new Actions(driver);
		action.moveToElement(text, 210, 0).click().perform();
		Thread.sleep(4000);
		driver.quit();
	}

}
