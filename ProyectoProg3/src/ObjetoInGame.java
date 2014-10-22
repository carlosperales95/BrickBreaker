import javax.swing.JLabel;


/**
 * @author Carlos
 *
 */
public abstract class ObjetoInGame extends ObjetoJuego {
	
	private JLabel imagenObj;

	public ObjetoInGame(double posx, double posy) {
		super(posx, posy);
		this.imagenObj = new JLabel();
		
	}

}
