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
		ig.comboBox_1.addActionListener(this);
		
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
		
		if (event.getSource() == this.interfazGrafica.btnNewButton_CE) {
			settear();
		}else if (event.getSource() == this.interfazGrafica.btnNewButton_delete) {
			
		}
		
	}
	
	public void delete() {
		String texto = this.interfazGrafica.textField_dol_converter.getText();
		
	}
	
	public void settear() {
		this.interfazGrafica.textField_dol_converter.setText(null);
		this.interfazGrafica.textField_eur_converter.setText(null);
	}
	
	public void moneda1() {

		this.interfazGrafica.textField_dol_converter.setText(this.metodos.valorMoneda("moneda1", this.interfazGrafica.valorMoneda1, this.interfazGrafica.comboBox_1.getSelectedItem().toString(), this.interfazGrafica.comboBox_2.getSelectedItem().toString()));

		
	}

	public void moneda2() {
		

		this.interfazGrafica.textField_eur_converter.setText(this.metodos.valorMoneda("moneda1", this.interfazGrafica.valorMoneda1, this.interfazGrafica.comboBox_1.getSelectedItem().toString(), this.interfazGrafica.comboBox_2.getSelectedItem().toString()));

		
	}
	
}
