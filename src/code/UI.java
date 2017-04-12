//<<<<<<< HEAD
//<<<<<<< HEAD
//package code;
//
//import javax.swing.JFrame;
//import listener.*;
//import javax.swing.*;
//
//import java.awt.event.ActionListener;
//import java.awt.image.IndexColorModel;
//import java.lang.Enum;
//import java.lang.Object;
//
//
//import javax.swing.JOptionPane;
//
//import edu.buffalo.fractal.FractalPanel;
//
//
////public class UI {
////	public static FractalPanel _panel = new FractalPanel();
////	public static EscapeTimeAlgorithm _escape = new EscapeTimeAlgorithm();
////	public static IndexColorModel _indexColor;
////	public static int _escTime = 2;
////	public static int _numColors = 255;
////	public static int[][] _currentArr = _escape.escTimeCalculator(512,512,_escTime,255,1);
////	public static ActionListener _changeToRedAlpha;
////	public static ActionListener _changeToRainbow;
////	
////	public UI(){
////		
////		int[][] mandarr = _escape.escTimeCalculator(512,512,_escTime,255,1);
////		int[][] jarr = _escape.escTimeCalculator(512,512,_escTime,255,2);
////		int[][] bsarr = _escape.escTimeCalculator(512,512,_escTime,255,3);
////		int[][] multiarr = _escape.escTimeCalculator(512,512,_escTime,255,4);
////		
////		_indexColor = colorScan.createRedAlphaColorModel(_numColors + 1);
////		_panel.setIndexColorModel(_indexColor);
////		_panel.updateImage(mandarr);
////	//	_panel.saveImage(PNG, mandarr);
////		
////		
////		//_panel.updateImage(jarr);
//////		_panel.saveImage(PNG,jarr);
////		
////	//	_panel.updateImage(bsarr);
//////		_panel.saveImage(PNG, bsarr);
////		
////	//	_panel.updateImage(multiarr);
//////		_panel.saveImage(PNG, multiarr);
////		
////		_currentArr = multiarr;
////		
////		JFrame window = new JFrame();//instantiating JFrame window
////		
////		//JmenuBar->JMenu->JMenuItem
////		JMenuBar menu = new JMenuBar();
////		JMenu fileLoc = new JMenu("Choose File Location");
////		JMenuItem fileLoc1 = new JMenuItem("TODO");
////		JMenuItem fileLoc2 = new JMenuItem("TODO");
////		JMenuItem fileLoc3 = new JMenuItem("TODO");
////		JMenuItem fileLoc4 = new JMenuItem("TODO");
////		fileLoc.add(fileLoc1);
////		fileLoc.add(fileLoc2);
////		fileLoc.add(fileLoc3);
////		fileLoc.add(fileLoc4);
////		menu.add(fileLoc);//adding JMenu to Menu Bar
////		JMenu fracChoice = new JMenu("Select a Fractal");
////		JMenuItem fracChoice1 = new JMenuItem("Mandelbrot");
////		fracChoice1.addActionListener(new changeFractal(_panel,mandarr));
////		JMenuItem fracChoice2 = new JMenuItem("Julia Set");
////		fracChoice2.addActionListener(new changeFractal(_panel,jarr));
////		JMenuItem fracChoice3 = new JMenuItem("Burning Ship");
////		fracChoice3.addActionListener(new changeFractal(_panel,bsarr));
////		JMenuItem fracChoice4 = new JMenuItem("Multibrot");
////		fracChoice4.addActionListener(new changeFractal(_panel,multiarr));
////=======
///*
// * To change this license header, choose License Headers in Project Praoperties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author dekuh
// */
//public class UI extends javax.swing.JFrame {
//	// JPanel.add(instance of FractalPanel
//
//	private static final long serialVersionUID = 1L;
//	public int[][] array;
//	public int escDist = 4;
//	public FractalPanel _display;
//	public colorModel _color;
//	public EscapeTimeAlgorithm _fractal;
//	private javax.swing.JMenu colorScheme;
//	private javax.swing.JMenuItem colorScheme1;
//	private javax.swing.JMenuItem colorScheme2;
//	private javax.swing.JMenuItem colorScheme3;
//	private javax.swing.JMenuItem colorScheme4;
//	private javax.swing.JMenu escTime;
//	private javax.swing.JMenu fracChoice;
//	private javax.swing.JMenuItem fracChoice1;
//	private javax.swing.JMenuItem fracChoice2;
//	private javax.swing.JMenuItem fracChoice3;
//	private javax.swing.JMenuItem fracChoice4;
//	private javax.swing.JPanel fractalOut;
//	private javax.swing.JMenuBar jMenuBar1;
//
//	public UI() {
//		initComponents();
//		fractalOut.add(_display);
//		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 1);
//		//this is here so there is a default
//		//fractal displayed upon start
//		_display.updateImage(array);
//	}
//
//	private void initComponents() {
//		_color = new ColorModel();
//		_display = new FractalPanel();
//		_fractal = new EscapeTimeAlgorithm();
//		fractalOut = new javax.swing.JPanel();
//		jMenuBar1 = new javax.swing.JMenuBar();
//		fracChoice = new javax.swing.JMenu();
//		fracChoice1 = new javax.swing.JMenuItem();
//		fracChoice2 = new javax.swing.JMenuItem();
//		fracChoice3 = new javax.swing.JMenuItem();
//		fracChoice4 = new javax.swing.JMenuItem();
//		colorScheme = new javax.swing.JMenu();
//		colorScheme1 = new javax.swing.JMenuItem();
//		colorScheme2 = new javax.swing.JMenuItem();
//		colorScheme3 = new javax.swing.JMenuItem();
//		colorScheme4 = new javax.swing.JMenuItem();
//		escTime = new javax.swing.JMenu();
//
//		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//		javax.swing.GroupLayout fractalOutLayout = new javax.swing.GroupLayout(fractalOut);
//		fractalOut.setLayout(fractalOutLayout);
//		fractalOutLayout.setHorizontalGroup(fractalOutLayout
//				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
//		fractalOutLayout.setVerticalGroup(fractalOutLayout
//				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281, Short.MAX_VALUE));
//
//		escTime.setText("Escape Time");
//		escTime.addMouseListener(new java.awt.event.MouseAdapter() {
//			public void mouseClicked(java.awt.event.MouseEvent evt) {
//				escTimeMouseClicked(evt);
//			}
//		});
//		jMenuBar1.add(escTime);
//
//		fracChoice.setText("Fractal Choice");
//
//		fracChoice1.setText("Mandelbrot");
//		fracChoice1.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				fracChoice1ActionPerformed(evt);
//			}
//		});
//		fracChoice.add(fracChoice1);
//
//		fracChoice2.setText("Julia Set");
//		fracChoice2.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				fracChoice2ActionPerformed(evt);
//			}
//		});
//		fracChoice.add(fracChoice2);
//
//		fracChoice3.setText("Burning Ship");
//
//		fracChoice3.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				fracChoice3ActionPerformed(evt);
//			}
//		});
//		fracChoice.add(fracChoice3);
//
//		fracChoice4.setText("Multibrot");
//
//		fracChoice4.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				fracChoice4ActionPerformed(evt);
//			}
//		});
//		fracChoice.add(fracChoice4);
//
//		
//		menu.add(fracChoice);//adding JMenu to Menu Bar
//		
//		
//		JMenu colorScheme = new JMenu("Select Color Scheme");
//		JMenuItem colorScheme1 = new JMenuItem("red alpha");
//		//_changeToRedAlpha = new changeColorModel(_panel,colorScan.createRedAlphaColorModel(_numColors + 1),_currentArr);
//		_changeToRedAlpha = new changeColorModel(_panel,colorScan.createRedAlphaColorModel(256),_currentArr);
//		colorScheme1.addActionListener(_changeToRedAlpha);
//		
//		JMenuItem colorScheme2 = new JMenuItem("rainbow");
//		_changeToRainbow = new changeColorModel(_panel,colorScan.createRedAlphaColorModel(_numColors + 1),_currentArr);
//		colorScheme2.addActionListener(_changeToRainbow);
//		
//		JMenuItem colorScheme3 = new JMenuItem("TODO");
//		JMenuItem colorScheme4 = new JMenuItem("TODO");
//		
//
//		jMenuBar1.add(fracChoice);
//
//		colorScheme.setText("Color Scheme");
//
//		colorScheme1.setText("TODO");
//		colorScheme1.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				colorScheme1actionPerformed(evt);
//			}
//		});
//
//		colorScheme.add(colorScheme1);
//
//		colorScheme2.setText("TODO");
//		colorScheme2.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				colorScheme2actionPerformed(evt);
//			}
//		});
//		colorScheme.add(colorScheme2);
//
//		colorScheme3.setText("TODO");
//		colorScheme3.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				colorScheme3actionPerformed(evt);
//			}
//		});
//		colorScheme.add(colorScheme3);
//
//		colorScheme4.setText("TODO");
//		colorScheme4.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				colorScheme4actionPerformed(evt);
//			}
//		});
//		colorScheme.add(colorScheme4);
//
//		menu.add(colorScheme);//adding JMenu to Menu Bar
//		JMenuItem update = new JMenuItem("Update Fractal");
//		JMenuItem close = new JMenuItem("Exit Program");
//		close.addActionListener(new closeListener());//adding action listener to JMenuItem close
//		menu.add(update);//adding Menu Item to Menu Bar
//		menu.add(close);//adding Menu Item to Menu Bar
//
//		window.setJMenuBar(menu);//add all JMenuBar to the JFrame
//		window.add(_panel);//add fractal panel to JFrame
//		window.pack();//set size of JFrame automatically
//		window.setVisible(true);//set JFrame visible
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close when click cross button
//		
//
//		jMenuBar1.add(colorScheme);
//
//		setJMenuBar(jMenuBar1);
//
//		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//		getContentPane().setLayout(layout);
//		layout.setHorizontalGroup(
//				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(fractalOut,
//						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
//		layout.setVerticalGroup(
//				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(fractalOut,
//						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
//
//		pack();
//
//	}
//	
//
//	private void fracChoice1ActionPerformed(java.awt.event.ActionEvent evt) {
//		// MANDELBROT SELECTED
//		System.out.println("Generating Mand");
//		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 1);
//		_display.updateImage(array);
//		// 512 high,512 wide, escape distance of 4, choice of mandelbrot
//	}
//
//	private void fracChoice2ActionPerformed(java.awt.event.ActionEvent evt) {
//		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 2);
//		_display.updateImage(array);
//		// 512 high,512 wide, escape distance of 4, choice of julia set
//	}
//
//	private void fracChoice3ActionPerformed(java.awt.event.ActionEvent evt) {
//		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 3);
//		_display.updateImage(array);
//		// 512 high,512 wide, escape distance of 4, choice of burning ship
//	}
//
//	private void fracChoice4ActionPerformed(java.awt.event.ActionEvent evt) {
//		array = _fractal.escTimeCalculator(512, 512, escDist, 255, 4);
//		_display.updateImage(array);
//		// 512 high,512 wide, escape distance of 4, choice of multibrot
//	}
//
//	private void colorScheme1actionPerformed(java.awt.event.ActionEvent evt) {
//		_display.updateImage(array);
//		_display.setIndexColorModel(_color.methodName);
//		// COLOR SCHEME 1
//	}
//
//	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {
//
//		_display.updateImage(array);
//		// COLOR SCHEME 2
//	}
//
//	private void colorScheme3actionPerformed(java.awt.event.ActionEvent evt) {
//
//		_display.updateImage(array);
//		// COLOR SCHEME 3
//	}
//
//	private void colorScheme4actionPerformed(java.awt.event.ActionEvent evt) {
//
//		// COLOR SCHEME 4
//		_display.updateImage(array);
//	}
//
//	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
//		String msg = "0";
//		while (Integer.valueOf(msg) <= 0) {
//			msg = JOptionPane.showInputDialog("Enter a new Escape Distance\nCannot Be null, or a negative number!");
//			if (Integer.valueOf(msg) > 0) {
//				escDist = Integer.valueOf(msg);
//			}
//		}
//		_display.updateImage(array);
//	}
//
//	/**
//	 * @param args
//	 *            the command line arguments
//	 */
//	public static void main(String args[]) {
//		/* Set the Nimbus look and feel */
//		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
//		// code (optional) ">
//		/*
//		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
//		 * default look and feel. For details see
//		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
//		 * html
//		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
//		// </editor-fold>
//
//		/* Create and display the form */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new UI().setVisible(true);
//			}
//		});
//	}
//}
//=======
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

=======

package code;

import java.awt.Color;
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
	public int escTimeNum = 255;
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
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, 1);
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
		escDist = new javax.swing.JMenu();
		zoom = new javax.swing.JMenu();
		zoom1 = new javax.swing.JMenuItem();
		zoom2 = new javax.swing.JMenuItem();
		close = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout fractalOutLayout = new javax.swing.GroupLayout(fractalOut);
		fractalOut.setLayout(fractalOutLayout);
		fractalOutLayout.setHorizontalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
		fractalOutLayout.setVerticalGroup(fractalOutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281, Short.MAX_VALUE));

		escDist.setText("Escape Distance");
		escDist.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				escTimeMouseClicked(evt);
			}
		});
		jMenuBar1.add(escDist);
		escTime.setText("Escape Time");
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
		this.getContentPane().add(jMenuBar1, java.awt.BorderLayout.SOUTH);
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
		if (p.x < 512 && p.y < 512 && p.x > -1 && p.y > -1) {
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
		graphic.fillRect(0, 543, 540, 13);// Border
		graphic.fillRect(520, 0, 15, 543);// Border
	}

	private void fracChoice1ActionPerformed(java.awt.event.ActionEvent evt) {
		// MANDELBROT SELECTED
		choice = 1;
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, 1);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of mandelbrot
	}

	private void fracChoice2ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 2;
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, 2);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of julia set
	}

	private void fracChoice3ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 3;
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, 3);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of burning ship
	}

	private void fracChoice4ActionPerformed(java.awt.event.ActionEvent evt) {
		choice = 4;
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, 4);
		_display.updateImage(array);
		// 512 high,512 wide, escape distance of 4, choice of multibrot
	}

//>>>>>>> branch 'master' of https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
	private void colorScheme1actionPerformed(java.awt.event.ActionEvent evt) {
		future.cancel(true);
		_display.setIndexColorModel(_color.GhostColorModel(256));
//<<<<<<< HEAD
		_display.updateImage(array);
	}

	private void colorScheme2actionPerformed(java.awt.event.ActionEvent evt) {
		_display.setIndexColorModel(_color.GreenscaleColorModel(256));
		_display.updateImage(array);
	}

	private void colorScheme3actionPerformed(java.awt.event.ActionEvent evt) {
		_display.setIndexColorModel(_color.BluescaleColorModel(256));
		_display.updateImage(array);
	}

	private void closeActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void colorScheme4actionPerformed(java.awt.event.ActionEvent evt) {
		_display.setIndexColorModel(_color.RedscaleColorModel(256));
		_display.updateImage(array);
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
//=======
		//_display.


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

	private void resetZoomActionPerformed(java.awt.event.ActionEvent evt) {
		array = _fractal.escTimeCalculatorChoice(512, 512, escDistNum, escTimeNum, choice);
		_display.updateImage(array);
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
					escDistNum = Integer.valueOf(msg);// let it through
					break;
				}
			}
			JOptionPane.showMessageDialog(null, "<html><b>Bad Input!</b></html>");
			// only happens if not good entry
		}
	}

	private void escTimeMouseClicked(java.awt.event.MouseEvent evt) {
		String msg = "0";
		while (true) {
			msg = JOptionPane.showInputDialog(
					"Enter a new Escape Time\nCannot Be null, or a negative number!\nAlso must be between 1 and 255 inclusive.");
			if (msg == null)
				return;// if cancel or X is pressed
			if (msg != null && isNumeric(msg) == true) {// if it's not null and
														// a number
				if (Integer.valueOf(msg) > 0 && Integer.valueOf(msg) <= 255) {
					// if it's a valid entry
					escTimeNum = Integer.valueOf(msg);// let it through
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
>>>>>>> branch 'master' of https://github.com/CSE116-Spring2017/semesterlongproject-b5-bitsplease.git
