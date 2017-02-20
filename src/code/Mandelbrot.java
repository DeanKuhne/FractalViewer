package code;

public class Mandelbrot {
	public static int[][] escTimeMandelbrot() {// range from -2.15 to .6
		// int escTimeArray[][] = new int[512][512];// array of possible escape
		// // time values
		// double xStep = 2.75 / 512;
		// double yStep = 2.6 / 512;
		// int passes = 0;
		// int distance;
		// for (double x = -2.15; x <= 0.6; x += xStep) {// goes through x range
		// for (double y = -1.3; y <= 1.3; y += yStep) {// goes through y range
		// System.out.println("x " + x);
		// System.out.println("y " + y);
		// int xCalc = (int) (Math.sqrt(x) + Math.sqrt(y) + x);
		// int yCalc = (int) ((2 * x * y) + y);
		// distance = (int) (Math.sqrt(xCalc) + Math.sqrt(yCalc));
		// while (distance <= 4 && passes < 255) {
		// passes++;
		// distance = (int) (Math.sqrt(xCalc) + Math.sqrt(yCalc));
		// }
		// escTimeArray[xCalc][yCalc] = passes;
		// }
		int escTimeArray[][] = new int[512][512];
		double xStep = 2.75 / 512;
		double yStep = 2.6 / 512;
		double xStart;
		double yStart;
		int distance = (int) (Math.sqrt((xStart * xStart) + (yStart * yStart)));// c=rad(a^2+b^2)
		int passes = 0;
		for (int x = 0; x < 512; x++) {// goes through x
			for (int y = 0; y < 512; y++) {// goes through y
				double xCalc = 0;// valid x
				double yCalc = 0;// valid y
				while (distance <= 4 && passes < 255) {
					double xPre = -2.15 + (xStep * x);
					double yPre = -1.30 + (yStep * y);
					xCalc = ((xPre * xPre) - (yPre * yPre) + xPre);//
					yCalc = ((2 * xPre * yPre) + yPre);
					passes++;
					distance = (int) (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));// c=radical(a^2+b^2)
				}
			}
			escTimeArray[x][y] = passes;
		}

		return escTimeArray;
	}
}
