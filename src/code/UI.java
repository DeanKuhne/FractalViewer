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
import javax.swing.SwingWorker;

import edu.buffalo.fractal.*;
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
	public int escTimeNum = 255;
	public int numThreads = 1;
	public int choice = 1;
	public int escDistNum = 4;
	public FractalPanel _display;
	public colorModelGroup _color;
	public EscapeTimeAlgorithm _fractal;
	private javax.swing.JMenu colorScheme;
	private javax.swing.JMenuItem colorScheme1;
	private javax.swing.JMenuItem colorScheme2;
	private javax.swing.JMenuItem colorScheme3;
	private javax.swing.JMenuItem colorScheme4;
	private javax.swing.JMenu escTime;
	private javax.swing.JMenu escDist;
	private javax.swing.JMenu zoom;
	private javax.swing.JMenuItem zoom1;
	private javax.swing.JMenuItem zoom2;
	private javax.swing.JMenu fracChoice;
	private javax.swing.JMenuItem close;
	private javax.swing.JMenuItem fracChoice1;
	private javax.swing.JMenuItem fracChoice2;
	private javax.swing.JMenuItem fracChoice3;
	private javax.swing.JMenuItem fracChoice4;
	private javax.swing.JPanel fractalOut;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenu multiThre;
	private javax.swing.JMenuItem computeMulti;
	private int sX;
	private int eX;
	private int sY;
	private int eY;
	private boolean drag;
	public ComputePool multiThread = new ComputePool();
	SwingWorker<WorkerResult,Void>[] workers;
	public Runnable randomize = new Runnable() {
		public void run() {
			_display.setIndexColorModel(_color.randomColorModel(256));
//			_display.updateImage(array);
			multiThread.generateFractal(2048, workers);
		}
	};

	public Future<?> future = executor.scheduleAtFixedRate(randomize, 0, 100, TimeUnit.MILLISECONDS);

	public UI() {
		initComponents();
		fractalOut.add(_display);
		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, 1);
		// this is here so there is a default
		// fractal displayed upon start
		_display.updateImage(array);
		multiThread.changePanel(_display);
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
		escDist = new javax.swing.JMenu();
		multiThre = new javax.swing.JMenu();
		computeMulti = new javax.swing.JMenuItem();
		zoom = new javax.swing.JMenu();
		zoom1 = new javax.swing.JMenuItem();
		zoom2 = new javax.swing.JMenuItem();
		close = new javax.swing.JMenuItem();
		multiThread.changePanel(_display);
//		_display.setSize(2048,2048);
		_display.setPreferredSize(new Dimension(2048,2048));
		
		workers = new SwingWorker[numThreads];
		generateSwingWorker();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout fractalOutLayout = new javax.swing.GroupLayout(fractalOut);
		fractalOut.setLayout(fractalOutLayout);
		fractalOutLayout.setHorizontalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
		fractalOutLayout.setVerticalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281, Short.MAX_VALUE));

		multiThre.setText("Choice of multi thread");
		
		
		// computeMulti is a JMenuItem
		computeMulti.setText("Enter the number of thread for computing");
		computeMulti.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				multiThreadMouseClicked(evt);
			}
		});
		
		// multiThre is a JMenu
		multiThre.add(computeMulti);
		
		
		jMenuBar1.add(multiThre);
		
		escDist.setText("Escape Time");
		escDist.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				escTimeMouseClicked(evt);
			}
		});
		jMenuBar1.add(escDist);
		escTime.setText("Escape Distance");
		escTime.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				escDistMouseClicked(evt);
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

		colorScheme2.setText("Greeen Flame!");
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
		zoom.setText("Zoom");
		zoom.add(zoom1);
		zoom1.setText("Select Area");
		zoom1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				zoomInActionPerformed(evt);
			}
		});
		zoom.add(zoom2);
		zoom2.setText("Reset Zoom");
		zoom2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resetZoomActionPerformed(evt);
			}
		});
		jMenuBar1.add(zoom);
		jMenuBar1.add(close);
		close.setText("Close");
		close.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeActionPerformed(evt);
			}
		});
		this.add(fractalOut);
		this.getContentPane().add(jMenuBar1, java.awt.BorderLayout.NORTH);
		pack();
	}

	public void fractalOutMousePressed(java.awt.event.MouseEvent evt) {
		Point point = evt.getPoint();
		sX = point.x;
		sY = point.y;
		drag = true;
	}

	public void fractalOutMouseDragged(java.awt.event.MouseEvent evt) {
		Point p = evt.getPoint();
		if (p.x < 2048 && p.y < 2048 && p.x > -1 && p.y > -1) {
			eX = p.x;
			eY = p.y;
			if (drag)
				repaint();
		}
	}

	public void fractalOutMouseReleased(java.awt.event.MouseEvent evt) {
		drag = false;
		repaint();
	}

	public void paint(Graphics graphic) {
		super.paintComponents(graphic);
		graphic.setColor(Color.RED);
		int w = Math.abs(eX - sX), h = Math.abs(eY - sY);
		// these 4 if blocks make it possible to draw a box despite the start
		// and end points.
		if (sX < eX && sY < eY)
			graphic.drawRect(sX + 8, sY + 31, w, h);
		if (sX > eX && sY < eY)
			graphic.drawRect(eX + 8, sY + 31, w, h);
		if (sX < eX && sY > eY)
			graphic.drawRect(sX + 8, eY + 31, w, h);
		if (eY < sY && eX < sX)
			graphic.drawRect(eX + 8, eY + 31, w, h);
		graphic.setColor(Color.ORANGE);
//		graphic.fillRect(0, 533, 540, 13);// Border
//		graphic.fillRect(510, 0, 15, 543);// Border
	}

	private void fracChoice1ActionPerformed(java.awt.event.ActionEvent evt) {
		// MANDELBROT SELECTED
		choice = 1;
//		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, 1);
//		_display.updateImage(array);
		generateSwingWorker();
		multiThread.generateFractal(2048, workers);
		// 2048 high,2048 wide, escape distance of 4, choice of mandelbrot
	}

	private void fracChoice2ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 2;
//		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, 2);
//		_display.updateImage(array);
		generateSwingWorker();
		multiThread.generateFractal(2048, workers);
		// 2048 high,2048 wide, escape distance of 4, choice of julia set
	}

	private void fracChoice3ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 3;
//		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, 3);
//		_display.updateImage(array);
		generateSwingWorker();
		multiThread.generateFractal(2048, workers);
		// 2048 high,2048 wide, escape distance of 4, choice of burning ship
	}

	private void fracChoice4ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 4;
//		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, 4);
//		_display.updateImage(array);
		generateSwingWorker();
		multiThread.generateFractal(2048, workers);
		// 2048 high,2048 wide, escape distance of 4, choice of multibrot
	}

	private void colorScheme1actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.GhostColorModel(256));
		_display.updateImage(array);
//		generateSwingWorker();
//		multiThread.generateFractal(2048, workers);
	}

	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.VenomColorModel(256));
		_display.updateImage(array);
//		generateSwingWorker();
//		multiThread.generateFractal(2048, workers);
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
//		generateSwingWorker();
//		multiThread.generateFractal(2048, workers);
	}

	private void resetZoomActionPerformed(java.awt.event.ActionEvent evt) {
//		array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, choice);
//		_display.updateImage(array);
		generateSwingWorker();
		multiThread.generateFractal(2048, workers);
	}

	private void zoomInActionPerformed(java.awt.event.ActionEvent evt) {
		// obtains coordinates and updates fractal
		double x1;
		double x2;
		double y1;
		double y2;
		if (sX < eX) {// if start point is less than end
			x1 = EscapeTimeAlgorithm.getxVal(sX, choice);
			x2 = EscapeTimeAlgorithm.getxVal(eX, choice);
		} else {
			x1 = EscapeTimeAlgorithm.getxVal(eX, choice);
			x2 = EscapeTimeAlgorithm.getxVal(sX, choice);
		}
		if (sY < eY) {// if start point is less than end
			y1 = EscapeTimeAlgorithm.getyVal(sY, choice);
			y2 = EscapeTimeAlgorithm.getyVal(eY, choice);
		} else {
			y1 = EscapeTimeAlgorithm.getyVal(eY, choice);
			y2 = EscapeTimeAlgorithm.getyVal(sY, choice);
		}
		array = _fractal.escTimeCalculatorArea(x1, x2, y1, y2, escDistNum, escTimeNum, choice);
		_display.updateImage(array);
//		generateSwingWorker();
//		multiThread.generateFractal(2048, workers);
	}

	private void escDistMouseClicked(java.awt.event.MouseEvent evt) {
		String msg = "0";
		while (true) {
			msg = JOptionPane.showInputDialog("Enter a new Escape Distance\nCannot Be null, or a negative number!");
			if (msg == null)
				return;// if cancel or X is pressed
			if (msg != null && isNumeric(msg) == true) {// if it's not null and
														// a number
				if (Integer.valueOf(msg) > 0) {// if it's a valid number
					escDistNum = Integer.valueOf(msg);
//					array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, choice);
//					_display.updateImage(array);// let it through
					generateSwingWorker();
					multiThread.generateFractal(2048, workers);
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "<html><b>Bad Input!</b></html>");
			// only happens if not good entry
		}
	}
	
	private void multiThreadMouseClicked(java.awt.event.ActionEvent evt) {
		String msg = "0";
		while (true) {
			msg = JOptionPane.showInputDialog("Enter a numbe of threads to generate picture\n");
			if (msg == null)
				return;// if cancel or X is pressed
			if (msg != null && isNumeric(msg) == true) {// if it's not null and
														// a number
				if (Integer.valueOf(msg) > 0) {
					// if it's a valid entry
					numThreads = Integer.valueOf(msg);
					
					
					multiThread.clearPool();
					generateSwingWorker();
					
					multiThread.generateFractal(2048, workers);
					
					// let it through
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "<html><b>Bad Input!</b></html>");
			// only happens if not good entry
		}
	}
	
	private void generateSwingWorker(){
		int ystart = 1;
		int yend = 1;
		workers = new SwingWorker[numThreads];
		if(2048 % numThreads == 0){
			int even = 2048 / numThreads;
			
			for(int i =1; i <= numThreads;i++){
				ystart = (i - 1) * even;
				yend  = i * even-1;
				
				workers[i-1] = new worker(i,choice,escTimeNum,escDistNum,ystart,yend);
			}
		}
		else{
			int left = 2048 % numThreads;
			int even = (2048 - left) / (numThreads - 1);
			for(int i = 1; i< numThreads; i++){
				ystart = (i - 1) * even;
				yend  = i * even-1;
				workers[i-1] = new worker(i,choice,escTimeNum,escDistNum,ystart,yend);
			}
			ystart = (numThreads - 1) *even;
			workers[numThreads-1] = new worker(numThreads,choice,escTimeNum,escDistNum,ystart,2047);
		}
	}
	
	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
		String msg1 = "0";
		while (true) {
			msg1 = JOptionPane.showInputDialog(
					"Enter a new Escape Time\nCannot Be null, or a negative number!\nAlso must be between 1 and 255 inclusive.");
			if (msg1 == null)
				return;// if cancel or X is pressed
			if (msg1 != null && isNumeric(msg1) == true) {// if it's not null and
														// a number

				if (Integer.valueOf(msg1) > 0 && Integer.valueOf(msg1) <= 255) {
					// if it's a valid entry
					escTimeNum = Integer.valueOf(msg1);// let it through
//					array = _fractal.escTimeCalculatorChoice(2048, 2048, escDistNum, escTimeNum, choice);
//					_display.updateImage(array);
					generateSwingWorker();
					multiThread.generateFractal(2048, workers);
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "<html><b>Bad Input!</b></html>");
			// only happens if not good entry
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