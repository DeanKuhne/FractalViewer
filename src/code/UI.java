package code;

import javax.swing.*;

public class UI extends javax.swing.JFrame {
	public UI() {
		initComponents();
	}

	private void initComponents() {
		//JmenuBar->JMenu->JMenuItem
		JMenuBar menu = new JMenuBar();
		JMenu fileLoc = new JMenu("Choose File Location");
		JMenuItem fileLoc1 = new JMenuItem("TODO");
		JMenuItem fileLoc2 = new JMenuItem("TODO");
		JMenuItem fileLoc3 = new JMenuItem("TODO");
		JMenuItem fileLoc4 = new JMenuItem("TODO");
		fileLoc.add(fileLoc1);
		fileLoc.add(fileLoc2);
		fileLoc.add(fileLoc3);
		fileLoc.add(fileLoc4);
		menu.add(fileLoc);//adding JMenu to Menu Bar
		JMenu fracChoice = new JMenu("Select a Fractal");
		JMenuItem fracChoice1 = new JMenuItem("Mandelbrot");
		JMenuItem fracChoice2 = new JMenuItem("Julia Set");
		JMenuItem fracChoice3 = new JMenuItem("Burning Ship");
		JMenuItem fracChoice4 = new JMenuItem("Multibrot");
		fracChoice.add(fracChoice1);
		fracChoice.add(fracChoice2);
		fracChoice.add(fracChoice3);
		fracChoice.add(fracChoice4);
		menu.add(fracChoice);//adding JMenu to Menu Bar
		JMenu colorScheme = new JMenu("Select Color Scheme");
		JMenuItem colorScheme1 = new JMenuItem("TODO");
		JMenuItem colorScheme2 = new JMenuItem("TODO");
		JMenuItem colorScheme3 = new JMenuItem("TODO");
		JMenuItem colorScheme4 = new JMenuItem("TODO");
		colorScheme.add(colorScheme1);
		colorScheme.add(colorScheme2);
		colorScheme.add(colorScheme3);
		colorScheme.add(colorScheme4);
		menu.add(colorScheme);//adding JMenu to Menu Bar
		JMenuItem update = new JMenuItem("Update Fractal");
		JMenuItem close = new JMenuItem("Exit Program");
		menu.add(update);//adding Menu Item to Menu Bar
		menu.add(close);//adding Menu Item to Menu Bar



	}

}
