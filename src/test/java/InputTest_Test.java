package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import InputTest.InputTest;

public class InputTest_Test {

	//If incorrect
	@Test
	public void Test() {
		assertFalse(InputTest.test("Hi"));
	}
	
	//If correct
		@Test
		public void Test1() {
			assertTrue(InputTest.test("Hello"));
		}

}
