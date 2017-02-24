package code;

public class EscapeTimeAlgorithm {
	private static double xRangeStart;
	private static double yRangeStart;
	private static double xRangeEnd;
	private static double yRangeEnd;
	private static double xCalc;
	private static double yCalc;
	private static double xCurrent;
	private static double yCurrent;
	private static double xTemp;
	private static double yTemp;

	public double getxVal(int x, int choice) {
		// method to show x value's translation to the column
		double xVal;
		dataInput(choice);
		if (choice == 1) {// mandelbrot set
			xVal = x * 512 + xRangeStart;
		}
		if (choice == 2) {// julia set
			xVal = x * 512 + xRangeStart;
		}
		if (choice == 3) {// burning ship set
			xVal = x * 512 + xRangeStart;
		}
		if (choice == 4) {// multibrot set
			xVal = x * 512 + xRangeStart;
		} else {
			return 0;
		}
		return xVal;
	}

	public double getyVal(int y, int choice) {
		// method to show y value's translation to the row
		double yVal;
		dataInput(choice);
		if (choice == 1) {// mandelbrot set
			yVal = y * 512 + yRangeStart;
		}
		if (choice == 2) {// julia set
			yVal = y * 512 + yRangeStart;
		}
		if (choice == 3) {// burning ship set
			yVal = y * 512 + yRangeStart;
		}
		if (choice == 4) {// multibrot set
			yVal = y * 512 + yRangeStart;
		} else {
			return 0;
		}
		return yVal;
	}

	public static void dataInput(int choice) {
		// method to fill values based on which fractal was chosen
		if (choice == 1) {
			// mandelbrot
			// X-coordinate range from -2.15 to 0.6
			// Y-coordinate range from -1.3 to 1.3
			xRangeStart = -2.15;
			xRangeEnd = 0.6;
			yRangeStart = -1.3;
			yRangeEnd = 1.3;
		}
		if (choice == 2) {
			// julia
			// X-coordinate range from -1.7 to 1.7
			// Y-coordinate range from -1.0 to 1.0
			xRangeStart = -1.7;
			xRangeEnd = 1.7;
			yRangeStart = -1.0;
			yRangeEnd = 1.0;
		}
		if (choice == 3) {
			// burning ship
			// X-coordinate range from -1.8 to -1.7
			// Y-coordinate range from -0.08 to 0.025
			xRangeStart = -1.8;
			xRangeEnd = -1.7;
			yRangeStart = -0.08;
			yRangeEnd = 0.025;
		}
		if (choice == 4) {
			// multibrot
			// X-coordinate range from -1 to 1
			// Y-coordinate range from -1.3 to 1.3
			xRangeStart = -1;
			xRangeEnd = 1;
			yRangeStart = -1.3;
			yRangeEnd = 1.3;
		}
	}

	public static void updateXY(int choice) {
		// defines the way each function calculates xCalc and yCalc, specific to
		// each function
		if (choice == 1) {// mandelbrot update function
			xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc, 2) + xCurrent;
			yTemp = 2 * xCalc * yCalc + yCurrent;
		}
		if (choice == 2) {// julia update function
			xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc, 2) - 0.72689;
			yTemp = 2 * xCalc * yCalc + 0.188887;
		}
		if (choice == 3) {// burning ship update function
			xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc, 2) + xCurrent;
			yTemp = Math.abs(2 * xCalc * yCalc) + yCurrent;
		}
		if (choice == 4) {// multibrot update function
			xTemp = Math.pow(xCalc, 3) - (3 * xCalc * Math.pow(yCalc, 2)) + xCurrent;
			yTemp = (3 * Math.pow(xCalc, 2) * yCalc) - Math.pow(yCalc, 3) + yCurrent;
		}
	}

	public int escTimeCoords(double x, double y, int choice) {
		// method which is used to test the escape time of a single coordinate
		xCurrent = x;
		yCurrent = y;
		xCalc = xCurrent;
		yCalc = yCurrent;
		int passes = 0;
		double dist = Math.sqrt(Math.pow(xCurrent, 2) + Math.pow(yCurrent, 2));
		while (dist <= 4 && passes < 255) {
			updateXY(choice);
			xCalc = xTemp;
			yCalc = yTemp;
			passes++;
			dist = Math.sqrt(Math.pow(xCalc, 2) + Math.pow(yCalc, 2));
		}
		return passes;
	}

	public static int[][] escTimeCalculator(int colAmt, int rowAmt, int escDist, int maxStep, int choice) {
		// method that will return an entire 2d array of escape times
		int escTimeArray[][] = new int[colAmt][rowAmt];
		dataInput(choice);
		double xStep = Math.abs(xRangeStart - xRangeEnd) / rowAmt;// x is row
		double yStep = Math.abs(yRangeStart - yRangeEnd) / colAmt;// y is column
		double xStart = xRangeStart;
		double yStart = yRangeStart;
		xCalc = xStart;
		yCalc = yStart;
		xCurrent = xCalc;
		yCurrent = yCalc;
		double distance;
		for (int cols = 0; cols < colAmt; cols++) {
			yCurrent = yStart + (yStep * cols);
			xCurrent = xStart;
			for (int rows = 0; rows < rowAmt; rows++) {
				xCurrent = xStart + (xStep * rows);
				int passes = 0;
				xCalc = xCurrent;
				yCalc = yCurrent;
				distance = (Math.sqrt((xCurrent * xCurrent) + (yCurrent * yCurrent)));
				while (distance <= escDist && passes < maxStep) {
					updateXY(choice);
					xCalc = xTemp;
					yCalc = yTemp;
					passes++;
					distance = (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
				}
				escTimeArray[cols][rows] = passes;
			}
		}
		return escTimeArray;
	}
}
