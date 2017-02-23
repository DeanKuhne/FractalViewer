package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Mandelbrot;

public class MandelbrotTest {

	@Test
	public void test() {
		Mandelbrot A = new Mandelbrot();
		assertEquals(255, A.escTimeMandelbrot(0.3207031250000001, -0.07109374999999386), 0.01);
	}
	@Test
	public void test2(){
		Mandelbrot A = new Mandelbrot();
		assertEquals(1, A.escTimeMandelbrot(0.5946289062500001, 1.2949218750000122), 0.01);
	}
}
