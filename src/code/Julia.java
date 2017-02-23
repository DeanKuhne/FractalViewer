package code;

public class Julia {
	public double escTimeJulia(double A, double B) {
		double xCurrent = A;
		double yCurrent = B;
		double xCalc = xCurrent;
		double yCalc = yCurrent;
		int passes = 0;
		double dist = Math.sqrt(Math.pow(xCurrent, 2) + Math.pow(yCurrent, 2));
		
			while(dist <= 4 && passes < 255){
				//Math.pow(xStep, 2) + Math.pow(yStep, 2 = distance
				
				double xTemp = Math.pow(xCalc, 2) - Math.pow(yCalc , 2) - 0.72689;
				double yTemp = 2 * xCalc * yCalc + 0.188887;
				
				xCalc = xTemp;
				yCalc = yTemp;
				passes++;
				dist = Math.sqrt(Math.pow(xCalc, 2) + Math.pow(yCalc, 2)); 
				}
		return passes;
	}
}