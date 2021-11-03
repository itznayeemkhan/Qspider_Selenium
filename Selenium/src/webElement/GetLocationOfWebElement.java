package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().fullscreen();
		WebElement usernameTextField = driver.findElement(By.id("username"));
		int startX = usernameTextField.getLocation().getX();
		int startY = usernameTextField.getLocation().getY();
		System.out.println("this is the x value " + startX);
		System.out.println("this is the y value " + startY);
		driver.quit();
		

	}

}
