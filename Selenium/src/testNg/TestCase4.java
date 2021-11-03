package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//
public class TestCase4 {
 @Test(timeOut=2000)
 public void demo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.quit();

	}




		}


