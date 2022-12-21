package com.junit5.assignment_20_12_22;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicTests 
{
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList(
				dynamicTest("simple dynamic tests",()->assertTrue(true)),
				dynamicTest("My executable class",new MyExecutable()),
				dynamicTest("Exception Executable",()->{throw new Exception("Exception Example");}),
				dynamicTest("simple dynamic tests - 2",()->assertTrue(true))
				
				
				);
	}
}

class MyExecutable implements Executable
{
	public void execute() throws Throwable
	{
		System.out.println("Hello World");
	}
}