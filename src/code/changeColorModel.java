package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.IndexColorModel;

import edu.buffalo.fractal.FractalPanel;


public class changeColorModel implements ActionListener {
	public static FractalPanel _panel;
	public static IndexColorModel _model;
	public static int[][] _arr;
	public changeColorModel(FractalPanel a,IndexColorModel b,int[][] c){
		_panel = a;
		_model = b;
		_arr = c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		_panel.setIndexColorModel(_model);
		_panel.updateImage(_arr);
//		_panel.updateUI();
//		
	}

}
