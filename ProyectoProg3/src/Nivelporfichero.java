import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Nivelporfichero extends JFrame{
		private static final long serialVersionUID = 1L;	
		private JFrame ventana;
		
	public Nivelporfichero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		
		ventana = new JFrame();
		ventana.setTitle("NIVEL");
		ventana.setBounds(100, 100, 500, 700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		


		final JPanel panelNivel = new JPanel();
		panelNivel.setBackground(new Color(119, 136, 153));

		panelNivel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panelNivel.setBounds(0, 0, 500, 700);
		ventana.getContentPane().add(panelNivel);
		panelNivel.setLayout(null);
		
		FicheroObjetos("NivelMuestra",panelNivel);

	}
		
		
		
	
	
	
	public void FicheroObjetos(String ficheronombre, JPanel pan){
		
	    File prueba = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	 
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         prueba = new File ("src\\files\\"+ficheronombre+".txt");
	         fr = new FileReader (prueba);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea;

	         while((linea=br.readLine())!=null){

	        	int p=0;
	     		int barras=0;
	     		
	     		for(int i=0;i<linea.length();i++){
	     			
	     			//System.out.println("p:"+p);
	     			//System.out.println("i:"+i);
	     			
	     			if(linea.charAt(i)=='-'){

	     				String objeto=linea.substring(p, i);
	     				
	     				System.out.println(objeto);
	     				
	     				
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
	     						
	     						for(int k =0;k<coords.length();k++){
	     							
	     							if(coords.charAt(k)=='/'){
	     								
	     								String cx=linea.substring(p, p+k);
	     								
	     								String cy=linea.substring(p+k+1,p+coords.length());
	     								
	     							//	System.out.println(cx);
	     							//	System.out.println(cy);
	     								
	     								System.out.println("Objeto: " + cx +"   "+cy+"   "+coords+"   "+"!"+objeto.substring(coords.length()+1)+"!"  );
	     								
	     							int x=Integer.parseInt(cx);
		     							int y=Integer.parseInt(cy);
	     								
	     								JLabel bloque = new JLabel();
	     								bloque.setBounds(x, y, 50, 20);
	     								bloque.setIcon(new ImageIcon(this.getClass().getResource( "/resources/"+ objeto.substring(coords.length()+1) +".png")));
	     								
	     								pan.add(bloque);
	     								
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
		         }
		         }
		      
	      
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nivelporfichero window = new Nivelporfichero();
					window.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


