package code;

import javax.swing.JOptionPane;

import edu.buffalo.fractal.FractalPanel;

/*
 * To change this license header, choose License Headers in Project Praoperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dekuh
 */
public class UI extends javax.swing.JFrame {
	// JPanel.add(instance of FractalPanel

	private static final long serialVersionUID = 1L;
	public int[][] array;
	public int escDist = 4;
	public FractalPanel _display;
	public EscapeTimeAlgorithm _fractal;
	private javax.swing.JMenu colorScheme;
	private javax.swing.JMenuItem colorScheme1;
	private javax.swing.JMenuItem colorScheme2;
	private javax.swing.JMenuItem colorScheme3;
	private javax.swing.JMenuItem colorScheme4;
	private javax.swing.JMenu escTime;
	// private javax.swing.JMenu fileLoc;
	// private javax.swing.JMenuItem fileLoc1;
	// private javax.swing.JMenuItem fileLoc2;
	// private javax.swing.JMenuItem fileLoc3;
	// private javax.swing.JMenuItem fileLoc4;
	private javax.swing.JMenu fracChoice;
	private javax.swing.JMenuItem fracChoice1;
	private javax.swing.JMenuItem fracChoice2;
	private javax.swing.JMenuItem fracChoice3;
	private javax.swing.JMenuItem fracChoice4;
	private javax.swing.JPanel fractalOut;
	private javax.swing.JMenuBar jMenuBar1;

	public UI() {
		initComponents();
		fractalOut.add(_display);
		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 1);
		_display.updateImage(array);
	}

	private void initComponents() {
		_display = new FractalPanel();
		_fractal = new EscapeTimeAlgorithm();
		fractalOut = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		// fileLoc = new javax.swing.JMenu();
		// fileLoc1 = new javax.swing.JMenuItem();
		// fileLoc2 = new javax.swing.JMenuItem();
		// fileLoc3 = new javax.swing.JMenuItem();
		// fileLoc4 = new javax.swing.JMenuItem();
		fracChoice = new javax.swing.JMenu();
		fracChoice1 = new javax.swing.JMenuItem();
		fracChoice2 = new javax.swing.JMenuItem();
		fracChoice3 = new javax.swing.JMenuItem();
		fracChoice4 = new javax.swing.JMenuItem();
		colorScheme = new javax.swing.JMenu();
		colorScheme1 = new javax.swing.JMenuItem();
		colorScheme2 = new javax.swing.JMenuItem();
		colorScheme3 = new javax.swing.JMenuItem();
		colorScheme4 = new javax.swing.JMenuItem();
		escTime = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout fractalOutLayout = new javax.swing.GroupLayout(fractalOut);
		fractalOut.setLayout(fractalOutLayout);
		fractalOutLayout.setHorizontalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
		fractalOutLayout.setVerticalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281, Short.MAX_VALUE));

		escTime.setText("Escape Time");
		escTime.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				escTimeMouseClicked(evt);
			}
		});
		jMenuBar1.add(escTime);

		fracChoice.setText("Fractal Choice");

		fracChoice1.setText("Mandelbrot");
		fracChoice1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice1ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice1);

		fracChoice2.setText("Julia Set");
		fracChoice2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice2ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice2);

		fracChoice3.setText("Burning Ship");

		fracChoice3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice3ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice3);

		fracChoice4.setText("Multibrot");

		fracChoice4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice4ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice4);

		jMenuBar1.add(fracChoice);

		colorScheme.setText("Color Scheme");

		colorScheme1.setText("TODO");
		colorScheme1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme1actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme1);

		colorScheme2.setText("TODO");
		colorScheme2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme2actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme2);

		colorScheme3.setText("TODO");
		colorScheme3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme3actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme3);

		colorScheme4.setText("TODO");
		colorScheme4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme4actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme4);

		jMenuBar1.add(colorScheme);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(fractalOut,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(fractalOut,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void fracChoice1ActionPerformed(java.awt.event.ActionEvent evt) {
		// MANDELBROT SELECTED
		System.out.println("Generating Mand");
		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 1);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of mandelbrot
	}

	private void fracChoice2ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 2);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of julia set
	}

	private void fracChoice3ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 3);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of burning ship
	}

	private void fracChoice4ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 4);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of multibrot
	}

	private void colorScheme1actionPerformed(java.awt.event.ActionEvent evt) {

		_display.updateImage(array);
		// COLOR SCHEME 1
	}

	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {

		_display.updateImage(array);
		// COLOR SCHEME 2
	}

	private void colorScheme3actionPerformed(java.awt.event.ActionEvent evt) {

		_display.updateImage(array);
		// COLOR SCHEME 3
	}

	private void colorScheme4actionPerformed(java.awt.event.ActionEvent evt) {

		// COLOR SCHEME 4
		_display.updateImage(array);
	}

	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
		String msg = "0";
		while (Integer.valueOf(msg) <= 0) {
			msg = JOptionPane.showInputDialog("Enter a new Escape Distance\nCannot Be null, or a negative number!");
			if (Integer.valueOf(msg) > 0) {
				escDist = Integer.valueOf(msg);
			}
		}
		_display.updateImage(array);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UI().setVisible(true);
			}
		});
	}
}
