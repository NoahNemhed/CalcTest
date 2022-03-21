package com.example.demo3;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {
	Calculator calculator;
	
	@Test
	void contextLoads() {
	}
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3), "2 + 3 must be 5.");
		assertEquals(1, calculator.add(-2, 3), "-2 + 3 must be 1.");
	}
	
	@Test
	void testAddFail() {
		assertNotEquals(6, calculator.add(2, 3), "2 + 3 should not be 6.");
		assertNotEquals(7, calculator.add(-2, 3), "-2 + 3 should not be 7");
	}

	@Test
	void testMultiply() {
		assertEquals(20, calculator.multiply(5, 4), "5 * 4 must be 20.");
		assertEquals(0, calculator.multiply(5, 0), "5 * 0 must be 0.");
	}
	
	@Test
	void testMultiplyFail() {
		assertNotEquals(30, calculator.multiply(5, 4), "5 * 4 should not be 30");
		assertNotEquals(5, calculator.multiply(5, 0), "5 * 0 should not be 1");
	}
	
	@Test
	void testSub() {
		assertEquals(10, calculator.subtract(12, 2), "12 - 2 must be 10.");
		assertEquals(-2, calculator.subtract(2, 4), "2 - 4 must be -2.");
	}
	
	@Test
	void testSubFail() {
		assertNotEquals(11, calculator.subtract(12, 2), "12 - 2 should not be 11.");
		assertNotEquals(-3, calculator.subtract(2, 4), "2 - 4 should not be -3.");
	}	
	
}
