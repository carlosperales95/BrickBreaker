

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JuegoBasico extends JPanel implements KeyListener, ActionListener, Runnable {
	public Image imgBarra;
	public Image imgPelota;
	public Image imgLadrillo;
	// para moverse
	static boolean derecha = false;
	static boolean izquierda = false;
	//posicion de las varables
	//pelota
	int bolaX = 233;
	int bolaY = 600;
	//		barra
	int barraX = 200;
	int barraY = 625;
	//		ladrillo
	int ladrilloX = 70;
	int ladrilloY = 50;

	//	parte grafica
	static 	JFrame frame;
	static JPanel panel;

	// creando bola, barra y ladrillo
	Rectangle bola = new Rectangle(bolaX, bolaY, 15, 15);
	Rectangle barra = new Rectangle(barraX, barraY, 100, 15);
	Rectangle[] ladrillo = new Rectangle[13];

	Thread t;

	JuegoBasico() {
		System.out.println("comenzando el juego");
		addKeyListener(this);
		setFocusable(true);
		t = new Thread(this);
		t.start();
	}

	public static void main(String[] args) { 

		frame = new JFrame();
		JuegoBasico game = new JuegoBasico();

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
		frame.setVisible(true);




	}


	public void paint(Graphics g) {
		//		fondo
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 495, 660);
		//		bola
		//		g.setColor(Color.GREEN);
		imgPelota= iconToImage(new ImageIcon("C:\\Users\\Jon\\Downloads\\oie_transparent.png"));
		g.drawImage(imgPelota, bola.x, bola.y, bola.width, bola.height, null);
		//		g.fillOval(bola.x, bola.y, bola.width, bola.height);  //Oval--> para hacer el cuadrado redondo
		//		barra

		//		g.setColor(Color.BLACK);
		imgBarra=iconToImage(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BarraNormal.png"));
		g.drawImage(imgBarra,barra.x, barra.y, barra.width, barra.height, null);
		//		g.fill3DRect(barra.x, barra.y, barra.width, barra.height, true);

		//		ladrillos
		imgLadrillo= iconToImage(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		//		g.setColor(Color.blue);
		//		g.drawRect(0, 0, 493, 644);

		for (int i = 0; i < ladrillo.length; i++) {
			if (ladrillo[i] != null) {
				g.drawImage(imgLadrillo,ladrillo[i].x, ladrillo[i].y, ladrillo[i].width,
						ladrillo[i].height, null);


			}
		}
		// fin del juego (PERDER)
		if (bolaSeCae == true || ladrillosOver == true) {
			Font f = new Font("Arial", Font.BOLD, 20);
			g.setFont(f);
			g.drawString(status, 70, 120);
			bolaSeCae = false;
			ladrillosOver = false;
		}

	}

	int movex = -1;
	int movey = -1;
	boolean bolaSeCae = false;
	boolean ladrillosOver = false;
	int count = 0;
	String status;

	public void run() {
		System.out.println("run");

		// creando los ladrillos
		for (int i = 0; i < ladrillo.length; i++) {
			ladrillo[i] = new Rectangle(ladrilloX, ladrilloY, 50, 20);
			if (i == 5) {
				ladrilloX = 70;
				ladrilloY = 72;
			}
			if (i == 9) {
				ladrilloX = 100;
				ladrilloY = 94;
			}
			ladrilloX += 51;
		}

		//Ladrillo y bola chocan
		while (bolaSeCae == false && ladrillosOver == false) {
			for (int i = 0; i < ladrillo.length; i++) {
				if (ladrillo[i] != null) {
					if (ladrillo[i].intersects(bola)) {
						ladrillo[i] = null;

						//													movex = -movex;
						movey = -movey;
						count++;
					}
				}
			}

			//compueba a ver si quedan ladrillos--> FIN DEL JUEGO (ganar)
			if (count == ladrillo.length) {
				ladrillosOver = true;
				status = "YOU WON THE GAME";
				repaint();
			}
			repaint();
			bola.x += movex;
			bola.y += movey;
			//movimiento barra
			if (izquierda == true) {

				barra.x -= 5;
				derecha = false;
			}
			if (derecha == true) {
				barra.x += 5;
				izquierda = false;
			}

			//margenes barra
			if (barra.x <= 4) {
				barra.x = 4;
			} else if (barra.x >= 400){
				barra.x = 400;
			}

			//bola cocha barra
			if (bola.intersects(barra)) {
				movey = -movey;
				// if(bola.y + bola.width >=barra.y)
			}

			//			margenes bola
			if (bola.x <= 0 || bola.x + bola.height >= 493) {
				movex = -movex;
			}
			if (bola.y <= 0) {
				movey = -movey;
			}
			//bola cae--> FIN PIERDES
			if (bola.y >= 660) {
				bolaSeCae = true;
				status = "YOU LOST THE GAME";
				repaint();
			}
			try {
				Thread.sleep(6);
			} catch (Exception ex) {
			}

		}

	}

	//	teclas
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

		bolaX = 233;
		bolaY = 600;

		int barraX = 200;
		int barraY = 625;

		ladrilloX = 70;
		ladrilloY = 50;


		bola = new Rectangle(bolaX, bolaY, 15, 15);
		barra = new Rectangle(barraX, barraY, 100, 15);
		ladrillo = new Rectangle[13];

		movex = -1;
		movey = -1;
		bolaSeCae = false;
		ladrillosOver = false;
		count = 0;
		status = null;

		for (int i = 0; i < ladrillo.length; i++) {
			ladrillo[i] = new Rectangle(ladrilloX, ladrilloY, 50, 20);
			if (i == 5) {
				ladrilloX = 70;
				ladrilloY = 72;
			}
			if (i == 9) {
				ladrilloX = 100;
				ladrilloY = 94;
			}
			ladrilloX += 51;
		}
		repaint();
	}
	static Image iconToImage(Icon icon) {
		if (icon instanceof ImageIcon) {
			return ((ImageIcon)icon).getImage();
		} 
		else {
			int w = icon.getIconWidth();
			int h = icon.getIconHeight();
			GraphicsEnvironment ge = 
					GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gd.getDefaultConfiguration();
			BufferedImage image = gc.createCompatibleImage(w, h);
			Graphics2D g = image.createGraphics();
			icon.paintIcon(null, g, 0, 0);
			g.dispose();
			return image;
		}
	}
}