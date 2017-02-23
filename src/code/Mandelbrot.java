package code;

public class Mandelbrot {
	public double escTimeMandelbrot(double A, double B) {
		double xCurrent = 0;
		double yCurrent = 0;
		double xCalc = 0;
		double yCalc = 0;
		int passes = 0;
			
			while (Math.pow(xCurrent, 2) + Math.pow(yCurrent, 2) <= 2 && passes < 255) {
				 //Math.pow(xStep, 2) + Math.pow(yStep, 2)
				
				xCurrent = A;
				yCurrent = B;
				
				double xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc, 2) + xCurrent;
				double yTemp = 2 * xCalc * yCalc + yCurrent;
				
				xCalc = xTemp;
				yCalc = yTemp;
				passes++;
			}
		return passes;
	}
}
