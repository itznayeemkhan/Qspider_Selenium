package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutenticationUsingAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("https://the-internet.herokuapp.com/basic_auth");
		   Runtime.getRuntime().exec("./autoIT/Autentication.exe");
		  
		   
		   
		   
		   
		   
		   
		   

	}

}
