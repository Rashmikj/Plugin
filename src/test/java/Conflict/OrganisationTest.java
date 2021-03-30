package Conflict;

import org.testng.annotations.Test;

public class OrganisationTest {

	@Test(groups="smokeTest")
	public void Test() {
		System.out.println("create testing4");
	}
	
	@Test(groups="regressionTest")
	public void Modify() {
		//a=10;
		System.out.println("create testing5");
	}
	
}
