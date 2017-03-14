package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.buffalo.fractal.FractalPanel;

public class changeFractal implements ActionListener {
	public  FractalPanel _panel;
	public int[][] _arr;
	public changeFractal(FractalPanel a,int[][] b){
		_panel = a;
		_arr = b;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		_panel.updateImage(_arr);
	}

}
