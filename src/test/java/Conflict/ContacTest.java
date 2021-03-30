package Conflict;

import org.testng.annotations.Test;

public class ContacTest {

/*	@Test(groups="smokeTest")
	public void createcontactTest() {
		System.out.println("create testi");

		System.out.println("go green");

		

		System.out.println("testing continuosly");
	}*/
	

	@Test(groups="smokeTest")
	public void create() {
		System.out.println("create testing1");
		//System.out.println("testing continuosly");
	}
	
	

	@Test(groups="smokeTest")
	public void Test() {
		System.out.println("create testing2");
	}
	
	@Test(groups="regressionTest")
	public void Modify() {
		//a=10;
		System.out.println("create testing3");
	}
	

	
	
}
