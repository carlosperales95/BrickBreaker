package juego;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JuegoBasicoJlabel  extends JPanel implements KeyListener, ActionListener, Runnable {
	// movement keys..
	static boolean derecha = false;
	static boolean izquierda = false;

	static JFrame frame;
	static JPanel panel;
	// declaracion de variables:
	//	pelota
	int bolaX = 233;
	int bolaY = 600;

	//	barra
	int barraX = 200;
	int barraY = 625;
	//	ladrillo
	int ladrilloX = 50;
	int ladrilloY = 70;

	//	// creando bola, barra y ladrillo
	//
	//	public Bola bola = new Bola();
	//	public Player barra= new Player();
	//	public Bloque[] ladrillo = new Bloque[21];

	Thread t;

	//fin creacion atributos???

	JuegoBasicoJlabel() {
		System.out.println("comenzando el juego");
		addKeyListener(this);
		setFocusable(true);
		t = new Thread(this);
		System.out.println("1");
		t.start();
	}

	public static void main(String[] args) { //ASTRAIN

		// creando bola, barra y ladrillo

		Bola bola = new Bola();
		Player barra= new Player();
		Bloque[] ladrillo = new Bloque[21];

		System.out.println("2");
		frame = new JFrame();
		JuegoBasicoJlabel game = new JuegoBasicoJlabel();

		frame.setBounds(450, 25, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("restart");
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

		panel = new JPanel();
		panel.setBounds(0, 0, 490, 660);
		panel.setBackground(Color.RED);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.add(game);
		button.addActionListener(game);

		panel.add(bo)


		//		//		barra
		//		//		JPanel barra = new JPanel();
		//		//		barra.setBounds(200, 625, 100, 20);
		//		//		panel.add(barra);
		//		//		barra.setLayout(new BorderLayout(0, 0));
		//
		//		JLabel lblNewLabel = new JLabel("");
		//		//		barra.add(lblNewLabel);
		//		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BarraNormal.png"));
		//		lblNewLabel.setBounds(200, 625, 100, 20);
		//		panel.add(lblNewLabel);

		//		pelota
		//		JPanel pelota = new JPanel();
		//		pelota.setBackground(Color.GREEN);
		//		pelota.setBounds(233, 603, 15, 15);
		//		panel.add(pelota);
		//		pelota.setLayout(new BorderLayout(0, 0));

		//		JLabel lblPILOTA = new JLabel("");
		//		//		pelota.add(lblPILOTA);
		//		lblPILOTA.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\oie_transparent.png"));
		//		lblPILOTA.setBounds(233, 603, 15, 15);
		//		panel.add(lblNewLabel);
		//		ladrillos

		//		JPanel panel_0 = new JPanel();
		//		panel.add(panel_0);
		//		panel_0.setLayout(new BorderLayout(0, 0));

		JLabel label_0 = new JLabel("");
		label_0.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		panel.add(label_0);
		label_0.setBounds(50, 70, 50, 20);

		//		JPanel panel_1 = new JPanel();
		//		panel.add(panel_1);
		//		panel_1.setLayout(new BorderLayout(0, 0));

		JLabel label_1 = new JLabel("");
		panel.add(label_1, BorderLayout.CENTER);
		label_1.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_1.setBounds(110, 70, 50, 20);

		//		JPanel panel_2 = new JPanel();
		//		panel.add(panel_2);
		//		panel_2.setLayout(new BorderLayout(0, 0));

		JLabel label_2 = new JLabel("");
		panel.add(label_2, BorderLayout.CENTER);
		label_2.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_2.setBounds(170, 70, 50, 20);

		//		JPanel panel_3 = new JPanel();
		//		panel.add(panel_3);
		//		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel label_3 = new JLabel("");
		panel.add(label_3, BorderLayout.CENTER);
		label_3.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_3.setBounds(230, 70, 50, 20);

		//		JPanel panel_4 = new JPanel();
		//		panel.add(panel_4);
		//		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel label_4 = new JLabel("");
		panel.add(label_4, BorderLayout.CENTER);
		label_4.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_4.setBounds(290, 70, 50, 20);

		//		JPanel panel_5 = new JPanel();
		//		panel.add(panel_5);
		//		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel label_5 = new JLabel("");
		panel.add(label_5, BorderLayout.CENTER);
		label_5.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_5.setBounds(350, 70, 50, 20);

		//		JPanel panel_6 = new JPanel();
		//		panel.add(panel_6);
		//		panel_6.setLayout(new BorderLayout(0, 0));

		JLabel label_6 = new JLabel("");
		panel.add(label_6, BorderLayout.CENTER);
		label_6.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_6.setBounds(85, 100, 50, 20);

		//		JPanel panel_7 = new JPanel();
		//		panel.add(panel_7);
		//		panel_7.setLayout(new BorderLayout(0, 0));

		JLabel label_7 = new JLabel("");
		panel.add(label_7, BorderLayout.CENTER);
		label_7.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_7.setBounds(145, 100, 50, 20);

		//		JPanel panel_8 = new JPanel();
		//		panel.add(panel_8);
		//		panel_8.setLayout(new BorderLayout(0, 0));

		JLabel label_8 = new JLabel("");
		panel.add(label_8, BorderLayout.CENTER);
		label_8.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_8.setBounds(205, 100, 50, 20);

		//		JPanel panel_9 = new JPanel();
		//		panel.add(panel_9);
		//		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel label_9 = new JLabel("");
		panel.add(label_9, BorderLayout.CENTER);
		label_9.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_9.setBounds(265, 100, 50, 20);

		//		JPanel panel_10 = new JPanel();
		//		panel.add(panel_10);
		//		panel_10.setLayout(new BorderLayout(0, 0));

		JLabel label_10 = new JLabel("");
		panel.add(label_10, BorderLayout.CENTER);
		label_10.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_10.setBounds(325, 100, 50, 20);

		//		JPanel panel_11 = new JPanel();
		//		panel.add(panel_11);
		//		panel_11.setLayout(new BorderLayout(0, 0));

		JLabel label_11 = new JLabel("");
		panel.add(label_11, BorderLayout.CENTER);
		label_11.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_11.setBounds(111, 130, 50, 20);

		//		JPanel panel_12 = new JPanel();
		//		panel.add(panel_12);
		//		panel_12.setLayout(new BorderLayout(0, 0));

		JLabel label_12 = new JLabel("");
		panel.add(label_12, BorderLayout.CENTER);
		label_12.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_12.setBounds(171, 130, 50, 20);

		//		JPanel panel_13 = new JPanel();
		//		panel.add(panel_13);
		//		panel_13.setLayout(new BorderLayout(0, 0));

		JLabel label_13 = new JLabel("");
		panel.add(label_13, BorderLayout.CENTER);
		label_13.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_13.setBounds(231, 130, 50, 20);

		//		JPanel panel_14 = new JPanel();
		//		panel.add(panel_14);
		//		panel_14.setLayout(new BorderLayout(0, 0));

		JLabel label_14 = new JLabel("");
		panel.add(label_14, BorderLayout.CENTER);
		label_14.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_14.setBounds(291, 130, 50, 20);

		//		JPanel panel_15 = new JPanel();
		//		panel.add(panel_15);
		//		panel_15.setLayout(new BorderLayout(0, 0));

		JLabel label_15 = new JLabel("");
		panel.add(label_15, BorderLayout.CENTER);
		label_15.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_15.setBounds(145, 160, 50, 20);

		//		JPanel panel_16 = new JPanel();
		//		panel.add(panel_16);
		//		panel_16.setLayout(new BorderLayout(0, 0));

		JLabel label_16 = new JLabel("");
		panel.add(label_16, BorderLayout.CENTER);
		label_16.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_16.setBounds(205, 160, 50, 20);

		//		JPanel panel_17 = new JPanel();
		//		panel.add(panel_17);
		//		panel_17.setLayout(new BorderLayout(0, 0));

		JLabel label_17 = new JLabel("");
		panel.add(label_17, BorderLayout.CENTER);
		label_17.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_17.setBounds(265, 160, 50, 20);

		//		JPanel panel_18 = new JPanel();
		//		panel.add(panel_18);
		//		panel_18.setLayout(new BorderLayout(0, 0));

		JLabel label_18 = new JLabel("");
		panel.add(label_18, BorderLayout.CENTER);
		label_18.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_18.setBounds(171, 194, 50, 20);

		//		JPanel panel_19 = new JPanel();
		//		panel.add(panel_19);
		//		panel_19.setLayout(new BorderLayout(0, 0));

		JLabel label_19 = new JLabel("");
		panel.add(label_19, BorderLayout.CENTER);
		label_19.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_19.setBounds(231, 194, 50, 20);

		//		JPanel panel_20 = new JPanel();
		//		label_20.setBounds(205, 225, 50, 20);
		//		panel.add(panel_20);
		//		panel_20.setLayout(new BorderLayout(0, 0));

		JLabel label_20 = new JLabel("");
		panel.add(label_20, BorderLayout.CENTER);
		label_20.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		label_20.setBounds(205, 225, 50, 20);



		frame.setVisible(true);
		System.out.println("22");
	}



	// declaring bola, paddle,ladrillos

	public void paint(Graphics g) {
		System.out.println("3");
		//		g.setColor(Color.LIGHT_GRAY);
		//		g.fillRect(0, 0, 495, 660);
		//		g.setColor(Color.blue);
		//		g.fillOval(bola.posx, bola.posy, bola.getAnchoAlto(), bola.getAnchoAlto());
		//		g.setColor(Color.green);
		//		g.fill3DRect(barra.posx, barra.posy, barra.getAnchura(), barra.getAltura(), true);
		//		//			g.setColor(Color.GRAY);
		//		//			g.fillRect(0, 251, 450, 200);
		//		g.setColor(Color.red);
		//		g.drawRect(0, 0, 493, 644);
		//		for (int i = 0; i < ladrillo.length; i++) {
		//			if (ladrillo[i] != null) {
		//				g.fill3DRect(ladrillo[i].posx, ladrillo[i].posy, ladrillo[i].getAnch(),
		//						ladrillo[i].getAlt(), true);
		//
		//
		//			}
		//		}

		if (bolaFallDown == true || ladrillosOver == true) {
			Font f = new Font("Arial", Font.BOLD, 20);
			g.setFont(f);
			g.drawString(status, 70, 120);
			bolaFallDown = false;
			ladrillosOver = false;
		}

	}

	// /...Game Loop...................

	// /////////////////// When bola strikes borders......... it
	// reverses......==>
	int movex = -1;
	int movey = -1;
	boolean bolaFallDown = false;
	boolean ladrillosOver = false;
	int count = 0;
	String status;

	public void run() {
		System.out.println("run");
		//		creando pelota
		//		JLabel labelPelota=  new JLabel();
		//		labelPelota.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\oie_transparent.png"));
		//		bola.setImagenObj(labelPelota);

		// //////////// =====Creating ladrillos for the game===>.....
		for (int i = 0; i < ladrillo.length; i++) {
			ladrillo[i] = new Bloque();
			ladrillo[i].getImagenObj().setBounds(ladrilloX, ladrilloY, 100, 20);
			panel.add(ladrillo[i].getImagenObj());
			if (i == 6) {
				ladrilloX = 85;
				ladrilloY = 100;
			}
			if (i == 11) {
				ladrilloX = 110;
				ladrilloY = 130;
			}
			if (i == 15) {
				ladrilloX = 145;
				ladrilloY = 160;
			}
			if (i == 18) {
				ladrilloX = 171;
				ladrilloY = 190;
			}
			if (i == 15) {
				ladrilloX = 205;
				ladrilloY = 220;
			}
			ladrilloX += 60;
		}
		// ===========ladrilloS created for the game new ready to use===

		// ====================================================
		// == bola CHOCA ladrillo=======

		//		while (bolaFallDown == false && ladrillosOver == false) {
		//			//   if(gameOver == true){return;}
		//			for (int i = 0; i < ladrillo.length; i++) {
		//				if (ladrillo[i] != null) {
		//					if(ladrillo[i].posy== (bola.posy+bola.getAnchoAlto()) ||((ladrillo[i].posy+ladrillo[i].getAlt())== (bola.posy) )){
		//						ladrillo[i] = null;
		//
		//						//							movex = -movex;
		//						movey = -movey;
		//						count++;
		//					}// end of 2nd if..
		//				}// end of 1st if..
		//			}// end of for loop..

		// /////////// =================================

		if (count == ladrillo.length) {// check if bola hits all ladrillos
			ladrillosOver = true;
			status = "YOU WON THE GAME";
			repaint();
		}
		// /////////// =================================
		repaint();
		bola.posx += movex;
		bola.posy += movey;

		if (izquierda == true) {

			barra.posx -= 5;
			derecha = false;
		}
		if (derecha == true) {
			barra.posx += 5;
			izquierda = false;
		}
		if (barra.posx <= 4) {
			barra.posx = 4;
		} else if (barra.posx >= 400){
			barra.posx = 400;
		}
		// /===== bola reverses when strikes the barra
		//PUTA NO FUNCIONA, HAY QUE HAYAR LA POSX DEL MOMENTO
		//	if (((bolaX+7.5)==(barraX+50)) || ((bolaY+7.5==barraY+7.5))) {

		if(barra.posy== (bola.posy+bola.getAnchoAlto()) ||((barra.posy+barra.getAltura())== (bola.posy) )){
			movey = -movey;
			// if(bola.y + bola.width >=barra.y)
		}
		// //=====================================
		// ....bola reverses when touches izquierda and derecha boundary
		if (bola.posx <= 0 || bola.posx + bola.getAnchoAlto() >= 493) {
			movex = -movex;
		}// if ends here
		if (bola.posy <= 0) {// ////////////////|| bolaY + bola.height >= 250
			movey = -movey;
		}// if ends here.....
		if (bola.posy >= 660) {// when bola falls below barra game is over...
			bolaFallDown = true;
			status = "YOU LOST THE GAME";
			repaint();
			//    System.out.print("game");
		}
		try {
			Thread.sleep(3);
		} catch (Exception ex) {
		}// try catch ends here

	}// while loop ends here

	//	}

	// loop ends here

	// ///////..... HANDLING KEY EVENTS................//
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			izquierda = true;
			// System.out.print("izquierda");
		}

		if (keyCode == KeyEvent.VK_RIGHT) {
			derecha = true;
			// System.out.print("derecha");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			izquierda = false;
		}

		if (keyCode == KeyEvent.VK_RIGHT) {
			derecha = false;
		}
		if (keyCode == KeyEvent.VK_R) {
			System.out.print("restart");
			this.restart();		
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("restart")) {
			System.out.print("restart");
			this.restart();

		}
	}

	public void restart() {

		requestFocus(true);
		System.out.println("restart");
		// ..............
		// variables declaration for bola.................................
		bolaX = 233;
		bolaY = 600;
		// variables declaration for bola.................................
		// ===============================================================
		// variables declaration for barra..................................
		int barraX = 200;
		int barraY = 625;
		// variables declaration for barra..................................
		// ===============================================================
		// variables declaration for ladrillo...............................
		ladrilloX = 70;
		ladrilloY = 50;
		// variables declaration for ladrillo...............................
		// ===============================================================
		// declaring bola, paddle,ladrillos
		bola = new Bola();
		barra = new Player();
		// Rectangle ladrillo;// = new Rectangle(ladrilloX, ladrilloY, 30, 10);
		//		ladrillo = new Bloque[12];

		movex = -1;
		movey = -1;
		bolaFallDown = false;
		ladrillosOver = false;
		count = 0;
		status = null;

		// //////////// =====Creating ladrillos for the game===>.....
		/*
		 * creating ladrillos again because this for loop is out of while loop in
		 * run method
		 */
		//		for (int i = 0; i < ladrillo.length; i++) {
		//			ladrillo[i] = new Bloque();
		//			if (i == 5) {
		//				ladrilloX = 70;
		//				ladrilloY = 72;
		//			}
		//			if (i == 9) {
		//				ladrilloX = 100;
		//				ladrilloY = 94;
		//			}
		//			ladrilloX += 51;
		//		}
		repaint();
	}
}