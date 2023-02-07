package Contenedores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPrincipal miVentana = new VentanaPrincipal(); 
		miVentana.setVisible(true);
		
		VentanaLogin miLogin = new VentanaLogin(miVentana, true); 
		miLogin.setVisible(true);
	}

}
