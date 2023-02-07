package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

public class VentanaLogin extends JDialog {

	private final JPanel ventanaLogin = new JPanel();
	private JPasswordField passCaja;



	/**
	 * Create the dialog.
	 */
	public VentanaLogin(java.awt.Frame parent, boolean modal) {
		super(parent, modal); //para que se quede en la ventana principal
		setBounds(100, 100, 287, 411);
		setSize(300, 420); 
		setTitle("Login"); 
		setLocationRelativeTo(null); //en el centro de la pantalla
		getContentPane().setLayout(new BorderLayout());
		ventanaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(ventanaLogin, BorderLayout.CENTER);
		ventanaLogin.setLayout(null);
		{
			JLabel etiquetaLogin = new JLabel("Ventana Login");
			etiquetaLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			etiquetaLogin.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
			etiquetaLogin.setBounds(57, 29, 163, 33);
			ventanaLogin.add(etiquetaLogin);
		}
		{
			JLabel etiquetaCandado = new JLabel("");
			etiquetaCandado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			etiquetaCandado.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaCandado.setIcon(new ImageIcon(VentanaLogin.class.getResource("/Imagenes/candado.png")));
			etiquetaCandado.setBounds(70, 92, 149, 110);
			ventanaLogin.add(etiquetaCandado);
		}
		{
			JLabel labelUsuario = new JLabel("Usuario");
			labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
			labelUsuario.setBounds(34, 244, 53, 23);
			ventanaLogin.add(labelUsuario);
		}
		{
			JLabel lblPass = new JLabel("Pass");
			lblPass.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPass.setBounds(34, 276, 53, 23);
			ventanaLogin.add(lblPass);
		}
		
		JComboBox comboUsuario = new JComboBox();
		comboUsuario.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Administrador", "Usuario"}));
		comboUsuario.setSelectedIndex(0);
		comboUsuario.setBounds(97, 245, 149, 22);
		ventanaLogin.add(comboUsuario);
		
		passCaja = new JPasswordField();
		passCaja.setHorizontalAlignment(SwingConstants.LEFT);
		passCaja.setBounds(97, 278, 149, 20);
		ventanaLogin.add(passCaja);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		botonAceptar.setBounds(157, 326, 89, 35);
		ventanaLogin.add(botonAceptar);
	}
}
