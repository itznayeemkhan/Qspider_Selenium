package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.xpath("//*[@id=\"contacts-form\"]/fieldset/div[5]/input")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("Nayeem khan");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Itznayeemkhan@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("8553988920");
		Thread.sleep(3000);
		driver.findElement(By.name("message")).sendKeys(" do contact me ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contacts-form\"]/fieldset/div[5]/input")).click();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/a")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
