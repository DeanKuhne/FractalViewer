package code;
import java.awt.image.IndexColorModel;
import java.lang.Enum;
import java.lang.Object;
import edu.buffalo.fractal.FractalPanel;
import edu.buffalo.fractal.FractalPanel.SaveFormat;;

public class UI {
	public static FractalPanel _panel = new FractalPanel();
	public static EscapeTimeAlgorithm _escape = new EscapeTimeAlgorithm();
	public static IndexColorModel indexColor;
	
	public UI(){
		int[][] mandarr = _escape.escTimeCalculator(512,512,2,512,1);
		int[][] jarr = _escape.escTimeCalculator(512,521,2,512,2);
		int[][] bsarr = _escape.escTimeCalculator(512,521,2,512,3);
		int[][] multiarr = _escape.escTimeCalculator(512,521,2,512,4);
		
		_panel.updateImage(mandarr);
		_panel.saveImage(PNG, mandarr);
		
		
		_panel.updateImage(jarr);
		_panel.saveImage(PNG,jarr);
		
		_panel.updateImage(bsarr);
		_panel.saveImage(PNG, bsarr);
		
		_panel.updateImage(multiarr);
		_panel.saveImage(PNG, multiarr);
		
		_panel.setIndexColorModel(indexColor);
		
		
	}
	
	public static void main(String[] args){
		
	}
	

}
