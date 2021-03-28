package Conflict;

import org.testng.annotations.Test;

public class OrganisationTest {

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
