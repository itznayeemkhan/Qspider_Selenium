package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropJquery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement box = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(box,200,50).perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println(text);
		driver.quit();

	}

}
