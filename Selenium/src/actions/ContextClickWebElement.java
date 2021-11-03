package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		 WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightClickButton).perform();
		Thread.sleep(4000);
		driver.quit();

	}

}
