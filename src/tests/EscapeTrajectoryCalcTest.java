package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.EscapeTrajectoryCalc;
import code.coordCalc;

public class EscapeTrajectoryCalcTest {

	@Test
	public void testRowToX() {
		// Translate a pixel's row to the associated x-coordinate in the fractal
		// (1 test per fractal) [4 * 5 points = 20 points]

	}

	@Test
	public void testColToY() {
		// Translate a pixel's column to the associated y-coordinate in the
		// fractal (1 test per fractal) [4 * 5 points = 20 points]

	}

	@Test
	public void testNeverEscDist() {
		// Calculates the escape time for a coordinate whose distance from the
		// origin never exceeds the escape distance [4 * 6 points = 24 points]

	}

	@Test
	public void testEscDistOne() {
		coordCalc frac = new coordCalc();
		// Calculates the escape time for a coordinate whose distance from the
		// origin exceeds the escape distance after a single loop pass [3 * 6
		// points = 18 points]
		assertEquals(255, frac.escTimeCoords(0.5946289062500001, 1.2949218750000122, 1), .01);// mandelbrot
		assertEquals(255, frac.escTimeCoords(1.6933593749999853, 0.9765625, 2), .01);// julia
		assertEquals(255, frac.escTimeCoords(0.9921875, 1.05625, 4), .01);// multibrot

	}

	@Test
	public void testBurnShipEscDist() {
		// Calculates that none of the pixels in the Burning Ship set have an
		// escape time of 0 or 1 [8 points]

	}

	@Test
	public void testArraySize() {
		// The method called to calculate the fractal returns a 2-d array with
		// 512 rows and 512 columns (1 test per fractal) [4 * 2 points = 8
		// points]

	}
}
