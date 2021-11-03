package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("./autoIT/FileUpload.exe");
		Thread.sleep(5000);
	

	}

}
