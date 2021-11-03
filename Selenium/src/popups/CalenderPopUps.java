package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUps {

	public static void main(String[] args) {
		// //div[@aria-label='Fri Oct 22 2021']
//div[@class='fsw_inputBox dates inactiveWidget ']
		String date="Sun Oct 24 2021";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//100,61
		Actions action = new Actions(driver);
		action.moveByOffset(100, 61).click();
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
		driver.quit();
		
		
		
	}

}
