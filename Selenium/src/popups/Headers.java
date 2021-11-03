package popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.marimallappawomenscollege.org/index.php?current=home");
		driver.manage().window().maximize();
		 List<WebElement> list = driver.findElements(By.xpath("//div[@id='chromemenu']/ul[@style='padding:12px 0 0 12px;']/li"));
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		

	}

}
