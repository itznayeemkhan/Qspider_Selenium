package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectTodaysDate {

	public static void main(String[] args) throws InterruptedException {
	        LocalDateTime time = LocalDateTime.now();
	        
	       String month = time.getMonth().name();
	         String editedmonth = month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
	       int date = time.getDayOfMonth();
	       String day = time.getDayOfWeek().name();
	       String editedday = day.substring(0,1).toUpperCase()+day.substring(1,3).toLowerCase();
	      int year = time.getYear();
	        String tommorowDate = editedday+" "+editedmonth+" "+date+" "+year;
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			//100,61
			Actions action = new Actions(driver);
			action.moveByOffset(100, 61).click();
			driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
			driver.findElement(By.xpath("//div[@aria-label='"+tommorowDate+"']")).click();
			Thread.sleep(5000);
			driver.quit();

	}
	}

