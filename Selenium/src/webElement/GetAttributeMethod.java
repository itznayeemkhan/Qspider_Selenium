package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedTollTip = "Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.manage().window().fullscreen();
		   String actualToolTip = driver.findElement(By.name("remember")).getAttribute("title");
		   System.out.println(actualToolTip);
		   if(expectedTollTip .equals (actualToolTip)) {
			   System.out.println("passed");
		   }
		   else
			   System.out.println("failed");
		   Thread.sleep(3000);
		   
		   driver.quit();

	}

}
