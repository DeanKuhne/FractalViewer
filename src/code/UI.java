
package code;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import edu.buffalo.fractal.FractalPanel;

/**
 *
 * @author dekuh
 */
public class UI extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	public int[][] array;
	public boolean otherChosen = false;
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
	private int sX;
	private int eX;
	private int sY;
	private int eY;
	private boolean drag;

	public Runnable randomize = new Runnable() {
		public void run() {
			_display.setIndexColorModel(_color.randomColorModel(256));
			_display.updateImage(array);
		}
	};

	public Future<?> future = executor.scheduleAtFixedRate(randomize, 0, 100, TimeUnit.MILLISECONDS);

	public UI() {
		initComponents();
		fractalOut.add(_display);
		array = _fractal.escTimeCalculatorChoice(512, 512, escDist, 255, 1);
		// this is here so there is a default
		// fractal displayed upon start
		_display.updateImage(array);
	}

	public static boolean isNumeric(String str) {
		boolean flag;
		try {
			int num = Integer.parseInt(str);
			flag = true;
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
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

		colorScheme2.setText("Venom");
		colorScheme2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme2actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme2);

		colorScheme3.setText("Random Flasher");
		colorScheme3.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme3actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme3);

		colorScheme4.setText("Purple");
		colorScheme4.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				colorScheme4actionPerformed(evt);
			}
		});
		colorScheme.add(colorScheme4);
		fractalOut.addMouseMotionListener(new java.awt.event.MouseAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				fractalOutMouseDragged(evt);
			}
		});
		fractalOut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				fractalOutMousePressed(evt);
			}

			public void mouseReleased(java.awt.event.MouseEvent evt) {
				fractalOutMouseReleased(evt);
			}
		});

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

	public void fractalOutMousePressed(java.awt.event.MouseEvent evt) {
		Point point = evt.getPoint();
		sX = point.x;
		sY = point.y;
		System.out.println("mousePressed at " + point);
		drag = true;
	}

	public void fractalOutMouseDragged(java.awt.event.MouseEvent evt) {
		Point p = evt.getPoint();
		eX = p.x;
		eY = p.y;
		System.out.println("Dragging to " + p);
	}

	public void fractalOutMouseReleased(java.awt.event.MouseEvent evt) {
		drag = false;
		repaint();
		System.out.println("Drawn rectangle area IS " + sX + "," + sY + " to " + eX + "," + eY);
	}

	public void paint(Graphics graphic) {
		int w = eX - sX, h = eY - sY;
		System.out.println("Rect[" + sX + "," + sY + "] size " + w + "x" + h);
		graphic.drawRect(sX+4, sY+50, w, h);
	}
	private void fracChoice1ActionPerformed(java.awt.event.ActionEvent evt) {
		// MANDELBROT SELECTED
		array = _fractal.escTimeCalculatorChoice(512, 512, escDist, 255, 1);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of mandelbrot
	}

	private void fracChoice2ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculatorChoice(512, 512, escDist, 255, 2);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of julia set
	}

	private void fracChoice3ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculatorChoice(512, 512, escDist, 255, 3);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of burning ship
	}

	private void fracChoice4ActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculatorChoice(512, 512, escDist, 255, 4);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of multibrot
	}

	private void colorScheme1actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.GhostColorModel(256));
		_display.updateImage(array);
	}

	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.VenomColorModel(256));
		_display.updateImage(array);
	}

	private void colorScheme3actionPerformed(java.awt.event.ActionEvent evt) {
		// did this for fun, makes a random color scheme appear once per second,
		// it stops when another color scheme is chosen.
		future = executor.scheduleAtFixedRate(randomize, 0, 1000, TimeUnit.MILLISECONDS);
	}

	private void closeActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();// scraps everything
	}

	private void colorScheme4actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.PurpleColorModel(256));
		_display.updateImage(array);
	}

	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
		String msg = "0";
		while (true) {
			msg = JOptionPane.showInputDialog("Enter a new Escape Distance\nCannot Be null, or a negative number!");
			if (msg == null)
				return;// if cancel or X is pressed
			if (msg != null && isNumeric(msg) == true) {// if it's not null and
														// a number
				if (Integer.valueOf(msg) > 0) {// if it's a valid number
					escDist = Integer.valueOf(msg);// let it through
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "<html><b>Bad Input!</b></html>");// only
																					// happens
																					// if
																					// not
																					// good
																					// entry
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
// >>>>>>> branch 'master' of
// https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
