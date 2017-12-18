package com.nhauser;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSummeZweiPositiv() {
		Calculator cal = new Calculator();
		int result = cal.addition(1, 2);
		
		assertEquals(3, result);
	}

	@Test
	public void testSummeZweiNegativ() {
		Calculator cal = new Calculator();
		int result = cal.addition(-2, -3);
		
		assertEquals(-5, result);
	}

	@Test
	public void testSummeZweiNull() {
		Calculator cal = new Calculator();
		int result = cal.addition(0, 0);
		
		assertEquals(0, result);
	}

}
