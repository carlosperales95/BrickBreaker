
/**
 * @author Carlos
 *
 */
public abstract class ObjetoJuego {
	
	double posx;
	double posy;

	/**
	 * 
	 */
	public ObjetoJuego(double posx, double posy) {
		
		this.posx = posx;
		this.posy = posy;
		
		
		
	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}
	public void setPosicion( double posx, double posy ) {
		setPosx(posx);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
