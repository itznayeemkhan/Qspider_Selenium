package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicHandling {

	public static void main(String[] args) throws InterruptedException {
		String actualTitle = "Life Insurance Corporation of India";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://licindia.in/Home/Policy-Loan-Options");
		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div/div[1]/p[1]/a[1]/b")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Set<String> list = driver.getWindowHandles();
		for(String ele:list)
		{
		driver.switchTo().window(ele);
		String expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(driver.getTitle());
		}
		else
		{
			System.out.println("failed");
		}
		}
		driver.quit();
		
	

	}

}