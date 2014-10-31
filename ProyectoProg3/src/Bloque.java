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

	private int alt;
	private int anch;
	// de momento ponemos solo color a los ladrillos
	//	private JLabel jLabelImagenIcon;
	//	private JPanel panelDondeMeterSuImagen;
	private int vidas;
	private boolean vivo;

	private int tipoLadrillo;

	/**
	 * @param posx
	 * @param posy
	 */
	public Bloque() {

		alt=LadrilloAltura;
		anch=LadrilloAnchura;
		//de momento:
		vidas=1;
		vivo=true;
	

//		imagenObj.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));		//		imagen todabia a decidir 

imagenObj.setVisible(true);



	}


	/**
	 * @return the alt
	 */
	public int getAlt() {
		return alt;
	}


	/**
	 * @param alt the alt to set
	 */
	public void setAlt(int alt) {
		this.alt = alt;
	}


	/**
	 * @return the anch
	 */
	public int getAnch() {
		return anch;
	}


	/**
	 * @param anch the anch to set
	 */
	public void setAnch(int anch) {
		this.anch = anch;
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


	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}


	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}




	public static void main(String[] args) {





	}

}
