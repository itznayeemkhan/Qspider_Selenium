package demoActiTimePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassTheDataFromTestNgFile {
	@Parameters({"username","password"})
	@Test
	public void qsp(String Username,String Password) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys(Username);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.id("LoginButton")).click();
	driver.findElement(By.id("LogoutLink")).click();
    driver.quit();
	
	}

}
