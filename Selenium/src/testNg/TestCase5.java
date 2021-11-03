package testNg;

import org.testng.annotations.Test;
// we can give priority to testCases
// default priority is zero
//lowest priority will execute first,if priority is not given execution is in alphabetical order
//we can give negative priority

public class TestCase5 {
	@Test(priority= 1)
	public void a1() {
		System.out.println("ali");
		
	}
	@Test(priority=-1)
	public void b1() {
		System.out.println("usman");
		
	}
	@Test(priority=-2)
	
	public void c1() {
		System.out.println("nayeem");
		
	}

}
