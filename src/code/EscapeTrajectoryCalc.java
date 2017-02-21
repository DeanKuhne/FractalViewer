package code;

public class EscapeTrajectoryCalc {
	public static int[][] escTimeMandelbrot(int colAmt, int rowAmt, double xRangeStart, double xRangeEnd,
			double yRangeStart, double yRangeEnd, int escDist, int maxStep, int choice) {
		int escTimeArray[][] = new int[colAmt][rowAmt];
		double xStep = Math.abs(xRangeStart - xRangeEnd) / rowAmt;// x is row
		double yStep = Math.abs(yRangeStart - yRangeEnd) / colAmt;// y is column

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
					passes++;
					distance = (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
				}
				escTimeArray[cols][rows] = passes;
			}
		}
		return escTimeArray;
	}
}