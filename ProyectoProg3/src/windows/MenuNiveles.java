package windows;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MenuNiveles {

	private JFrame menunivel;


	/**
	 * Create the application.
	 */
	public MenuNiveles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		menunivel = new JFrame();
		menunivel.setBounds(100, 100, 500, 500);
		menunivel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menunivel.getContentPane().setLayout(null);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setBounds(0, 0, 500, 500);
		menunivel.getContentPane().add(panelbotones);
		panelbotones.setLayout(null);
		
		JLabel labelfondo = new JLabel("");
		labelfondo.setBounds(0, 0, 500, 500);
		labelfondo.setIcon(new ImageIcon(this.getClass().getResource("/resources/Fondo.png")));
		panelbotones.add(labelfondo);
		
		//bloque.setIcon(new ImageIcon(this.getClass().getResource( "/resources/"+ "Bloque"+ comboBox.getSelectedItem().toString() +".png")));
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuNiveles window = new MenuNiveles();
					window.menunivel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
