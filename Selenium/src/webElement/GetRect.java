package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().fullscreen();
		Rectangle usernameTextField = driver.findElement(By.id("username")).getRect();
		int height = usernameTextField.getHeight();
		int width = usernameTextField.getWidth();
		int startX = usernameTextField.getX();
		int startY = usernameTextField.getY();
		System.out.println(height);
		System.out.println(width);
		System.out.println(startX);
		System.out.println(startY);

	}

}
