import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.UIManager;

@SuppressWarnings("unused")
public class Editor extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JFrame ventanaeditor;

	private MouseAdapter deleting;

	/**
	 * Create the application.
	 */
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		ventanaeditor = new JFrame();
		ventanaeditor.setTitle("EDITOR DE NIVELES");
		ventanaeditor.setBounds(100, 100, 610, 700);
		ventanaeditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaeditor.getContentPane().setLayout(null);
		
		final JPanel panelNivel = new JPanel();
		panelNivel.setBackground(new Color(119, 136, 153));

		panelNivel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panelNivel.setBounds(114, 0, 500, 700);
		ventanaeditor.getContentPane().add(panelNivel);
		panelNivel.setLayout(null);
		
		final JPanel recursos = new JPanel();
		recursos.setBackground(new Color(255, 69, 0));
		recursos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		recursos.setBounds(0, 0, 115, 700);
		ventanaeditor.getContentPane().add(recursos);
		recursos.setLayout(null);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.addItem("Naranja");
		comboBox.addItem("Azul");
		comboBox.addItem("Amarillo");
		comboBox.addItem("Verde");
		comboBox.addItem("Morado");
		comboBox.addItem("Duro");
		comboBox.addItem("Pared");

		comboBox.setBackground(new Color(245, 255, 250));
		comboBox.setToolTipText("Bloques");
		comboBox.setBounds(10, 11, 95, 29);
		recursos.add(comboBox);
		
		final JButton btnDelete = new JButton("Delete");
	
		btnDelete.setBounds(10, 334, 95, 39);
		btnDelete.setBackground(new Color(245, 255, 250));
		
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnDelete.setBackground(Color.GRAY);
				
				panelNivel.addMouseListener(deleting=new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent me) {
						
						if(panelNivel.findComponentAt(((int)panelNivel.getMousePosition().getX()),((int) panelNivel.getMousePosition().getY()))instanceof JLabel){
							
							
							
							panelNivel.remove(panelNivel.findComponentAt(((int)panelNivel.getMousePosition().getX()),((int) panelNivel.getMousePosition().getY())));
						
							panelNivel.repaint();
							
							btnDelete.setBackground(new Color(245, 255, 250));
							
							
							if(btnDelete.getBackground().equals(new Color(245, 255, 250))){panelNivel.removeMouseListener(deleting);}
							
							
						}	
					}
				});
				

				
			
			}
		});
		
		recursos.add(btnDelete);
		
		

		
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(245, 255, 250));
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			panelNivel.removeAll();
	
			panelNivel.repaint();
				
			}
		});
		
		btnClear.setBounds(10, 384, 95, 39);
		recursos.add(btnClear);

		
		
		panelNivel.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {

		if(panelNivel.findComponentAt(((int)panelNivel.getMousePosition().getX()),((int) panelNivel.getMousePosition().getY()))instanceof JLabel){
			
			panelNivel.findComponentAt(((int)panelNivel.getMousePosition().getX()),((int) panelNivel.getMousePosition().getY())).requestFocus();
			panelNivel.repaint();
			
		}
			
			
			
		}
	});
		

		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(245, 255, 250));
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final JLabel bloque = new JLabel();
				bloque.setBounds(200, 250, 50, 20);
				bloque.setIcon(new ImageIcon(this.getClass().getResource( "/resources/"+ "Bloque"+ comboBox.getSelectedItem().toString() +".png")));
				
				bloque.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent arg0) {
						
						if(bloque.hasFocus()){
							
							switch(arg0.getKeyCode()){
							
							case KeyEvent.VK_RIGHT: bloque.setBounds(bloque.getX()+1, bloque.getY(),bloque.getWidth(), bloque.getHeight()); break;
							
							case KeyEvent.VK_LEFT:bloque.setBounds(bloque.getX()-1, bloque.getY(),bloque.getWidth(), bloque.getHeight()); break;
							
							case KeyEvent.VK_UP: bloque.setBounds(bloque.getX(), bloque.getY()-1,bloque.getWidth(), bloque.getHeight()); break;
							
							case KeyEvent.VK_DOWN: bloque.setBounds(bloque.getX(), bloque.getY()+1,bloque.getWidth(), bloque.getHeight()); break;
							
							}
						}	
						
					}
				});
				
				panelNivel.add(bloque);
				
				panelNivel.repaint();
				
				
			}
		});
		
		btnAdd.setBounds(10, 66, 95, 23);
		recursos.add(btnAdd);
		

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(245, 255, 250));
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					    
			String nombre;  
			nombre = JOptionPane.showInputDialog("Guardar con el nombre:");  
					    
			 AccionesFicheros.EscribeFichero(nombre,PaneltoString(panelNivel)); 

			}
		});
		
		
		btnSave.setBounds(10, 284, 95, 39);
		recursos.add(btnSave);
		
		
	}

	

	
	public String PaneltoString (JPanel p){
		String nivel = "" ;
		
		for(int i=0; i<p.getComponents().length;i++){
			
			if(p.getComponents()[i] instanceof JLabel){
				
				nivel=nivel+p.getComponents()[i].getX()+"/";
				nivel=nivel+p.getComponents()[i].getY()+"/";
				
				

				
				if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueNaranja.png").toString())){
				
					
					nivel=nivel+"BloqueNaranja"+"-";
					
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueVerde.png").toString())){
				
					nivel=nivel+"BloqueVerde"+"-";
					
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueMorado.png").toString())){
					
					nivel=nivel+"BloqueMorado"+"-";
					
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueAzul.png").toString())){
					
					nivel=nivel+"BloqueAzul"+"-";
					
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueAmarillo.png").toString())){
					
					nivel=nivel+"BloqueAmarillo"+"-";
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloqueDuro.png").toString())){
					
					nivel=nivel+"BloqueDuro"+"-";
				}else{if(((JLabel) p.getComponents()[i]).getIcon().toString().equals(this.getClass().getResource( "/resources/BloquePared.png").toString())){
					
					nivel=nivel+"BloquePared"+"-";
					
				}}}}}}}}}		
		
		
		
		return nivel;
	}
	

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
					window.ventanaeditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
