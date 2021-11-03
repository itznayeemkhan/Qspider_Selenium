package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Login")).click();
        
        
        

	}

}
