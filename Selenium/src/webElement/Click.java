package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://sports.ndtv.com/ipl-2021/csk-vs-kkr-ipl-2021-final-live-cricket-score-chennai-super-kings-vs-kolkata-knight-riders-2576560");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"subnav_hr\"]/ul/li[5]/a"
	  		+ "")).click();
	  Thread.sleep(5000);
	  driver.quit();
	  
	  
	}

}
