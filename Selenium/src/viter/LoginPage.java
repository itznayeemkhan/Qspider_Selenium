package viter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//*[@id=\"loginFormDiv\"]/form/div[3]/button")
	private WebElement loginButton;
	
	public void login(String username, String password)
	{
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.sendKeys(username);
		Thread.sleep(2000);
		
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys(password);
		Thread.sleep(2000);
		loginButton.click();
	}
	}
	

	}
}


