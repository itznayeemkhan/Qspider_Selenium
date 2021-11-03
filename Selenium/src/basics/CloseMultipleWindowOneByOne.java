package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMultipleWindowOneByOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> windowids = driver.getWindowHandles();
		for(String win : windowids)
			
		{
		  driver.switchTo().window(win);
		  driver.close();
		}
		

	}

}
