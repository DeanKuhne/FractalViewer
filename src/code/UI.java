package code;

import javax.swing.JOptionPane;

import edu.buffalo.fractal.FractalPanel;

/**
 *
 * @author dekuh
 */
public class UI extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public int[][] array;
	public int escDist = 4;
	public FractalPanel _display;
	public colorModelGroup _color;
	public EscapeTimeAlgorithm _fractal;
	private javax.swing.JMenu colorScheme;
	private javax.swing.JMenuItem colorScheme1;
	private javax.swing.JMenuItem colorScheme2;
	private javax.swing.JMenuItem colorScheme3;
	private javax.swing.JMenuItem colorScheme4;
	private javax.swing.JMenu escTime;
	private javax.swing.JMenu fracChoice;
	private javax.swing.JMenuItem close;
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
		// this is here so there is a default
		// fractal displayed upon start
		_display.updateImage(array);
	}

	private void initComponents() {
		_color = new colorModelGroup();
		_display = new FractalPanel();
		_fractal = new EscapeTimeAlgorithm();
		fractalOut = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
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
		close = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout fractalOutLayout = new javax.swing.GroupLayout(fractalOut);
		fractalOut.setLayout(fractalOutLayout);
		fractalOutLayout.setHorizontalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
		fractalOutLayout.setVerticalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281, Short.MAX_VALUE));

		escTime.setText("Escape Time");
		escTime.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				escTimeMouseClicked(evt);
			}
		});
		jMenuBar1.add(escTime);

		fracChoice.setText("Fractal Choice");

		fracChoice1.setText("Mandelbrot");
		fracChoice1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice1ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice1);

		fracChoice2.setText("Julia Set");
		fracChoice2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice2ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice2);

		fracChoice3.setText("Burning Ship");

		fracChoice3.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice3ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice3);

		fracChoice4.setText("Multibrot");

		fracChoice4.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fracChoice4ActionPerformed(evt);
			}
		});
		fracChoice.add(fracChoice4);
		jMenuBar1.add(colorScheme);
		jMenuBar1.add(fracChoice);

		colorScheme.setText("Color Scheme");

		colorScheme1.setText("Ghostscale(B&W)");
		colorScheme1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme1actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme1);

		colorScheme2.setText("Greenscale");
		colorScheme2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme2actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme2);

		colorScheme3.setText("Bluescale");
		colorScheme3.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme3actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme3);

		colorScheme4.setText("Redscale");
		colorScheme4.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme4actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme4);

		jMenuBar1.add(close);
		close.setText("Close");
		close.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeActionPerformed(evt);
			}
		});

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
		_display.setIndexColorModel(_color.GhostColorModel(256));
	}

	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {
		_display.updateImage(array);
		_display.setIndexColorModel(_color.GreenscaleColorModel(256));
	}

	private void colorScheme3actionPerformed(java.awt.event.ActionEvent evt) {
		_display.updateImage(array);
		_display.setIndexColorModel(_color.BluescaleColorModel(256));
	}

	private void closeActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void colorScheme4actionPerformed(java.awt.event.ActionEvent evt) {
		_display.updateImage(array);
		_display.setIndexColorModel(_color.RedscaleColorModel(256));
	}

	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
		String msg = "0";
		while (msg == null || Integer.valueOf(msg) <= 0) {// while it
															// is this
			msg = JOptionPane.showInputDialog(
					"Enter a new Escape Distance\nCannot Be null, or a negative number!\nYou have to put in a valid number to close this window...");// keep
			// asking
			if (msg != null && Integer.valueOf(msg) > 0) {// if it's
				// valid
				escDist = Integer.valueOf(msg);// let it go through
				break;
			}
		}
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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UI().setVisible(true);
			}
		});
	}
}
