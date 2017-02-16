package code;

public class Mandelbrot {
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
}
