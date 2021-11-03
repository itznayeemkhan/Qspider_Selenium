package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		WebElement source1 = driver.findElement(By.id("box3"));
		WebElement destinaton1 = driver.findElement(By.id("box103"));
		WebElement source2 = driver.findElement(By.id("box6"));
		WebElement destinaton2 = driver.findElement(By.id("box106"));
		WebElement source3 = driver.findElement(By.id("box7"));
		WebElement destinaton3 = driver.findElement(By.id("box107"));
		WebElement source4 = driver.findElement(By.id("box5"));
		WebElement destinaton4 = driver.findElement(By.id("box105"));
		WebElement source5 = driver.findElement(By.id("box1"));
		WebElement destinaton5 = driver.findElement(By.id("box101"));
		WebElement source6 = driver.findElement(By.id("box4"));
		WebElement destinaton6 = driver.findElement(By.id("box104"));
		WebElement source7 = driver.findElement(By.id("box2"));
		WebElement destinaton7 = driver.findElement(By.id("box102"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, destinaton1).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source2, destinaton2).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source3, destinaton3).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source4, destinaton4).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source5, destinaton5).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source6, destinaton6).perform();
		Thread.sleep(3000);
		action.dragAndDrop(source7, destinaton7).perform();
		Thread.sleep(3000);
		driver.quit();
	
		
		
		

	}

}
