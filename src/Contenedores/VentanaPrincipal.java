package Contenedores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private Dimension tamPantalla; //para dimensionar a toda la pantalla
	private Rectangle pantalla; //
	
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setTitle("Ventana Principal"); 
		setSize(650,342);
		setLocationRelativeTo(null);
		tamPantalla = Toolkit.getDefaultToolkit().getScreenSize(); //adaptar al tamaño de la pantalla
		pantalla = new Rectangle(tamPantalla); 
		setBounds(pantalla); 
		
		 
		JPanel miPanel = new JPanel();
		setContentPane(miPanel);
		
		miPanel.setBackground(new Color(128, 255, 128));
		miPanel.setBounds(0, 0, 434, 261);
		
		miPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al sistema");
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 31, 213, 49);
		miPanel.add(lblNewLabel);
		
		JButton botonRegistro = new JButton("REGISTRAR");
		botonRegistro.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonRegistro.setBackground(Color.LIGHT_GRAY);
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegistro.setBounds(29, 112, 149, 49);
		miPanel.add(botonRegistro);
		
		JButton botonConsultar = new JButton("CONSULTAR");
		botonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonConsultar.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonConsultar.setBackground(Color.LIGHT_GRAY);
		botonConsultar.setBounds(214, 112, 149, 49);
		miPanel.add(botonConsultar);
	}
}
