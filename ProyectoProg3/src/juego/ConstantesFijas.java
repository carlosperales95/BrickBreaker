/**
 * 
 */

/**

 * @author Jon
 *
 */

package juego;

//Imports
import java.awt.Color;

//Class definition
public interface ConstantesFijas {


	//Window Size
	public static final int WindowAltura= 700;
	public static final int WindowAncgura = 500;

	//Lives
	public static final int MaxVidas = 5;
	public static final int MinVidas = 0;

	//Ball
	public static final int BolaAnchura = 15;
	public static final int BolaAltura = 15;
	public static final int BolaMargenDch = 493;
	public static final int BolaInicioX = 233;
	public static final int BolaInicioY = 603;

	//Paddle
	public static final int BarraAnchura = 100;
	public static final int BarraAltura = 15;
	public static final int BarraMargenDch = 450;
	public static final int BarraInicioX = 200;
	public static final int BarraInicioY = 625;
	//	public static final int PADDLE_MIN = 35;
	//	public static final int PADDLE_MAX = 140;

	//Bricks
	public static final int LadrilloAnchura = 50;
	public static final int LadrilloAltura = 20;
	public static final int LadrillosNumMax = 50;
	public static final int NO_BRICKS = 0;

	//Brick Colors
	public static final Color BLUE_BRICK_ONE = new Color(0,0,255);
	public static final Color BLUE_BRICK_TWO = new Color(28,134,238);
	public static final Color BLUE_BRICK_THREE = new Color(0,191,255);
	public static final Color RED_BRICK_ONE = new Color(255,0,0);
	public static final Color RED_BRICK_TWO = new Color(255,106,106);
	public static final Color RED_BRICK_THREE = new Color(238,180,180);
	public static final Color PURPLE_BRICK_ONE = new Color(128,0,128);
	public static final Color PURPLE_BRICK_TWO = new Color(148,0,211);
	public static final Color PURPLE_BRICK_THREE = new Color(155,48,255);
	public static final Color YELLOW_BRICK_ONE = new Color(255,215,0);
	public static final Color YELLOW_BRICK_TWO = new Color(255,255,0);
	public static final Color YELLOW_BRICK_THREE = new Color(255,246,143);
	public static final Color PINK_BRICK_ONE = new Color(205,0,205);
	public static final Color PINK_BRICK_TWO = new Color(238,130,238);
	public static final Color PINK_BRICK_THREE = new Color(255,225,255);
	public static final Color GRAY_BRICK_ONE = new Color(77,77,77);
	public static final Color GRAY_BRICK_TWO = new Color(125,125,125);
	public static final Color GRAY_BRICK_THREE = new Color(189,189,189);
	public static final Color GREEN_BRICK_ONE = new Color(0,139,0);
	public static final Color GREEN_BRICK_TWO = new Color(0,205,0);
	public static final Color GREEN_BRICK_THREE = new Color(0,255,0);

}
