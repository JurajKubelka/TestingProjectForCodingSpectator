package cl.uchile.dcc.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorial0() {
		assertEquals(1, Factorial.factorial(0));
	}

	@Test
	public void testFactorial1() {
		assertEquals(1, Factorial.factorial(1));
	}

	@Test
	public void testFactorial2() {
		assertEquals(2, Factorial.factorial(2));
	}

	@Test
	public void testFactorial3() {
		assertEquals(6, Factorial.factorial(3));
	}

	@Test
	public void testFactorial4() {
		assertEquals(24, Factorial.factorial(4));
	}
	
}
