package juego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 * @author Carlos
 *
 */
public class Bloque extends ObjetoJuego  implements ConstantesFijas{

	private int vidas;



	/**
	 * @param posx
	 * @param posy
	 */
	public Bloque(String nombre) {
System.out.println(nombre);
		if(nombre.equalsIgnoreCase("BloquePared")){
			this.vidas=3;
			System.out.println("3 vidas");

		}else if(nombre.equalsIgnoreCase("BloqueDuro")){
			this.vidas=2;
			System.out.println("2 vidas");
		}else vidas=1;




		//		imagenObj.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));		//		imagen todabia a decidir 

		//		imagenObj.setVisible(true);



	}














	/**
	 * @return the vidas
	 */
	public int getVidas() {
		return vidas;
	}


	/**
	 * @param vidas the vidas to set
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}






	public static void main(String[] args) {





	}

}
