package com.junit5.assignment_20_12_22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledDemo 
{
	@Disabled
	@Test
	public void simple()
	{
		int result =1;
		int expected = 1;
		assertEquals(result, expected);
	}

	@Test
	public void simple1()
	{
		int result =1;
		int expected = 1;
		assertEquals(result, expected);
	}
	
	@Test
	public void simple2()
	{
		int result =1;
		int expected = 1;
		assertEquals(result, expected);
	}

}
