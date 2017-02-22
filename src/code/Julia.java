package code;

public class Julia {
	public static void main(String[] args) {
		int[][] pot = escTimeJulia();
		for (int i = 0; i < pot.length; i++) {
			System.out.println();
			for (int j = 0; j < pot.length; j++) {
				System.out.print("" + pot[i][j]);
			}
		}
	}
	public static int[][] escTimeJulia() {
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
