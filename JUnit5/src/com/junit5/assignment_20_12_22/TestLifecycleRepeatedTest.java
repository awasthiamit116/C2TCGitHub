package com.junit5.assignment_20_12_22;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestLifecycleRepeatedTest implements TestLifecycleLogger2
{
	@Test
	@RepeatedTest(10)
	public void test()
	{
		System.out.println("First test case");
	}
	
}
