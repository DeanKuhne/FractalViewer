package code;

public class BurningShip{
	public double escTimeBurningShip(double A, double B){
		double xCurrent = 0;
		double yCurrent = 0;
		double xCalc = 0;
		double yCalc = 0;
		int passes = 0;

			while(Math.pow(xCurrent, 2) + Math.pow(yCurrent, 2) <= 4 && passes < 255){
				//Math.pow(xStep, 2) + Math.pow(yStep, 2 = distance
				
				xCurrent = A;
				yCurrent = B;
				
				double xTemp = (xCalc * xCalc) - (yCalc * yCalc) + xCurrent;
				double yTemp = Math.abs(2 * xCalc * yCalc) + yCurrent;
				
				xCalc = xTemp;
				yCalc = yTemp;
				passes++;
			}
	return passes;
	}
}