package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreenWindow {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.FLIPKART.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     driver.manage().window().fullscreen();
	     Thread.sleep(3000);
	     driver.quit();
	     
	    
	    

	}

}
