package code;

public class coordCalc {
	private static double xCalc;
	private static double yCalc;
	private static double xCurrent;
	private static double yCurrent;
	private static double xTemp;
	private static double yTemp;

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
			yTemp = (3 * Math.pow(xCalc, 2) * yCalc) - Math.pow(yCalc, 3) + yCurrent;
		}
	}

	public int escTimeCoords(double x, double y, int choice) {
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

}
