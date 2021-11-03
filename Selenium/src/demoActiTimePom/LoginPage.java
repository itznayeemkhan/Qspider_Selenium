package demoActiTimePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//element identification using @findby
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	/*
	 * @FindBy(xpath = "//td[@id=\"headerContainer\"]") private WebElement
	 * headerContainer;
	 */
	
	//designed getters and setters to access private elements outside the class
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	public void login()
	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
		loginButton.click();
	}
	
	public void login(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}
