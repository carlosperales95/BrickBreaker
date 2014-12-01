import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class NivelJuego extends JFrame implements KeyListener, ActionListener, Runnable {

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


	//	parte grafica
	static 	JFrame frame;

	// creando bola, barra y ladrillo
	Rectangle bola = new Rectangle(bolaX, bolaY, 15, 15);
	Rectangle barra = new Rectangle(barraX, barraY, 100, 15);
	Rectangle[] ladrillo = new Rectangle[100];
	String[] nomladrillo = new String[100];

	Thread t;
	
	public NivelJuego() {
		System.out.println("comenzando el juego");
		addKeyListener(this);
		setFocusable(true);
		t = new Thread(this);
		t.start();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		
		frame = new JFrame();
		frame.setTitle("NIVEL");
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		


		final JPanel panelNivel = new JPanel();
		panelNivel.setBackground(new Color(119, 136, 153));

		panelNivel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panelNivel.setBounds(0, 0, 500, 700);
		frame.getContentPane().add(panelNivel);
		panelNivel.setLayout(null);
		
	

	}
	

	public void CreaObjetos(String ficheronombre){
		
		int count=0;
		
	    File fichero = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	 
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         fichero = new File ("src\\files\\"+ficheronombre+".txt");
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
		     							
		     							count=count+1;
		     							
		     							nomladrillo[count]=objeto.substring(coords.length()+1); 
		     							ladrillo[count]=new Rectangle(x, y, 50, 20);

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

		for (int i = 1; i < ladrillo.length; i++) {
			
			if (ladrillo[i] != null) {
				
				imgLadrillo= iconToImage(new ImageIcon(this.getClass().getResource( "/resources/"+ nomladrillo[i] +".png")));
				
				g.drawImage(imgLadrillo,ladrillo[i].x, ladrillo[i].y, ladrillo[i].width,ladrillo[i].height, null);
			}}
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void run() {
		
	System.out.println("run");
	
	CreaObjetos("NivelMuestra");
	
	frame.repaint();
	
	try {
		Thread.sleep(6);
		
	} catch (Exception ex) {
	}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					NivelJuego window = new NivelJuego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
}
	
}
