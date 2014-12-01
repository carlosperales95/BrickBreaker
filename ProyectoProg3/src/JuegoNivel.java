

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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JuegoNivel extends JPanel implements KeyListener, ActionListener, Runnable {
	public Image imgBarra;
	public Image imgPelota;
	public Image imgLadrillo;
	// para moverse
	static boolean derecha = false;
	static boolean izquierda = false;
	//posicion de las varables
	
	
	static int cuentalad=0;
	
	//pelota
	int bolaX = 233;
	int bolaY = 600;
	//		barra
	int barraX = 200;
	int barraY = 625;


	//	parte grafica
	static 	JFrame frame;
	static JPanel panel;

	// creando bola, barra y ladrillo
	Rectangle bola = new Rectangle(bolaX, bolaY, 15, 15);
	Rectangle barra = new Rectangle(barraX, barraY, 100, 15);
	static Rectangle[] ladrillo = new Rectangle[100];
	static String[] nomladrillo = new String[100];

	Thread t;

	public JuegoNivel() {
		System.out.println("comenzando el juego");
		addKeyListener(this);
		setFocusable(true);
		t = new Thread(this);
		t.start();
	}

	public static void main(String[] args) { 

		frame = new JFrame();
		JuegoNivel game = new JuegoNivel();

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

		crealad();


	}


	public static void crealad(){

		int count=0;
		
	    File fichero = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	 
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         fichero = new File ("src\\files\\NivelMuestra.txt");
	         fr = new FileReader (fichero);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea;

	         while((linea=br.readLine())!=null){

	        	int p=0;
	     		int barras=0;
	     		
	     		//Va leyendo caracteres hasta que encuentra un '-', 
	     		//que lo interpretará como un fin de declaracion de objeto
	     		
	     		for(int i=0;i<linea.length();i++){
	     			
	     			//System.out.println("p:"+p);
	     			//System.out.println("i:"+i);
	     			
	     			if(linea.charAt(i)=='-'){

	     				String objeto=linea.substring(p, i);
	     				
	     				System.out.println(objeto);
	     				
	     				//Vuelve al primer caracter del objeto y vuelve a empezar a leer caracteres
	     				//El contador barras empieza a 0 y para cuando haya leído dos barras
	     				//(que son las que separan las coordenadas donde se encontrará el objeto)
	     				
	     				for(int j=0;j<objeto.length();j++){
	     					
	     				//	System.out.println("b:"+barras);
	     	
	     				if(objeto.charAt(j)=='/'){
	     					
	     					barras=barras+1;
	     					
	     					//System.out.println("b:"+barras);
	     					
	     					if(barras==2){
	     					//	System.out.println("P:"+p);
	     					//	System.out.println("J:"+j);
	     						
	     						String coords=linea.substring(p, p+j);
	     						
	     						System.out.println(coords);
	     						
	     						//Vuelve al principio del objeto y empieza a leer caracteres
	     						//Cuando encuentre una barra habrá terminado de leer la X, 
	     						//por lo cual mediante substrings podremos separar también la Y
	     						//También podemos diferenciar Objeto y Coordenadas
	     						
	     						for(int k =0;k<coords.length();k++){
	     							
	     							if(coords.charAt(k)=='/'){
	     								
	     								String cx=linea.substring(p, p+k);
	     								
	     								String cy=linea.substring(p+k+1,p+coords.length());
	     								
	     							//	System.out.println(cx);
	     							//	System.out.println(cy);
	     								
	     								System.out.println("Objeto: " + cx +"   "+cy+"   "+coords+"   "+"!"+objeto.substring(coords.length()+1)+"!"  );
	     								
	     								//Una vez separado el objeto creamos el objeto en el frame,
	     								//con las coordenadas y el nombre de objeto que hemos obtenido con el código anterior
	     								int x=Integer.parseInt(cx);
		     							int y=Integer.parseInt(cy);
		     							
		     							
		     							
		     							nomladrillo[count]=objeto.substring(coords.length()+1);
		     							ladrillo[count]=new Rectangle(x, y, 50, 20);
		     							count=count+1;
		     							cuentalad=cuentalad+1;
		     							
		     							
	     							//	setIcon(new ImageIcon(this.getClass().getResource( "/resources/"+ objeto.substring(coords.length()+1) +".png")));
	     								
	     								
	     								
	     								barras=0;								
	     								p=i+1;
	     								
	     							//	System.out.println("p:"+p);
	     								
	     								System.out.println();
	     								System.out.println();
	     								
	     								break;}}break;}}}}}}
	      		}

		      catch(Exception e){
		         e.printStackTrace();
		      }finally{
		         // En el finally cerramos el fichero, para asegurarnos
		         // que se cierra tanto si todo va bien como si salta 
		         // una excepcion.
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }}
	}
	
	public void paint(Graphics g) {
		//		fondo
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 495, 660);

		//		bola
		imgPelota= iconToImage(new ImageIcon(this.getClass().getResource( "/resources/BolaPeq.png")));
		g.drawImage(imgPelota, bola.x, bola.y, bola.width, bola.height, null);
	
		//		barra
		imgBarra=iconToImage(new ImageIcon(this.getClass().getResource( "/resources/BarraNormal.png")));
		g.drawImage(imgBarra,barra.x, barra.y, barra.width, barra.height, null);

		//		ladrillos
		


		for (int i = 0; i < ladrillo.length; i++) {
			if (ladrillo[i] != null) {
				
				imgLadrillo= iconToImage(new ImageIcon(this.getClass().getResource( "/resources/"+ nomladrillo[i] +".png")));
				
				g.drawImage(imgLadrillo,ladrillo[i].x, ladrillo[i].y, ladrillo[i].width,ladrillo[i].height, null);


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
		
		//creando nombres disponibles para ladrillos
		
		for (int i = 0; i < cuentalad; i++) {
			nomladrillo[i] = "";
			
		}

		// creando los ladrillos
		for (int i = 0; i < cuentalad; i++) {
			ladrillo[i] = new Rectangle(0, 0, 50, 20);
			
		}

		//Ladrillo y bola chocan
		while (bolaSeCae == false && ladrillosOver == false) {
			for (int i = 0; i < ladrillo.length; i++) {
				if (ladrillo[i] != null) {
					if (ladrillo[i].intersects(bola)) {
						ladrillo[i] = null;

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
			ladrillo[i] = new Rectangle(0, 0, 50, 20);

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
	} }

