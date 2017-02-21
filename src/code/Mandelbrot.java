package code;

public class Mandelbrot {
	public static void main(String[] args) {
		int[][] pot = escTimeMandelbrot();
		for (int i = 0; i < pot.length; i++) {
			System.out.println();
			for (int j = 0; j < pot.length; j++) {
				System.out.print("" + pot[i][j]);
			}
		}

	}

	public static int[][] escTimeMandelbrot() {
		int escTimeArray[][] = new int[512][512];
		double xStep = 2.75 / 512;
		double yStep = 2.6 / 512;
		double xCalc = -2.15;
		double yCalc = -1.3;
		double xStart = -2.15;
		double yStart = -1.3;
		double xCurrent = xCalc;
		double yCurrent = yCalc;
		double xTemp;
		double yTemp;
		double distance;
		for (int cols = 0; cols < 512; cols++) {
			yCurrent = yStart + (yStep * cols);
			xCurrent = xStart;
			for (int rows = 0; rows < 512; rows++) {
				xCurrent = xStart + (xStep * rows);
				int passes = 0;
				xCalc = xCurrent;
				yCalc = yCurrent;
				distance = (Math.sqrt((xCurrent * xCurrent) + (yCurrent * yCurrent)));
				while (distance <= 4 && passes < 255) {
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
