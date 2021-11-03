package testNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//execute same test case multiple times using invocation count
//threadPoolSize will help you to run same test case multiple threads

public class TestCase3 {
	@Test(invocationCount = 6,threadPoolSize=3,description="hello")
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		List<WebElement> navBar = driver
				.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2']/li"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		for(WebElement ele:navBar) {
			action.click(ele);
		}
		action.keyUp(Keys.CONTROL);
		action.perform();
		

	}



		}



