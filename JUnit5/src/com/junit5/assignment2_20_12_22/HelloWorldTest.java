package com.junit5.assignment2_20_12_22;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest 
{
	@Test
	public void testSay()
	{
		HelloWorld hello = new HelloWorld();
		assertEquals("Unexpected Result", "Hello World!",hello.say());
	}
}
