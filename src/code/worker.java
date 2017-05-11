package code;

import javax.swing.SwingWorker;

import edu.buffalo.fractal.*;

public class worker extends SwingWorker<WorkerResult,Void> {
	
	private int numThread;
	private int even;
	private int left;
	private int cols = 2048;
	private int[][] array;
	private int choice;
	private int escDistNum;
	private int escTimeNum;
	private int ey;
	private int sy;
	
	private EscapeTimeAlgorithm _fractal = new EscapeTimeAlgorithm();
	
	public worker(int num,int choose,int time, int dist,int ys,int ye){
		escTimeNum = time;
		escDistNum = dist;
		numThread = num;
		choice = choose;
		ey = ys;  // starts from this row
		sy = ye;  // ends at this row
	
	}
	
	@Override
	protected WorkerResult doInBackground() throws Exception {
		
		double x1 = EscapeTimeAlgorithm.getxVal(ey, choice);
		double x2 = EscapeTimeAlgorithm.getxVal(sy, choice);
		double y1 = EscapeTimeAlgorithm.getyVal(0, choice);
		double y2 = EscapeTimeAlgorithm.getyVal(2048, choice);
		System.out.println("Worker NO."+numThread+" starts at" + x1);
		System.out.println("Worker NO."+numThread+" ends at" + x2);
		array = _fractal.escTimeCalculatorPart(x1, x2, y1, y2, escDistNum, escTimeNum, choice,sy-ey+1);
		
		return new WorkerResult(ey,array);
	}

}
