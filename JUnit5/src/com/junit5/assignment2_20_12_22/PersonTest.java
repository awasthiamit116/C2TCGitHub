package com.junit5.assignment2_20_12_22;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest 
{
	@Test
	public void GetFullName()
	{
		System.out.println("from TestPerson1");
		Person per = new Person("Robert", "King");
		assertEquals("Robert King", per.getFullName());
	}
	
	@Test
	public void NullsInName()
	{
		System.out.println("from TestPerson1");
		Person per1 = new Person("Robert", "King");
		assertNotNull("Full name null", per1.getFullName());
		assertNotNull("Full name null", per1.getFirstName());
	
		Person per2 = new Person("Robert", "King");
		assertEquals("Robert King", per2.getFullName());
	}
	
	
	@Test
	public void GetFirstName()
	{
		Person p = new Person("Robert", "King");
		assertEquals(p.getFirstName(), "Robert");
	}
	
	@Test
	public void testGetLastName()
	{
		Person p = new Person("Robert", "King");
		assertEquals(p.getLastName(), "King");
	}
	
	
}
