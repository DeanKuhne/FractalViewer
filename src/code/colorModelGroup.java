package code;

import java.awt.Color;
import java.awt.image.IndexColorModel;

public class colorModelGroup {

	public IndexColorModel createRainbowColorModel(int numColors) {
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

	public IndexColorModel createRedAlphaColorModel(int numColors) {
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

	public static IndexColorModel createBluesAlphaColorModel(int numColors) {
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
