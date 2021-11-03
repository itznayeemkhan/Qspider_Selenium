package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[5]/div[3]/div/div[2]/p[2]/a")).click();
		Runtime.getRuntime().exec("./autoIT/FileDownload.exe");

		
	}

}
