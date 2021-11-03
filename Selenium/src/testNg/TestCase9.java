package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
//add  the comments to report and print it in console
public class TestCase9 {
	@Test
	public void login() {
		System.out.println("test case");
		Reporter.log("its reporter class");
		Reporter.log("test case is:001",true);
		
	}

}
