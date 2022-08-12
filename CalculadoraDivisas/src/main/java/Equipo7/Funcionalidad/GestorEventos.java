package Equipo7.Funcionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import Equipo7.Interfaz.InterfazGrafica;

public class GestorEventos implements ActionListener {

	private InterfazGrafica interfazGrafica;
	
	private Methods metodos;
	
	public GestorEventos(InterfazGrafica ig,Methods metodos) {
		this.metodos = metodos;
		this.interfazGrafica = ig;
		
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
		
		this.interfazGrafica.moneda1.setText(this.metodos.valorMoneda("moneda1", this.interfazGrafica.valorMoneda1, this.interfazGrafica.coinSelector1.getSelectedItem().toString(), this.interfazGrafica.coinSelector2.getSelectedItem().toString()));
		
	}

	public void moneda2() {
		
		this.interfazGrafica.moneda2.setText(this.metodos.valorMoneda("moneda1", this.interfazGrafica.valorMoneda1, this.interfazGrafica.coinSelector1.getSelectedItem().toString(), this.interfazGrafica.coinSelector2.getSelectedItem().toString()));
		
	}
	
}
