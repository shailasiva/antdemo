package com.pac;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoB {

	
	@Test
	public void testB()
	{
		Reporter.log("Test B", true);
		Assert.fail();
	}

}
