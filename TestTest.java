package com.example.demo2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Spy;

public class TestTest {
	@Spy
	static 
	com.example.demo2.Test test;

	
	@BeforeClass
	public static void setUpBeforeClass(){
		test = new com.example.demo2.Test();
	}
	@Test
	public void test() {
		test.setTestName("ORI");
		assertEquals("test name expected = ", "ORI", test.getTestName());
	}
}
