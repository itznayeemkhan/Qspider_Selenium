package demoActiTimePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//create an object for LoginPage
		LoginPage loginpage = new LoginPage(driver);
		//using the reference call the getters and identify web elements
		loginpage.getUsernameTextField().sendKeys("admin");
		loginpage.getPasswordTextField().sendKeys("manager");
		loginpage.getLoginButton().click();
		driver.quit();

	}

}
