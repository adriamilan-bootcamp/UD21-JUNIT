package Equipo7.Funcionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import Equipo7.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener {

	private InterfazGrafica interfazGrafica;
	
	private Methods metodos;
	
	public GestorEventos(Methods metodos,InterfazGrafica ig) {
		this.metodos = metodos;
		this.interfazGrafica = ig;
		ig.comboBox.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		switch (event.getActionCommand()) {
			case "moneda1":
				moneda1();
				break;
			case "moneda2":
				moneda2();
				break;
		}
		
	}
	
	public void moneda1() {
		
		String monedaSeleccionada = this.interfazGrafica.comboBox.getSelectedItem().toString();
		
		this.interfazGrafica.moneda1.setText(this.metodos.typeMonedaSelector(monedaSeleccionada.toLowerCase()));
		
	}

	public void moneda2() {
		
		String monedaSeleccionada = this.interfazGrafica.comboBox.getSelectedItem().toString();
		
		this.interfazGrafica.moneda2.setText(this.metodos.typeMonedaSelector(monedaSeleccionada.toLowerCase()));
		
	}
	
}
