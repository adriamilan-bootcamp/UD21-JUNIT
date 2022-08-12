package Equipo7.Interfaz;

import java.awt.Font;

import javax.swing.*;

import Equipo7.Funcionalidad.GestorEventos;

import java.awt.Choice;

public class InterfazGrafica extends JFrame {
	
	// Panel de la aplicacion
	private JPanel contentPane;
	
	// Inicializamos los valores de las 2 monedas a convertir
	private int valorMoneda1 = 0;
	private int valorMoneda2;
	
	// Monedas disponibles en nuestra app
	private String[] monedasDispo = {"Euro", "Dolar", "Yen", "Libra"};
	
	// Haciendo publico componentes
	
	public JLabel moneda1;
	public JLabel moneda2;
	public JComboBox comboBox;
	
	public InterfazGrafica() {
	
		// Hacemos que el usuario no pueda modificar las dimensiones de la aplicacion
		setResizable(false);
		
		// Asignamos el titulo de la aplicacion
		setTitle("Calculadora de divisas");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 700, 500);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
		
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		
		moneda1 = new JLabel("Temp");
		moneda1.setBounds(60, 100, 100, 70);
		contentPane.add(moneda1);
		moneda1.setFont(new Font("Poppins", Font.PLAIN, 48));
		
		moneda2 = new JLabel("Temp");
		moneda2.setFont(new Font("Dialog", Font.PLAIN, 48));
		moneda2.setBounds(60, 251, 100, 70);
		contentPane.add(moneda2);
		
		comboBox = new JComboBox(this.monedasDispo);
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(60, 175, 125, 24);
		contentPane.add(comboBox);
		comboBox.setActionCommand("typeMoneda1");
	}
}
