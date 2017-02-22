package code;

public class EscapeTrajectoryCalc {
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

	public static void mandData() {// mandelbrot
		// X-coordinate range from -2.15 to 0.6
		// Y-coordinate range from -1.3 to 1.3
		xRangeStart = -2.15;
		xRangeEnd = 0.6;
		yRangeStart = -1.3;
		yRangeEnd = 1.3;

	}

	public static void juliData() {// julia
		// X-coordinate range from -1.7 to 1.7
		// Y-coordinate range from -1.0 to 1.0
		xRangeStart = -1.7;
		xRangeEnd = 1.7;
		yRangeStart = -1.0;
		yRangeEnd = 1.0;
	}

	public static void burnData() {// burning ship
		// X-coordinate range from -1.8 to -1.7
		// Y-coordinate range from -0.08 to 0.025
		xRangeStart = -1.8;
		xRangeEnd = -1.7;
		yRangeStart = -0.08;
		yRangeEnd = 0.025;
	}

	public static void multData() {// multibrot
		// X-coordinate range from -1 to 1
		// Y-coordinate range from -1.3 to 1.3
		xRangeStart = -1;
		xRangeEnd = 1;
		yRangeStart = -1.3;
		yRangeEnd = 1.3;
	}

	public static void updateXY(int choice) {
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
			yTemp = (3 * Math.pow(xCalc, 2) * yCalc) + yCurrent;
		}
	}

	public static int[][] escTimeCalculator(int colAmt, int rowAmt, int escDist, int maxStep, int choice) {
		int escTimeArray[][] = new int[colAmt][rowAmt];
		if (choice == 1)
			mandData();
		if (choice == 2)
			juliData();
		if (choice == 3)
			burnData();
		if (choice == 4)
			multData();

		double xStep = Math.abs(xRangeStart - xRangeEnd) / rowAmt;// x is row
		double yStep = Math.abs(yRangeStart - yRangeEnd) / colAmt;// y is column
<<<<<<< HEAD
=======
<<<<<<< HEAD
	// For this first phase, you will need to split the ranges into 512
	// equally-spaced rows and 512 equally-spaced columns. To generate the
	// entire fractal, you simply calculate the escape-time for each of
	// these 262144 coordinate pairs. (The number 262144 is equal to 512 *
	// 512 or the number of row & column combination). The final fractal
	// results should be returned as a 2-d array on int

	public static void main(String args[]) {
		System.out.println(escTimeMandelbrot());
	}

	public static int[][] escTimeMandelbrot() {// range from -2.15 to .6
//		int escTimeArray[][] = new int[512][512];// array of possible escape
//													// time values
//		double xStep = 2.75 / 512;
//		double yStep = 2.6 / 512;
//		int passes = 0;
//		int distance;
//		for (double x = -2.15; x <= 0.6; x += xStep) {// goes through x range
//			for (double y = -1.3; y <= 1.3; y += yStep) {// goes through y range
//				System.out.println("x " + x);
//				System.out.println("y " + y);
//				int xCalc = (int) (Math.sqrt(x) + Math.sqrt(y) + x);//
//				int yCalc = (int) ((2 * x * y) + y);
//				distance = (int) (Math.sqrt(xCalc) + Math.sqrt(yCalc));
//				while (distance <= 4 && passes < 255) {
//					passes++;
//					distance = (int) (Math.sqrt(xCalc) + Math.sqrt(yCalc));
//				}
//				escTimeArray[xCalc][yCalc] = passes;
//			}
		int escTimeArray[][] = new int [512][512];
		int x = 0;
		int y = 0;
		int distance = (int) (Math.sqrt((x^2)+(y^2)));//c=rad(a^2+b^2)

		return escTimeArray;// replace with actual 2d array output
	}// end of mandelbrot escape time calculation

	public int[][] escTimeJulia(int[][] array) {
		int[][] escTimeJulia = new int[512][512];
		int xCalc = 0;
		int yCalc = 0;
		double xStep = 3.4 / 512;
		double yStep = 2.0 / 512;
		int passes = 0;
		int distance = 0;
		for (double x = -1.7; x <= 1.7; x += xStep) {
			for (double y = -1.0; y <= 1.0; y += yStep) {
				xCalc = (int) (Math.sqrt(x) - Math.sqrt(y) - 0.72689);
				yCalc = (int) ((2 * x * y) + 0.188887);
				while (distance <= 4 && passes < 255) {
=======
>>>>>>> branch 'master' of https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
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
>>>>>>> branch 'master' of https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
					passes++;
					distance = (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
				}
				escTimeArray[cols][rows] = passes;
			}
		}
		return escTimeArray;
	}
}