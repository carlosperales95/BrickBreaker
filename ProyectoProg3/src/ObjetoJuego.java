import javax.swing.JLabel;


/**
 * @author Carlos y Jon
 *
 */
public abstract class ObjetoJuego implements ConstantesFijas {

	public ObjetoJuego() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected int posx;
	protected int posy;
	protected JLabel imagenObj;

	/**
	 * @return the imagenObj
	 */
	public JLabel getImagenObj() {
		return imagenObj;
	}

	/**
	 * @param imagenObj the imagenObj to set
	 */
	public void setImagenObj(JLabel imagenObj) {
		this.imagenObj = imagenObj;
	}

	/**
	 * 
	 */
	public ObjetoJuego(int posx, int posy) {

		this.posx = posx;
		this.posy = posy;



	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
	public void setPosicion( int posx, int posy ) {
		setPosx(posx);
	}























}
