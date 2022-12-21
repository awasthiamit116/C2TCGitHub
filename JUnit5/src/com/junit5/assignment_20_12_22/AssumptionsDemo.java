package com.junit5.assignment_20_12_22;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo 
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
		Assumptions.assumeTrue("Dev".equals(System.getProperty("ENV")),AssumptionsDemo::message);
	
	}
	
	private static String message()
	{
		return "TEST execution failed :: ";
	}
	
}
