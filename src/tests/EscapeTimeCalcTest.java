package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.EscapeTimeAlgorithm;

public class EscapeTimeCalcTest {
	EscapeTimeAlgorithm frac = new EscapeTimeAlgorithm();

	@Test
	public void testRowToX() {
		// Translate a pixel's row to the associated x-coordinate in the fractal
		// (1 test per fractal) [4 * 5 points = 20 points]

		// method getxVal takes in the row number, and the choice as to which
		// fractal you want
		assertEquals(250, frac.getxVal(250, 1), .01);// mandelbrot
		assertEquals(250, frac.getxVal(250, 2), .01);// julia
		assertEquals(250, frac.getxVal(250, 3), .01);// burning ship
		assertEquals(250, frac.getxVal(250, 4), .01);// multibrot

	}

	@Test
	public void testColToY() {
		// Translate a pixel's column to the associated y-coordinate in the
		// fractal (1 test per fractal) [4 * 5 points = 20 points]

		// method getyVal takes in the column number, and the choice as to which
		// fractal you want
		assertEquals(250, frac.getyVal(250, 1), .01);// mandelbrot
		assertEquals(250, frac.getyVal(250, 2), .01);// julia
		assertEquals(250, frac.getyVal(250, 3), .01);// burning ship
		assertEquals(250, frac.getyVal(250, 4), .01);// multibrot

	}

	@Test
	public void testNeverEscDist() {
		// Calculates the escape time for a coordinate whose distance from the
		// origin never exceeds the escape distance [4 * 6 points = 24 points]
		assertEquals(255, frac.escTimeCoords(0.3207031250000001, -0.07109374999999386, 1), .01);// mandelbrot
		assertEquals(255, frac.escTimeCoords(1.0492187499999897, -0.234375, 2), .01);// julia
		assertEquals(255, frac.escTimeCoords(-1.7443359374999874, -0.017451171875000338, 3), .01);// burning
		assertEquals(255, frac.escTimeCoords(0.5859375, 0.24375000000000108, 4), .01);// multibrot

	}

	@Test
	public void testEscDistOne() {
		// Calculates the escape time for a coordinate whose distance from the
		// origin exceeds the escape distance after a single loop pass [3 * 6
		// points = 18 points]
		assertEquals(2, frac.escTimeCoords(0.5946289062500001, 1.2949218750000122, 1), .01);// mandelbrot
		assertEquals(2, frac.escTimeCoords(1.6933593749999853, 0.9765625, 2), .01);// julia
		assertEquals(2, frac.escTimeCoords(0.9921875, 1.05625, 4), .01);// multibrot

	}

	@Test
	public void testBurnShipEscDist() {
		// Calculates that none of the pixels in the Burning Ship set have an
		// escape time of 0 or 1 [8 points]
		int[][] array = EscapeTimeAlgorithm.escTimeCalculator(512, 512, 4, 255, 3);
		for (int row = 0; row < 512; row++) {
			for (int col = 0; col < 512; col++) {
				assertTrue(array[row][col] != 0 && array[row][col] != 1);
			}
		}

	}

	@Test
	public void testArraySize() {
		// The method called to calculate the fractal returns a 2-d array with
		// 512 rows and 512 columns (1 test per fractal) [4 * 2 points = 8
		// points]
		int[][] mand = EscapeTimeAlgorithm.escTimeCalculator(512, 512, 4, 255, 1);
		assertEquals(mand.length == 512 && mand[0].length == 512, .01);
		int[][] juli = EscapeTimeAlgorithm.escTimeCalculator(512, 512, 4, 255, 2);
		assertEquals(juli.length == 512 && juli[0].length == 512, .01);
		int[][] burn = EscapeTimeAlgorithm.escTimeCalculator(512, 512, 4, 255, 3);
		assertEquals(burn.length == 512 && burn[0].length == 512, .01);
		int[][] mult = EscapeTimeAlgorithm.escTimeCalculator(512, 512, 4, 255, 4);
		assertEquals(mult.length == 512 && mult[0].length == 512, .01);

	}
}
