package testNg;

import org.testng.annotations.Test;

public class TestCase11 {
	
	@Test()
	public void a1() throws Exception {
		System.out.println("hi");
		throw new Exception();
	}
		
		
	
	@Test(dependsOnMethods="a1")
	public void b2() {
		System.out.println("hello");
		
	}
	@Test(dependsOnMethods="b2")
	public void c2() {
		System.out.println("hello");
		
	}

}
