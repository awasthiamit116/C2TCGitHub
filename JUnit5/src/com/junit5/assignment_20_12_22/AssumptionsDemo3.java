package com.junit5.assignment_20_12_22;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo3 
{
	@Test
	void testOnDev()
	{
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("Dev".equals(System.getProperty("ENV")));
	
	}
	
	
	@Test
	void testOnProd()
	{
		System.setProperty("ENV", "PROD");
		Assumptions.assumingThat("Dev".equals(System.getProperty("ENV")),AssumptionsDemo3::message);
	
	}
	
	private static String message()
	{
		return "TEST execution failed :: ";
	}
	
}
