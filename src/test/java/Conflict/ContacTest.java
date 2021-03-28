package Conflict;

import org.testng.annotations.Test;

public class ContacTest {

	@Test(groups="smoke")
	public void createcontactTest() {
		System.out.println("create testi");

		System.out.println("go green");

		

		System.out.println("testing continuosly");
	}
	

	@Test(groups="smoke")
	public void LoginTest() {
		System.out.println("create testin");
		System.out.println("testing continuosly");
	}
	
	

	@Test(groups="smoke")
	public void Test() {
		System.out.println("create testing");
	}
	
	@Test(groups="regression")
	public void Modify() {
		//a=10;
		System.out.println("modification");
	}
	

	
	
}
