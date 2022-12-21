package com.junit5.assignment_20_12_22;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifecycleLogger2 
{
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all tests");
	}
	
	@AfterAll
	default void afterAllTests()
	{
		System.out.println("After all tests");
	}
	
}
