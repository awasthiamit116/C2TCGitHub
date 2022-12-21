package com.junit5.assignment2_20_12_22;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingTest 
{
	@Test
	public void testGreet()
	{
		Greeting greeting = new Greeting();
		assertEquals("Unexpected results", "Welcome To Java",greeting.greet());

	}
}
