package controlador;

import Vista.VentanaLogin;
import Vista.VentanaPrincipal;
import modelo.Logica;

public class Aplicacion {
	
	public void iniciarSistema() {
		VentanaPrincipal miVentana = new VentanaPrincipal(); 
		VentanaLogin miLogin = new VentanaLogin(miVentana, true); 
		Coordinador miCoordinador = new Coordinador(); 
		Logica miLogica = new Logica(); 
		miVentana.setVisible(true);
		miLogin.setVisible(true);
		
	}

}
