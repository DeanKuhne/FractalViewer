package code;

public class BurningShip{
	public static int[][] escTimeBurningShip(){
		int [][] escTimeBurningShip = new int[512][512];
		double xStep = 3.5 / 512;
		double yStep = 0.105 / 512;
		double xCalc;
		double yCalc;
		double xStart = -1.8;
		double yStart = -0.08;
		double dist;

		for(int cols = 0; cols < 512; cols++){
			double yCurrent = yStart + (yStep * cols);
			double xCurrent = xStart;
	
			for(int rows = 0; rows < 512; rows++){
				xCurrent = xStart + (xStep * rows);
				int passes = 0;
				xCalc = xCurrent;
				yCalc = yCurrent;
				dist = (Math.sqrt((xCurrent * xCurrent) + (yCurrent * yCurrent)));
		
				while(dist <= 4 && passes < 255){
					double xTemp = (xCalc * xCalc) - (yCalc * yCalc) + xCurrent;
					double yTemp = Math.abs(2 * xCalc * yCalc) + yCurrent;
					xCalc = xTemp;
					yCalc = yTemp;
					passes++;
					dist = (Math.sqrt((xCalc * xCalc) + (yCalc * yCalc)));
				}
				escTimeBurningShip [cols][rows] = passes;
			}
		}
	return escTimeBurningShip;
	}
}