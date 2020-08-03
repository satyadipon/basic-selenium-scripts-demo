package tests;

import org.testng.annotations.Test;

import setup.TestSetup;

public class Test_A extends TestSetup{

	
	@Test
	public void test() {

		driver.get("https://www.google.com");
		
	}

}
