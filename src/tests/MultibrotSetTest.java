package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.MultibrotSet;

public class MultibrotSetTest {

	@Test
	public void test() {
		MultibrotSet A = new MultibrotSet();
		assertEquals(255, A.escTimeMultibro(0.5859375, 0.24375000000000108), 0.01);
	}
	@Test
	public void test2(){
		MultibrotSet A = new MultibrotSet();
		assertEquals(1, A.escTimeMultibro(0.9921875, 1.05625), 0.01);
	}
}