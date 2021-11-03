package demoActiTimePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	@FindBy(id="headerContainer")
	private WebElement PleaseIdentifyYourSelf;
	
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

	public WebElement getPleaseIdentifyYourSelf() {
		return PleaseIdentifyYourSelf;
	}

	public void setPleaseIdentifyYourSelf(WebElement pleaseIdentifyYourSelf) {
		PleaseIdentifyYourSelf = pleaseIdentifyYourSelf;
	}

	public WebElement getAtproductname() {
		return atproductname;
	}

	public void setAtproductname(WebElement atproductname) {
		this.atproductname = atproductname;
	}

	public WebElement getKeepligged() {
		return keepligged;
	}

	public void setKeepligged(WebElement keepligged) {
		this.keepligged = keepligged;
	}

	public WebElement getKeeplogin() {
		return keeplogin;
	}

	public void setKeeplogin(WebElement keeplogin) {
		this.keeplogin = keeplogin;
	}

	public WebElement getPasswordrecovery() {
		return passwordrecovery;
	}

	public void setPasswordrecovery(WebElement passwordrecovery) {
		this.passwordrecovery = passwordrecovery;
	}

	public WebElement getActitime() {
		return actitime;
	}

	public void setActitime(WebElement actitime) {
		this.actitime = actitime;
	}

	public WebElement getActitimeinc() {
		return actitimeinc;
	}

	public void setActitimeinc(WebElement actitimeinc) {
		this.actitimeinc = actitimeinc;
	}
	@FindBy(className="atProductName")
	private WebElement atproductname;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepligged;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement keeplogin;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement passwordrecovery;
	
	@FindBy(xpath="//nobr[text()='actiTIME 2020 Online']")
	private WebElement actitime;
	
	@FindBy(xpath="//a[text()='actiTIME Inc.']")
	private WebElement actitimeinc;
	

}
