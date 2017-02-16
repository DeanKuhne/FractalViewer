package code;

public class BurningShip {
	public int[][] BuriningShipSet(int [][] array) {
		int[][] BuriningShipSet = new int[512][512];
		int xCalc = 0;
		int yCalc = 0;
		for (double xCoor = -1.8; xCoor <= -1.7; xCoor = xCoor + 0.00000000000000001) {
			double vertX = (xCalc * xCalc) - (yCalc * yCalc) + xCoor;
		}
		for (double yCoor = -0.08; yCoor <= 0.025; yCoor = yCoor + 0.0000000000000001) {
			double vertY = Math.abs(2 * xCalc * yCalc) + yCoor;
		}
	}
}
