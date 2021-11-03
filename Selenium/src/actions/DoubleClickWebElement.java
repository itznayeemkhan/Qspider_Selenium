package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickWebElement {

	public static void main(String[] args) throws InterruptedException {
		int i;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=cucumber");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement plusIcon = driver.findElement(By.id("add"));
		Actions action = new Actions(driver);
		for(i=0;i<50;i++) {
			

		action.doubleClick(plusIcon).perform();
		Thread.sleep(1000);
		}
		Thread.sleep(4000);
		driver.quit();

	}

}
