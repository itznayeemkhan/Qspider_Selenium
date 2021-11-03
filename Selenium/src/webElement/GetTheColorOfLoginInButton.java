package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheColorOfLoginInButton {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  driver.manage().window().fullscreen();
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).
		  getCssValue("border-top-color"));
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).
		  getCssValue("font-family")); 
		  driver.quit();
		 }

}
