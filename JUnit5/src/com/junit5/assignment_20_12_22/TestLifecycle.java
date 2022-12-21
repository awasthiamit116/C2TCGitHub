package com.junit5.assignment_20_12_22;

import org.junit.jupiter.api.Test;

public class TestLifecycle implements TestLifecycleLogger
{
	@Test
	public void test()
	{
		System.out.println("First test case");
	}
	
}
