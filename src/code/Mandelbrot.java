package code;

public class Mandelbrot {
	public static void main(String[] args) {
		int[][] pot = escTimeMandelbrot();
		for (int i = 0; i < 512; i++) {
			System.out.println();
			for (int j = 0; j < 512; j++) {
				System.out.print(" " + pot[i][j]);
			}
		}
	}

	public static int[][] escTimeMandelbrot() {
		int escTimeArray[][] = new int[512][512];
		double xStep = 2.75 / 512;
		double yStep = 2.6 / 512;
		double xCalc = -2.15;
		double yCalc = -1.6;
		int distance = (int) (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
		int passes = 0;
		for (int y = 0; y < 512; y++) {
			for (int x = 0; x < 512; x++) {
				double xUse = xCalc + (xStep * x);
				double yUse = yCalc + (yStep * y);
				while (distance <= 4 && passes < 255) {
					xCalc = ((xCalc * xCalc) - (yCalc * yCalc) + xUse);//
					yCalc = ((2 * xCalc * yCalc) + yUse);
					passes++;
					distance = (int) (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
				}
				escTimeArray[x][y] = passes;
			}
		}
		return escTimeArray;
	}
}
