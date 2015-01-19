package juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author Carlos y Jon
 *
 */
public class Player extends ObjetoJuego implements ConstantesFijas{

	private int xSpeed;

	private boolean dch;
	


	private boolean izq;
	private int altura;
	private int anchura;

	/**
	 * @param posx
	 * @param posy
	 */
	public Player() {

		dch=false;
		izq=false;
		posx= BarraInicioX;
		posy= BarraInicioY;
		altura=BarraAltura;
		anchura=BarraAnchura;

		imagenObj.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BarraNormal.png"));
		imagenObj.setBounds(posx, posy, 100, 20);
		imagenObj.setVisible(true);

	}


	//creacion copiada al juego k me baje, esta sin terminar
	public void pintar(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(0, 251, 450, 200);


	}


	public void resetPos() {
		posx = BarraInicioX;
		posy = BarraInicioY;
	}






	/**
	 * @return the xSpeed
	 */
	public int getxSpeed() {
		return xSpeed;
	}


	/**
	 * @param xSpeed the xSpeed to set
	 */
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}


	/**
	 * @return the dch
	 */
	public boolean isDch() {
		return dch;
	}


	/**
	 * @param dch the dch to set
	 */
	public void setDch(boolean dch) {
		this.dch = dch;
	}


	/**
	 * @return the izq
	 */
	public boolean isIzq() {
		return izq;
	}


	/**
	 * @param izq the izq to set
	 */
	public void setIzq(boolean izq) {
		this.izq = izq;
	}


	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}


	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	/**
	 * @return the anchura
	 */
	public int getAnchura() {
		return anchura;
	}


	/**
	 * @param anchura the anchura to set
	 */
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}



}
