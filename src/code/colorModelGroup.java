package code;

import java.awt.image.IndexColorModel;
import java.util.Random;

public class colorModelGroup {

	public IndexColorModel GhostColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			reds[i] = (byte) ((Math.log10(i) / Math.log10(reds.length)) * 256);
			greens[i] = (byte) ((Math.log10(i) / Math.log10(greens.length)) * 256);
			blues[i] = (byte) ((Math.log10(i) / Math.log10(blues.length)) * 256);
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 256);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}

	public IndexColorModel VenomColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			reds[i] = (byte) ((Math.log10(i) / Math.log10(reds.length)) * 256);
			greens[i] = (byte) ((Math.log(i)) * 256);
			alphas[i] = (byte) ((Math.log(i) / Math.log(alphas.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}

	public IndexColorModel PurpleColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			greens[i] = (byte) ((Math.log(9 * i) / i) * 1);
			blues[i] = (byte) ((i / Math.log10(reds.length)) * 256);
			reds[i] = (byte) ((i / Math.log1p(reds.length)) * 256);
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}
	
	public IndexColorModel randomColorModel(int numColors) {
		Random ran = new Random();
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			int x = ran.nextInt(numColors);
			greens[i] = (byte) (x * x);
			x = ran.nextInt(numColors);
			while (x == 0) x = ran.nextInt(numColors);
			blues[i] = (byte) (Math.pow(x, 320));
			x = ran.nextInt(numColors);
			reds[i] = (byte) (x + x);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues);
		return retVal;
	}
}
//>>>>>>> branch 'master' of https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
