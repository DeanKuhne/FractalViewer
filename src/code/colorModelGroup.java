package code;

import java.awt.image.IndexColorModel;

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
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}

	public IndexColorModel GreenscaleColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			reds[i] = 0;
			greens[i] = (byte) ((Math.log10(i) / Math.log10(greens.length)) * 256);
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}

	public IndexColorModel RedscaleColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			reds[i] = (byte) ((Math.log10(i) / Math.log10(reds.length)) * 256);
			greens[i] = 0;
			blues[i] = 0;
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(reds.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}

	public IndexColorModel BluescaleColorModel(int numColors) {
		byte[] reds = new byte[numColors];
		byte[] greens = new byte[numColors];
		byte[] blues = new byte[numColors];
		byte[] alphas = new byte[numColors];
		for (int i = 0; i < reds.length - 1; i++) {
			reds[i] = 0;
			greens[i] = 0;
			blues[i] = (byte) ((Math.log10(i) / Math.log10(blues.length)) * 256);
			alphas[i] = (byte) ((Math.log10(i) / Math.log10(alphas.length)) * 1);
		}
		IndexColorModel retVal = new IndexColorModel(8, reds.length, reds, greens, blues, alphas);
		return retVal;
	}
}