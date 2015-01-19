package juego;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * @author Carlos y Jon
 *
 */
//
public class Bola extends ObjetoJuego implements ConstantesFijas {

	private boolean enPantalla;
	private int xDir = 1;
	private int yDir = -1;
	private int anchoAlto= BolaAnchura;

	

	public Bola() {

		posx= BolaInicioX;
		posy= BolaInicioY;

		imagenObj.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\oie_transparent.png"));
		imagenObj.setBounds(posx, posy, 15, 15);
		imagenObj.setVisible(true);

	}

	/**
	 * @return the enPantalla
	 */
	public boolean isEnPantalla() {
		return enPantalla;
	}

	/**
	 * @param enPantalla the enPantalla to set
	 */
	public void setEnPantalla(boolean enPantalla) {
		this.enPantalla = enPantalla;
	}

	/**
	 * @return the xDir
	 */
	public int getxDir() {
		return xDir;
	}

	/**
	 * @param xDir the xDir to set
	 */
	public void setxDir(int xDir) {
		this.xDir = xDir;
	}

	/**
	 * @return the yDir
	 */
	public int getyDir() {
		return yDir;
	}

	/**
	 * @param yDir the yDir to set
	 */
	public void setyDir(int yDir) {
		this.yDir = yDir;
	}

	public void move() {
		posx += xDir;
		posy += yDir;
	}

	public void resetPos() {
		posx = BolaInicioX;
		posy = BolaInicioY;
		xDir = 1;
		yDir = -1;
	}
	/**
	 * @return the anchoAlto
	 */
	public int getAnchoAlto() {
		return anchoAlto;
	}

	/**
	 * @param anchoAlto the anchoAlto to set
	 */
	public void setAnchoAlto(int anchoAlto) {
		this.anchoAlto = anchoAlto;
	}


}
