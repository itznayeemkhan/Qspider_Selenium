package launchingBrowsers;
// Launching on Internet explorer
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LanuchingIeBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	     InternetExplorerDriver driver = new InternetExplorerDriver();
	     driver.quit();
     

	}

}
