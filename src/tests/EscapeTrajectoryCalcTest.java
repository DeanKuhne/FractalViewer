package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.EscapeTrajectoryCalc;

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
		// Calculates the escape time for a coordinate whose distance from the
		// origin exceeds the escape distance after a single loop pass [3 * 6
		// points = 18 points]

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
