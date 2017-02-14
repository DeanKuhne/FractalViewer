package code;

public class EscapeTrajectoryCalc {
	// Set xCalc = current point's x-coordinate
	// Set yCalc = current point's y-coordinate
	// Set dist = distance from the point (xCalc, yCalc) to (0,0) using the
	// Pythagorean theorem
	// Set passes = 0
	// While dist <_ 4 and passes < 255 do
	// Update xCaly and yCalc equal using the update function defined for
	// the fractal being generated
	// Increase passes by 1
	// Set dist distance from the point (xCalc, yCalc) to (0,0) using the
	// Pythagorean theorem
	// EndWhile
	// Set the current point's escape-time equal to passes

	// For this first phase, you will need to split the ranges into 512
	// equally-spaced rows and 512 equally-spaced columns. To generate the
	// entire fractal, you simply calculate the escape-time for each of
	// these 262144 coordinate pairs. (The number 262144 is equal to 512 *
	// 512 or the number of row & column combination). The final fractal
	// results should be returned as a 2-d array on int.

	public int[][] escTimeMandelbrot(int[][] array) {// range from -2.15 to .6
		int xCalc = 0;
		int yCalc = 0;
		double xStep = 2.75 / 512;
		double yStep = 2.6 / 512;
		for (double x = -2.15; xStep <= 0.6; x += xStep) {//goes through x range
			for (double y = -1.3; yStep <= 1.3; y += yStep) {//goes through y range
				xCalc = (int) (Math.sqrt(x) + Math.sqrt(y) + x);//
				yCalc = (int) ((2 * x * y) + y);
			}
		}

		return new int[2][3];// replace with actual 2d array output
	}// end of mandelbrot escape time calculation

}
// two for loops going through the entire 2d arraay of possible x y values and
// calculates perspective escape times for each