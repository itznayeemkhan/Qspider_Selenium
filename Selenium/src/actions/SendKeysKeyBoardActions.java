package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
			for (int j=0;j<10;j++) {
		for(int i= 0;i<10;i++) {
		action.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(1000);

	}
		for(int k=0;k<10;k++)
		{
			action.sendKeys(Keys.PAGE_UP).perform();
			 Thread.sleep(1000);
		}
		}
		
		driver.quit();

}
}

