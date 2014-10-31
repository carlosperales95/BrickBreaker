import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Label;


public class pruebaVentanaGrafica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaVentanaGrafica window = new pruebaVentanaGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pruebaVentanaGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(450, 25, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 490, 660);
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(111, 70, 50, 20);
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				
						JLabel label_1 = new JLabel("");
						panel_1.add(label_1, BorderLayout.CENTER);
						label_1.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel pelota = new JPanel();
		pelota.setBackground(Color.GREEN);
		pelota.setBounds(233, 603, 15, 15);
		panel.add(pelota);
		pelota.setLayout(new BorderLayout(0, 0));

		JLabel lblPILOTA = new JLabel("");
		pelota.add(lblPILOTA);
		lblPILOTA.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\oie_transparent.png"));

		JPanel panel_0 = new JPanel();
		panel_0.setBounds(50, 70, 50, 20);
		panel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		JLabel label_0 = new JLabel("");
		label_0.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));
		panel_0.add(label_0);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(171, 70, 50, 20);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JLabel label_2 = new JLabel("");
		panel_2.add(label_2, BorderLayout.CENTER);
		label_2.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(231, 70, 50, 20);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel label_3 = new JLabel("");
		panel_3.add(label_3, BorderLayout.CENTER);
		label_3.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(291, 70, 50, 20);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel label_4 = new JLabel("");
		panel_4.add(label_4, BorderLayout.CENTER);
		label_4.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(351, 70, 50, 20);
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel label_5 = new JLabel("");
		panel_5.add(label_5, BorderLayout.CENTER);
		label_5.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(85, 101, 50, 20);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JLabel label_6 = new JLabel("");
		panel_6.add(label_6, BorderLayout.CENTER);
		label_6.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(145, 101, 50, 20);
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JLabel label_7 = new JLabel("");
		panel_7.add(label_7, BorderLayout.CENTER);
		label_7.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(205, 101, 50, 20);
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JLabel label_8 = new JLabel("");
		panel_8.add(label_8, BorderLayout.CENTER);
		label_8.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(265, 101, 50, 20);
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel label_9 = new JLabel("");
		panel_9.add(label_9, BorderLayout.CENTER);
		label_9.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(325, 101, 50, 20);
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		JLabel label_10 = new JLabel("");
		panel_10.add(label_10, BorderLayout.CENTER);
		label_10.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(111, 132, 50, 20);
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JLabel label_11 = new JLabel("");
		panel_11.add(label_11, BorderLayout.CENTER);
		label_11.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(171, 132, 50, 20);
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JLabel label_12 = new JLabel("");
		panel_12.add(label_12, BorderLayout.CENTER);
		label_12.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(231, 132, 50, 20);
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JLabel label_13 = new JLabel("");
		panel_13.add(label_13, BorderLayout.CENTER);
		label_13.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(291, 132, 50, 20);
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JLabel label_14 = new JLabel("");
		panel_14.add(label_14, BorderLayout.CENTER);
		label_14.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(145, 163, 50, 20);
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JLabel label_15 = new JLabel("");
		panel_15.add(label_15, BorderLayout.CENTER);
		label_15.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_16 = new JPanel();
		panel_16.setBounds(205, 163, 50, 20);
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));

		JLabel label_16 = new JLabel("");
		panel_16.add(label_16, BorderLayout.CENTER);
		label_16.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_17 = new JPanel();
		panel_17.setBounds(265, 163, 50, 20);
		panel.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));

		JLabel label_17 = new JLabel("");
		panel_17.add(label_17, BorderLayout.CENTER);
		label_17.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(171, 194, 50, 20);
		panel.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));

		JLabel label_18 = new JLabel("");
		panel_18.add(label_18, BorderLayout.CENTER);
		label_18.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(231, 194, 50, 20);
		panel.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));

		JLabel label_19 = new JLabel("");
		panel_19.add(label_19, BorderLayout.CENTER);
		label_19.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel panel_20 = new JPanel();
		panel_20.setBounds(205, 225, 50, 20);
		panel.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));

		JLabel label_20 = new JLabel("");
		panel_20.add(label_20, BorderLayout.CENTER);
		label_20.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BloquePared.png"));

		JPanel barra = new JPanel();
		barra.setBounds(200, 625, 100, 20);
		panel.add(barra);
		barra.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		barra.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\resources\\BarraNormal.png"));
	}
}
