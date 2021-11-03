package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfTheWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().fullscreen();
	         Dimension dimensions = driver.findElement(By.id("username")).getSize();
	       int heightDimension = dimensions.getHeight();
	       int widthDimension = dimensions.getWidth();
	       System.out.println(heightDimension);
	       System.out.println(widthDimension);
			
		   driver.quit();

	}

}
