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

	public void BuriningShipSet(int xCalc, int yCalc) {
		for (double xCoor = -1.8; xCoor <= -1.7; xCoor = xCoor + 0.00000000000000001) {
			double vertX = (xCalc * xCalc) - (yCalc * yCalc) + xCoor;
		}
		for (double yCoor = -0.08; yCoor <= 0.025; yCoor = yCoor + 0.0000000000000001) {
			double vertY = Math.abs(2 * xCalc * yCalc) + yCoor;
		}
	}

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
					passes++;
					distance = (int) (Math.sqrt(xCalc) + Math.sqrt(yCalc));
				}
				escTimeJulia[xCalc][yCalc] = passes;
			}
		}
		return escTimeJulia;
	}
}
// two for loops going through the entire 2d arraay of possible x y values and
// calculates perspective escape times for each