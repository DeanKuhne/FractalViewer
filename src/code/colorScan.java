package code;

import java.awt.Panel;
import java.awt.Color;
import java.awt.image.IndexColorModel;


public class colorScan {
	public colorScan(){
		
	}
	
	public static IndexColorModel createRainbowColorModel(int numColors) {
	    byte[] reds = new byte[numColors];
	    byte[] greens = new byte[numColors];
	    byte[] blues = new byte[numColors];
	    for (int i = 0; i < reds.length - 1; i++) {
	      int rgb = Color.HSBtoRGB(i / ((float) reds.length - 1), 0.6F, 1);
	      reds[i] = (byte) ((rgb & 0xFF0000) >> 16);
	      greens[i] = (byte) ((rgb & 0xFF00) >> 8);
	      blues[i] = (byte) (rgb & 0xFF);
	      
	    }
	    IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues);
	    return retVal;
	  }

	  public static IndexColorModel createRedAlphaColorModel(int numColors) {
	    byte[] reds = new byte[numColors];
	    byte[] greens = new byte[numColors];
	    byte[] blues = new byte[numColors];
	    byte[] alphas = new byte[numColors];// create 4 arrays for color model parameters, and the length of arrays will equals to the number of color
	    for (int i = 0; i < reds.length - 1; i++) {  //loop the all 4 arrays and input the value of parameters
	      reds[i] = (byte) ((Math.log10(i) / Math.log10(reds.length)) * 256);//the range of red is from 0 to 255
	      greens[i] = 0;
	      blues[i] = 0;
	      alphas[i] = (byte)((Math.log10(i) / Math.log10(reds.length)) * 1);//the range of alpha is from 0.0 to 1.0
	    }
	    IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues,alphas);//return the indexmodel with parameters of 8 bits, size of numColors, and 4 arrays
	    return retVal;
	  }
	  
	  public static IndexColorModle ceateBluesAlphaColorModel(int numColors){
		  byte[] reds = new byte[numColors];
		  byte[] greens = new byte[numColors];
		  byte[] blues = new byte[numColors];
		  byte[] alphas = new byte[numColors]; /** create 4 arrays for color model parameters, adn the length of arrays will equasl to the number of color**/
		  for(int i = 0; i < reds.length - 1; i++){ /** loop the all 4 arrays and input the value of parameters**/
			  reds[i] = 0;
			  greens[i] = 0;
			  blues[i] = (byte) ((Math.log10(i) / Math.log10(blues.length)) * 256); /** the range of blue is from 0 to 255**/
			  alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 1); /** the range of alpha is from 0.0 to 1.0**/
		  }
		  IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas); 
		  return retVal; /** return the indexmodel with parameters of 8 bits, size of numColors, and 4 arrays**/
	  }
}