/**
 * 
 */

/**
 * @author Carlos
 *
 */
public class Player extends ObjetoJuego implements Movible{

	/**
	 * @param posx
	 * @param posy
	 */
	public Player(double posx, double posy) {
		super(posx, posy);
		
	}

	@Override
	public void MueveObjeto(ObjetoJuego o, boolean direcci�n) {
		
		if(direcci�n) o.setPosx(o.getPosx()+1.00);else o.setPosx(o.getPosx()-1.00);
	
	}



}
