package de.basha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		calc = new Calculator();
	}
	
	/*Test for multiply two Integer Numbers*/
	@Test
	@DisplayName("Simple multiplication should work")
	public void testMultiply()
	{
		assertEquals(30, calc.multiply(5, 6),"Multiple with two nums should work");
	}
	
	/*Test for sum two Integer Numbers*/
	@Test
	@DisplayName("Simple Addition should work")
	public void testSum()
	{
		assertEquals(11, calc.sum(5, 6),"Sum two nums should work");
		assertEquals(51,calc.sum(34, 17),"Sum two nums should work");
		assertEquals(68,calc.sum(34, 34),"Sum two nums should work");
	}
	
	/*Test for sub two Integer Numbers*/
	@Test
	@DisplayName("Simple Subtraction should work")
	public void testSub()
	{
		assertEquals(4, calc.sub(10, 6),"Sub two nums should work");
	}
	
	/*Test for multiply two Integer Numbers*/
	@Test
	@DisplayName("Simple Divison should work")
	public void testDivision() throws Exception
	{
		assertEquals(2.5, calc.divide(15, 6),"Divided two nums should work");
	}
	
	@Test
	@DisplayName("Handling Multiplication with Zero")
	public void testMultiplyWithZero()
	{
		assertEquals(0,calc.multiply(0, 5), "Multiple with zero should be zero");
	}
	
	@Test
	public void testFail()
	{
		assertEquals(1,calc.sub(5, 4));
	}
}
