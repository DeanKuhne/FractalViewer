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
		int xCalc = 0;//valid x 
		int yCalc = 0;//valid y
		int distance = (int) (Math.sqrt((xCalc^2)+(yCalc^2)));//c=rad(a^2+b^2)
		int passes = 0;
		while (distance <= 4 && passes < 255) {
			xCalc = (int) ((xCalc^2)-(yCalc^2) + xCalc);//
			yCalc = (int) ((2 * xCalc * yCalc) + yCalc);
			passes++;
			distance = (int) (Math.sqrt((xCalc^2)+(yCalc^2)));//c=rad(a^2+b^2)
		}
		escTimeArray[xCalc][yCalc] = passes;

		return escTimeArray;
	}
}
