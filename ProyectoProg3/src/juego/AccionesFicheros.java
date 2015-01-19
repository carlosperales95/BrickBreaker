package juego;

	import java.io.*;

/**
 * @author Carlos
 *
 */


public class AccionesFicheros {
	



	 
	public static void LeeFichero(String ficheronombre) {
		
	    
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
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
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
	

	
	 
	public static void EscribeFichero(String ficheronombre, String texto){
	    FileWriter fichero = null;
	    PrintWriter pw = null;
	 
	        try {
	        	
	            fichero = new FileWriter("src\\files\\"+ficheronombre+".txt");
	            pw = new PrintWriter(fichero);
	 
	          
	                pw.println(texto);
	 
	        } 
	        catch (Exception e) {
	        	
	            e.printStackTrace();
	        } 
	        
	        finally {
	        	
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           
	           } 
	           
	           catch (Exception e2) {
	        	   
	              e2.printStackTrace();
	           }
	        }
	}

	
	public static void main (String[]args){
		
	EscribeFichero("prueba","hola");
	//EscribeFichero("prueba2","hola\nhey");
	//LeeFichero("prueba2");
	LeeFichero("pruev");
	System.out.println();
	System.out.println();
	System.out.println();
	
	//FicheroObjetos("pruebita");
		
	}
	
	
	
}
