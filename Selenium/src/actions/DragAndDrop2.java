package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#photo%20Manager");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloader']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//img[@alt='On top of kozi kopka']"));
		WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		Thread.sleep(3000);
		driver.quit();

	}
	

}
