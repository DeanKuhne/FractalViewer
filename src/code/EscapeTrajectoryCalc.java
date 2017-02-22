package code;

public class EscapeTrajectoryCalc {
	public static int[][] escTimeMandelbrot(int colAmt, int rowAmt, double xRangeStart, double xRangeEnd,
			double yRangeStart, double yRangeEnd, int escDist, int maxStep, int choice) {
		int escTimeArray[][] = new int[colAmt][rowAmt];
		double xStep = Math.abs(xRangeStart - xRangeEnd) / rowAmt;// x is row
		double yStep = Math.abs(yRangeStart - yRangeEnd) / colAmt;// y is column
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
		double xStart = xRangeStart;
		double yStart = yRangeStart;
		double xCalc = xStart;
		double yCalc = yStart;
		double xCurrent = xCalc;
		double yCurrent = yCalc;
		double xTemp;
		double yTemp;
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
					xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc, 2) + xCurrent;
					yTemp = 2 * xCurrent * yCurrent + yCurrent;
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