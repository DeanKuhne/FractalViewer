package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Julia;

public class JuliaTest {

	@Test
	public void test() {
		Julia A = new Julia();
		assertEquals(255, A.escTimeJulia(1.0492187499999897, -0.234375), 0.01);
	}
	@Test
	public void test2() {
		Julia A = new Julia();
		assertEquals(2, A.escTimeJulia(1.6933593749999853, 0.9765625), 0.01);
	}
}