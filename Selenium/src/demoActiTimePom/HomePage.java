package demoActiTimePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id='container_tt']']")
	private WebElement timeTrack;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement users;
	
	
	@FindBy(id="logoutLink")
	private WebElement logout;


	public WebElement getTimeTrack() {
		return timeTrack;
	}


	public void setTimeTrack(WebElement timeTrack) {
		this.timeTrack = timeTrack;
	}


	public WebElement getTasks() {
		return tasks;
	}


	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}


	public WebElement getReports() {
		return reports;
	}


	public void setReports(WebElement reports) {
		this.reports = reports;
	}


	public WebElement getUsers() {
		return users;
	}


	public void setUsers(WebElement users) {
		this.users = users;
	}


	public WebElement getLogout() {
		return logout;
	}


	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
}
