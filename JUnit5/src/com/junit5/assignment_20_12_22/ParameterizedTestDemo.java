package com.junit5.assignment_20_12_22;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(strings= {"1","2","three"})
	void withValueSource(String number)
	{
		assertNotNull(number);
	}
}
