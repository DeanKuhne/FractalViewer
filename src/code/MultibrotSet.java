package code;

public class MultibrotSet {
	public double escTimeMultibro(double A, double B){
		double xCurrent = 0;
		double yCurrent= 0;
		double xCalc = 0;
		double yCalc = 0;
		int passes = 0;

			while(Math.pow(xCurrent, 2) + Math.pow(yCurrent, 2) <= 2 && passes < 255){
				//Math.pow(xStep, 2) + Math.pow(yStep, 2) = distance;
				
				xCurrent = A;
				yCurrent = B;
				
				double xTemp = Math.pow(xCalc, 3) - (3 * xCalc * Math.pow(yCalc, 2)) + xCurrent;
				double yTemp = (3 * Math.pow(xCalc, 2) * yCalc) - Math.pow(yCalc, 3) + yCurrent;
				
				xCalc = xTemp;
				yCalc = yTemp;
				passes++;
				}
		return passes;
	}
}