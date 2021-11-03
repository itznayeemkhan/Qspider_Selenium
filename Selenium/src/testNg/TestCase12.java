package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demoActiTimePom.LoginPage;

public class TestCase12 {
	@DataProvider(name="Credentials")
	public String [][] getData(){
		String [][] arr = {{"admin","manager"},{"trainer","trainer"}};
		return arr;

	@Test(dataProvider ="Credentials")
	public void LoginDemo(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name(username)).sendKeys(admin);
		driver.findElement(By.name(username)).sendKeys(manager);
		driver.findElement(By.id(username)).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
	}

}
