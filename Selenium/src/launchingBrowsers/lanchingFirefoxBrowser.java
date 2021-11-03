package launchingBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;


public class lanchingFirefoxBrowser {

	public static void main(String[] args) {
			 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		     FirefoxDriver driver = new FirefoxDriver();
		     String expectedTitle = "Selenium"; // test data 
		      driver.get("https://www.selenium.dev/");
		      // invalid argument EXeception if not given fully qualified path
		    String actualTitle =   driver.getTitle();
		    // print the title
		    System.out.println(actualTitle);
		    // verification and validation
		    if(expectedTitle.equals(actualTitle)) {
		    	System.out.println("test case passed ");
		    } else {
		    		System.out.print("test case failed");
		    }
		  
		    driver.quit(); // close the window of the server

		}

	}

